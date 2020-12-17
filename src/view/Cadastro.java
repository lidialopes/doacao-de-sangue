package view;

import controller.*;
import javax.swing.JOptionPane;
import org.json.*;

public class Cadastro extends javax.swing.JFrame {

    UsuarioController controllerDoador;
    TipoSanguineoController controllerTipoSanguineo;
    
    public Cadastro() {
        initComponents();
        controllerDoador = new UsuarioController();
        controllerTipoSanguineo = new TipoSanguineoController();
        controllerTipoSanguineo
                .getTipos()
                .forEach((
                        String item) -> cmbTipoSanguineo.addItem(item)
                );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRua = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        txtCep = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        lblUf = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbTipoSanguineo = new javax.swing.JComboBox<>();
        txtMunicipio = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        sepEndereco = new javax.swing.JSeparator();
        sepLogin = new javax.swing.JSeparator();
        lblLoginGroup = new javax.swing.JLabel();
        lblEnderecoGroup = new javax.swing.JLabel();
        sepDadosPessoais = new javax.swing.JSeparator();
        lblDadosPessoaisGroup = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Doador");
        setResizable(false);
        setSize(new java.awt.Dimension(450, 500));

        lblRua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRua.setText("Rua/Avenida");

        lblBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBairro.setText("Bairro");

        lblMunicipio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMunicipio.setText("Município");

        txtRua.setToolTipText("Rua/Avenida");
        txtRua.setMinimumSize(new java.awt.Dimension(7, 25));
        txtRua.setPreferredSize(new java.awt.Dimension(150, 25));

        txtBairro.setToolTipText("Bairro");
        txtBairro.setMinimumSize(new java.awt.Dimension(7, 25));
        txtBairro.setPreferredSize(new java.awt.Dimension(150, 25));

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Cadastrar Doador");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        txtCep.setToolTipText("CEP");
        txtCep.setMinimumSize(new java.awt.Dimension(7, 25));
        txtCep.setPreferredSize(new java.awt.Dimension(150, 25));
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });

        lblCep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCep.setText("CEP");

        txtUf.setToolTipText("UF");
        txtUf.setMinimumSize(new java.awt.Dimension(7, 25));
        txtUf.setPreferredSize(new java.awt.Dimension(80, 25));

        lblUf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUf.setText("UF");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTitulo.setText("Cadastro de Doador");

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setText("Email");

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLogin.setText("Login");

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSenha.setText("Senha");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Tipo Sanguíneo");

        txtMunicipio.setToolTipText("Município");
        txtMunicipio.setMinimumSize(new java.awt.Dimension(7, 25));
        txtMunicipio.setPreferredSize(new java.awt.Dimension(150, 25));

        txtNome.setToolTipText("Nome");
        txtNome.setMinimumSize(new java.awt.Dimension(7, 25));
        txtNome.setPreferredSize(new java.awt.Dimension(150, 25));

        txtLogin.setToolTipText("Login");
        txtLogin.setMinimumSize(new java.awt.Dimension(7, 25));
        txtLogin.setPreferredSize(new java.awt.Dimension(150, 25));

        txtSenha.setToolTipText("Senha");
        txtSenha.setMinimumSize(new java.awt.Dimension(7, 25));
        txtSenha.setPreferredSize(new java.awt.Dimension(150, 25));

        txtEmail.setToolTipText("Email");
        txtEmail.setMinimumSize(new java.awt.Dimension(7, 25));
        txtEmail.setPreferredSize(new java.awt.Dimension(150, 25));

        lblLoginGroup.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginGroup.setText("Login");

        lblEnderecoGroup.setForeground(new java.awt.Color(102, 102, 102));
        lblEnderecoGroup.setText("Endereço");

        lblDadosPessoaisGroup.setForeground(new java.awt.Color(102, 102, 102));
        lblDadosPessoaisGroup.setText("Dados Pessoais");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDadosPessoaisGroup)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(138, 138, 138))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnderecoGroup)
                            .addComponent(lblLoginGroup)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sepLogin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblLogin))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblSenha))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sepDadosPessoais, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sepEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblCep)
                                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblUf)))
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblBairro))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMunicipio)
                                        .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblRua)
                                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTipoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btnCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblDadosPessoaisGroup)
                .addGap(1, 1, 1)
                .addComponent(sepDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEnderecoGroup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(lblUf)
                    .addComponent(lblMunicipio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(lblRua))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblLoginGroup)
                .addGap(1, 1, 1)
                .addComponent(sepLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnCadastrar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(checkFieldEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Campos em branco", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean flag = controllerDoador.cadastra(txtBairro.getText(), txtCep.getText(), txtEmail.getText(), 
                txtLogin.getText(), txtMunicipio.getText(), txtNome.getText(), 
                txtRua.getText(), txtSenha.getText(), txtUf.getText(), 
                cmbTipoSanguineo.getSelectedItem().toString());
        if(flag){
            Login tela = new Login();
            tela.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        JSONObject info = controllerDoador.getAddressInfoByCep(txtCep.getText());
        txtUf.setText(info.getString("uf"));
        txtMunicipio.setText(info.getString("localidade"));
        txtBairro.setText(info.getString("bairro"));
        txtRua.setText(info.getString("logradouro"));
    }//GEN-LAST:event_txtCepActionPerformed

    private boolean checkFieldEmpty(){
        return txtBairro.getText().equals("") 
                && txtCep.getText().equals("")
                && txtEmail.getText().equals("")
                && txtLogin.getText().equals("")
                && txtMunicipio.getText().equals("")
                && txtNome.getText().equals("")
                && txtRua.getText().equals("")
                && txtSenha.getText().equals("")
                && txtUf.getText().equals("");
    }
    
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cmbTipoSanguineo;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblDadosPessoaisGroup;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnderecoGroup;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLoginGroup;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUf;
    private javax.swing.JSeparator sepDadosPessoais;
    private javax.swing.JSeparator sepEndereco;
    private javax.swing.JSeparator sepLogin;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
