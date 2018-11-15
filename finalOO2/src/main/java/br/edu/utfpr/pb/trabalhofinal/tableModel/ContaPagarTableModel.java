package br.edu.utfpr.pb.trabalhofinal.tableModel;

import br.edu.utfpr.pb.trabalhofinal.model.ContaPagar;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ContaPagarTableModel extends AbstractTableModel {

    private List<ContaPagar> lista;
    private String[] columns = {"Código", "Fornecedor", "Valor", "Valor Pago", "Data Vencimento", "Data Pagamento"};

    public ContaPagarTableModel() {
        lista = new ArrayList<>();
    }

    public ContaPagarTableModel(List<ContaPagar> lista) {
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
                return lista.get(rowIndex).getFornecedor().getNome();
            case 2:
                return lista.get(rowIndex).getValor();
            case 3:
                return lista.get(rowIndex).getValorPago();
            case 4:
                return lista.get(rowIndex).getDataVencimento();
            case 5:
                return lista.get(rowIndex).getDataPagamento();
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
