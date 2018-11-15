/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.pb.trabalhofinal.tableModel;

import br.edu.utfpr.pb.trabalhofinal.model.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jpeit
 */
public class ProdutoTableModel extends AbstractTableModel {

    private List<Produto> lista;
    private String[] colunas = {"Código", "Nome", "Categoria", "Valor"};

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
                return lista.get(rowIndex).getCategoria().getDescricao();
            case 3:
                return lista.get(rowIndex).getValor();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }

    public ProdutoTableModel() {
    }

    public ProdutoTableModel(List<Produto> lista) {
        this.lista = lista;
    }

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

}
