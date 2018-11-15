package br.edu.utfpr.pb.trabalhofinal.tableModel;

import br.edu.utfpr.pb.trabalhofinal.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UsuarioTableModel extends AbstractTableModel {

    private List<Usuario> lista;
    private String[] columns = {"Código", "Nome", "CPF", "E-mail"};

    public UsuarioTableModel() {
        lista = new ArrayList<>();
    }

    public UsuarioTableModel(List<Usuario> lista) {
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
                return lista.get(rowIndex).getEmail();
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
