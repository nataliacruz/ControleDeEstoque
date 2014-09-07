
package Funcionarios;

import ConexaoBanco.ConexaoBanco;
import DimensionaImagem.DimensionaImagem;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Funcionarios extends javax.swing.JFrame {
    
    DimensionaImagem dimImagem = new DimensionaImagem();
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;
    DefaultTableModel tabela;

    public Funcionarios() {
        initComponents();
        
        Font font = new Font("NSimSun", Font.PLAIN, 18);
        JTableHeader cabecalho = tabelaFuncionario.getTableHeader();
        cabecalho.setFont(font);
        
        carregaFuncionario("Todos", null, (DefaultTableModel) tabelaFuncionario.getModel());
        
        dimImagem.dimensionaComponentes(lblImagemFundo, "/ControleDeEstoque/Imagens/ImagemFundoFuncionario.jpg", 550, 160);
        dimImagem.dimensionaComponentes(lblImagemFundo1, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 800, 560);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincial = new javax.swing.JPanel();
        InternalFrameFuncionarios = new javax.swing.JInternalFrame();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtCidade = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox();
        lblSituacao = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFuncao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        lblDataCadastro = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblImagemFundo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisarFuncionario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        lblStatus = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnDados = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        lblImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionários");
        setResizable(false);

        PainelPrincial.setBackground(new java.awt.Color(255, 255, 255));
        PainelPrincial.setLayout(null);

        InternalFrameFuncionarios.setBackground(new java.awt.Color(255, 255, 255));
        InternalFrameFuncionarios.setClosable(true);
        InternalFrameFuncionarios.setTitle("Novo cadastro");
        InternalFrameFuncionarios.setName("Novo cadastro"); // NOI18N
        InternalFrameFuncionarios.setNormalBounds(new java.awt.Rectangle(0, 0, 850, 590));
        InternalFrameFuncionarios.setVisible(false);
        InternalFrameFuncionarios.getContentPane().setLayout(null);

        btnSalvar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        InternalFrameFuncionarios.getContentPane().add(btnSalvar);
        btnSalvar.setBounds(20, 510, 100, 35);

        btnSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        InternalFrameFuncionarios.getContentPane().add(btnSair);
        btnSair.setBounds(130, 510, 100, 35);

        txtCidade.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFuncionarios.getContentPane().add(txtCidade);
        txtCidade.setBounds(20, 430, 390, 32);

        jLabel23.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel23.setText("Cidade");
        InternalFrameFuncionarios.getContentPane().add(jLabel23);
        jLabel23.setBounds(20, 400, 70, 30);

        txtCEP.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCEPKeyTyped(evt);
            }
        });
        InternalFrameFuncionarios.getContentPane().add(txtCEP);
        txtCEP.setBounds(20, 360, 120, 32);

        jLabel16.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel16.setText("CEP");
        InternalFrameFuncionarios.getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 330, 28, 30);

        jLabel18.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel18.setText("Endereço");
        InternalFrameFuncionarios.getContentPane().add(jLabel18);
        jLabel18.setBounds(160, 330, 90, 30);

        txtEndereco.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFuncionarios.getContentPane().add(txtEndereco);
        txtEndereco.setBounds(160, 360, 320, 32);

        jLabel24.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel24.setText("Estado");
        InternalFrameFuncionarios.getContentPane().add(jLabel24);
        jLabel24.setBounds(420, 400, 60, 30);

        comboEstado.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboEstado.setMaximumRowCount(27);
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" }));
        InternalFrameFuncionarios.getContentPane().add(comboEstado);
        comboEstado.setBounds(420, 430, 60, 32);

        lblSituacao.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblSituacao.setForeground(new java.awt.Color(255, 0, 0));
        lblSituacao.setText("Funcionário não cadastrado");
        InternalFrameFuncionarios.getContentPane().add(lblSituacao);
        lblSituacao.setBounds(500, 430, 270, 30);

        jLabel19.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel19.setText("Situação");
        InternalFrameFuncionarios.getContentPane().add(jLabel19);
        jLabel19.setBounds(500, 400, 72, 30);

        txtBairro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFuncionarios.getContentPane().add(txtBairro);
        txtBairro.setBounds(500, 360, 270, 32);

        jLabel20.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel20.setText("Bairro");
        InternalFrameFuncionarios.getContentPane().add(jLabel20);
        jLabel20.setBounds(500, 330, 70, 30);

        lblImagem.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lblImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblImagem.setName(""); // NOI18N
        lblImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagemMouseClicked(evt);
            }
        });
        InternalFrameFuncionarios.getContentPane().add(lblImagem);
        lblImagem.setBounds(20, 100, 230, 210);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFuncionarios.getContentPane().add(txtCPF);
        txtCPF.setBounds(280, 200, 150, 32);

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setText("CPF");
        InternalFrameFuncionarios.getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 170, 30, 30);

        txtFuncao.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtFuncao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InternalFrameFuncionarios.getContentPane().add(txtFuncao);
        txtFuncao.setBounds(280, 130, 320, 32);

        jLabel9.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel9.setText("Função");
        InternalFrameFuncionarios.getContentPane().add(jLabel9);
        jLabel9.setBounds(280, 100, 54, 30);

        jLabel8.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel8.setText("Celular");
        InternalFrameFuncionarios.getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 240, 63, 30);

        txtCelular.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        InternalFrameFuncionarios.getContentPane().add(txtCelular);
        txtCelular.setBounds(280, 270, 150, 32);

        jLabel6.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel6.setText("E-mail");
        InternalFrameFuncionarios.getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 240, 60, 30);

        txtEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFuncionarios.getContentPane().add(txtEmail);
        txtEmail.setBounds(450, 270, 320, 32);

        txtTelefone.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });
        InternalFrameFuncionarios.getContentPane().add(txtTelefone);
        txtTelefone.setBounds(620, 200, 150, 32);

        jLabel7.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel7.setText("Telefone");
        InternalFrameFuncionarios.getContentPane().add(jLabel7);
        jLabel7.setBounds(620, 170, 80, 30);

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Nascimento");
        InternalFrameFuncionarios.getContentPane().add(jLabel3);
        jLabel3.setBounds(620, 100, 90, 30);

        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascimento.setToolTipText("");
        txtNascimento.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtNascimento.setName(""); // NOI18N
        InternalFrameFuncionarios.getContentPane().add(txtNascimento);
        txtNascimento.setBounds(620, 130, 150, 32);

        jLabel5.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel5.setText("RG");
        InternalFrameFuncionarios.getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 170, 18, 30);

        txtRG.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRGKeyTyped(evt);
            }
        });
        InternalFrameFuncionarios.getContentPane().add(txtRG);
        txtRG.setBounds(450, 200, 150, 32);

        lblDataCadastro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblDataCadastro.setForeground(new java.awt.Color(255, 0, 0));
        lblDataCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataCadastro.setText("Data do cadastro");
        InternalFrameFuncionarios.getContentPane().add(lblDataCadastro);
        lblDataCadastro.setBounds(620, 40, 150, 30);

        jLabel15.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel15.setText("Cadastrado em");
        InternalFrameFuncionarios.getContentPane().add(jLabel15);
        jLabel15.setBounds(620, 10, 130, 30);

        txtNome.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameFuncionarios.getContentPane().add(txtNome);
        txtNome.setBounds(100, 40, 500, 32);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("Nome");
        InternalFrameFuncionarios.getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 10, 36, 30);

        jLabel22.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel22.setText("Código");
        InternalFrameFuncionarios.getContentPane().add(jLabel22);
        jLabel22.setBounds(20, 10, 60, 30);

        lblCodigo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("Código");
        InternalFrameFuncionarios.getContentPane().add(lblCodigo);
        lblCodigo.setBounds(20, 40, 60, 30);
        InternalFrameFuncionarios.getContentPane().add(lblImagemFundo1);
        lblImagemFundo1.setBounds(0, 0, 800, 560);

        PainelPrincial.add(InternalFrameFuncionarios);
        InternalFrameFuncionarios.setBounds(0, 0, 810, 590);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar Funcionários");
        PainelPrincial.add(jLabel1);
        jLabel1.setBounds(20, 10, 210, 30);

        txtPesquisarFuncionario.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisarFuncionario.setToolTipText("");
        txtPesquisarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPesquisarFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarFuncionarioKeyReleased(evt);
            }
        });
        PainelPrincial.add(txtPesquisarFuncionario);
        txtPesquisarFuncionario.setBounds(20, 40, 770, 32);

        tabelaFuncionario.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Função", "Cod"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaFuncionario.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tabelaFuncionario.setFocusTraversalPolicyProvider(true);
        tabelaFuncionario.setGridColor(new java.awt.Color(102, 102, 255));
        tabelaFuncionario.setRowHeight(25);
        tabelaFuncionario.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaFuncionario.getTableHeader().setReorderingAllowed(false);
        tabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFuncionarioMouseClicked(evt);
            }
        });
        tabelaFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaFuncionarioKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionario);
        if (tabelaFuncionario.getColumnModel().getColumnCount() > 0) {
            tabelaFuncionario.getColumnModel().getColumn(0).setPreferredWidth(500);
            tabelaFuncionario.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabelaFuncionario.getColumnModel().getColumn(2).setPreferredWidth(400);
            tabelaFuncionario.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        PainelPrincial.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 770, 330);

        lblStatus.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatus.setText("Funcionários Cadastrados:");
        PainelPrincial.add(lblStatus);
        lblStatus.setBounds(20, 460, 460, 30);

        btnNovo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        PainelPrincial.add(btnNovo);
        btnNovo.setBounds(20, 540, 100, 35);

        btnDados.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnDados.setText("Dados");
        btnDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosActionPerformed(evt);
            }
        });
        PainelPrincial.add(btnDados);
        btnDados.setBounds(130, 540, 100, 35);

        btnExcluir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        PainelPrincial.add(btnExcluir);
        btnExcluir.setBounds(240, 540, 100, 35);

        btnImprimir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PainelPrincial.add(btnImprimir);
        btnImprimir.setBounds(570, 540, 105, 35);

        btnFechar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        PainelPrincial.add(btnFechar);
        btnFechar.setBounds(690, 540, 100, 35);
        PainelPrincial.add(lblImagemFundo);
        lblImagemFundo.setBounds(260, 430, 550, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincial, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincial, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (txtNome.getText().equals("") || txtNome.getText().equals("Campo obrigatório"))
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtNome.grabFocus();
        }
        else if (txtNome.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null, "Nome excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtNome.grabFocus();
        }
        else if (txtRG.getText().length() > 15)
        {
            JOptionPane.showMessageDialog(null, "RG excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtRG.grabFocus();
        }
        else if (txtEmail.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null, "E-mail excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtEmail.grabFocus();
        }
        else if (txtTelefone.getText().length() > 15)
        {
            JOptionPane.showMessageDialog(null, "Telefone excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtTelefone.grabFocus();
        }
        else if (txtCelular.getText().length() > 15)
        {
            JOptionPane.showMessageDialog(null, "Celular excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtCelular.grabFocus();
        }
        else if (txtFuncao.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null, "Função excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtFuncao.grabFocus();
        }
        else if (txtCEP.getText().length() > 10)
        {
            JOptionPane.showMessageDialog(null, "Cep excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtCEP.grabFocus();
        }
        else if (txtEndereco.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null, "Endereço excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtEndereco.grabFocus();
        }
        else if (txtBairro.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null, "Bairro excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtBairro.grabFocus();
        }
        else if (txtCidade.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null, "Cidade excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtCidade.grabFocus();
        }
        else
        {
            if (InternalFrameFuncionarios.getTitle().equals("Novo cadastro"))
            {

                cadastrarFuncionario(txtNome.getText(), txtNascimento.getText(), 
                        txtCPF.getText(), txtRG.getText(), txtEmail.getText(), txtTelefone.getText(), txtCelular.getText(),
                        txtFuncao.getText(), Integer.valueOf(txtCEP.getText()), txtEndereco.getText(), txtBairro.getText(),
                        txtCidade.getText(), comboEstado.getSelectedItem().toString());
                
                lblCodigo.setText(String.valueOf(getMaxCodigoFuncionario()));

                copiaFoto(lblImagem.getName(), lblCodigo.getText());
                updateFoto(lblImagem.getName(), lblCodigo.getText());
                
                carregaFuncionario("Todos", txtPesquisarFuncionario.getText(), (DefaultTableModel) tabelaFuncionario.getModel());
                InternalFrameFuncionarios.dispose();
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);

            }
            else
            {
                alterarFuncionario(Integer.valueOf(lblCodigo.getText()),txtNome.getText(), txtNascimento.getText(), 
                        txtCPF.getText(), txtRG.getText(), txtEmail.getText(), txtTelefone.getText(), txtCelular.getText(),
                        txtFuncao.getText(), Integer.valueOf(txtCEP.getText()), txtEndereco.getText(), txtBairro.getText(),
                        txtCidade.getText(), comboEstado.getSelectedItem().toString());
                
                copiaFoto(lblImagem.getName(), lblCodigo.getText());
                updateFoto(lblImagem.getName(), lblCodigo.getText());
                
                carregaFuncionario("Todos", txtPesquisarFuncionario.getText(), (DefaultTableModel) tabelaFuncionario.getModel());
                InternalFrameFuncionarios.dispose();
                JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        InternalFrameFuncionarios.dispose();

    }//GEN-LAST:event_btnSairActionPerformed

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

                lblImagem.setIcon(new ImageIcon("C:/ControleDeEstoque/Imagens/FuncionarioPadrao.jpg"));
                lblImagem.setName("C:/ControleDeEstoque/Imagens/FuncionarioPadrao.jpg");

                
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
                    formataFoto(arquivo);

                    String caminho = arquivo.getAbsolutePath().replace('\\', '/');
                    lblImagem.setName(caminho);

                }
                else
                {
                    // o usuario desistiu, faça algo
                    fileChooser.setVisible(false);
                }
            }
            
        }

    }//GEN-LAST:event_lblImagemMouseClicked

    private void txtRGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRGKeyTyped

        String caracteres="0987654321-.";
        if(!caracteres.contains(evt.getKeyChar()+""))
        {
            evt.consume();
        }

    }//GEN-LAST:event_txtRGKeyTyped

    private void txtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyTyped

        String caracteres="0987654321()-";
        if(!caracteres.contains(evt.getKeyChar()+""))
        {
            evt.consume();
        }

    }//GEN-LAST:event_txtTelefoneKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped

        String caracteres="0987654321()-";
        if(!caracteres.contains(evt.getKeyChar()+""))
        {
            evt.consume();
        }

    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtPesquisarFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarFuncionarioKeyReleased

        carregaFuncionario("Like", txtPesquisarFuncionario.getText(), (DefaultTableModel) tabelaFuncionario.getModel());

        if (txtPesquisarFuncionario.getText().equals(""))
        {

            //label recebe cor preta
            lblStatus.setForeground(Color.BLACK);
        }
        else
        {
            lblStatus.setForeground(Color.red);
            lblStatus.setText("Status: Pesquisando Funcionário");
        }

    }//GEN-LAST:event_txtPesquisarFuncionarioKeyReleased

    private void tabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFuncionarioMouseClicked

        if (evt.getClickCount()==2)
        {
            btnDadosActionPerformed(null);

            carregaFuncionario("Todos", null, (DefaultTableModel) tabelaFuncionario.getModel());
        }

    }//GEN-LAST:event_tabelaFuncionarioMouseClicked

    private void tabelaFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaFuncionarioKeyPressed

        int key = evt.getKeyCode();
        if (key == evt.VK_DELETE)
        {
            btnExcluirActionPerformed(null);
        }

    }//GEN-LAST:event_tabelaFuncionarioKeyPressed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        txtNome.setText("");
        txtNascimento.setValue(null);
        txtCPF.setValue(null);
        txtRG.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtFuncao.setText("");
        txtCEP.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
        txtEndereco.setText("");
        comboEstado.setSelectedIndex(0);
        lblDataCadastro.setText("Data do cadastro");
        lblSituacao.setText("Funcionário não cadastrado");

        lblImagem.setName("C:/ControleDeEstoque/Imagens/FuncionarioPadrao.jpg");
        lblImagem.setIcon(new ImageIcon("C:/ControleDeEstoque/Imagens/FuncionarioPadrao.jpg"));

        lblCodigo.setText(String.valueOf(getMaxCodigoFuncionario()+1));

        InternalFrameFuncionarios.setTitle("Novo cadastro");
        InternalFrameFuncionarios.setVisible(true);

        txtNome.grabFocus();

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed

        int linha = tabelaFuncionario.getSelectedRow();
        if (linha== -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um funcionário para alterar!","Atenção",JOptionPane.INFORMATION_MESSAGE);
        }

        else
        {
            txtNome.setText("");
            txtNascimento.setValue(null);
            txtCPF.setValue(null);
            txtRG.setText("");
            txtEmail.setText("");
            txtTelefone.setText("");
            txtCelular.setText("");
            txtFuncao.setText("");
            txtCEP.setText("");
            txtCidade.setText("");
            txtBairro.setText("");
            txtEndereco.setText("");
            comboEstado.setSelectedIndex(0);

            carregarFuncionario(Integer.valueOf(tabelaFuncionario.getModel().getValueAt(linha, 3).toString()));
            lblCodigo.setText(tabelaFuncionario.getModel().getValueAt(linha, 3).toString());

            File foto = new File(lblImagem.getName());
            formataFoto(foto);

            InternalFrameFuncionarios.setTitle("Alteração de dados");
            InternalFrameFuncionarios.setVisible(true);

            txtNome.grabFocus();
        }

    }//GEN-LAST:event_btnDadosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int linha = tabelaFuncionario.getSelectedRow();
        if (linha== -1){
            JOptionPane.showMessageDialog(null, "Selecione um funcionário para excluir!","Atenção",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {

            int cont = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?","Atenção",JOptionPane.YES_NO_OPTION);
            if (cont == 0)
            {

                excluirFuncionario(Integer.valueOf(tabelaFuncionario.getModel().getValueAt(linha, 3).toString()));
                carregaFuncionario("Todos", txtPesquisarFuncionario.getText(), (DefaultTableModel) tabelaFuncionario.getModel());
            }
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcionarios().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇAM OS MÉTODOS
    
    //MÉTODOS DA CLASSE CLIENTE:
    
    public void carregaFuncionario(String Instrucao, String Texto, DefaultTableModel tabela) {
        
        String Query = "";
        if(Instrucao.equals("Todos"))
        {
            Query = "select * from funcionarios where Excluido = 0 order by Nome";                
        }
        if(Instrucao.equals("Like"))
        {
            Query = "select * from funcionarios where Excluido = 0 and Nome like '%"+Texto+"%' order by Nome";                
        }
        
        tabela.setRowCount(0);
        try 
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery(Query);
            int Contador = 0;
            while (rs.next())
            {
                tabela.addRow( new Object[] {
                rs.getString( "Nome" ), 
                rs.getString( "CPF" ), 
                rs.getString( "Funcao" ),
                rs.getInt("Codigo_Funcionario")
                });
                Contador++;
            }
            lblStatus.setText("Funcionários cadastrados: "+Contador);
            rs.close();
            banco.fecharConexaoBanco();
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public int getMaxCodigoFuncionario() {
        int codFuncionario = 0;
        try 
        {
        banco.conexaoBanco();
        rs = banco.st.executeQuery("select MAX(Codigo_Funcionario) as CodFuncionario from funcionarios");
        while (rs.next()) 
        {
            codFuncionario = rs.getInt("CodFuncionario");
        }
        rs.close();
        banco.fecharConexaoBanco();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        return codFuncionario;
    }
    
    public void carregarFuncionario(int Codigo) {
                
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from funcionarios where Excluido = 0 and Codigo_Funcionario = '"+Codigo+"'");
            
            while (rs.next())
            {                
                txtNome.setText(rs.getString("Nome"));
                txtNascimento.setText(rs.getString("Nascimento"));
                txtCPF.setText(rs.getString("CPF"));
                txtRG.setText(rs.getString("RG"));
                txtEmail.setText(rs.getString("Email"));
                txtTelefone.setText(rs.getString("Telefone"));
                txtCelular.setText(rs.getString("Celular"));
                txtFuncao.setText(rs.getString("Funcao"));
                txtCEP.setText(rs.getString("CEP"));
                txtEndereco.setText(rs.getString("Endereco"));
                txtBairro.setText(rs.getString("Bairro"));
                txtCidade.setText(rs.getString("Cidade"));
                comboEstado.setSelectedItem(rs.getString("Estado"));
                lblImagem.setName(rs.getString("Foto"));
                lblDataCadastro.setText(sdf.format(rs.getDate("Data_Cadastro")));
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
    
    public void formataFoto(File foto) {
        
        try
        {
            BufferedImage bi;
            bi = ImageIO.read(foto); //carrega a imagem real num buffer
            BufferedImage aux = new BufferedImage(230, 200, bi.getType());//cria um buffer auxiliar com o tamanho desejado    
            Graphics2D g = aux.createGraphics();//pega a classe graphics do aux para edicao    
            AffineTransform at = AffineTransform.getScaleInstance((double) 230 / bi.getWidth(), (double) 200 / bi.getHeight());//cria a transformacao    
            g.drawRenderedImage(bi, at);//pinta e transforma a imagem real no auxiliar
            lblImagem.setIcon(new ImageIcon(aux));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Foto do funcionário não encontrada! Verifique se foi deletada ou movida!","Atenção", JOptionPane.ERROR_MESSAGE);
            lblImagem.setIcon(new ImageIcon("C:/ControleDeEstoque/Imagens/FotoFuncionarioNaoDisponivel.jpg"));
        }
        
    }
    
    public void copiaFoto(String foto, String codigo) {
        
        String Nome = "Funcionario";     
    	String Diretorio = foto;
    	String Nome_Da_Imagem =  Nome + codigo +".jpg" ; 
        String caminho = "C:/ControleDeEstoque/Imagens/Funcionarios/" + Nome_Da_Imagem;
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
            String Query = "update funcionarios set Foto = '"+Foto+"' where Codigo_Funcionario = '"+Codigo+"'";
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
    
    public void excluirFuncionario(int Codigo) {
                
        try 
        {
            
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update funcionarios set Excluido = 1 where Codigo_Funcionario = '"+Codigo+"'");
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
    
    public void cadastrarFuncionario(String Nome, String Nascimento, String CPF, String RG, String Email, 
            String Telefone, String Celular, String Funcao, int CEP, String Endereco, String Bairro,
            String Cidade, String Estado) {
        
        try
        {
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("insert into funcionarios "
                    + "(Nome, Nascimento, CPF, RG, Email, Telefone, Celular, Funcao, CEP, Endereco, Bairro, Cidade,"
                    + "Estado) "
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?)");
            ps.setString(1, txtNome.getText());
            ps.setString(2, txtNascimento.getText());
            ps.setString(3, txtCPF.getText());
            ps.setString(4, txtRG.getText());
            ps.setString(5, txtEmail.getText());
            ps.setString(6, txtTelefone.getText());
            ps.setString(7, txtCelular.getText());
            ps.setString(8, txtFuncao.getText());
            ps.setString(9, txtCEP.getText());
            ps.setString(10, txtEndereco.getText());
            ps.setString(11, txtBairro.getText());
            ps.setString(12, txtCidade.getText());
            ps.setString(13, comboEstado.getSelectedItem().toString());
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
            
        }
        catch (SQLException | HeadlessException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void alterarFuncionario(int Codigo, String Nome, String Nascimento, String CPF, String RG, String Email, 
            String Telefone, String Celular, String Funcao, int CEP, String Endereco, String Bairro,
            String Cidade, String Estado) {
                
        try
        {
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update funcionarios set Nome = '"+Nome+"',"
                +"Nascimento = '"+Nascimento+"',"
                +"CPF = '"+CPF+"',"
                +"RG = '"+RG+"',"
                +"Email = '"+Email+"',"
                +"Telefone = '"+Telefone+"',"
                +"Celular = '"+Celular+"',"
                +"Funcao = '"+Funcao+"',"
                +"CEP = '"+CEP+"',"
                +"Endereco = '"+Endereco+"',"
                +"Bairro = '"+Bairro+"',"
                +"Cidade = '"+Cidade+"',"
                +"Estado = '"+Estado+"' where Codigo_Funcionario = '"+Codigo+"'");
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
        }
        catch (HeadlessException | SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame InternalFrameFuncionarios;
    private javax.swing.JPanel PainelPrincial;
    private javax.swing.JButton btnDados;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblImagemFundo1;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisarFuncionario;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
