

package Clientes;

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
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Clientes extends javax.swing.JFrame {
    
    DimensionaImagem dimImagem = new DimensionaImagem();
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;
    public int codigoEmpresa;
    public int codigoCliente;

    public Clientes() {
        initComponents();
        
        Font font = new Font("NSimSun", Font.PLAIN, 18);
        
        JTableHeader cabecalhoCliente = tabelaCliente.getTableHeader();
        cabecalhoCliente.setFont(font);
        
        JTableHeader cabecalhoEmpresa = tabelaEmpresa.getTableHeader();
        cabecalhoEmpresa.setFont(font);
                
        carregaCliente(txtPesquisarCliente.getText(), (DefaultTableModel) tabelaCliente.getModel());
        
        dimImagem.dimensionaComponentes(lblImagemFundo, "/ControleDeEstoque/Imagens/ImagemFundoCliente.jpg", 380, 170);
        dimImagem.dimensionaComponentes(lblImagemFundo1, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 800, 560);
        dimImagem.dimensionaComponentes(lblImagemFundo2, "/ControleDeEstoque/Imagens/ImagemFundoCliente.jpg", 250, 110);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincial = new javax.swing.JPanel();
        InternalFrameCliente = new javax.swing.JInternalFrame();
        InternalFrameEmpresa = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEmpresa = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtPesquisarEmpresa = new javax.swing.JTextField();
        btnEscolher = new javax.swing.JButton();
        lblStatusEmpresa = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblImagemFundo2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDataCadastro = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        btnPesquisarEmpresa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblImagemFundo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisarCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        lblStatus = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnDados = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        lblImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setResizable(false);

        PainelPrincial.setBackground(new java.awt.Color(255, 255, 255));
        PainelPrincial.setLayout(null);

        InternalFrameCliente.setBackground(new java.awt.Color(255, 255, 255));
        InternalFrameCliente.setClosable(true);
        InternalFrameCliente.setTitle("Novo cadastro");
        InternalFrameCliente.setName("Novo cadastro"); // NOI18N
        InternalFrameCliente.setNormalBounds(new java.awt.Rectangle(0, 0, 850, 590));
        InternalFrameCliente.setVisible(false);
        InternalFrameCliente.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                InternalFrameClienteInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        InternalFrameCliente.getContentPane().setLayout(null);

        InternalFrameEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        InternalFrameEmpresa.setClosable(true);
        InternalFrameEmpresa.setTitle("Pesquisar empresas");
        InternalFrameEmpresa.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        try {
            InternalFrameEmpresa.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        InternalFrameEmpresa.setVisible(false);
        InternalFrameEmpresa.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                InternalFrameEmpresaInternalFrameOpened(evt);
            }
        });
        InternalFrameEmpresa.getContentPane().setLayout(null);

        tabelaEmpresa.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cod"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEmpresa.setRowHeight(20);
        tabelaEmpresa.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaEmpresa.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaEmpresa);
        if (tabelaEmpresa.getColumnModel().getColumnCount() > 0) {
            tabelaEmpresa.getColumnModel().getColumn(0).setPreferredWidth(500);
            tabelaEmpresa.getColumnModel().getColumn(1).setPreferredWidth(120);
        }

        InternalFrameEmpresa.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 90, 430, 190);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jLabel16.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel16.setText("Pesquisar Empresas");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(20, 10, 190, 30);

        txtPesquisarEmpresa.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisarEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarEmpresaKeyReleased(evt);
            }
        });
        jPanel6.add(txtPesquisarEmpresa);
        txtPesquisarEmpresa.setBounds(20, 40, 430, 32);

        btnEscolher.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnEscolher.setText("Escolher");
        btnEscolher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolherActionPerformed(evt);
            }
        });
        jPanel6.add(btnEscolher);
        btnEscolher.setBounds(20, 340, 110, 35);

        lblStatusEmpresa.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatusEmpresa.setText("Empresas Cadastradas:");
        jPanel6.add(lblStatusEmpresa);
        lblStatusEmpresa.setBounds(20, 300, 380, 30);

        btnCancelar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel6.add(btnCancelar);
        btnCancelar.setBounds(340, 340, 110, 35);
        jPanel6.add(lblImagemFundo2);
        lblImagemFundo2.setBounds(220, 280, 250, 110);

        InternalFrameEmpresa.getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 470, 390);

        InternalFrameCliente.getContentPane().add(InternalFrameEmpresa);
        InternalFrameEmpresa.setBounds(0, 0, 480, 420);

        txtNome.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCliente.getContentPane().add(txtNome);
        txtNome.setBounds(100, 40, 500, 32);

        lblDataCadastro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblDataCadastro.setForeground(new java.awt.Color(255, 0, 0));
        lblDataCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataCadastro.setText("Data do cadastro");
        InternalFrameCliente.getContentPane().add(lblDataCadastro);
        lblDataCadastro.setBounds(620, 40, 150, 30);

        jLabel22.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel22.setText("Código");
        InternalFrameCliente.getContentPane().add(jLabel22);
        jLabel22.setBounds(20, 10, 60, 30);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("Nome completo");
        InternalFrameCliente.getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 10, 120, 30);

        lblCodigo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("Código");
        InternalFrameCliente.getContentPane().add(lblCodigo);
        lblCodigo.setBounds(20, 40, 60, 30);

        jLabel8.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel8.setText("Cadastrado em");
        InternalFrameCliente.getContentPane().add(jLabel8);
        jLabel8.setBounds(620, 10, 130, 30);

        jLabel9.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel9.setText("Empresa filiada");
        InternalFrameCliente.getContentPane().add(jLabel9);
        jLabel9.setBounds(280, 110, 140, 30);

        txtEmpresa.setEditable(false);
        txtEmpresa.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InternalFrameCliente.getContentPane().add(txtEmpresa);
        txtEmpresa.setBounds(280, 140, 280, 32);

        btnPesquisarEmpresa.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        btnPesquisarEmpresa.setText("...");
        btnPesquisarEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarEmpresaActionPerformed(evt);
            }
        });
        InternalFrameCliente.getContentPane().add(btnPesquisarEmpresa);
        btnPesquisarEmpresa.setBounds(560, 140, 40, 32);

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Nascimento");
        InternalFrameCliente.getContentPane().add(jLabel3);
        jLabel3.setBounds(620, 110, 100, 30);

        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascimento.setToolTipText("");
        txtNascimento.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtNascimento.setName(""); // NOI18N
        InternalFrameCliente.getContentPane().add(txtNascimento);
        txtNascimento.setBounds(620, 140, 150, 32);

        jLabel7.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel7.setText("Telefone");
        InternalFrameCliente.getContentPane().add(jLabel7);
        jLabel7.setBounds(620, 180, 90, 30);

        txtTelefone.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });
        InternalFrameCliente.getContentPane().add(txtTelefone);
        txtTelefone.setBounds(620, 210, 150, 32);

        txtRG.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRGKeyTyped(evt);
            }
        });
        InternalFrameCliente.getContentPane().add(txtRG);
        txtRG.setBounds(450, 210, 150, 32);

        jLabel5.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel5.setText("RG");
        InternalFrameCliente.getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 180, 30, 30);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCliente.getContentPane().add(txtCPF);
        txtCPF.setBounds(280, 210, 150, 32);

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setText("CPF");
        InternalFrameCliente.getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 180, 40, 30);

        txtCelular.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCliente.getContentPane().add(txtCelular);
        txtCelular.setBounds(280, 280, 150, 32);

        jLabel18.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel18.setText("Celular");
        InternalFrameCliente.getContentPane().add(jLabel18);
        jLabel18.setBounds(280, 250, 63, 30);

        jLabel6.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel6.setText("E-mail");
        InternalFrameCliente.getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 250, 70, 30);

        txtEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCliente.getContentPane().add(txtEmail);
        txtEmail.setBounds(450, 280, 320, 32);

        jLabel10.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel10.setText("CEP");
        InternalFrameCliente.getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 340, 28, 30);

        txtCep.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCepKeyTyped(evt);
            }
        });
        InternalFrameCliente.getContentPane().add(txtCep);
        txtCep.setBounds(20, 370, 120, 32);

        jLabel11.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel11.setText("Endereço");
        InternalFrameCliente.getContentPane().add(jLabel11);
        jLabel11.setBounds(160, 340, 90, 30);

        txtEndereco.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCliente.getContentPane().add(txtEndereco);
        txtEndereco.setBounds(160, 370, 320, 32);

        jLabel12.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel12.setText("Bairro");
        InternalFrameCliente.getContentPane().add(jLabel12);
        jLabel12.setBounds(500, 340, 70, 30);

        txtBairro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCliente.getContentPane().add(txtBairro);
        txtBairro.setBounds(500, 370, 270, 32);

        jLabel13.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel13.setText("Cidade");
        InternalFrameCliente.getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 410, 70, 30);

        txtCidade.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCliente.getContentPane().add(txtCidade);
        txtCidade.setBounds(20, 440, 390, 32);

        jLabel14.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel14.setText("Estado");
        InternalFrameCliente.getContentPane().add(jLabel14);
        jLabel14.setBounds(420, 410, 60, 30);

        comboEstado.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboEstado.setMaximumRowCount(27);
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" }));
        InternalFrameCliente.getContentPane().add(comboEstado);
        comboEstado.setBounds(420, 440, 60, 32);

        jLabel19.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel19.setText("Situação");
        InternalFrameCliente.getContentPane().add(jLabel19);
        jLabel19.setBounds(500, 410, 72, 30);

        lblSituacao.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblSituacao.setForeground(new java.awt.Color(255, 0, 0));
        lblSituacao.setText("Cliente não cadastrado");
        InternalFrameCliente.getContentPane().add(lblSituacao);
        lblSituacao.setBounds(500, 440, 270, 30);

        btnSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        InternalFrameCliente.getContentPane().add(btnSair);
        btnSair.setBounds(130, 510, 100, 35);

        lblImagem.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lblImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblImagem.setName(""); // NOI18N
        lblImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagemMouseClicked(evt);
            }
        });
        InternalFrameCliente.getContentPane().add(lblImagem);
        lblImagem.setBounds(20, 110, 230, 210);

        btnSalvar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        InternalFrameCliente.getContentPane().add(btnSalvar);
        btnSalvar.setBounds(20, 510, 100, 35);
        InternalFrameCliente.getContentPane().add(lblImagemFundo1);
        lblImagemFundo1.setBounds(0, 0, 800, 560);

        PainelPrincial.add(InternalFrameCliente);
        InternalFrameCliente.setBounds(0, 0, 810, 590);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar Clientes");
        PainelPrincial.add(jLabel1);
        jLabel1.setBounds(20, 20, 170, 30);

        txtPesquisarCliente.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisarCliente.setToolTipText("");
        txtPesquisarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPesquisarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarClienteKeyReleased(evt);
            }
        });
        PainelPrincial.add(txtPesquisarCliente);
        txtPesquisarCliente.setBounds(20, 50, 770, 32);

        tabelaCliente.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Cidade", "Cod"
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
        tabelaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaCliente.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tabelaCliente.setFocusTraversalPolicyProvider(true);
        tabelaCliente.setGridColor(new java.awt.Color(102, 102, 255));
        tabelaCliente.setRowHeight(25);
        tabelaCliente.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaCliente.getTableHeader().setReorderingAllowed(false);
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        tabelaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaClienteKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);
        if (tabelaCliente.getColumnModel().getColumnCount() > 0) {
            tabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(500);
            tabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabelaCliente.getColumnModel().getColumn(2).setPreferredWidth(500);
            tabelaCliente.getColumnModel().getColumn(3).setPreferredWidth(90);
        }

        PainelPrincial.add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 770, 340);

        lblStatus.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatus.setText("Clientes Cadastrados:");
        PainelPrincial.add(lblStatus);
        lblStatus.setBounds(20, 470, 300, 30);

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
        btnImprimir.setBounds(570, 540, 110, 35);

        btnFechar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnFechar.setText("Sair");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        PainelPrincial.add(btnFechar);
        btnFechar.setBounds(690, 540, 100, 35);
        PainelPrincial.add(lblImagemFundo);
        lblImagemFundo.setBounds(430, 440, 380, 170);

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

    private void txtPesquisarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarClienteKeyReleased

        carregaCliente(txtPesquisarCliente.getText(), (DefaultTableModel) tabelaCliente.getModel());
        
    }//GEN-LAST:event_txtPesquisarClienteKeyReleased

    private void txtPesquisarEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarEmpresaKeyReleased
        
        carregaEmpresa(txtPesquisarEmpresa.getText(), (DefaultTableModel) tabelaEmpresa.getModel());
        
    }//GEN-LAST:event_txtPesquisarEmpresaKeyReleased

    private void btnEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolherActionPerformed

        int linha = tabelaEmpresa.getSelectedRow();

        if (linha == -1)
        {
            JOptionPane.showMessageDialog(null, "Escolha uma empresa!","Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {            
            codigoEmpresa = Integer.valueOf(tabelaEmpresa.getModel().getValueAt(linha, 1).toString());
            txtEmpresa.setText(tabelaEmpresa.getModel().getValueAt(linha, 0).toString());
            
            InternalFrameEmpresa.dispose();
        }
    }//GEN-LAST:event_btnEscolherActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        InternalFrameEmpresa.dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void InternalFrameEmpresaInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_InternalFrameEmpresaInternalFrameOpened
        
        carregaEmpresa(txtPesquisarEmpresa.getText(), (DefaultTableModel) tabelaEmpresa.getModel());
           
    }//GEN-LAST:event_InternalFrameEmpresaInternalFrameOpened

    private void txtCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyTyped
        
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+""))
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_txtCepKeyTyped

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        
        if (evt.getClickCount()==2)
        {
            btnDadosActionPerformed(null);
            
            carregaCliente(txtPesquisarCliente.getText(), (DefaultTableModel) tabelaCliente.getModel());
        }
        
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void tabelaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaClienteKeyPressed
        
        int key = evt.getKeyCode();
        if (key == evt.VK_DELETE)
        {            
            btnExcluirActionPerformed(null);
        }
        
    }//GEN-LAST:event_tabelaClienteKeyPressed

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

                lblImagem.setIcon(new ImageIcon("C:/ControleDeEstoque/Imagens/ClientePadrao.jpg"));
                lblImagem.setName("C:/ControleDeEstoque/Imagens/ClientePadrao.jpg");

                
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

    private void btnPesquisarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarEmpresaActionPerformed

        if (txtEmpresa.getText().isEmpty())
        {
            carregaEmpresa(txtPesquisarEmpresa.getText(), (DefaultTableModel) tabelaEmpresa.getModel());

            InternalFrameEmpresa.setVisible(true);
        }
        else
        {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja desvincular este cliente à empresa?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (resp == 0)
            {
                txtEmpresa.setText("");
                codigoEmpresa = 0;
            }
        }
        

    }//GEN-LAST:event_btnPesquisarEmpresaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        InternalFrameCliente.dispose();
        InternalFrameEmpresa.dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

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
        else if (txtTelefone.getText().length() > 10)
        {
            JOptionPane.showMessageDialog(null, "Telefone excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtTelefone.grabFocus();
        }
        else if (txtCelular.getText().length() > 10)
        {
            JOptionPane.showMessageDialog(null, "Celular excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtCelular.grabFocus();
        }
        else if (txtEmpresa.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null, "Empresa excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtEmpresa.grabFocus();
        }
        else if (txtCep.getText().length() > 10)
        {
            JOptionPane.showMessageDialog(null, "Cep excede o número de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtCep.grabFocus();
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
            if (InternalFrameCliente.getTitle().equals("Novo cadastro"))
            {

                cadastrarCliente(txtNome.getText(), txtNascimento.getText(), txtCPF.getText(), txtRG.getText(), 
                        txtEmail.getText(), txtTelefone.getText(), txtCelular.getText(), codigoEmpresa, 
                        txtCep.getText(), txtEndereco.getText(), txtBairro.getText(), txtCidade.getText(), 
                        comboEstado.getSelectedItem().toString());
                
                lblCodigo.setText(String.valueOf(getMaxCodigoCliente()));

                copiaFoto(lblImagem.getName(), lblCodigo.getText());
                updateFoto(lblImagem.getName(), lblCodigo.getText());
                
                carregaCliente(txtPesquisarCliente.getText(), (DefaultTableModel) tabelaCliente.getModel());
                InternalFrameCliente.dispose();
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);

            }
            else
            {
                alterarCliente(codigoCliente, txtNome.getText(), txtNascimento.getText(), txtCPF.getText(), txtRG.getText(), 
                        txtEmail.getText(), txtTelefone.getText(), txtCelular.getText(), codigoEmpresa, 
                        txtCep.getText(), txtEndereco.getText(), txtBairro.getText(), txtCidade.getText(), 
                        comboEstado.getSelectedItem().toString());
                
                copiaFoto(lblImagem.getName(), lblCodigo.getText());
                updateFoto(lblImagem.getName(), lblCodigo.getText());
                
                JOptionPane.showMessageDialog(null, "Cadastro editado com sucesso!","Atenção", JOptionPane.INFORMATION_MESSAGE);
                InternalFrameCliente.dispose();
                carregaCliente(txtPesquisarCliente.getText(), (DefaultTableModel) tabelaCliente.getModel());
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        
        txtNome.setText("");
        txtNascimento.setValue(null);
        txtCPF.setValue(null);
        txtRG.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmpresa.setText("");
        txtCep.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
        txtEndereco.setText("");
        comboEstado.setSelectedIndex(0);
        lblSituacao.setText("Cliente não cadastrado");
        
        lblImagem.setName("C:/ControleDeEstoque/Imagens/ClientePadrao.jpg");
        lblImagem.setIcon(new ImageIcon("C:/ControleDeEstoque/Imagens/ClientePadrao.jpg"));
        
        lblCodigo.setText(String.valueOf(getMaxCodigoCliente()+1));
        
        InternalFrameCliente.setTitle("Novo cadastro");
        InternalFrameCliente.setVisible(true);   
        
        txtNome.grabFocus();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed
        
        int linha = tabelaCliente.getSelectedRow();
        if (linha== -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para alterar!","Atenção",JOptionPane.WARNING_MESSAGE);
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
            txtEmpresa.setText("");
            txtCep.setText("");
            txtCidade.setText("");
            txtBairro.setText("");
            txtEndereco.setText("");
            comboEstado.setSelectedIndex(0);
            
            carregarCliente(String.valueOf(tabelaCliente.getModel().getValueAt(linha, 3)));
            lblCodigo.setText(String.valueOf(tabelaCliente.getModel().getValueAt(linha, 3)));
            
            dimImagem.dimensionaComponentes(lblImagem, lblImagem.getName(), 230, 210);
            
            InternalFrameCliente.setTitle("Alteração de dados");
            InternalFrameCliente.setVisible(true);
            
            txtNome.grabFocus();
        }
        
    }//GEN-LAST:event_btnDadosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int linha = tabelaCliente.getSelectedRow();
        if (linha== -1){
            JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir!","Atenção",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            int cont = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?","Atenção",JOptionPane.YES_NO_OPTION);
            if (cont == 0)
            {        

                excluirCliente(String.valueOf(tabelaCliente.getModel().getValueAt(linha, 3)));
                carregaCliente(txtPesquisarCliente.getText(), (DefaultTableModel) tabelaCliente.getModel());
                
                txtPesquisarCliente.grabFocus();
            }
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnFecharActionPerformed

    private void InternalFrameClienteInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_InternalFrameClienteInternalFrameClosed
        
        txtPesquisarCliente.grabFocus();
        
    }//GEN-LAST:event_InternalFrameClienteInternalFrameClosed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }
    
    //MÉTODOS DA CLASSE CLIENTE:
    
    public void carregaCliente(String Texto, DefaultTableModel tabela) {
                
        tabela.setRowCount(0);
        try 
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from clientes where Excluido = 0 and Nome like '%"+Texto+"%' order by Nome");
            
            int contLinha = 0;
            while (rs.next())
            {
                tabela.addRow( new Object[] {
                    rs.getString( "Nome" ), 
                    rs.getString( "CPF" ), 
                    rs.getString( "Cidade" ),
                    rs.getInt("Codigo_Cliente")
                });
                
                
                
                contLinha = contLinha +1;
            }
            
            if (txtPesquisarCliente.getText().equals(""))
            {

                //label recebe cor preta
                lblStatus.setForeground(Color.BLACK);
                lblStatus.setText("Clientes cadastrados: " + contLinha);

            }
            else
            {
                lblStatus.setForeground(Color.red);
                lblStatus.setText("Status: Pesquisando Cliente");
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
    
    public int getMaxCodigoCliente() {
        int codigoCliente = 0;
        try 
        {
        banco.conexaoBanco();
        rs = banco.st.executeQuery("select MAX(Codigo_Cliente) as CodCliente from clientes");
        while (rs.next()) 
        {
            codigoCliente = rs.getInt("CodCliente");
        }
        rs.close();
        banco.fecharConexaoBanco();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        return codigoCliente;
    }
    
    public void carregarCliente(String Codigo) {
                
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from clientes "
                    + "where Excluido = 0 and Codigo_Cliente = '"+Codigo+"'");
            
            while (rs.next())
            {   
                String data = sdf.format(rs.getDate("Data_Cadastro"));
                
                codigoCliente = rs.getInt("Codigo_Cliente");
                txtNome.setText(rs.getString("Nome"));
                txtNascimento.setText(rs.getString("Nascimento"));
                txtCPF.setText(rs.getString("CPF"));
                txtRG.setText(rs.getString("RG"));
                txtEmail.setText(rs.getString("Email"));
                txtTelefone.setText(rs.getString("Telefone"));
                txtCelular.setText(rs.getString("Celular"));
                codigoEmpresa = rs.getInt("Codigo_Empresa");
                txtCep.setText(rs.getString("CEP"));
                txtEndereco.setText(rs.getString("Endereco"));
                txtBairro.setText(rs.getString("Bairro"));
                txtCidade.setText(rs.getString("Cidade"));
                comboEstado.setSelectedItem(rs.getString("Estado"));
                lblImagem.setName(rs.getString("Foto"));
                lblDataCadastro.setText(data);
            }
            
            rs = banco.st.executeQuery("select Razao_Social from empresas "
                    + "where Codigo_Empresa = '"+codigoEmpresa+"'");
            while (rs.next())
            {
                txtEmpresa.setText(rs.getString("Razao_Social"));
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
    
    public void copiaFoto(String foto, String codigo) {
        
        String Nome = "Cliente";     
    	String Diretorio = foto;
    	String Nome_Da_Imagem =  Nome + codigo +".jpg" ; 
        String caminho = "C:/ControleDeEstoque/Imagens/Clientes/" + Nome_Da_Imagem;
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
            ps = banco.con.prepareStatement("update clientes set Foto = '"+Foto+"' where Codigo_Cliente = '"+Codigo+"'");
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
    
    public void excluirCliente(String Codigo) {
        
        try 
        {
            
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update clientes set Excluido = 1 where Codigo_Cliente = '"+Codigo+"'");
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
    
    public void carregaEmpresa(String Texto, DefaultTableModel tabela) {
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from empresas where Excluido = 0 and Razao_Social like '%"+Texto+"%' order by Razao_Social");
            
            tabela.setRowCount(0);
            int Contador = 0;
            while (rs.next())
            {
                tabela.addRow(new Object[] {
                    rs.getString("Razao_Social"),
                    rs.getInt("Codigo_Empresa")
                });
                Contador ++;
            }
            
            if (txtPesquisarEmpresa.getText().equals(""))
            {
                //label recebe cor preta
                lblStatusEmpresa.setForeground(Color.BLACK);
                lblStatusEmpresa.setText("Empresas cadastradas: "+Contador);
            }
            else
            {
                lblStatusEmpresa.setText("Status: Pesquisando Empresa");
                lblStatusEmpresa.setForeground(Color.red);
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
    
    
    public void cadastrarCliente(String Nome, String Nascimento, String CPF, String RG, String Email, String Telefone, 
            String Celular, int codigoEmpresa, String CEP, String Endereco, String Bairro, String Cidade, 
            String Estado) {
                
        try
        {
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("insert into clientes "
                    + "(Nome, Nascimento, CPF, RG, Email, Telefone, Celular, Codigo_Empresa, CEP, Endereco, Bairro, "
                    + "Cidade, Estado) "
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, txtNome.getText());
            ps.setString(2, txtNascimento.getText());
            ps.setString(3, txtCPF.getText());
            ps.setString(4, txtRG.getText());
            ps.setString(5, txtEmail.getText());
            ps.setString(6, txtTelefone.getText());
            ps.setString(7, txtCelular.getText());
            ps.setInt(8, codigoEmpresa);
            ps.setString(9, txtCep.getText());
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
    
    public void alterarCliente(int codigoCliente, String Nome, String Nascimento, String CPF, String RG, String Email, String Telefone, 
            String Celular, int codigoEmpresa, String CEP, String Endereco, String Bairro, String Cidade, 
            String Estado) {
                        
        try
        {
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update clientes set Nome = '"+Nome+"',"
                +"Nascimento = '"+Nascimento+"',"
                +"CPF = '"+CPF+"',"
                +"RG = '"+RG+"',"
                +"Email = '"+Email+"',"
                +"Telefone = '"+Telefone+"',"
                +"Celular = '"+Celular+"',"
                +"Codigo_Empresa = '"+codigoEmpresa+"',"
                +"CEP = '"+CEP+"',"
                +"Endereco = '"+Endereco+"',"
                +"Bairro = '"+Bairro+"',"
                +"Cidade = '"+Cidade+"',"
                +"Estado = '"+Estado+"' where Codigo_Cliente = '"+codigoCliente+"'");
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
    private javax.swing.JInternalFrame InternalFrameCliente;
    private javax.swing.JInternalFrame InternalFrameEmpresa;
    private javax.swing.JPanel PainelPrincial;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDados;
    private javax.swing.JButton btnEscolher;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarEmpresa;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblImagemFundo1;
    private javax.swing.JLabel lblImagemFundo2;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatusEmpresa;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTable tabelaEmpresa;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisarCliente;
    private javax.swing.JTextField txtPesquisarEmpresa;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
