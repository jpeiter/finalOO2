package br.edu.utfpr.pb.trabalhofinal.tableModel;

import br.edu.utfpr.pb.trabalhofinal.model.VendaProduto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VendaProdutoTableModel extends AbstractTableModel {

    private List<VendaProduto> lista;
    private String[] columns = {"Código", "Produto", "Quantidade", "Valor Total"};

    public VendaProdutoTableModel() {
        lista = new ArrayList<>();
    }

    public VendaProdutoTableModel(List<VendaProduto> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lista.get(rowIndex).getId();
            case 1:
                return lista.get(rowIndex).getProduto().getNome();
            case 2:
                return lista.get(rowIndex).getQuantidade();
            case 3:
                return lista.get(rowIndex).getProduto().getValor() * lista.get(rowIndex).getQuantidade();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    public void removeRow(int rowIndex) {
        this.lista.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
