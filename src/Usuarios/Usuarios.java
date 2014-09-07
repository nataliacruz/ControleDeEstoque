

package Usuarios;

import ConexaoBanco.ConexaoBanco;
import DimensionaImagem.DimensionaImagem;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public final class Usuarios extends javax.swing.JFrame {

    DimensionaImagem dimImagem = new DimensionaImagem();
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;
    DefaultTableModel tabela;
    public String nomeUsuario;
   
    public Usuarios() {
        initComponents();
        
        Font font = new Font("NSimSun", Font.PLAIN, 18);
        JTableHeader cabecalho = tabelaUsuarios.getTableHeader();
        cabecalho.setFont(font);
        
        carregaUsuarios("Todos", null, (DefaultTableModel) tabelaUsuarios.getModel());
        
        dimImagem.dimensionaComponentes(lblImagemFundo, "/ControleDeEstoque/Imagens/ImagemFundoUsuario.jpg", 320, 120);
        dimImagem.dimensionaComponentes(lblImagemFundo1, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 530, 380);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        InternalFrameUsuarios = new javax.swing.JInternalFrame();
        lblCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblDataCadastro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        pTxtSenha = new javax.swing.JPasswordField();
        lblSituacao = new javax.swing.JLabel();
        pTxtSenha2 = new javax.swing.JPasswordField();
        btnFechar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        lblImagemFundo1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        btnDados = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de usuários");
        setName("Usuarios"); // NOI18N

        PainelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PainelPrincipal.setLayout(null);

        InternalFrameUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        InternalFrameUsuarios.setClosable(true);
        InternalFrameUsuarios.setTitle("Novo cadastro");
        InternalFrameUsuarios.setVisible(false);
        InternalFrameUsuarios.getContentPane().setLayout(null);

        lblCodigo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("Código");
        InternalFrameUsuarios.getContentPane().add(lblCodigo);
        lblCodigo.setBounds(20, 40, 60, 30);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("Nome de usuário");
        InternalFrameUsuarios.getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 10, 140, 30);

        jLabel6.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel6.setText("Código");
        InternalFrameUsuarios.getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 10, 60, 30);

        txtNome.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameUsuarios.getContentPane().add(txtNome);
        txtNome.setBounds(100, 40, 230, 32);

        jLabel8.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel8.setText("Cadastrado em");
        InternalFrameUsuarios.getContentPane().add(jLabel8);
        jLabel8.setBounds(350, 10, 130, 30);

        lblDataCadastro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblDataCadastro.setForeground(new java.awt.Color(255, 0, 0));
        lblDataCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataCadastro.setText("Data do cadastro");
        InternalFrameUsuarios.getContentPane().add(lblDataCadastro);
        lblDataCadastro.setBounds(350, 40, 150, 30);

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Tipo de usuário");
        InternalFrameUsuarios.getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 100, 135, 30);

        comboTipo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "Administrador", "Normal" }));
        InternalFrameUsuarios.getContentPane().add(comboTipo);
        comboTipo.setBounds(280, 130, 220, 34);

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setText("Senha");
        InternalFrameUsuarios.getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 170, 45, 30);

        pTxtSenha.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameUsuarios.getContentPane().add(pTxtSenha);
        pTxtSenha.setBounds(280, 200, 220, 32);

        lblSituacao.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblSituacao.setText("Digite a senha novamente");
        lblSituacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSituacaoMousePressed(evt);
            }
        });
        InternalFrameUsuarios.getContentPane().add(lblSituacao);
        lblSituacao.setBounds(280, 240, 220, 30);

        pTxtSenha2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameUsuarios.getContentPane().add(pTxtSenha2);
        pTxtSenha2.setBounds(280, 270, 220, 32);

        btnFechar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnFechar.setText("Sair");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        InternalFrameUsuarios.getContentPane().add(btnFechar);
        btnFechar.setBounds(130, 330, 100, 35);

        btnSalvar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        InternalFrameUsuarios.getContentPane().add(btnSalvar);
        btnSalvar.setBounds(20, 330, 100, 35);

        lblImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagemMouseClicked(evt);
            }
        });
        InternalFrameUsuarios.getContentPane().add(lblImagem);
        lblImagem.setBounds(20, 100, 230, 210);
        InternalFrameUsuarios.getContentPane().add(lblImagemFundo1);
        lblImagemFundo1.setBounds(0, 0, 530, 380);

        PainelPrincipal.add(InternalFrameUsuarios);
        InternalFrameUsuarios.setBounds(0, 0, 540, 410);

        btnNovo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnNovo);
        btnNovo.setBounds(20, 360, 100, 35);

        tabelaUsuarios.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Tipo", "Cod"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaUsuarios.setRowHeight(25);
        tabelaUsuarios.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuariosMouseClicked(evt);
            }
        });
        tabelaUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaUsuariosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuarios);
        if (tabelaUsuarios.getColumnModel().getColumnCount() > 0) {
            tabelaUsuarios.getColumnModel().getColumn(0).setResizable(false);
            tabelaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabelaUsuarios.getColumnModel().getColumn(1).setResizable(false);
            tabelaUsuarios.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelaUsuarios.getColumnModel().getColumn(2).setResizable(false);
            tabelaUsuarios.getColumnModel().getColumn(2).setPreferredWidth(35);
        }

        PainelPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(20, 92, 500, 200);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar usuários");
        PainelPrincipal.add(jLabel1);
        jLabel1.setBounds(20, 10, 170, 30);

        txtPesquisar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });
        PainelPrincipal.add(txtPesquisar);
        txtPesquisar.setBounds(20, 42, 500, 32);

        btnSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnSair);
        btnSair.setBounds(420, 360, 100, 35);

        lblStatus.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatus.setText("Usuários cadastrados:");
        PainelPrincipal.add(lblStatus);
        lblStatus.setBounds(20, 310, 330, 30);

        btnDados.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnDados.setText("Dados");
        btnDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnDados);
        btnDados.setBounds(130, 360, 100, 35);

        btnExcluir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnExcluir);
        btnExcluir.setBounds(240, 360, 100, 35);
        PainelPrincipal.add(lblImagemFundo);
        lblImagemFundo.setBounds(220, 290, 320, 120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
       
        txtNome.setText("");
        comboTipo.setSelectedIndex(0);
        pTxtSenha.setText("");
        
        txtNome.setEnabled(true);
        comboTipo.setEnabled(true);
        
        pTxtSenha.setEditable(true);
        pTxtSenha2.setVisible(true);
        lblSituacao.setText("Digite a senha novamente");
        lblSituacao.setForeground(Color.BLACK);
        lblSituacao.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        
        lblCodigo.setText(String.valueOf(getMaxCodigo()+1));
        
        lblImagem.setName("/ControleDeEstoque/Imagens/UsuarioPadrao.jpg");
        lblImagem.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/UsuarioPadrao.jpg"));
                
        InternalFrameUsuarios.setTitle("Novo cadastro");
        InternalFrameUsuarios.setVisible(true);
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        
        //pesquisar no banco os registros
        carregaUsuarios("Like", txtPesquisar.getText(), (DefaultTableModel) tabelaUsuarios.getModel());
            
        if (txtPesquisar.getText().equals(""))
        {
            
            //label recebe cor preta
            lblStatus.setForeground(Color.BLACK);
        
        }
        else
        {
             //label status adquire o texto e a cor abaixo
            lblStatus.setText("Status: Pesquisando Usuário");
            lblStatus.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed
        
        int linha = tabelaUsuarios.getSelectedRow();
        if (linha== -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um usuário para alterar!","Atenção",JOptionPane.INFORMATION_MESSAGE);
        }
        
        else
        {
            txtNome.setText("");
            comboTipo.setSelectedIndex(0);
            pTxtSenha.setText("");
            
            pTxtSenha.setEditable(false);
            pTxtSenha2.setVisible(false);
            lblSituacao.setText("Alterar senha");
            lblSituacao.setForeground(Color.RED);
            lblSituacao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            
            carregarUsuario(Integer.valueOf(tabelaUsuarios.getModel().getValueAt(linha, 2).toString()));
            lblCodigo.setText(tabelaUsuarios.getModel().getValueAt(linha, 2).toString());
            
            dimImagem.dimensionaComponentes(lblImagem, lblImagem.getName(), 230, 210);

            InternalFrameUsuarios.setTitle("Alteração de dados");
            InternalFrameUsuarios.setVisible(true);
            
            txtNome.grabFocus();
                                            
        }
        
    }//GEN-LAST:event_btnDadosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabelaUsuarios.getSelectedRow();
        if (linha== -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um usuário para excluir!","Atenção",JOptionPane.INFORMATION_MESSAGE);
        }
        
        else
        {            
            if (tabelaUsuarios.getModel().getValueAt(linha, 0).toString().equals("Administrador"))
            {
                JOptionPane.showMessageDialog(null, "Este é um usuário padrão e não pode ser excluído!","Atenção",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {        
                int con = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?","Atenção",JOptionPane.YES_NO_OPTION);
                if (con==0)
                {                    
                    excluirUsuario(tabelaUsuarios.getModel().getValueAt(linha, 2).toString());
                }
            }                
        }        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (txtNome.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Defina um nome de usuário!","Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else if (txtNome.getText().length() >15)
        {
            JOptionPane.showMessageDialog(null, "O nome de usuário não pode possuir mais de 15 caracteres!","Atenção", JOptionPane.WARNING_MESSAGE);

        }
        else if (comboTipo.getSelectedItem().equals("<Selecione>"))
        {
            JOptionPane.showMessageDialog(null, "Selecione o tipo do usuário!","Atenção", JOptionPane.WARNING_MESSAGE);
        }        
        else
        {
            if (InternalFrameUsuarios.getTitle().equals("Novo cadastro"))
            {
                if (pTxtSenha.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Defina uma senha!","Atenção", JOptionPane.WARNING_MESSAGE);
                }
                else if (pTxtSenha.getText().length() >15)
                {
                    JOptionPane.showMessageDialog(null, "A senha não pode possuir mais de 15 caracteres!","Atenção", JOptionPane.WARNING_MESSAGE);
                }
                else if (!pTxtSenha.getText().equals(pTxtSenha2.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Digite a senha corretamente nos dois campos!","Atenção", JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    cadastrarUsuario(txtNome.getText(), comboTipo.getSelectedItem().toString(), pTxtSenha.getText());
                    lblCodigo.setText(String.valueOf(getMaxCodigo()));
                    copiaFoto(lblImagem.getName(), lblCodigo.getText());
                    updateFoto(lblImagem.getName(), lblCodigo.getText());
                    
                    carregaUsuarios("Todos", null, (DefaultTableModel) tabelaUsuarios.getModel());     
                    JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    InternalFrameUsuarios.dispose();
                }                
            }
            else
            {
                if (lblSituacao.getText().equals("Digite a nova senha"))
                {
                    if (pTxtSenha2.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"Você não digitou uma nova senha!\nA senha deste usuário não será alterada!", "Atenção", JOptionPane.WARNING_MESSAGE);
                        
                        updateUsuario(Integer.valueOf(lblCodigo.getText()), txtNome.getText(), comboTipo.getSelectedItem().toString(), pTxtSenha.getText());
                        copiaFoto(lblImagem.getName(), lblCodigo.getText());
                        updateFoto(lblImagem.getName(), lblCodigo.getText());
                    }
                    else
                    {
                        updateUsuario(Integer.valueOf(lblCodigo.getText()), txtNome.getText(), comboTipo.getSelectedItem().toString(), pTxtSenha2.getText());
                        copiaFoto(lblImagem.getName(), lblCodigo.getText());
                        updateFoto(lblImagem.getName(), lblCodigo.getText());
                    }
                }
                else
                {
                    updateUsuario(Integer.valueOf(lblCodigo.getText()), txtNome.getText(), comboTipo.getSelectedItem().toString(), pTxtSenha.getText());
                    copiaFoto(lblImagem.getName(), lblCodigo.getText());
                    updateFoto(lblImagem.getName(), lblCodigo.getText());                    
                }
                
                JOptionPane.showMessageDialog(null, "Cadastro editado com sucesso!","Atenção", JOptionPane.INFORMATION_MESSAGE);               
                carregaUsuarios("Todos", null, (DefaultTableModel) tabelaUsuarios.getModel());
                InternalFrameUsuarios.dispose();
            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        InternalFrameUsuarios.dispose();

    }//GEN-LAST:event_btnFecharActionPerformed

    private void tabelaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuariosMouseClicked
        
        if (evt.getClickCount() == 2)
        {
            btnDadosActionPerformed(null);
            carregaUsuarios("Todos", null, (DefaultTableModel) tabelaUsuarios.getModel());
        }
        
    }//GEN-LAST:event_tabelaUsuariosMouseClicked

    private void tabelaUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaUsuariosKeyPressed
        
        int key = evt.getKeyChar();
        if (key == evt.VK_DELETE)
        {
            btnExcluirActionPerformed(null);
        }
        
    }//GEN-LAST:event_tabelaUsuariosKeyPressed

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
            Object[] options1 = {"Restaurar padrão","Escolher outra foto"};
            int opcao1 = JOptionPane.showOptionDialog(null, "Como deseja alterar esta foto?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[0]);
            
            if (opcao1 == 0)
            {

                lblImagem.setIcon(new ImageIcon("C:/ControleDeEstoque/Imagens/UsuarioPadrao.jpg"));
                lblImagem.setName("C:/ControleDeEstoque/Imagens/UsuarioPadrao.jpg");

                
            }
            if (opcao1 ==1 )
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
            
        }
        
    }//GEN-LAST:event_lblImagemMouseClicked

    private void lblSituacaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSituacaoMousePressed
        
        if (InternalFrameUsuarios.getTitle().equals("Alteração de dados"))
        {
            lblSituacao.setText("Digite a nova senha");
            lblSituacao.setForeground(Color.BLACK);
            lblSituacao.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            pTxtSenha2.setVisible(true);
            pTxtSenha2.grabFocus();
        }
        
    }//GEN-LAST:event_lblSituacaoMousePressed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇAM OS METODOS
    
    public void carregaUsuarios(String Instrucao, String Texto, DefaultTableModel tabela)
    {
        String Query = "";
        if (Instrucao.equals("Todos"))
        {
            Query = "select * from usuarios where Excluido = 0 order by Codigo_Usuario";
        }
        else if (Instrucao.equals("Like"))
        {
            Query = "select * from usuarios where Nome like '%"+Texto+"%' and Excluido = 0 order by Codigo_Usuario";
        }
        //fazer a pesquisa no banco e listar na tabela os itens
        try
        {
            banco.conexaoBanco();

            rs = banco.st.executeQuery(Query);

            int Contador = 0;
            tabela.setRowCount(0);
            while ( rs.next() )
            {
                    tabela.addRow(new Object[] {
                    rs.getString( "Nome" ),    
                    rs.getString( "Tipo" ),
                    rs.getString("Codigo_Usuario")
                    });
                    Contador++;
            }
            
            lblStatus.setText("Usuários cadastrados: "+Contador);

            //fechar as conexoes

            rs.close();
            banco.fecharConexaoBanco();
                
                
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void carregarUsuario(int codigo) {
        
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            banco.conexaoBanco();
            rs = banco.st.executeQuery("Select * from usuarios where Codigo_Usuario = '"+codigo+"'");
            
            while (rs.next())
            {
                txtNome.setText(rs.getString("Nome"));
                nomeUsuario = txtNome.getText();
                comboTipo.setSelectedItem(rs.getString("Tipo"));
                pTxtSenha.setText(rs.getString("Senha"));
                lblImagem.setName(rs.getString("Foto"));
                lblDataCadastro.setText(sdf.format(rs.getDate("Data_Cadastro")));
            }
            
            rs.close();
            banco.fecharConexaoBanco();
            
            if (txtNome.getText().equals("Administrador"))
            {
                txtNome.setEnabled(false);
                comboTipo.setEnabled(false);
                pTxtSenha.grabFocus();
            }
            else
            {
                txtNome.setEnabled(true);
                comboTipo.setEnabled(true);
                txtNome.grabFocus();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public int getMaxCodigo() {
        int codUsuario = 0;
        try 
        {
        banco.conexaoBanco();
        rs = banco.st.executeQuery("select MAX(Codigo_Usuario) as CodUsuario from usuarios");
        while (rs.next()) 
        {
            codUsuario = rs.getInt("CodUsuario");
        }
        rs.close();
        banco.fecharConexaoBanco();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        return codUsuario;
    }
    
    public void excluirUsuario(String codigo) {
        
        try
        {
            banco.conexaoBanco();
            ps=banco.con.prepareStatement("update usuarios set Excluido = 1 where Codigo_Usuario = '"+codigo+"'");
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
            
            carregaUsuarios("Todos", null, (DefaultTableModel) tabelaUsuarios.getModel());
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void cadastrarUsuario(String Nome, String Tipo, String Senha) {
        
        try
        {
            banco.conexaoBanco();
            rs=banco.st.executeQuery("select Nome from usuarios where Excluido = 0");

            int cont = 0;

            while (rs.next())
            {
                if (txtNome.getText().equals(rs.getString("Nome")))
                {
                    cont = 1;
                }
                if (txtNome.getText().equals(nomeUsuario))
                {
                    cont = 0;
                }

            }

            if (cont == 0)
            {
                ps=banco.con.prepareStatement("insert into usuarios (Nome, Senha, Tipo) values (?, ?, ?)");
                ps.setString(1, Nome);
                ps.setString(2, Senha);
                ps.setString(3, Tipo);
                ps.executeUpdate();
                
                ps.close();
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Este nome de usuário já existe!","Atenção", JOptionPane.WARNING_MESSAGE);   
            }
            rs.close();
            banco.fecharConexaoBanco();  

        }
        catch (HeadlessException | SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void updateUsuario(int Codigo, String Nome, String Tipo, String Senha) {
        
        try
        {
            banco.conexaoBanco();
            
            rs=banco.st.executeQuery("select Nome from usuarios where Excluido = 0");

            int cont = 0;

            while (rs.next())
            {
                if (txtNome.getText().equals(rs.getString("Nome")))
                {
                    cont = 1;
                }
                if (txtNome.getText().equals(nomeUsuario))
                {
                    cont = 0;
                }
            }

            if (cont == 0)
            {                
                ps=banco.con.prepareStatement("update usuarios set Nome = '"+Nome+"',"+
                    "Tipo = '"+Tipo+"',"+
                    "Senha = '"+Senha+"' where Codigo_Usuario = '"+Codigo+"'");
                ps.executeUpdate();

                ps.close();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Este nome de usuário já existe!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            rs.close();
            banco.fecharConexaoBanco();

        }
        catch (HeadlessException | SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void copiaFoto(String foto, String codigo) {
        
        String Nome = "Usuario";     
    	String Diretorio = foto;
    	String Nome_Da_Imagem =  Nome + codigo +".jpg" ; 
        String caminho = "C:/ControleDeEstoque/Imagens/Usuarios/" + Nome_Da_Imagem;
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
    
    public void updateFoto(String Foto, String Codigo) {
        
        try
        {            
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update usuarios set Foto = '"+Foto+"' where Codigo_Usuario = '"+Codigo+"'");
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
    
    public int retornaCodUsuario(String nome) {
        
        int codUsuario = 0;
        
        try
        {            
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Codigo_Usuario from usuarios where Nome = '"+nome+"'");
            while (rs.next())
            {
                codUsuario = rs.getInt("Codigo_Usuario");
            }
            rs.close();
            banco.fecharConexaoBanco();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        return codUsuario;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame InternalFrameUsuarios;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JButton btnDados;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblImagemFundo1;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPasswordField pTxtSenha;
    private javax.swing.JPasswordField pTxtSenha2;
    private javax.swing.JTable tabelaUsuarios;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
