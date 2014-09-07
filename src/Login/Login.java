
package Login;

import ConexaoBanco.ConexaoBanco;
import MenuPrincipal.MenuPrincipal;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class Login extends javax.swing.JFrame {

    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;
    
    public Login() {
        initComponents();
        
        carregaUsuario();
        
        File foto = new File("C:/ControleDeEstoque/Imagens/LoginIcone.jpg");
        formataFoto(foto);
        
        pTxtSenha.grabFocus();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboUsuario = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        pTxtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entre com um usuário");
        setName("Login"); // NOI18N
        setResizable(false);

        PainelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PainelPrincipal.setLayout(null);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setText("Nome de Usuário");
        PainelPrincipal.add(jLabel1);
        jLabel1.setBounds(130, 20, 135, 30);

        comboUsuario.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboUsuario.setAlignmentX(CENTER_ALIGNMENT);
        comboUsuario.setAlignmentY(CENTER_ALIGNMENT);
        comboUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUsuarioActionPerformed(evt);
            }
        });
        PainelPrincipal.add(comboUsuario);
        comboUsuario.setBounds(90, 50, 220, 32);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("Senha");
        PainelPrincipal.add(jLabel2);
        jLabel2.setBounds(170, 90, 45, 30);

        pTxtSenha.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        pTxtSenha.setAlignmentX(CENTER_ALIGNMENT);
        pTxtSenha.setAlignmentY(CENTER_ALIGNMENT);
        pTxtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pTxtSenhaKeyPressed(evt);
            }
        });
        PainelPrincipal.add(pTxtSenha);
        pTxtSenha.setBounds(90, 120, 220, 32);

        btnEntrar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnEntrar);
        btnEntrar.setBounds(90, 300, 100, 35);

        btnSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnSair);
        btnSair.setBounds(210, 300, 100, 35);
        PainelPrincipal.add(lblImagem);
        lblImagem.setBounds(0, 0, 400, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pTxtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pTxtSenhaKeyPressed

        int tecla = evt.getKeyCode();
        if (tecla ==10)
        {
            
           verificaLoginSenha();

        }

    }//GEN-LAST:event_pTxtSenhaKeyPressed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        verificaLoginSenha();

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        System.exit(0);

    }//GEN-LAST:event_btnSairActionPerformed

    private void comboUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUsuarioActionPerformed
        
        pTxtSenha.grabFocus();
        
    }//GEN-LAST:event_comboUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇAM OS MÉTODOS
    
    public void carregaUsuario() {
        try
            {
                banco.conexaoBanco();
                rs=banco.st.executeQuery("select * from usuarios where Excluido = 0 order by Codigo_Usuario");

                String nome = "";
                while ( rs.next() )
                {
                        nome = rs.getString("Nome");
                        comboUsuario.addItem(nome);

                }
                
                rs.close();
                banco.fecharConexaoBanco();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
            }
    }

    public void verificaLoginSenha() {
        try
            {
                banco.conexaoBanco();
                rs= banco.st.executeQuery("select Nome, Senha from usuarios");

                int cont = 0;
                while (rs.next())
                {

                    if (comboUsuario.getSelectedItem().equals(rs.getString("Nome")) && pTxtSenha.getText().equals(rs.getString("Senha")))
                    {
                        cont = 1;
                    }

                }
                
                if (cont ==1)
                {
                    this.dispose();
                    
                    MenuPrincipal menuPrincipal = new MenuPrincipal();
                    menuPrincipal.setVisible(true);
                    
                    SimpleDateFormat fds = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    String Data = fds.format(new Date());
                    
                    menuPrincipal.setUsuario(comboUsuario.getSelectedItem().toString(), Data);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!","Atenção", JOptionPane.ERROR_MESSAGE);
                    pTxtSenha.setText("");
                    pTxtSenha.grabFocus();
                }
                rs.close();
                banco.fecharConexaoBanco();

            }
            catch (SQLException e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ocorreu um erro "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void formataFoto(File foto) {
        
        try
        {
            BufferedImage bi;
            bi = ImageIO.read(foto); //carrega a imagem real num buffer
            BufferedImage aux = new BufferedImage(400, 370, bi.getType());//cria um buffer auxiliar com o tamanho desejado    
            Graphics2D g = aux.createGraphics();//pega a classe graphics do aux para edicao    
            AffineTransform at = AffineTransform.getScaleInstance((double) 400 / bi.getWidth(), (double) 370 / bi.getHeight());//cria a transformacao    
            g.drawRenderedImage(bi, at);//pinta e transforma a imagem real no auxiliar
            lblImagem.setIcon(new ImageIcon(aux));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox comboUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JPasswordField pTxtSenha;
    // End of variables declaration//GEN-END:variables
}
