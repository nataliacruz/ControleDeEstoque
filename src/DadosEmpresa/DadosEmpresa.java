

package DadosEmpresa;

import ConexaoBanco.ConexaoBanco;
import DimensionaImagem.DimensionaImagem;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public final class DadosEmpresa extends javax.swing.JFrame {
    
    DimensionaImagem dimImagem = new DimensionaImagem();
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;

    
    public DadosEmpresa() {
        initComponents();
        
        carregaDados();
        
        if (txtRazaoSocial.getText().isEmpty() || txtCNPJ.getText().equals("   .   .   /   -  ") ||
                txtNomeFantasia.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtEmail.getText().isEmpty() ||
                txtInscricaoEstadual.getText().isEmpty() || txtCEP.getText().isEmpty() || txtEndereco.getText().isEmpty() ||
                txtBairro.getText().isEmpty() || txtCidade.getText().isEmpty()) {
            lblSituacao.setText("Cadastro incompleto");
        } else {
            lblSituacao.setText("Cadastro completo");
        }
                
        dimImagem.dimensionaComponentes(lblImagemFundo, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 800, 550);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtCidade = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtInscricaoEstadual = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtRazaoSocial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        lblImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dados da Empresa");
        setName("Empresa"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        btnSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(120, 500, 100, 35);

        btnSalvar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(10, 500, 100, 35);

        txtCidade.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        getContentPane().add(txtCidade);
        txtCidade.setBounds(20, 440, 390, 32);

        jLabel19.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel19.setText("Cidade");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(20, 410, 70, 30);

        txtCEP.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCEPKeyTyped(evt);
            }
        });
        getContentPane().add(txtCEP);
        txtCEP.setBounds(20, 370, 120, 32);

        jLabel16.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel16.setText("CEP");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 340, 28, 30);

        jLabel17.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel17.setText("Endereço");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(160, 340, 90, 30);

        txtEndereco.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(160, 370, 320, 32);

        jLabel20.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel20.setText("Estado");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(420, 410, 60, 30);

        comboEstado.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboEstado.setMaximumRowCount(27);
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" }));
        getContentPane().add(comboEstado);
        comboEstado.setBounds(420, 440, 60, 32);

        jLabel21.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel21.setText("Situação");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(500, 410, 72, 30);

        lblSituacao.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblSituacao.setForeground(new java.awt.Color(255, 0, 0));
        lblSituacao.setText("Cadastro incompleto");
        getContentPane().add(lblSituacao);
        lblSituacao.setBounds(500, 440, 270, 30);

        txtBairro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        getContentPane().add(txtBairro);
        txtBairro.setBounds(500, 370, 270, 32);

        jLabel18.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel18.setText("Bairro");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(500, 340, 70, 30);

        txtInscricaoEstadual.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        getContentPane().add(txtInscricaoEstadual);
        txtInscricaoEstadual.setBounds(280, 280, 490, 32);

        jLabel14.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel14.setText("Inscrição Estadual");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(280, 250, 162, 30);

        txtEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        getContentPane().add(txtEmail);
        txtEmail.setBounds(280, 210, 490, 32);

        jLabel10.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel10.setText("E-mail");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(280, 180, 60, 30);

        txtNomeFantasia.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        getContentPane().add(txtNomeFantasia);
        txtNomeFantasia.setBounds(280, 140, 290, 32);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("Nome Fantasia");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 110, 117, 30);

        jLabel9.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel9.setText("Telefone");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(590, 110, 72, 30);

        txtTelefone.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(590, 140, 180, 32);

        txtRazaoSocial.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        getContentPane().add(txtRazaoSocial);
        txtRazaoSocial.setBounds(20, 40, 550, 32);

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setText("CNPJ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 10, 36, 30);

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        getContentPane().add(txtCNPJ);
        txtCNPJ.setBounds(590, 40, 180, 32);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setText("Razão Social");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 110, 30);

        lblImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagemMouseClicked(evt);
            }
        });
        getContentPane().add(lblImagem);
        lblImagem.setBounds(20, 110, 230, 210);
        getContentPane().add(lblImagemFundo);
        lblImagemFundo.setBounds(0, 0, 800, 550);

        setSize(new java.awt.Dimension(804, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (txtRazaoSocial.getText().isEmpty() || txtCNPJ.getText().equals("   .   .   /   -  ") ||
                txtNomeFantasia.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtEmail.getText().isEmpty() ||
                txtInscricaoEstadual.getText().isEmpty() || txtCEP.getText().isEmpty() || txtEndereco.getText().isEmpty() ||
                txtBairro.getText().isEmpty() || txtCidade.getText().isEmpty()) {
            lblSituacao.setText("Cadastro incompleto");
        } else {
            lblSituacao.setText("Cadastro completo");
        }
        
        //restriçoes para atualizar empresa
        if (txtRazaoSocial.getText().equals("") || txtRazaoSocial.getText().equals("Campo obrigatório"))
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo Razão Social!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtRazaoSocial.grabFocus();
        }
        else if (txtRazaoSocial.getText().length() >45)
        {
            JOptionPane.showMessageDialog(null, "Razão Social excede o limite de caracteres!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtRazaoSocial.grabFocus();
        }
        else if (txtNomeFantasia.getText().length() >45)
        {
            JOptionPane.showMessageDialog(null, "Nome Fantasia excede o limite de caracteres!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtNomeFantasia.grabFocus();
        }
        else if (txtCEP.getText().length() >10)
        {
            JOptionPane.showMessageDialog(null, "CEP excede o limite de caracteres!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtCEP.grabFocus();
        }
        else if (txtCidade.getText().length() >45)
        {
            JOptionPane.showMessageDialog(null, "Cidade excede o limite de caracteres!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtCidade.grabFocus();
        }
        else if (txtEndereco.getText().length() >45)
        {
            JOptionPane.showMessageDialog(null, "Endereco excede o limite de caracteres!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtEndereco.grabFocus();
        }
        else if (txtBairro.getText().length() >45)
        {
            JOptionPane.showMessageDialog(null, "Bairro excede o limite de caracteres!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtBairro.grabFocus();
        }
        else if (txtTelefone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo Telefone!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtTelefone.grabFocus();
        }
        else if (txtTelefone.getText().length() >20)
        {
            JOptionPane.showMessageDialog(null, "Telefone excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtTelefone.grabFocus();
        }
        else if (txtEmail.getText().length() >45)
        {
            JOptionPane.showMessageDialog(null, "E-mail excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtEmail.grabFocus();
        }
        else if (txtInscricaoEstadual.getText().length() >50)
        {
            JOptionPane.showMessageDialog(null, "Inscrição Estadual excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtInscricaoEstadual.grabFocus();
        }
        else
        {
            updateDados();
            copiaFoto(lblImagem.getName());
            updateFoto(lblImagem.getName());
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCEPKeyTyped

        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+""))
        {
            evt.consume();
        }

    }//GEN-LAST:event_txtCEPKeyTyped

    private void lblImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagemMouseClicked

        Object[] options = {"Visualizar","Alterar foto"};
        int opcao = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (opcao == 0)
        {
            try
            {
                java.awt.Desktop.getDesktop().open( new File( lblImagem.getName() ) );
            }
            catch (IOException e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (opcao == 1)
        {

            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", "jpg");
            //use FILES_ONLY caso deseje que o usuario selecione apenas arquivos
            fileChooser.setDialogTitle("Selecione um arquivo/imagem");
            fileChooser.setFileFilter(filter);
            int status = fileChooser.showOpenDialog(null);

            if (status == JFileChooser.APPROVE_OPTION)
            {

                File arquivo = fileChooser.getSelectedFile();//arquivo

                String caminho = arquivo.getAbsolutePath().replace('\\', '/');
                lblImagem.setName(caminho);
                
                dimImagem.dimensionaComponentes(lblImagem, caminho, 230, 210);

            }
            else
            {
                // o usuario desistiu, faça algo
                fileChooser.setVisible(false);
            }

        }

    }//GEN-LAST:event_lblImagemMouseClicked

    
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
            java.util.logging.Logger.getLogger(DadosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosEmpresa().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇAM OS MÉTODOS
    
    public void carregaDados() {
        try
        {
            banco.conexaoBanco();
            rs=banco.st.executeQuery("select * from dados_empresa where Codigo_Empresa = 1");
        
            while (rs.next())
            {
                txtRazaoSocial.setText(rs.getString("Razao_Social"));
                txtNomeFantasia.setText(rs.getString("Nome_Fantasia"));
                txtCNPJ.setText(rs.getString("CNPJ"));
                txtCEP.setText(rs.getString("CEP"));
                txtCidade.setText(rs.getString("Cidade"));
                comboEstado.setSelectedItem(rs.getString("Estado"));
                txtEndereco.setText(rs.getString("Endereco"));
                txtBairro.setText(rs.getString("Bairro"));
                txtTelefone.setText(rs.getString("Telefone"));
                txtEmail.setText(rs.getString("Email"));
                txtInscricaoEstadual.setText(rs.getString("Inscricao_Estadual"));
                lblImagem.setName(rs.getString("Foto"));
            }
            
            dimImagem.dimensionaComponentes(lblImagem, lblImagem.getName(), 230, 210);
            
            rs.close();
            banco.fecharConexaoBanco();
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateDados() {
        
        try{
                
                //atualizar os dados da empresa
                banco.conexaoBanco();
                ps = banco.con.prepareStatement("update dados_empresa set Razao_Social ='"+txtRazaoSocial.getText()+"',"
                +"Nome_Fantasia = '"+txtNomeFantasia.getText()+"',"
                +"CNPJ = '"+txtCNPJ.getText()+"',"
                +"CEP = '"+txtCEP.getText()+"',"
                +"Cidade = '"+txtCidade.getText()+"',"
                +"Estado = '"+comboEstado.getSelectedItem().toString()+"',"
                +"Endereco = '"+txtEndereco.getText()+"',"
                +"Bairro = '"+txtBairro.getText()+"',"
                +"Telefone = '"+txtTelefone.getText()+"',"
                +"Email = '"+txtEmail.getText()+"',"
                + "Inscricao_Estadual = '"+txtInscricaoEstadual.getText()+"',"
                + "Foto = '"+lblImagem.getName()+"' where Codigo_Empresa = 1");
                ps.executeUpdate();
                
                //mensagem emitida se atualizar com sucesso
                JOptionPane.showMessageDialog(null, "Dados da empresa atualizados com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                
                //fechar conexoes
                ps.close();
                banco.fecharConexaoBanco();
                
                this.dispose();
            }
            catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
                
            }
        
    }
    
    public void copiaFoto(String foto) {
            
    	String Diretorio = foto;
        String caminho = "C:/ControleDeEstoque/Imagens/LogoEmpresa/LOGO.jpg";
        Path source = Paths.get(Diretorio);
        Path target = Paths.get(caminho);
        try
        {
            if (!source.equals(target))
            {
                Files.deleteIfExists(target);
                Files.copy(source, target);
            }

            lblImagem.setName(caminho);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void updateFoto(String Foto) {
        
        try
        {            
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update dados_empresa set Foto = '"+Foto+"' where Codigo_Empresa = 1");
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtInscricaoEstadual;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
