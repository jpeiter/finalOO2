package br.edu.utfpr.pb.trabalhofinal.view;

import br.edu.utfpr.pb.trabalhofinal.controller.VendaController;
import br.edu.utfpr.pb.trabalhofinal.enums.EPermissao;
import br.edu.utfpr.pb.trabalhofinal.model.Usuario;
import br.edu.utfpr.pb.trabalhofinal.relatorio.Relatorios;
import br.edu.utfpr.pb.trabalhofinal.tableModel.VendaTableModel;
import br.edu.utfpr.pb.trabalhofinal.util.UserSession;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author jpeit
 */
public class FrmVendaLista extends javax.swing.JInternalFrame {

    private VendaTableModel vendaTableModel;
    private VendaController vendaController;
    private Usuario usuario;
    private DateTimeFormatter formatter;

    public FrmVendaLista(Usuario usuario) {
        initComponents();
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        UserSession.getInstance().setUsuarioLogado(usuario);
        UserSession sessao = UserSession.getInstance();

        btnInserir.setEnabled(!sessao.temPermissao(EPermissao.FINANCEIRO));

        this.usuario = usuario;
        txtDataInicial.setText(LocalDate.now().withDayOfMonth(1).format(formatter));
        txtDataFinal.setText(LocalDate.now().format(formatter));

        this.vendaController = new VendaController();
        carregarDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnInserir = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        btn2aVia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bntFiltrar = new javax.swing.JButton();
        tabPane = new javax.swing.JTabbedPane();
        pnlNPedido = new javax.swing.JPanel();
        txtNPedido = new javax.swing.JTextField();
        pnlDatas = new javax.swing.JPanel();
        txtDataInicial = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDataFinal = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Vendas");

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDados);

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/pb/finalOO2/image/adicionar.png"))); // NOI18N
        btnInserir.setText("Nova Venda");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/pb/finalOO2/image/buscar16.png"))); // NOI18N
        btnDetalhes.setText("VER DETALHES");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        btn2aVia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/pb/finalOO2/image/relatorio.png"))); // NOI18N
        btn2aVia.setText("2ª Via Recibo");
        btn2aVia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2aViaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInserir)
                .addGap(18, 18, 18)
                .addComponent(btnDetalhes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn2aVia)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetalhes)
                    .addComponent(btnInserir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btn2aVia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setText("Filtrar por:");

        bntFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/pb/finalOO2/image/buscar.png"))); // NOI18N
        bntFiltrar.setText("Filtrar");
        bntFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntFiltrarActionPerformed(evt);
            }
        });

        txtNPedido.setPreferredSize(new java.awt.Dimension(73, 20));

        javax.swing.GroupLayout pnlNPedidoLayout = new javax.swing.GroupLayout(pnlNPedido);
        pnlNPedido.setLayout(pnlNPedidoLayout);
        pnlNPedidoLayout.setHorizontalGroup(
            pnlNPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNPedidoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtNPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
        );
        pnlNPedidoLayout.setVerticalGroup(
            pnlNPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        tabPane.addTab("Nº Pedido", pnlNPedido);

        try {
            txtDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Data inicial");

        try {
            txtDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Data final:");

        javax.swing.GroupLayout pnlDatasLayout = new javax.swing.GroupLayout(pnlDatas);
        pnlDatas.setLayout(pnlDatasLayout);
        pnlDatasLayout.setHorizontalGroup(
            pnlDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatasLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDatasLayout.setVerticalGroup(
            pnlDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatasLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDatasLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        tabPane.addTab("Datas", pnlDatas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabPane))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        FrmVendaForm frm
                = new FrmVendaForm(null, true, this.usuario);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);

        carregarDados();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        try {
            if (tblDados.getSelectedRow() >= 0) {
                Long idVenda = Long.parseLong(
                        vendaTableModel.getValueAt(
                                tblDados.getSelectedRow(), 0).toString()
                );
                FrmVendaForm frm
                        = new FrmVendaForm(null, true);
                frm.carregarVenda(idVenda);
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);

                carregarDados();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Selecione um registro!",
                        "Atenção",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Ocorreu um erro!",
                    "Atenção",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void bntFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntFiltrarActionPerformed
        buscaVenda();
    }//GEN-LAST:event_bntFiltrarActionPerformed

    private void btn2aViaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2aViaActionPerformed
        if (tblDados.getSelectedRow() >= 0) {
            Long idVenda = Long.parseLong(
                    vendaTableModel.getValueAt(
                            tblDados.getSelectedRow(), 0).toString()
            );
            new Relatorios().recibo2aVia(idVenda);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecione um registro!",
                    "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn2aViaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntFiltrar;
    private javax.swing.JButton btn2aVia;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnInserir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDatas;
    private javax.swing.JPanel pnlNPedido;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTable tblDados;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicial;
    private javax.swing.JTextField txtNPedido;
    // End of variables declaration//GEN-END:variables

    private void carregarDados() {
        vendaTableModel = new VendaTableModel(
                vendaController.listar()
        );
        tblDados.setModel(vendaTableModel);
        vendaTableModel.fireTableDataChanged();
    }

    private void buscaVenda() {
        if (tabPane.getSelectedIndex() == 0) {
            vendaTableModel = new VendaTableModel(
                    vendaController.findVendasByNumeroPedido(txtNPedido.getText())
            );
        } else if (tabPane.getSelectedIndex() == 1) {
            try {
                LocalDate dataInicial = LocalDate.parse(txtDataInicial.getText(), formatter);
                LocalDate dataFinal = LocalDate.parse(txtDataFinal.getText(), formatter);

                if (dataFinal.compareTo(dataInicial) >= 0) {
                    vendaTableModel = new VendaTableModel(
                            vendaController.findVendasByData(dataInicial, dataFinal)
                    );
                } else {
                    JOptionPane.showMessageDialog(this, "A data inicial deve ser anterior à data final!", "Atenção!", JOptionPane.ERROR_MESSAGE);
                }
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Datas inválidas!", "Atenção!", JOptionPane.ERROR_MESSAGE);
            }
        }
        tblDados.setModel(vendaTableModel);
        vendaTableModel.fireTableDataChanged();
    }

}