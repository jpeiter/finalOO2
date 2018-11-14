package br.edu.utfpr.pb.trabalhofinal.tableModel;

import br.edu.utfpr.pb.trabalhofinal.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel {

    private List<Cliente> lista;
    private String[] columns = {"Código", "Nome", "CPF", "Cidade"};

    public ClienteTableModel() {
        lista = new ArrayList<>();
    }

    public ClienteTableModel(List<Cliente> lista) {
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
                return lista.get(rowIndex).getCpf();
            case 3:
                return lista.get(rowIndex).getCidade().getNome();
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
