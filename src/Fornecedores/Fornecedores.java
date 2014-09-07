
package Fornecedores;

import ConexaoBanco.ConexaoBanco;
import DimensionaImagem.DimensionaImagem;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Fornecedores extends javax.swing.JFrame {

    DimensionaImagem dimImagem = new DimensionaImagem();
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;
    DefaultTableModel tabela;
    public String razaoSocial;
    
    public Fornecedores() {
        initComponents();
        
        Font font = new Font("NSimSun", Font.PLAIN, 18);
        JTableHeader cabecalho = tabelaFornecedor.getTableHeader();
        cabecalho.setFont(font);
        
        carregaFornecedor(txtPesquisar.getText(), (DefaultTableModel) tabelaFornecedor.getModel(), lblStatus);
        
        dimImagem.dimensionaComponentes(lblImagemFundo, "/ControleDeEstoque/Imagens/ImagemFundoFuncionario.jpg", 550, 160);
        dimImagem.dimensionaComponentes(lblImagemFundo1, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 800, 560);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelFornecedor = new javax.swing.JPanel();
        InternalFrameFornecedor = new javax.swing.JInternalFrame();
        btnFechar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtInscricaoEstadual = new javax.swing.JTextField();
        lblDataCadastro = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox();
        txtCidade = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblImagemFundo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnDados = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedores");

        PainelFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        PainelFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        PainelFornecedor.setLayout(null);

        InternalFrameFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        InternalFrameFornecedor.setClosable(true);
        InternalFrameFornecedor.setTitle("Novo cadastro");
        InternalFrameFornecedor.setName("Novo cadastro"); // NOI18N
        InternalFrameFornecedor.setVisible(false);
        InternalFrameFornecedor.getContentPane().setLayout(null);

        btnFechar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnFechar.setText("Sair");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        InternalFrameFornecedor.getContentPane().add(btnFechar);
        btnFechar.setBounds(130, 510, 100, 35);

        btnSalvar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        InternalFrameFornecedor.getContentPane().add(btnSalvar);
        btnSalvar.setBounds(20, 510, 100, 35);

        jLabel15.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel15.setText("Código");
        InternalFrameFornecedor.getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 10, 60, 30);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("Razão Social");
        InternalFrameFornecedor.getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 10, 110, 30);

        txtRazaoSocial.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFornecedor.getContentPane().add(txtRazaoSocial);
        txtRazaoSocial.setBounds(100, 40, 470, 32);

        lblCodigo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("Código");
        InternalFrameFornecedor.getContentPane().add(lblCodigo);
        lblCodigo.setBounds(20, 40, 60, 30);

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Nome Fantasia");
        InternalFrameFornecedor.getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 110, 130, 30);

        lblImagem.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lblImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblImagem.setName(""); // NOI18N
        lblImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagemMouseClicked(evt);
            }
        });
        InternalFrameFornecedor.getContentPane().add(lblImagem);
        lblImagem.setBounds(20, 110, 230, 210);

        txtNomeFantasia.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFornecedor.getContentPane().add(txtNomeFantasia);
        txtNomeFantasia.setBounds(280, 140, 290, 32);

        jLabel16.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel16.setText("E-mail");
        InternalFrameFornecedor.getContentPane().add(jLabel16);
        jLabel16.setBounds(280, 180, 70, 30);

        txtEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFornecedor.getContentPane().add(txtEmail);
        txtEmail.setBounds(280, 210, 290, 32);

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setText("CNPJ");
        InternalFrameFornecedor.getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 110, 40, 30);

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFornecedor.getContentPane().add(txtCNPJ);
        txtCNPJ.setBounds(590, 140, 180, 32);

        jLabel11.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel11.setText("Telefone");
        InternalFrameFornecedor.getContentPane().add(jLabel11);
        jLabel11.setBounds(590, 180, 72, 30);

        txtTelefone.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFornecedor.getContentPane().add(txtTelefone);
        txtTelefone.setBounds(590, 210, 180, 32);

        jLabel12.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel12.setText("Inscrição Estadual");
        InternalFrameFornecedor.getContentPane().add(jLabel12);
        jLabel12.setBounds(280, 250, 162, 30);

        txtInscricaoEstadual.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFornecedor.getContentPane().add(txtInscricaoEstadual);
        txtInscricaoEstadual.setBounds(280, 280, 490, 32);

        lblDataCadastro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblDataCadastro.setForeground(new java.awt.Color(255, 0, 0));
        lblDataCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataCadastro.setText("Data do cadastro");
        InternalFrameFornecedor.getContentPane().add(lblDataCadastro);
        lblDataCadastro.setBounds(620, 40, 150, 30);

        jLabel13.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel13.setText("Cadastrado em");
        InternalFrameFornecedor.getContentPane().add(jLabel13);
        jLabel13.setBounds(620, 10, 130, 30);

        jLabel20.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel20.setText("Bairro");
        InternalFrameFornecedor.getContentPane().add(jLabel20);
        jLabel20.setBounds(500, 340, 70, 30);

        txtBairro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFornecedor.getContentPane().add(txtBairro);
        txtBairro.setBounds(500, 370, 270, 32);

        jLabel22.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel22.setText("Situação");
        InternalFrameFornecedor.getContentPane().add(jLabel22);
        jLabel22.setBounds(500, 410, 72, 30);

        lblSituacao.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblSituacao.setForeground(new java.awt.Color(255, 0, 0));
        lblSituacao.setText("Fornecedor não cadastrado");
        InternalFrameFornecedor.getContentPane().add(lblSituacao);
        lblSituacao.setBounds(500, 440, 270, 30);

        jLabel24.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel24.setText("Estado");
        InternalFrameFornecedor.getContentPane().add(jLabel24);
        jLabel24.setBounds(420, 410, 60, 30);

        comboEstado.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboEstado.setMaximumRowCount(27);
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" }));
        InternalFrameFornecedor.getContentPane().add(comboEstado);
        comboEstado.setBounds(420, 440, 60, 32);

        txtCidade.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFornecedor.getContentPane().add(txtCidade);
        txtCidade.setBounds(20, 440, 390, 32);

        txtEndereco.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFornecedor.getContentPane().add(txtEndereco);
        txtEndereco.setBounds(160, 370, 320, 32);

        jLabel14.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel14.setText("Endereço");
        InternalFrameFornecedor.getContentPane().add(jLabel14);
        jLabel14.setBounds(160, 340, 90, 30);

        txtCEP.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCEPKeyTyped(evt);
            }
        });
        InternalFrameFornecedor.getContentPane().add(txtCEP);
        txtCEP.setBounds(20, 370, 120, 32);

        jLabel10.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel10.setText("CEP");
        InternalFrameFornecedor.getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 340, 28, 30);
        InternalFrameFornecedor.getContentPane().add(lblImagemFundo1);
        lblImagemFundo1.setBounds(0, 0, 800, 560);

        PainelFornecedor.add(InternalFrameFornecedor);
        InternalFrameFornecedor.setBounds(0, 0, 810, 590);

        tabelaFornecedor.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cidade", "Cod"
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
        tabelaFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        tabelaFornecedor.setRowHeight(25);
        tabelaFornecedor.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaFornecedor.getTableHeader().setReorderingAllowed(false);
        tabelaFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFornecedorMouseClicked(evt);
            }
        });
        tabelaFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaFornecedorKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedor);
        if (tabelaFornecedor.getColumnModel().getColumnCount() > 0) {
            tabelaFornecedor.getColumnModel().getColumn(0).setPreferredWidth(500);
            tabelaFornecedor.getColumnModel().getColumn(1).setPreferredWidth(900);
            tabelaFornecedor.getColumnModel().getColumn(2).setPreferredWidth(90);
        }

        PainelFornecedor.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 770, 330);

        btnSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        PainelFornecedor.add(btnSair);
        btnSair.setBounds(690, 540, 100, 35);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar Fornecedores");
        PainelFornecedor.add(jLabel1);
        jLabel1.setBounds(20, 10, 200, 30);

        txtPesquisar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisar.setToolTipText("");
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });
        PainelFornecedor.add(txtPesquisar);
        txtPesquisar.setBounds(20, 40, 770, 32);

        btnDados.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnDados.setText("Dados");
        btnDados.setBorder(null);
        btnDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosActionPerformed(evt);
            }
        });
        PainelFornecedor.add(btnDados);
        btnDados.setBounds(130, 540, 100, 35);

        lblStatus.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatus.setText("Fornecedores cadastrados:");
        PainelFornecedor.add(lblStatus);
        lblStatus.setBounds(20, 450, 460, 40);

        btnNovo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        PainelFornecedor.add(btnNovo);
        btnNovo.setBounds(20, 540, 100, 35);

        btnExcluir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        PainelFornecedor.add(btnExcluir);
        btnExcluir.setBounds(240, 540, 100, 35);
        PainelFornecedor.add(lblImagemFundo);
        lblImagemFundo.setBounds(260, 430, 550, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (txtRazaoSocial.getText().equals("") || txtRazaoSocial.getText().equals("Campo obrigatório"))
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo Razão Social", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtRazaoSocial.grabFocus();
        }
        else if (txtRazaoSocial.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null, "Razão Social excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtRazaoSocial.grabFocus();
        }
        else if (txtCNPJ.getText().length() > 20)
        {
            JOptionPane.showMessageDialog(null, "CNPJ excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtCNPJ.grabFocus();
        }
        else if (txtCEP.getText().length() > 10)
        {
            JOptionPane.showMessageDialog(null, "CEP excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtCEP.grabFocus();
        }
        else if (txtCidade.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null, "Cidade excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtCidade.grabFocus();
        }
        else if (txtEndereco.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null, "Endereço excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtEndereco.grabFocus();
        }
        else if (txtBairro.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null, "Bairro excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtBairro.grabFocus();
        }
        else if (txtTelefone.getText().length() > 15)
        {
            JOptionPane.showMessageDialog(null, "Telefone excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtTelefone.grabFocus();
        }
        else if (txtEmail.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null, "E-mail excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtEmail.grabFocus();
        }
        else if (txtInscricaoEstadual.getText().length() > 45)
        {
            JOptionPane.showMessageDialog(null, "Inscrição Estadual excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtInscricaoEstadual.grabFocus();
        }
        else
        {
            if (InternalFrameFornecedor.getTitle().equals("Novo cadastro"))
            {

                cadastrarFornecedor(txtRazaoSocial.getText(), txtNomeFantasia.getText(), txtCNPJ.getText(), txtCEP.getText(),
                        txtCidade.getText(), comboEstado.getSelectedItem().toString(), txtEndereco.getText(), 
                        txtBairro.getText(), txtTelefone.getText(), txtEmail.getText(), txtInscricaoEstadual.getText());

                copiaFoto(lblImagem.getName(), lblCodigo.getText());
                updateFoto(lblImagem.getName(), lblCodigo.getText());
                
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                InternalFrameFornecedor.dispose();
                carregaFornecedor(txtPesquisar.getText(), (DefaultTableModel) tabelaFornecedor.getModel(), lblStatus);

            }
            else
            {
                alterarFornecedor(Integer.valueOf(lblCodigo.getText()), txtRazaoSocial.getText(), txtNomeFantasia.getText(), txtCNPJ.getText(), txtCEP.getText(),
                        txtCidade.getText(), comboEstado.getSelectedItem().toString(), txtEndereco.getText(), 
                        txtBairro.getText(), txtTelefone.getText(), txtEmail.getText(), txtInscricaoEstadual.getText());
                copiaFoto(lblImagem.getName(), lblCodigo.getText());
                updateFoto(lblImagem.getName(), lblCodigo.getText());
                
                JOptionPane.showMessageDialog(null, "Cadastro editado com sucesso!","Atenção", JOptionPane.INFORMATION_MESSAGE);
                InternalFrameFornecedor.dispose();
                carregaFornecedor(txtPesquisar.getText(), (DefaultTableModel) tabelaFornecedor.getModel(), lblStatus);
            }

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        InternalFrameFornecedor.dispose();

    }//GEN-LAST:event_btnFecharActionPerformed

    private void tabelaFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedorMouseClicked

        if (evt.getClickCount()==2)
        {
            btnDadosActionPerformed(null);

            carregaFornecedor(txtPesquisar.getText(), (DefaultTableModel) tabelaFornecedor.getModel(), lblStatus);
        }

    }//GEN-LAST:event_tabelaFornecedorMouseClicked

    private void tabelaFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaFornecedorKeyPressed

        int key = evt.getKeyCode();
        if (key == evt.VK_DELETE)
        {
            btnExcluirActionPerformed(null);
        }

    }//GEN-LAST:event_tabelaFornecedorKeyPressed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnSairActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased

        carregaFornecedor(txtPesquisar.getText(), (DefaultTableModel) tabelaFornecedor.getModel(), lblStatus);

    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed

        int linha = tabelaFornecedor.getSelectedRow();
        if (linha== -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um fornecedor para alterar!","Atenção",JOptionPane.INFORMATION_MESSAGE);
        }

        else
        {

            txtRazaoSocial.setText("");
            txtNomeFantasia.setText("");
            txtCNPJ.setText("");
            txtEmail.setText("");
            txtTelefone.setText("");
            txtCEP.setText("");
            txtEndereco.setText("");
            txtBairro.setText("");
            txtCidade.setText("");
            comboEstado.setSelectedIndex(0);
            txtInscricaoEstadual.setText("");

            carregarFornecedor((tabelaFornecedor.getModel().getValueAt(linha, 2).toString()));
            
            dimImagem.dimensionaComponentes(lblImagem, lblImagem.getName(), 230, 210);

            InternalFrameFornecedor.setVisible(true);
            InternalFrameFornecedor.setTitle("Alteração de dados");

            txtRazaoSocial.grabFocus();

        }
    }//GEN-LAST:event_btnDadosActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        txtRazaoSocial.setText("");
        txtNomeFantasia.setText("");
        txtCNPJ.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtCEP.setText("");
        txtEndereco.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        comboEstado.setSelectedIndex(0);
        txtInscricaoEstadual.setText("");

        lblCodigo.setText(String.valueOf(getMaxCodigo()));

        lblImagem.setName("/ControleDeEstoque/Imagens/FornecedorPadrao.jpg");
        lblImagem.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/FornecedorPadrao.jpg"));

        InternalFrameFornecedor.setTitle("Novo cadastro");
        InternalFrameFornecedor.setVisible(true);

        txtRazaoSocial.grabFocus();

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int linha = tabelaFornecedor.getSelectedRow();
        if (linha== -1){
            JOptionPane.showMessageDialog(null, "Selecione um fornecedor para excluir!","Atenção",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            if (verificaExclusaoFornecedor(Integer.valueOf(tabelaFornecedor.getModel().getValueAt(linha, 2).toString()))==true)
            {
                JOptionPane.showMessageDialog(null, "Este fornecedor está vinculado a uma compra e não poderá ser excluído!","Atenção",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                int cont = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?","Atenção",JOptionPane.YES_NO_OPTION);
                if (cont == 0)
                {
                    excluirFornecedor(tabelaFornecedor.getModel().getValueAt(linha, 2).toString());
                    carregaFornecedor(txtPesquisar.getText(), (DefaultTableModel) tabelaFornecedor.getModel(), lblStatus);
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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

                lblImagem.setIcon(new ImageIcon("C:/ControleDeEstoque/Imagens/FornecedorPadrao.jpg"));
                lblImagem.setName("C:/ControleDeEstoque/Imagens/FornecedorPadrao.jpg");

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

    private void txtCEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCEPKeyTyped

        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+""))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtCEPKeyTyped

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
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fornecedores().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇA OS MÉTODOS
    
    public void carregaFornecedor(String Texto, DefaultTableModel tabela, javax.swing.JLabel lblStatus) {
        
        tabela.setRowCount(0);
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from fornecedores where Razao_Social like '%"+Texto+"%' and Excluido = 0 "
                    + "order by Razao_Social");
            
            int Contador = 0;
            while (rs.next())
            {
                tabela.addRow(new Object[] {
                    rs.getString("Razao_Social"),
                    rs.getString("Cidade"),
                    rs.getInt("Codigo_Fornecedor")
                });
                
                Contador++;
            }
            
            if (Texto.equals(""))
            {
                //label recebe cor preta
                lblStatus.setForeground(Color.BLACK);
                lblStatus.setText("Fonecedores cadastrados: "+Contador);
            }
            else
            {
                lblStatus.setForeground(Color.red);
                lblStatus.setText("Status: Pesquisando Fornecedores");
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
    
    public void carregarFornecedor(String codigo) {
                
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from fornecedores where Excluido = 0 and Codigo_Fornecedor = '"+codigo+"'");
            
            while (rs.next())
            {
                lblCodigo.setText(String.valueOf(rs.getInt("Codigo_Fornecedor")));
                txtRazaoSocial.setText(rs.getString("Razao_Social"));
                razaoSocial = txtRazaoSocial.getText();
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
            
            rs.close();
            banco.fecharConexaoBanco();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public int getMaxCodigo() {
        int codFornecedor = 0;
        try 
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select MAX(Codigo_Fornecedor) as CodFornecedor from fornecedores");
            while (rs.next()) 
            {
                codFornecedor = rs.getInt("CodFornecedor");
            }
            rs.close();
            banco.fecharConexaoBanco();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        return codFornecedor;
    }
    
    public boolean verificaExclusaoFornecedor(int Codigo) {
        
        boolean Flag = false;
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Codigo_Fornecedor from compras "
                    + "where Excluido = 0 and Codigo_Fornecedor = '"+Codigo+"'");
            while (rs.next())
            {
                Flag = true;
            }
            
            rs.close();
            banco.fecharConexaoBanco();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        return Flag;
        
    }
    
    public void excluirFornecedor(String codigo) {
                
        try
        {
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update fornecedores set Excluido = 1 where Codigo_Fornecedor = '"+codigo+"'");
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
    
    public void cadastrarFornecedor(String razaoSocial, String nomeFantasia, String CNPJ, String CEP, String Cidade, 
            String Estado, String Endereco, String Bairro, String Telefone, String Email, String inscricaoEstadual) {
        
        int cont = 0;
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Razao_Social from fornecedores where Excluido = 0");
            
            while (rs.next())
            {
                if (txtRazaoSocial.getText().equals(rs.getString("Razao_Social")))
                {
                    JOptionPane.showMessageDialog(null, "Já existe um fornecedor com este nome!","Atenção", JOptionPane.WARNING_MESSAGE);
                    cont = 1;
                }
            }
            
            if (cont == 0)
            {
            
                ps = banco.con.prepareStatement("insert into fornecedores values (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                ps.setString(1, razaoSocial);
                ps.setString(2, nomeFantasia);
                ps.setString(3, CNPJ);
                ps.setString(4, CEP);
                ps.setString(5, Cidade);
                ps.setString(6, Estado);
                ps.setString(7, Endereco);
                ps.setString(8, Bairro);
                ps.setString(9, Telefone);
                ps.setString(10, Email);
                ps.setString(11, inscricaoEstadual);
                ps.setString(13, null);
                ps.setInt(14, 0);
                ps.executeUpdate();
                
                ps.close();
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
        
        String Nome = "Fornecedor";     
    	String Diretorio = foto;
    	String Nome_Da_Imagem =  Nome + codigo +".jpg" ; 
        String caminho = "C:/ControleDeEstoque/Imagens/Fornecedores/" + Nome_Da_Imagem;
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
            String Query = "update fornecedores set Foto = '"+Foto+"' where Codigo_Fornecedor = '"+Codigo+"'";
            banco.conexaoBanco();
            ps = banco.con.prepareStatement(Query);
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
    
    public void alterarFornecedor(int codigoFornecedor, String RazaoSocial, String nomeFantasia, String CNPJ, String CEP, String Cidade, 
            String Estado, String Endereco, String Bairro, String Telefone, String Email, String inscricaoEstadual) {
        
        try
        {
            banco.conexaoBanco();
            
            rs = banco.st.executeQuery("select Razao_Social from fornecedores where Excluido = 0");
            
            int cont = 0;
            while (rs.next())
            {
                if (RazaoSocial.equals(rs.getString("Razao_Social")))
                {
                    cont = 1;
                }
                if (RazaoSocial.equals(razaoSocial))
                {
                    cont = 0;
                }
            }
            
            if (cont == 0)
            {
            
                ps = banco.con.prepareStatement("update fornecedores set Razao_Social = '"+RazaoSocial+"',"
                +"Nome_Fantasia = '"+nomeFantasia+"'," 
                +"CNPJ = '"+CNPJ+"'," 
                +"CEP = '"+CEP+"'," 
                +"Cidade = '"+Cidade+"'," 
                +"Estado = '"+Estado+"'," 
                +"Endereco = '"+Endereco+"'," 
                +"Bairro = '"+Bairro+"'," 
                +"Telefone = '"+Telefone+"'," 
                +"Email = '"+Email+"'," 
                +"Inscricao_Estadual = '"+inscricaoEstadual+"' where Codigo_Fornecedor = '"+codigoFornecedor+"'");
                ps.executeUpdate();
            
                ps.close();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Já existe um fornecedor com este nome!","Atenção", JOptionPane.WARNING_MESSAGE);
                txtRazaoSocial.grabFocus();
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame InternalFrameFornecedor;
    private javax.swing.JPanel PainelFornecedor;
    private javax.swing.JButton btnDados;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblImagemFundo1;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tabelaFornecedor;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtInscricaoEstadual;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
