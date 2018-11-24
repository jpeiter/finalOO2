/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.pb.trabalhofinal.tableModel;

import br.edu.utfpr.pb.trabalhofinal.model.Estado;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jpeit
 */
public class EstadoTableModel extends AbstractTableModel {

    private List<Estado> lista;
    private String[] colunas = {"Código", "Nome", "Sigla"};

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lista.get(rowIndex).getId();
            case 1:
                return lista.get(rowIndex).getNome();
            case 2:
                return lista.get(rowIndex).getSigla();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }

    public EstadoTableModel() {
    }

    public EstadoTableModel(List<Estado> lista) {
        this.lista = lista;
    }

    public List<Estado> getLista() {
        return lista;
    }

    public void setLista(List<Estado> lista) {
        this.lista = lista;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    public void removeRow(int rowIndex) {
        this.lista.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }

}
