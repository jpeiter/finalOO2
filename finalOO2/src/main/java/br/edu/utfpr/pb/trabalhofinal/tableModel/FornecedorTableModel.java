package br.edu.utfpr.pb.trabalhofinal.tableModel;

import br.edu.utfpr.pb.trabalhofinal.model.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FornecedorTableModel extends AbstractTableModel {

    private List<Fornecedor> lista;
    private String[] columns = {"Código", "Nome", "CNPJ", "Telefone"};

    public FornecedorTableModel() {
        lista = new ArrayList<>();
    }

    public FornecedorTableModel(List<Fornecedor> lista) {
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
                return lista.get(rowIndex).getNome();
            case 2:
                return lista.get(rowIndex).getCnpj();
            case 3:
                return lista.get(rowIndex).getTelefone();
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
