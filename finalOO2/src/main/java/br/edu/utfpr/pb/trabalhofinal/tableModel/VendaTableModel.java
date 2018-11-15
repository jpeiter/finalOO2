package br.edu.utfpr.pb.trabalhofinal.tableModel;

import br.edu.utfpr.pb.trabalhofinal.model.Venda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VendaTableModel extends AbstractTableModel {

    private List<Venda> lista;
    private String[] columns = {"Código", "Nº Pedido", "Data", "Cliente"};

    public VendaTableModel() {
        lista = new ArrayList<>();
    }

    public VendaTableModel(List<Venda> lista) {
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
                return lista.get(rowIndex).getNumeroPedido();
            case 2:
                return lista.get(rowIndex).getData();
            case 3:
                return lista.get(rowIndex).getCliente().getNome();
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
