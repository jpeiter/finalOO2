package br.edu.utfpr.pb.trabalhofinal.view;

import br.edu.utfpr.pb.trabalhofinal.controller.CidadeController;
import br.edu.utfpr.pb.trabalhofinal.controller.ClienteController;
import br.edu.utfpr.pb.trabalhofinal.controller.EstadoController;
import br.edu.utfpr.pb.trabalhofinal.model.Cidade;
import br.edu.utfpr.pb.trabalhofinal.model.Cliente;
import br.edu.utfpr.pb.trabalhofinal.model.Contato;
import br.edu.utfpr.pb.trabalhofinal.model.Estado;
import br.edu.utfpr.pb.trabalhofinal.tableModel.ContatoTableModel;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jpeit
 */
public class FrmClienteForm extends javax.swing.JDialog {

    private Cliente cliente;
    private final ClienteController clienteController;
    private final CidadeController cidadeController;
    private final EstadoController estadoController;
    private DefaultComboBoxModel cmbModelEstado;
    private DefaultComboBoxModel cmbModelCidade;
    private ContatoTableModel contatoTableModel;
    private Contato contatoEdit;

    public FrmClienteForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        estadoController = new EstadoController();
        cidadeController = new CidadeController();

        cmbModelEstado = new DefaultComboBoxModel();
        estadoController.listar().forEach((x) -> cmbModelEstado.addElement(x));
        cmbEstado.setModel(cmbModelEstado);
        cmbEstado.setSelectedIndex(0);

        cmbModelCidade = new DefaultComboBoxModel();
        cidadeController.findCidadesByEstado((Estado) cmbEstado.getSelectedItem()).forEach((x) -> cmbModelCidade.addElement(x));
        cmbCidade.setModel(cmbModelCidade);

        cliente = new Cliente();
        cliente.setContatos(new ArrayList<>());
        clienteController = new ClienteController();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContato = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtTelefoneContato = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSalvarContato = new javax.swing.JButton();
        btnEditarContato = new javax.swing.JButton();
        btnRemoverContato = new javax.swing.JButton();
        txtNomeContato = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(460, 460));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/pb/finalOO2/image/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/pb/finalOO2/image/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

        jLabel1.setText("Código:");

        txtId.setEnabled(false);

        jLabel2.setText("*Nome:");

        jLabel4.setText("*Estado:");

        cmbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstadoItemStateChanged(evt);
            }
        });

        jLabel3.setText("*Cidade:");

        jLabel5.setText("*CPF:");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("*Endereço:");

        jLabel7.setText("*CEP:");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNome)
                            .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCEP)
                            .addComponent(cmbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEndereco))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel1);

        tblContato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblContato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContatoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblContato);

        jLabel8.setText("*Nome:");

        jLabel9.setText("*Telefone");

        btnSalvarContato.setText("Salvar");
        btnSalvarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarContatoActionPerformed(evt);
            }
        });

        btnEditarContato.setText("Editar");
        btnEditarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarContatoActionPerformed(evt);
            }
        });

        btnRemoverContato.setText("Remover");
        btnRemoverContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverContatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnSalvarContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoverContato))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefoneContato, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarContato)
                    .addComponent(btnEditarContato)
                    .addComponent(btnRemoverContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Contatos:", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if (podeSalvar()) {
                salvar();

                JOptionPane.showMessageDialog(rootPane,
                        "Registro salvo com sucesso!",
                        "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane,
                    e.getMessage(),
                    "Atenção",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja cancelar?", "Atenção", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstadoItemStateChanged
        cmbModelCidade.removeAllElements();
        cidadeController.findCidadesByEstado((Estado) cmbEstado.getSelectedItem())
                .forEach((x) -> cmbModelCidade.addElement(x));
        cmbCidade.setModel(cmbModelCidade);
    }//GEN-LAST:event_cmbEstadoItemStateChanged

    private void tblContatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContatoMouseClicked
        if (evt.getClickCount() == 2) {
            carregarContato();
        }
    }//GEN-LAST:event_tblContatoMouseClicked

    private void btnSalvarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarContatoActionPerformed
        if (contatoEdit == null) {
            adicionarContato();

        } else {
            atualizarContato();
            contatoEdit = null;
        }
    }//GEN-LAST:event_btnSalvarContatoActionPerformed

    private void btnEditarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarContatoActionPerformed
        carregarContato();
    }//GEN-LAST:event_btnEditarContatoActionPerformed

    private void btnRemoverContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverContatoActionPerformed
        try {
            if (tblContato.getSelectedRow() >= 0) {
                if (JOptionPane.showConfirmDialog(rootPane, "Deseja remover o contato?", "Atenção",
                        JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
                    cliente.getContatos().remove(
                            tblContato.getSelectedRow());
                    contatoTableModel.removeRow(
                            tblContato.getSelectedRow());
                    contatoTableModel.fireTableDataChanged();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum contato selecionado para remover!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRemoverContatoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmClienteForm dialog = new FrmClienteForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarContato;
    private javax.swing.JButton btnRemoverContato;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarContato;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblContato;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeContato;
    private javax.swing.JTextField txtTelefoneContato;
    // End of variables declaration//GEN-END:variables

    public void carregarCliente(Long idCliente) {
        cliente = clienteController.buscar(idCliente);
        this.setTitle(cliente.getNome() + " - Editar Dados");
        txtId.setText(cliente.getId().toString());
        txtNome.setText(cliente.getNome());
        txtCPF.setText(cliente.getCpf());
        cmbEstado.setSelectedItem((Estado) cliente.getCidade().getEstado());
        cmbCidade.setSelectedItem((Cidade) cliente.getCidade());
        txtEndereco.setText(cliente.getEndereco());
        txtCEP.setText(cliente.getCep());

        if (cliente.getContatos() != null) {
            carregarContatos();
        } else {
            cliente.setContatos(new ArrayList<>());
        }
    }

    private void salvar() throws Exception {
        cliente.setNome(txtNome.getText());
        cliente.setCpf(txtCPF.getText().replaceAll("[-.]", ""));
        cliente.setCidade((Cidade) cmbCidade.getSelectedItem());
        cliente.setEndereco(txtEndereco.getText());
        cliente.setCep(txtCEP.getText().replaceAll("[-.]", ""));

        clienteController.salvar(cliente);
    }

    private boolean podeSalvar() throws Exception {
        if (txtNome.getText().isEmpty() || txtCPF.getText().isEmpty()
                || txtEndereco.getText().isEmpty() || txtCEP.getText().isEmpty()) {
            throw new Exception("Preencha todos os campos obrigatórios!");
        }
        return true;
    }

    private void adicionarContato() {
        Contato contato = new Contato();
        contato.setNome(txtNomeContato.getText());
        contato.setTelefone(txtTelefoneContato.getText());
        contato.setCliente(this.cliente);

        cliente.getContatos().add(contato);
        limparCamposContato();
        carregarContatos();
    }

    private void atualizarContato() {
        contatoEdit.setNome(txtNomeContato.getText());
        contatoEdit.setTelefone(txtTelefoneContato.getText());
        limparCamposContato();
        carregarContatos();
    }

    private void limparCamposContato() {
        txtNomeContato.setText("");
        txtTelefoneContato.setText("");
    }

    private void carregarContatos() {
        contatoTableModel = new ContatoTableModel(cliente.getContatos());
        tblContato.setModel(contatoTableModel);
        contatoTableModel.fireTableDataChanged();
    }

    private void carregarContato() {
        try {
            if (tblContato.getSelectedRow() >= 0) {
                contatoEdit = cliente.getContatos().get(
                        tblContato.getSelectedRow());
                txtNomeContato.setText(contatoEdit.getNome());
                txtTelefoneContato.setText(contatoEdit.getTelefone());
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um registro!",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocorreu um erro!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
}
