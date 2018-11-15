package br.edu.utfpr.pb.trabalhofinal.tableModel;

import br.edu.utfpr.pb.trabalhofinal.model.ContaReceber;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ContaReceberTableModel extends AbstractTableModel {

    private List<ContaReceber> lista;
    private String[] columns = {"Código", "Número Pedido Venda", "Valor", "Data Venda"};

    public ContaReceberTableModel() {
        lista = new ArrayList<>();
    }

    public ContaReceberTableModel(List<ContaReceber> lista) {
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
                return lista.get(rowIndex).getVenda().getNumeroPedido();
            case 2:
                return lista.get(rowIndex).getValor();
            case 3:
                return lista.get(rowIndex).getVenda().getData();
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
