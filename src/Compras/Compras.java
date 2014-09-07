
package Compras;

import Caixa.Caixa;
import CentroEstoque.CentroEstoque;
import ConexaoBanco.ConexaoBanco;
import DimensionaImagem.DimensionaImagem;
import Fornecedores.Fornecedores;
import TrataFloat.TrocaVirgulaPorPonto;
import Usuarios.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Compras extends javax.swing.JFrame {
    
    TrocaVirgulaPorPonto troca = new TrocaVirgulaPorPonto();
    CentroEstoque centroEstoque = new CentroEstoque();
    Fornecedores fornecedores = new Fornecedores();
    DimensionaImagem dimImagem = new DimensionaImagem();
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;
    DefaultTableModel tabela;
    String nomeUsuario, tipoFormaPagto;
    int codFornecedor = 0, codFormaPagto = 0;
    public DecimalFormat dffloat = new DecimalFormat("##,###.00");
    
    public Compras() {
        initComponents();
        
        Font font = new Font("NSimSun", Font.PLAIN, 18);
        
        JTableHeader cabecalhoCompras = tabelaCompras.getTableHeader();
        cabecalhoCompras.setFont(font);
        
        JTableHeader cabecalhoParcela = tabelaParcela.getTableHeader();
        cabecalhoParcela.setFont(font);
        
        JTableHeader cabecalhoProdutosCompra = tabelaProdutosCompra.getTableHeader();
        cabecalhoProdutosCompra.setFont(font);
        
        JTableHeader cabecalhoFornecedor = tabelaFornecedor.getTableHeader();
        cabecalhoFornecedor.setFont(font);
        
        carregaCompra("Todos", null, (DefaultTableModel)tabelaCompras.getModel());
        
        txtFornecedor.setEditable(false);
        txtPagto.setEditable(false);
        txtFormaPagto.setEditable(false);
        txtCentroEstoque.setEditable(false);
        
        dimImagem.dimensionaComponentes(lblImagemFundo1, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 1030, 600);
        lblImagemFundo3.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/ImagemFundoCompras.jpg"));
        dimImagem.dimensionaComponentes(lblImagemFundo4, "/ControleDeEstoque/Imagens/ImagemFundoFuncionario.jpg", 490, 130);
        dimImagem.dimensionaComponentes(lblImagemFundo5, "/ControleDeEstoque/Imagens/ImagemFundoCentroEstoque2.jpg", 280, 130);
    }
    
    public void setUsuario(String Usuario) {
        nomeUsuario = Usuario;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        InternalFrameCompra = new javax.swing.JInternalFrame();
        InternalFrameFormaPagto = new javax.swing.JInternalFrame();
        InternalFrameFornecedor = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisarFornecedor = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();
        lblStatusFornecedor = new javax.swing.JLabel();
        btnOkFornecedor = new javax.swing.JButton();
        btnSairFornecedor = new javax.swing.JButton();
        lblImagemFundo4 = new javax.swing.JLabel();
        InternalFrameEscolherProduto = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        InternalFrameCentrosEstoque = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtPesquisarCentroEstoque = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaCentrosEstoque = new javax.swing.JTable();
        btnOkCentroEstoque = new javax.swing.JButton();
        btnSairCentrosEstoque = new javax.swing.JButton();
        lblStatusCentroEstoque = new javax.swing.JLabel();
        lblImagemFundo5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPesquisarProdutos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnAddProduto = new javax.swing.JButton();
        btnSairProduto = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        txtCentroEstoque = new javax.swing.JTextField();
        btnPesquisaCentroEstoque = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblParcelas = new javax.swing.JLabel();
        txtParcelas = new javax.swing.JSpinner();
        lblPagto = new javax.swing.JLabel();
        txtPagto = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaParcela = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutosCompra = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboCalendario = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtResponsavel = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblCodigoCompra = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblDataCadastro = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        btnPesquisarFornecedor = new javax.swing.JButton();
        txtFormaPagto = new javax.swing.JTextField();
        btnPesquisarFormaPagto = new javax.swing.JButton();
        lblImagemFundo1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCompras = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnDados = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblImagemFundo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compras");
        setName("Compras"); // NOI18N

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setLayout(null);

        InternalFrameCompra.setClosable(true);
        InternalFrameCompra.setTitle("Novo cadastro");
        InternalFrameCompra.setVisible(true);
        InternalFrameCompra.getContentPane().setLayout(null);

        InternalFrameFormaPagto.setVisible(false);

        javax.swing.GroupLayout InternalFrameFormaPagtoLayout = new javax.swing.GroupLayout(InternalFrameFormaPagto.getContentPane());
        InternalFrameFormaPagto.getContentPane().setLayout(InternalFrameFormaPagtoLayout);
        InternalFrameFormaPagtoLayout.setHorizontalGroup(
            InternalFrameFormaPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        InternalFrameFormaPagtoLayout.setVerticalGroup(
            InternalFrameFormaPagtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        InternalFrameCompra.getContentPane().add(InternalFrameFormaPagto);
        InternalFrameFormaPagto.setBounds(0, 0, 720, 410);

        InternalFrameFornecedor.setClosable(true);
        InternalFrameFornecedor.setTitle("Fornecedores");
        InternalFrameFornecedor.setVisible(false);
        InternalFrameFornecedor.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                InternalFrameFornecedorInternalFrameClosed(evt);
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("Pesquisar fornecedores");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 210, 30);

        txtPesquisarFornecedor.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisarFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarFornecedorKeyReleased(evt);
            }
        });
        jPanel1.add(txtPesquisarFornecedor);
        txtPesquisarFornecedor.setBounds(20, 40, 600, 32);

        tabelaFornecedor.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fornecedor", "Cidade", "Cod"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaFornecedor.setRowHeight(25);
        tabelaFornecedor.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFornecedorMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaFornecedor);
        if (tabelaFornecedor.getColumnModel().getColumnCount() > 0) {
            tabelaFornecedor.getColumnModel().getColumn(0).setPreferredWidth(400);
            tabelaFornecedor.getColumnModel().getColumn(1).setPreferredWidth(400);
            tabelaFornecedor.getColumnModel().getColumn(2).setPreferredWidth(90);
        }

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(20, 90, 600, 230);

        lblStatusFornecedor.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatusFornecedor.setText("Fornecedores cadastrados: 0");
        jPanel1.add(lblStatusFornecedor);
        lblStatusFornecedor.setBounds(20, 350, 440, 30);

        btnOkFornecedor.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnOkFornecedor.setText("Ok");
        btnOkFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOkFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnOkFornecedor);
        btnOkFornecedor.setBounds(20, 410, 100, 40);

        btnSairFornecedor.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSairFornecedor.setText("Sair");
        btnSairFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSairFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnSairFornecedor);
        btnSairFornecedor.setBounds(520, 410, 100, 40);
        jPanel1.add(lblImagemFundo4);
        lblImagemFundo4.setBounds(160, 330, 490, 130);

        javax.swing.GroupLayout InternalFrameFornecedorLayout = new javax.swing.GroupLayout(InternalFrameFornecedor.getContentPane());
        InternalFrameFornecedor.getContentPane().setLayout(InternalFrameFornecedorLayout);
        InternalFrameFornecedorLayout.setHorizontalGroup(
            InternalFrameFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        InternalFrameFornecedorLayout.setVerticalGroup(
            InternalFrameFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        InternalFrameCompra.getContentPane().add(InternalFrameFornecedor);
        InternalFrameFornecedor.setBounds(0, 0, 660, 490);

        InternalFrameEscolherProduto.setClosable(true);
        InternalFrameEscolherProduto.setTitle("Escolha um produto para adicionar à compra");
        InternalFrameEscolherProduto.setVisible(false);
        InternalFrameEscolherProduto.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                InternalFrameEscolherProdutoInternalFrameClosed(evt);
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        InternalFrameCentrosEstoque.setClosable(true);
        InternalFrameCentrosEstoque.setTitle("Centros de estoque");
        InternalFrameCentrosEstoque.setVisible(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel14.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel14.setText("Pesquisar centros de estoque");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(20, 10, 260, 30);

        txtPesquisarCentroEstoque.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisarCentroEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarCentroEstoqueKeyReleased(evt);
            }
        });
        jPanel2.add(txtPesquisarCentroEstoque);
        txtPesquisarCentroEstoque.setBounds(20, 40, 590, 32);

        tabelaCentrosEstoque.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaCentrosEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
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
        tabelaCentrosEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaCentrosEstoque.setRowHeight(25);
        tabelaCentrosEstoque.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaCentrosEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCentrosEstoqueMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tabelaCentrosEstoque);
        if (tabelaCentrosEstoque.getColumnModel().getColumnCount() > 0) {
            tabelaCentrosEstoque.getColumnModel().getColumn(0).setPreferredWidth(500);
            tabelaCentrosEstoque.getColumnModel().getColumn(1).setPreferredWidth(90);
        }

        jPanel2.add(jScrollPane6);
        jScrollPane6.setBounds(20, 90, 590, 180);

        btnOkCentroEstoque.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnOkCentroEstoque.setText("Ok");
        btnOkCentroEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOkCentroEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkCentroEstoqueActionPerformed(evt);
            }
        });
        jPanel2.add(btnOkCentroEstoque);
        btnOkCentroEstoque.setBounds(20, 360, 100, 35);

        btnSairCentrosEstoque.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSairCentrosEstoque.setText("Sair");
        btnSairCentrosEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSairCentrosEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCentrosEstoqueActionPerformed(evt);
            }
        });
        jPanel2.add(btnSairCentrosEstoque);
        btnSairCentrosEstoque.setBounds(510, 360, 100, 35);

        lblStatusCentroEstoque.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatusCentroEstoque.setText("Centros de estoque cadastrados: 0");
        jPanel2.add(lblStatusCentroEstoque);
        lblStatusCentroEstoque.setBounds(20, 300, 470, 30);
        jPanel2.add(lblImagemFundo5);
        lblImagemFundo5.setBounds(350, 280, 280, 130);

        javax.swing.GroupLayout InternalFrameCentrosEstoqueLayout = new javax.swing.GroupLayout(InternalFrameCentrosEstoque.getContentPane());
        InternalFrameCentrosEstoque.getContentPane().setLayout(InternalFrameCentrosEstoqueLayout);
        InternalFrameCentrosEstoqueLayout.setHorizontalGroup(
            InternalFrameCentrosEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        InternalFrameCentrosEstoqueLayout.setVerticalGroup(
            InternalFrameCentrosEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(InternalFrameCentrosEstoque);
        InternalFrameCentrosEstoque.setBounds(0, 0, 648, 440);

        jLabel8.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel8.setText("Pesquisar produto por nome ou código personalizado");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 10, 460, 30);

        txtPesquisarProdutos.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisarProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarProdutosKeyReleased(evt);
            }
        });
        jPanel3.add(txtPesquisarProdutos);
        txtPesquisarProdutos.setBounds(20, 40, 600, 32);

        jLabel10.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel10.setText("Centro de estoque");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(230, 320, 153, 30);

        txtQuantidade.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });
        jPanel3.add(txtQuantidade);
        txtQuantidade.setBounds(20, 350, 70, 32);

        jLabel9.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel9.setText("Quantidade");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 320, 90, 30);

        jLabel12.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel12.setText("Valor");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(130, 320, 50, 30);

        txtValor.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });
        jPanel3.add(txtValor);
        txtValor.setBounds(130, 350, 70, 32);

        btnAddProduto.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnAddProduto.setText("Ok");
        btnAddProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdutoActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddProduto);
        btnAddProduto.setBounds(20, 410, 100, 35);

        btnSairProduto.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSairProduto.setText("Sair");
        btnSairProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSairProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairProdutoActionPerformed(evt);
            }
        });
        jPanel3.add(btnSairProduto);
        btnSairProduto.setBounds(520, 410, 100, 35);

        tabelaProdutos.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produto", "Cod Person", "Cod"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaProdutos.setRowHeight(25);
        tabelaProdutos.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabelaProdutos);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(500);
            tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(90);
            tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(90);
        }

        jPanel3.add(jScrollPane5);
        jScrollPane5.setBounds(20, 90, 600, 210);

        txtCentroEstoque.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jPanel3.add(txtCentroEstoque);
        txtCentroEstoque.setBounds(230, 350, 350, 32);

        btnPesquisaCentroEstoque.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnPesquisaCentroEstoque.setText("...");
        btnPesquisaCentroEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaCentroEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaCentroEstoqueActionPerformed(evt);
            }
        });
        jPanel3.add(btnPesquisaCentroEstoque);
        btnPesquisaCentroEstoque.setBounds(580, 350, 40, 32);

        javax.swing.GroupLayout InternalFrameEscolherProdutoLayout = new javax.swing.GroupLayout(InternalFrameEscolherProduto.getContentPane());
        InternalFrameEscolherProduto.getContentPane().setLayout(InternalFrameEscolherProdutoLayout);
        InternalFrameEscolherProdutoLayout.setHorizontalGroup(
            InternalFrameEscolherProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        InternalFrameEscolherProdutoLayout.setVerticalGroup(
            InternalFrameEscolherProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        InternalFrameCompra.getContentPane().add(InternalFrameEscolherProduto);
        InternalFrameEscolherProduto.setBounds(0, 0, 660, 490);

        btnFechar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnFechar.setText("Sair");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        InternalFrameCompra.getContentPane().add(btnFechar);
        btnFechar.setBounds(130, 520, 100, 35);

        btnSalvar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        InternalFrameCompra.getContentPane().add(btnSalvar);
        btnSalvar.setBounds(20, 520, 100, 35);

        lblTotal.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 0, 0));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("0,00");
        InternalFrameCompra.getContentPane().add(lblTotal);
        lblTotal.setBounds(20, 450, 140, 30);

        jLabel11.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel11.setText("Valor da Compra");
        InternalFrameCompra.getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 420, 140, 30);

        jLabel13.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel13.setText("Forma de Pagamento");
        InternalFrameCompra.getContentPane().add(jLabel13);
        jLabel13.setBounds(220, 420, 162, 30);

        lblParcelas.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblParcelas.setText("Parcelas");
        InternalFrameCompra.getContentPane().add(lblParcelas);
        lblParcelas.setBounds(730, 420, 72, 30);

        txtParcelas.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtParcelas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtParcelasStateChanged(evt);
            }
        });
        InternalFrameCompra.getContentPane().add(txtParcelas);
        txtParcelas.setBounds(730, 450, 70, 32);

        lblPagto.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblPagto.setText("Pago na 1ª parcela");
        InternalFrameCompra.getContentPane().add(lblPagto);
        lblPagto.setBounds(830, 420, 162, 30);

        txtPagto.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPagto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagtoKeyTyped(evt);
            }
        });
        InternalFrameCompra.getContentPane().add(txtPagto);
        txtPagto.setBounds(830, 450, 89, 32);

        tabelaParcela.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaParcela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parcela", "Liquid", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaParcela.setRowHeight(25);
        tabelaParcela.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jScrollPane3.setViewportView(tabelaParcela);
        if (tabelaParcela.getColumnModel().getColumnCount() > 0) {
            tabelaParcela.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaParcela.getColumnModel().getColumn(1).setPreferredWidth(10);
            tabelaParcela.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        InternalFrameCompra.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(730, 220, 260, 180);

        btnRemover.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnRemover.setText("-");
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        InternalFrameCompra.getContentPane().add(btnRemover);
        btnRemover.setBounds(670, 270, 50, 40);

        btnAdd.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnAdd.setText("+");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        InternalFrameCompra.getContentPane().add(btnAdd);
        btnAdd.setBounds(670, 220, 50, 40);

        tabelaProdutosCompra.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaProdutosCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Centro de estoque", "Quant", "Valor", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutosCompra.setRowHeight(25);
        tabelaProdutosCompra.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jScrollPane2.setViewportView(tabelaProdutosCompra);
        if (tabelaProdutosCompra.getColumnModel().getColumnCount() > 0) {
            tabelaProdutosCompra.getColumnModel().getColumn(0).setPreferredWidth(300);
            tabelaProdutosCompra.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabelaProdutosCompra.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabelaProdutosCompra.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabelaProdutosCompra.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        InternalFrameCompra.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 220, 640, 180);

        jLabel16.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("Adicionar produtos à compra");
        InternalFrameCompra.getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 190, 250, 30);

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setText("Fornecedor");
        InternalFrameCompra.getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 90, 90, 30);

        jLabel5.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel5.setText("Nº da nota");
        InternalFrameCompra.getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 90, 90, 30);

        txtNota.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCompra.getContentPane().add(txtNota);
        txtNota.setBounds(310, 120, 180, 32);

        jLabel6.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel6.setText("Data da compra");
        InternalFrameCompra.getContentPane().add(jLabel6);
        jLabel6.setBounds(840, 90, 126, 30);

        comboCalendario.setBackground(new java.awt.Color(229, 244, 244));
        comboCalendario.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        comboCalendario.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboCalendario.setMaxSelectableDate(new java.util.Date(253370775694000L));
        comboCalendario.setMinSelectableDate(new java.util.Date(-62135755106000L));
        InternalFrameCompra.getContentPane().add(comboCalendario);
        comboCalendario.setBounds(840, 120, 150, 32);

        jLabel7.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel7.setText("Responsável");
        InternalFrameCompra.getContentPane().add(jLabel7);
        jLabel7.setBounds(510, 90, 99, 30);

        txtResponsavel.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCompra.getContentPane().add(txtResponsavel);
        txtResponsavel.setBounds(510, 120, 300, 32);

        txtDescricao.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCompra.getContentPane().add(txtDescricao);
        txtDescricao.setBounds(110, 40, 700, 32);

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Descrição da compra");
        InternalFrameCompra.getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 10, 171, 30);

        jLabel15.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel15.setText("Código");
        InternalFrameCompra.getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 10, 60, 30);

        lblCodigoCompra.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblCodigoCompra.setForeground(new java.awt.Color(255, 0, 0));
        lblCodigoCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigoCompra.setText("Código");
        InternalFrameCompra.getContentPane().add(lblCodigoCompra);
        lblCodigoCompra.setBounds(20, 40, 60, 30);

        jLabel19.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel19.setText("Cadastrado em");
        InternalFrameCompra.getContentPane().add(jLabel19);
        jLabel19.setBounds(840, 10, 130, 30);

        lblDataCadastro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblDataCadastro.setForeground(new java.awt.Color(255, 0, 0));
        lblDataCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataCadastro.setText("Data do cadastro");
        InternalFrameCompra.getContentPane().add(lblDataCadastro);
        lblDataCadastro.setBounds(840, 40, 150, 30);

        jLabel17.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("Parcelas");
        InternalFrameCompra.getContentPane().add(jLabel17);
        jLabel17.setBounds(730, 190, 80, 30);

        txtFornecedor.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCompra.getContentPane().add(txtFornecedor);
        txtFornecedor.setBounds(20, 120, 230, 32);

        btnPesquisarFornecedor.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnPesquisarFornecedor.setText("...");
        btnPesquisarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarFornecedorActionPerformed(evt);
            }
        });
        InternalFrameCompra.getContentPane().add(btnPesquisarFornecedor);
        btnPesquisarFornecedor.setBounds(250, 120, 40, 32);

        txtFormaPagto.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCompra.getContentPane().add(txtFormaPagto);
        txtFormaPagto.setBounds(220, 450, 400, 32);

        btnPesquisarFormaPagto.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnPesquisarFormaPagto.setText("...");
        InternalFrameCompra.getContentPane().add(btnPesquisarFormaPagto);
        btnPesquisarFormaPagto.setBounds(620, 450, 40, 32);
        InternalFrameCompra.getContentPane().add(lblImagemFundo1);
        lblImagemFundo1.setBounds(0, 0, 1020, 570);

        painelPrincipal.add(InternalFrameCompra);
        InternalFrameCompra.setBounds(0, 0, 1030, 600);

        btnNovo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnNovo);
        btnNovo.setBounds(20, 550, 100, 35);

        tabelaCompras.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Data", "Responsável", "Valor", "Cod"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCompras.setRowHeight(25);
        tabelaCompras.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaComprasMouseClicked(evt);
            }
        });
        tabelaCompras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaComprasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCompras);
        if (tabelaCompras.getColumnModel().getColumnCount() > 0) {
            tabelaCompras.getColumnModel().getColumn(0).setPreferredWidth(500);
            tabelaCompras.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelaCompras.getColumnModel().getColumn(2).setPreferredWidth(300);
            tabelaCompras.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabelaCompras.getColumnModel().getColumn(4).setPreferredWidth(90);
        }

        painelPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 990, 370);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar compras");
        painelPrincipal.add(jLabel1);
        jLabel1.setBounds(20, 10, 153, 30);

        txtPesquisar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });
        painelPrincipal.add(txtPesquisar);
        txtPesquisar.setBounds(20, 40, 990, 32);

        lblStatus.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatus.setText("Compras cadastradas:");
        painelPrincipal.add(lblStatus);
        lblStatus.setBounds(20, 480, 440, 40);

        btnSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSair);
        btnSair.setBounds(910, 550, 100, 35);

        btnDados.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnDados.setText("Dados");
        btnDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnDados);
        btnDados.setBounds(130, 550, 100, 35);

        btnExcluir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnExcluir);
        btnExcluir.setBounds(240, 550, 100, 35);
        painelPrincipal.add(lblImagemFundo3);
        lblImagemFundo3.setBounds(430, 460, 470, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        
        txtDescricao.setText("");
        txtFornecedor.setText("");
        txtNota.setText("");
        comboCalendario.setDate(new Date());
        txtResponsavel.setText("");
        txtPesquisarProdutos.setText("");
        txtQuantidade.setText("");
        txtValor.setText("");
        tabela = (DefaultTableModel)tabelaProdutosCompra.getModel();
        tabela.setRowCount(0);
        lblTotal.setText("0");
        txtParcelas.setValue(1);
        tabela = (DefaultTableModel)tabelaParcela.getModel();
        tabela.setRowCount(0);
        lblCodigoCompra.setText(String.valueOf(getMaxCodigoCompra()+1));
        txtPagto.setText("0");
        
        btnAddProduto.setEnabled(true);
        btnRemover.setEnabled(true);
        txtParcelas.setEnabled(true);
        tabelaProdutosCompra.setEnabled(true);
        tabelaParcela.setEnabled(true);
        
        txtFormaPagto.setText("");
        tipoFormaPagto = "";
        codFormaPagto = 0;
        
        InternalFrameCompra.setTitle("Novo cadastro");
        InternalFrameCompra.setVisible(true);
        
        txtDescricao.grabFocus();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed
        
        int linha = tabelaCompras.getSelectedRow();
        if (linha == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione a compra para alterar!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            tabela = (DefaultTableModel) tabelaCompras.getModel();
            String Codigo = String.valueOf(tabela.getValueAt(linha, 4));
            carregarCompra(Codigo);
            
            carregarProdutosCompra(Codigo, (DefaultTableModel) tabelaProdutosCompra.getModel());
            
            carregarParcelas(Codigo, (DefaultTableModel) tabelaParcela.getModel());
            
            carregarPagtoPrimeiraParcela(Codigo);
            
            btnAdd.setEnabled(false);
            btnRemover.setEnabled(false);
            txtParcelas.setEnabled(false);
            tabelaProdutosCompra.setEnabled(false); 
            tabelaParcela.setEnabled(false);
            txtPagto.setEditable(false);
            
            InternalFrameCompra.setTitle("Alteração de dados");
            InternalFrameCompra.setVisible(true);
            
            txtDescricao.grabFocus();
        }
        
    }//GEN-LAST:event_btnDadosActionPerformed

    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed

        //excessoes da pesquisa
        if (tabelaProdutos.getSelectedRow() < 0)
        {
            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela!", "Atenção", JOptionPane.WARNING_MESSAGE);
            tabelaProdutos.grabFocus();
        }
        else if (txtQuantidade.getText().equals("0") || txtQuantidade.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Informe uma quantidade válida!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtQuantidade.grabFocus();
        }
        else if (txtValor.getText().equals("0") || txtValor.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Informe o valor do produto!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtValor.grabFocus();
        }
        else if (txtCentroEstoque.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Selecione um centro de estoque!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtCentroEstoque.grabFocus();
        }
        else
        {
            String produto = tabelaProdutos.getModel().getValueAt(tabelaProdutos.getSelectedRow(), 0).toString();
            int quant = Integer.parseInt(txtQuantidade.getText());
            float valor = troca.trocaVirgulaPorPonto(txtValor.getText());
            String centro = txtCentroEstoque.getText();
            
            addProdutosTabela(produto, quant, valor, centro, (DefaultTableModel) tabelaProdutosCompra.getModel());
            
            InternalFrameEscolherProduto.dispose();
           
        }

    }//GEN-LAST:event_btnAddProdutoActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed

        int linha = tabelaProdutosCompra.getSelectedRow();

        if (linha<0)
        {
            JOptionPane.showMessageDialog(null, "Selecione um produto para retirar!","Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            retiraProdutosTabela(linha);
        }

    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (txtDescricao.getText().equals("") || txtDescricao.getText().equals("Campo obrigatório"))
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo Descrição da Compra!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtDescricao.grabFocus();
        }
        else if (txtResponsavel.getText().length() >50)
        {
            JOptionPane.showMessageDialog(null, "O campo responsável é muito grande!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtResponsavel.grabFocus();
        }
        else if (txtFornecedor.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Selecione um fornecedor!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtFornecedor.grabFocus();
        }
        else if (tabelaProdutosCompra.getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(null, "Adicione um produto à compra!", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnAdd.grabFocus();
        }
        else if (txtFormaPagto.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Selecione uma forma de pagamento!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtFormaPagto.grabFocus();
        }
        else if (Float.valueOf(txtPagto.getText()) > Float.valueOf(lblTotal.getText()))
        {
            JOptionPane.showMessageDialog(null, "O valor pago não pode ser maior que o valor total!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtPagto.grabFocus();
        }
        else
        {
            if (InternalFrameCompra.getTitle().equals("Novo cadastro"))
            {
                if (tipoFormaPagto.equals("À Vista"))
                {
                    int resp = JOptionPane.showConfirmDialog(null, "Este valor saiu do caixa?", "Atenção", JOptionPane.YES_NO_OPTION);
                    if (resp == 0)
                    {
                        Usuarios usuarios = new Usuarios();
                        int codUsuario = usuarios.retornaCodUsuario(nomeUsuario);
                        
                        Caixa caixa = new Caixa();
                        if (caixa.verificaCaixaAberto(codUsuario) == true)
                        {
                            int codCaixa = caixa.retornaCodigoCaixa(codUsuario);
                            caixa.registraMovimentacao(codCaixa, "Compra realizada pelo usuário "+nomeUsuario, 
                                    "Entrada", Float.valueOf(lblTotal.getText()), 
                                    txtFormaPagto.getText(), comboCalendario.getDate(), codUsuario);
                        
                            tabela = (DefaultTableModel)tabelaProdutosCompra.getModel();

                            //inserir dados da tabela compra
                            addCompra();

                            //inserir dados na tabela produtos_compra
                            addProdutosCompra(tabela);

                            //adicionar produtos na tabela produtos_centro_estoque
                            addProdutosCentroEstoque(tabela);

                            //adicionar a despesa na tabela despesa
                            addDespesa((DefaultTableModel) tabelaParcela.getModel());

                            //recarregar a tabela compras para que a compra apareça
                            carregaCompra("Todos", null, (DefaultTableModel) tabelaCompras.getModel());

                            JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                            InternalFrameCompra.dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Você não tem um caixa aberto para realizar as movimentações!", "Atenção", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else
                    {
                        tabela = (DefaultTableModel)tabelaProdutosCompra.getModel();

                        //inserir dados da tabela compra
                        addCompra();

                        //inserir dados na tabela produtos_compra
                        addProdutosCompra(tabela);

                        //adicionar produtos na tabela produtos_centro_estoque
                        addProdutosCentroEstoque(tabela);

                        //adicionar a despesa na tabela despesa
                        addDespesa((DefaultTableModel) tabelaParcela.getModel());

                        //recarregar a tabela compras para que a compra apareça
                        carregaCompra("Todos", null, (DefaultTableModel) tabelaCompras.getModel());

                        JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                        InternalFrameCompra.dispose();
                    }
                }
                else
                {
                    tabela = (DefaultTableModel)tabelaProdutosCompra.getModel();

                    //inserir dados da tabela compra
                    addCompra();

                    //inserir dados na tabela produtos_compra
                    addProdutosCompra(tabela);

                    //adicionar produtos na tabela produtos_centro_estoque
                    addProdutosCentroEstoque(tabela);

                    //adicionar a despesa na tabela despesa
                    addDespesa((DefaultTableModel) tabelaParcela.getModel());

                    //recarregar a tabela compras para que a compra apareça
                    carregaCompra("Todos", null, (DefaultTableModel) tabelaCompras.getModel());

                    JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    InternalFrameCompra.dispose();
                }
            }
            else
            {
                updateCompra();
                
                updateDespesas();
                
                //updateParcelasLiquidado();
                
                carregaCompra("Todos", null, (DefaultTableModel) tabelaCompras.getModel());
                InternalFrameCompra.dispose();
                JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                
            }

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        InternalFrameEscolherProduto.dispose();
        InternalFrameCompra.dispose();

    }//GEN-LAST:event_btnFecharActionPerformed

    private void txtParcelasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtParcelasStateChanged

        if (InternalFrameCompra.getTitle().equals("Novo cadastro"))
        {
            if (txtParcelas.getValue().equals(0))
            {
                txtParcelas.setValue(1);
            }
            if (txtParcelas.getValue().equals(1))
            {
                txtPagto.setEditable(false);
            }
            else
            {
                txtPagto.setEditable(true);
            }
            float valorTotal = Float.valueOf(lblTotal.getText());
            int qntParcelas = Integer.valueOf(txtParcelas.getValue().toString());
            float valorPago = valorTotal/qntParcelas;

            txtPagto.setText(String.valueOf(valorPago));

            geraParcela();
        }

    }//GEN-LAST:event_txtParcelasStateChanged

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+""))
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_txtQuantidadeKeyTyped

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        
        String caracteres="0987654321.,";
        if(!caracteres.contains(evt.getKeyChar()+""))
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        
        carregaCompra("Like", txtPesquisar.getText(), (DefaultTableModel) tabelaCompras.getModel());
        
        if (txtPesquisar.getText().isEmpty())
        {
            lblStatus.setForeground(Color.BLACK);
        }
        else
        {
            lblStatus.setText("Status: Pesquisando compras");
            lblStatus.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void txtPagtoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagtoKeyTyped
        
        String caracteres = "0987654321.,";
        if (!caracteres.contains(evt.getKeyChar()+""))
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_txtPagtoKeyTyped

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int linha = tabelaCompras.getSelectedRow();
        if (linha == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione uma compra para alterar!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (resp == 0)
            {
                tabela = (DefaultTableModel) tabelaCompras.getModel();
                String Codigo = String.valueOf(tabela.getValueAt(linha, 4));

                excluirCompra(Codigo);
            }
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaComprasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaComprasKeyPressed
        
        int key = evt.getKeyCode();
        if (key == evt.VK_DELETE) {
            btnExcluirActionPerformed(null);
        }
        
    }//GEN-LAST:event_tabelaComprasKeyPressed

    private void tabelaComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaComprasMouseClicked
        
        if (evt.getClickCount() == 2) {
            btnDadosActionPerformed(null);

            carregaCompra("Todos", null, (DefaultTableModel) tabelaCompras.getModel());
        }
        
    }//GEN-LAST:event_tabelaComprasMouseClicked

    private void btnSairProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairProdutoActionPerformed
        
        InternalFrameEscolherProduto.dispose();
        
    }//GEN-LAST:event_btnSairProdutoActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        txtDescricao.setEnabled(false);
        txtFornecedor.setEnabled(false);
        txtNota.setEnabled(false);
        txtResponsavel.setEnabled(false);
        tabelaProdutosCompra.setEnabled(false);
        btnAdd.setEnabled(false);
        btnRemover.setEnabled(false);
        tabelaParcela.setEnabled(false);
        txtFormaPagto.setEnabled(false);
        txtParcelas.setEnabled(false);
        txtPagto.setEnabled(false);
        
        txtValor.setText("");
        txtQuantidade.setText("");
        txtCentroEstoque.setText("");
        
        InternalFrameFormaPagto.dispose();
        InternalFrameFornecedor.dispose();
        InternalFrameCentrosEstoque.dispose();
        
        carregaProduto(txtPesquisarProdutos.getText(), (DefaultTableModel) tabelaProdutos.getModel());
        
        InternalFrameEscolherProduto.setVisible(true);
        
        txtPesquisarProdutos.grabFocus();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void InternalFrameEscolherProdutoInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_InternalFrameEscolherProdutoInternalFrameClosed
        
        txtDescricao.setEnabled(true);
        txtFornecedor.setEnabled(true);
        txtNota.setEnabled(true);
        txtResponsavel.setEnabled(true);
        tabelaProdutosCompra.setEnabled(true);
        btnAdd.setEnabled(true);
        btnRemover.setEnabled(true);
        tabelaParcela.setEnabled(true);
        txtFormaPagto.setEnabled(true);
        txtParcelas.setEnabled(true);
        txtPagto.setEnabled(true);
        
    }//GEN-LAST:event_InternalFrameEscolherProdutoInternalFrameClosed

    private void btnPesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarFornecedorActionPerformed

        if (txtFornecedor.getText().isEmpty()) {
            
            txtDescricao.setEnabled(false);
            txtFornecedor.setEnabled(false);
            txtNota.setEnabled(false);
            txtResponsavel.setEnabled(false);
            tabelaProdutosCompra.setEnabled(false);
            btnAdd.setEnabled(false);
            btnRemover.setEnabled(false);
            tabelaParcela.setEnabled(false);
            txtFormaPagto.setEnabled(false);
            txtParcelas.setEnabled(false);
            txtPagto.setEnabled(false);
            btnPesquisarFornecedor.setEnabled(false);
            
            InternalFrameEscolherProduto.dispose();
            InternalFrameFormaPagto.dispose();
            InternalFrameCentrosEstoque.dispose();
            
            fornecedores.carregaFornecedor(txtPesquisarFornecedor.getText(), (DefaultTableModel) tabelaFornecedor.getModel(), lblStatusFornecedor);
            InternalFrameFornecedor.setVisible(true);
            
            txtPesquisarFornecedor.grabFocus();
        } 
        else 
        {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja desvincular este fornecedor desta compra?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (resp == 0) 
            {
                txtFornecedor.setText("");
                codFornecedor = 0;
            }
        }
        
    }//GEN-LAST:event_btnPesquisarFornecedorActionPerformed

    private void txtPesquisarFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarFornecedorKeyReleased
        
        fornecedores.carregaFornecedor(txtPesquisarFornecedor.getText(), (DefaultTableModel) tabelaFornecedor.getModel(), lblStatusFornecedor);
        
    }//GEN-LAST:event_txtPesquisarFornecedorKeyReleased

    private void btnSairFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairFornecedorActionPerformed
        
        InternalFrameFornecedor.dispose();
        
    }//GEN-LAST:event_btnSairFornecedorActionPerformed

    private void btnOkFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkFornecedorActionPerformed
        
        int linha = tabelaFornecedor.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um fornecedor na tabela!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            txtFornecedor.setText(tabelaFornecedor.getModel().getValueAt(linha, 0).toString());
            codFornecedor = Integer.valueOf(tabelaFornecedor.getModel().getValueAt(linha, 2).toString());
            
            InternalFrameFornecedor.dispose();
        }
        
    }//GEN-LAST:event_btnOkFornecedorActionPerformed

    private void InternalFrameFornecedorInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_InternalFrameFornecedorInternalFrameClosed
        
        txtDescricao.setEnabled(true);
        txtFornecedor.setEnabled(true);
        txtNota.setEnabled(true);
        txtResponsavel.setEnabled(true);
        tabelaProdutosCompra.setEnabled(true);
        btnAdd.setEnabled(true);
        btnRemover.setEnabled(true);
        tabelaParcela.setEnabled(true);
        txtFormaPagto.setEnabled(true);
        txtParcelas.setEnabled(true);
        txtPagto.setEnabled(true);
        btnPesquisarFornecedor.setEnabled(true);
        
        btnPesquisarFornecedor.grabFocus();
        
    }//GEN-LAST:event_InternalFrameFornecedorInternalFrameClosed

    private void btnSairCentrosEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCentrosEstoqueActionPerformed
        
        InternalFrameCentrosEstoque.dispose();
        
    }//GEN-LAST:event_btnSairCentrosEstoqueActionPerformed

    private void btnOkCentroEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkCentroEstoqueActionPerformed
        
        int linha = tabelaCentrosEstoque.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um centro de estoque na tabela!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            txtCentroEstoque.setText(tabelaCentrosEstoque.getModel().getValueAt(linha, 0).toString());
            
            InternalFrameCentrosEstoque.dispose();
        }
        
    }//GEN-LAST:event_btnOkCentroEstoqueActionPerformed

    private void txtPesquisarCentroEstoqueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarCentroEstoqueKeyReleased
        
        centroEstoque.carregaCentroEstoque(txtPesquisarCentroEstoque.getText(), (DefaultTableModel) tabelaCentrosEstoque.getModel(), lblStatusCentroEstoque);
        
    }//GEN-LAST:event_txtPesquisarCentroEstoqueKeyReleased

    private void btnPesquisaCentroEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaCentroEstoqueActionPerformed
        
        if (txtCentroEstoque.getText().isEmpty()) {
            centroEstoque.carregaCentroEstoque(txtPesquisarCentroEstoque.getText(), (DefaultTableModel) tabelaCentrosEstoque.getModel(), lblStatusCentroEstoque);
            InternalFrameCentrosEstoque.setVisible(true);
            
            txtPesquisarCentroEstoque.grabFocus();
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja desvincular este centro de estoque deste produto?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                txtCentroEstoque.setText("");
            }
        }
        
    }//GEN-LAST:event_btnPesquisaCentroEstoqueActionPerformed

    private void txtPesquisarProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarProdutosKeyReleased
        
        carregaProduto(txtPesquisarProdutos.getText(), (DefaultTableModel) tabelaProdutos.getModel());
        
    }//GEN-LAST:event_txtPesquisarProdutosKeyReleased

    private void tabelaFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedorMouseClicked
        
        if (evt.getClickCount() == 2) 
        {
            btnOkFornecedorActionPerformed(null);
        }
        
    }//GEN-LAST:event_tabelaFornecedorMouseClicked

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        
        if (evt.getClickCount() == 2) 
        {
            btnAddProdutoActionPerformed(null);
        }
        
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void tabelaCentrosEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCentrosEstoqueMouseClicked
        
        if (evt.getClickCount()==2)
        {
            btnOkCentroEstoqueActionPerformed(null);
        }
        
    }//GEN-LAST:event_tabelaCentrosEstoqueMouseClicked

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
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇAM OS MÉTODOS
    
    public void carregaProduto(String Texto, DefaultTableModel tabela) {
        
        tabela.setRowCount(0);
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from produtos where Excluido = 0 and Nome like '%"+Texto+"%' "
                    + "or Excluido = 0 and Codigo_Personalizado like '%"+Texto+"%' order by Nome");
            while (rs.next())
            {
                tabela.addRow(new Object[] {
                    rs.getString("Nome"),
                    rs.getString("Codigo_Personalizado"),
                    rs.getInt("Codigo_Produto")
                });
            }
            
            rs.close();
            banco.fecharConexaoBanco();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void addProdutosTabela(String produto, int quant, float valor, String centro, DefaultTableModel tabela) {
        
        try
        {     
            float subtotal = quant * valor;
            
            int Flag = 0;
            for (int i = 0; i<tabela.getRowCount(); i++)
            {
                if (tabela.getValueAt(i, 0).equals(produto) && tabela.getValueAt(i, 1).equals(centro) 
                        && tabela.getValueAt(i, 3).equals(valor))
                {
                    Flag = 1;
                    tabela.setValueAt(quant+Integer.valueOf(tabela.getValueAt(i, 2).toString()), i, 2);
                    tabela.setValueAt(Float.valueOf(tabela.getValueAt(i, 2).toString())*Float.valueOf(tabela.getValueAt(i, 3).toString()), i, 4);
                }
            }
            if (Flag == 0)
            {

                tabela.addRow(new Object[]{
                    produto, 
                    centro, 
                    quant, 
                    valor, 
                    subtotal
                });
                   
            }
            
            geraParcela();
            
            //somar o valor total e jogar no txttotal
            float total= troca.trocaVirgulaPorPonto(lblTotal.getText());
            total = total +subtotal;
            
            //colocar o valor no txtpago
            int qntParcelas = Integer.valueOf(txtParcelas.getValue().toString());
            float valorPago = total/qntParcelas;
            
            lblTotal.setText(dffloat.format(total));
            if (lblTotal.getText().equals(",00")) {
                lblTotal.setText("0,00");
            }
            txtPagto.setText(dffloat.format(valorPago));
            if (txtPagto.getText().equals(",00")) {
                txtPagto.setText("0,00");
            }

        } 
        catch (NumberFormatException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void retiraProdutosTabela(int linha) {
        
        try
        {
            tabela = (DefaultTableModel) tabelaProdutosCompra.getModel();
            int quant = Integer.valueOf(tabela.getValueAt(linha, 2).toString());
            if (quant == 1)
            {
                tabela.removeRow(linha);
            }
            else
            {
                int resp = Integer.valueOf(JOptionPane.showInputDialog(null, "Entre com a quantidade que deseja retirar:", "Atenção",JOptionPane.QUESTION_MESSAGE));
                if (resp > quant)
                {
                    JOptionPane.showMessageDialog(null, "Não é possível retirar uma quantidade maior que a atual!", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
                else if (resp == quant)
                {
                    tabela.removeRow(linha);
                }
                else
                {
                    tabela.setValueAt(quant-resp, linha, 2);
                }
            }
            
            geraParcela();

            float total = 0;
            float valor;
            for (int i=0; i<tabelaProdutosCompra.getRowCount(); i++)
            {
                valor = Float.valueOf(tabela.getValueAt(i, 3).toString()) * Integer.valueOf(tabela.getValueAt(i, 2).toString());
                tabela.setValueAt(valor, i, 4);
                total = total + Float.valueOf(tabela.getValueAt(i, 4).toString());
            }
            lblTotal.setText(String.valueOf(total));
            
            int qntParcelas = Integer.valueOf(txtParcelas.getValue().toString());
            float valorPago = total/qntParcelas;
        
            txtPagto.setText(String.valueOf(valorPago));
        }
        catch (HeadlessException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        } 
        
    }
    
    public void addCompra() {
        
        try
        {            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String data = sdf.format(comboCalendario.getDate());
            
            banco.conexaoBanco();
            //inserir dados da compra na tabela compra
            ps = banco.con.prepareStatement("insert into compras "
                    + "(Descricao, Codigo_Fornecedor, Numero_Nota, Data, Responsavel, Valor, Forma_Pagamento, Parcelas) "
                    + "values (?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, txtDescricao.getText());
            ps.setInt(2, codFornecedor);
            ps.setString(3, txtNota.getText());
            ps.setString(4, data);
            ps.setString(5, txtResponsavel.getText());
            ps.setFloat(6, Float.valueOf(lblTotal.getText()));
            ps.setString(7, txtFormaPagto.getText());
            ps.setInt(8, Integer.valueOf(txtParcelas.getValue().toString()));
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
        }
        catch (HeadlessException | NumberFormatException | SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public int getMaxCodigoCompra() {
        int codigoCompra = 0;
        try
        {
            banco.conexaoBanco();
            //obter o codigo da ultima compra realizada
            rs = banco.st.executeQuery("select MAX(Codigo_Compra) as CodCompra from compras");

            while(rs.next())
            {
                codigoCompra = rs.getInt("CodCompra");
            }
            
            rs.close();
            banco.conexaoBanco();
                
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        return codigoCompra;
    }
    
    public void addProdutosCompra(DefaultTableModel modelo) {
        
        try
        {
            int codCentro = 0;
            int codProduto = 0;
            int codCompra = getMaxCodigoCompra();
            int quant;
            float valor;
            float subtotal;
            
            banco.conexaoBanco();

            for(int i=0; i<modelo.getRowCount(); i++)
            {
                
                quant = Integer.valueOf(modelo.getValueAt(i, 2).toString());
                valor = Float.valueOf(modelo.getValueAt(i, 3).toString());
                subtotal = Float.valueOf(modelo.getValueAt(i, 4).toString());

                rs = banco.st.executeQuery("select Codigo_Centro_Estoque from centros_estoque where Nome = '" + modelo.getValueAt(i, 1) + "'");
                while (rs.next())
                {
                    codCentro = rs.getInt("Codigo_Centro_Estoque");
                }

                rs = banco.st.executeQuery("select Codigo_Produto from produtos where Nome = '" + modelo.getValueAt(i, 0) + "'");
                while (rs.next())
                {
                    codProduto = rs.getInt("Codigo_Produto");
                }

                //inserir os produtos da compra na tabela produtos_compra
                ps = banco.con.prepareStatement("insert into produtos_compra values (?, ?, ?, ?, ?, ?)");
                ps.setInt(1, codProduto);
                ps.setInt(2, codCompra);
                ps.setInt(3, quant);
                ps.setFloat(4, valor);
                ps.setFloat(5, subtotal);
                ps.setInt(6, codCentro);
                ps.executeUpdate();

            }
            
            rs.close();
            ps.close();
            banco.fecharConexaoBanco();
        }
        catch (NumberFormatException | SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    public void addProdutosCentroEstoque(DefaultTableModel modelo) {
        
        //inserir os produtos na tabela produtos_centro_estoque
        try
        {
            
            int codProduto = 0;
            int codCentro = 0;
            int cod, cont = 0;
            int quantidade = 0;
            
            banco.conexaoBanco();
            for(int i=0; i<tabelaProdutosCompra.getRowCount(); i++)
            {

                rs = banco.st.executeQuery("select Codigo_Produto from produtos where Nome = '" + modelo.getValueAt(i, 0) + "'");
                while (rs.next())
                {
                    codProduto = rs.getInt("Codigo_Produto");
                }

                rs = banco.st.executeQuery("select Codigo_Centro_Estoque from centros_estoque where Nome = '" + modelo.getValueAt(i, 1) + "'");
                while (rs.next())
                {
                    codCentro = rs.getInt("Codigo_Centro_Estoque");
                }

                //verificar se o produto ja existe no centro de estoque
                rs = banco.st.executeQuery("select Codigo_Produto from produtos_centro_estoque");

                while (rs.next())
                {
                    cod = rs.getInt("Codigo_Produto");

                    //se o produto ja existir entao só atualiza a quantidade, se nao cria o produto na tabela
                    if (cod == codProduto)
                    {
                        cont = 1;
                    }

                }
                if (cont == 1)
                {
                    rs = banco.st.executeQuery("select Quantidade from produtos_centro_estoque where Codigo_Produto = '"+codProduto+"'");

                    while (rs.next())
                    {
                        quantidade = rs.getInt("Quantidade");
                    }
                    int qntAtual = Integer.valueOf(modelo.getValueAt(i, 2).toString());
                    ps = banco.con.prepareStatement("update produtos_centro_estoque set Quantidade = '"+(quantidade +qntAtual)+"' where Codigo_Produto = '"+codProduto+"'");
                    ps.executeUpdate();
                    
                    
                }
                else
                {
                    ps = banco.con.prepareStatement("insert into produtos_centro_estoque values (?, ?, ?, ?)");
                    ps.setInt(1, codProduto);
                    ps.setString(2, String.valueOf(modelo.getValueAt(i, 0)));
                    ps.setInt(3, codCentro);
                    ps.setInt(4, Integer.valueOf(modelo.getValueAt(i, 2).toString()));
                    ps.executeUpdate();
                    
                }
            }
            ps.close();
            rs.close();
            banco.fecharConexaoBanco();
        }
        
        catch (NumberFormatException | SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void addDespesa(DefaultTableModel modelo) {
        
        //inserir dados na tabela despesa
        
        try
        {
            
            int qntParcela = Integer.valueOf(txtParcelas.getValue().toString());
            float valorPago = Float.valueOf(txtPagto.getText());
            float valorTotal = Float.valueOf(lblTotal.getText());
            float valorParcela = valorPago;
            boolean liquidado;
            float resto;
            float restoParcela = valorPago;
            
            if (qntParcela > 1)
            {
                resto = valorTotal - valorPago;
                qntParcela = qntParcela -1;
                restoParcela = resto/qntParcela;
                qntParcela = qntParcela +1;
            }
            
            banco.conexaoBanco();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(comboCalendario.getDate());
            String dataPagto = sdf.format(calendar.getTime());
            String dataVenc = sdf.format(calendar.getTime());
            
            for (int i=0; i<qntParcela;i++)
            {
                liquidado = Boolean.valueOf(modelo.getValueAt(i, 1).toString());
                
                ps = banco.con.prepareStatement("insert into despesas values (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,? ,? ,? ,? ,? ,?)");
                ps.setInt(1, getMaxCodigoCompra());
                ps.setString(2, txtDescricao.getText());
                ps.setString(3, txtResponsavel.getText());
                ps.setInt(4, codFornecedor);
                ps.setInt(5, qntParcela);
                ps.setInt(6, i+1);
                ps.setString(7, dataPagto);
                ps.setString(8, dataVenc);
                ps.setString(9, txtFormaPagto.getText());
                ps.setFloat(10, valorPago);
                ps.setFloat(11, 0);
                ps.setFloat(12, valorParcela);
                ps.setBoolean(13, liquidado);
                ps.setString(14, "Compras");
                ps.setInt(15, 0);
                ps.setInt(16, 0);
                ps.executeUpdate();

                calendar.add(Calendar.MONTH, 1);
                dataVenc = sdf.format(calendar.getTime());
                dataPagto = null;
                valorParcela = restoParcela;
                valorPago = valorParcela;
            }
            
            ps.close();
            banco.fecharConexaoBanco();
        }
        catch (NumberFormatException | SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void geraParcela() {
        
        tabela = (DefaultTableModel) tabelaParcela.getModel();
        
        boolean liquidado = true;
        
        String data;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Calendar calendar = Calendar.getInstance();
        if (tabela.getRowCount() > 0) {
            data = tabela.getValueAt(tabelaParcela.getRowCount()-1, 2).toString();
            //calendar.setTime(data);
            calendar.add(Calendar.MONTH, 1);
        } else {
            data = sdf.format(comboCalendario.getDate());
            calendar.setTime(comboCalendario.getDate());
        }
        
        tabela.setRowCount(0);
        for (int i = 1; i <=Integer.valueOf(txtParcelas.getValue().toString()); i++)
        {
            tabela.addRow(new Object[]{
            i,
            liquidado,
            data
            });
            
            liquidado = false;
            calendar.add(Calendar.MONTH, 1);
            comboCalendario.setDate(calendar.getTime());
        }
        
    }
    
    public void carregaCompra(String Instrucao, String Texto, DefaultTableModel Tabela) {
        
        String Query = "";
        if (Instrucao.equals("Todos"))
        {
            Query = "Select * from compras where Excluido = 0 order by Data";
        }
        if (Instrucao.equals("Like"))
        {
            Query = "Select * from compras where Descricao like '%"+Texto+"%' and Excluido = 0 order by Data";
        }
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery(Query);
            
            Tabela.setRowCount(0);
            int Contador = 0;
            while (rs.next())
            {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String Data = sdf.format(rs.getDate("Data"));
                                
                Tabela.addRow(new Object[] {
                    rs.getString("Descricao"),
                    Data,
                    rs.getString("Responsavel"),
                    rs.getFloat("Valor"),
                    rs.getInt("Codigo_Compra")
                });
                Contador++;
            }
            
            lblStatus.setText("Compras cadastradas: "+Contador);
            rs.close();
            banco.fecharConexaoBanco();
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public String getFornecedor(int codFornecedor) {
        
        String razaoSocial = "";
        
        try 
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select fornecedores.Razao_Social from fornecedores "
                    + "where fornecedores.Codigo_Fornecedor = '"+codFornecedor+"'");
            while (rs.next())
            {
                razaoSocial = rs.getString("fornecedores.Razao_Social");
            }
            
            rs.close();
            banco.fecharConexaoBanco();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        return razaoSocial;
    }
    
    public void carregarCompra(String Codigo) {
        
        try
        {            
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select compras.* from compras "
                    + "where compras.Codigo_Compra = '"+Codigo+"'");
            while (rs.next())
            {
                txtDescricao.setText(rs.getString("compras.Descricao"));
                codFornecedor = rs.getInt("compras.Codigo_Fornecedor");
                txtNota.setText(rs.getString("compras.Numero_Nota"));
                comboCalendario.setDate(rs.getDate("compras.Data"));
                txtResponsavel.setText(rs.getString("compras.Responsavel"));
                lblTotal.setText(String.valueOf(rs.getFloat("compras.Valor")));
                txtFormaPagto.setText(rs.getString("compras.Forma_Pagamento"));
                lblCodigoCompra.setText(rs.getString("compras.Codigo_Compra"));
                txtParcelas.setValue(rs.getInt("compras.Parcelas"));
            }
            rs.close();
            banco.fecharConexaoBanco();
            
            txtFornecedor.setText(getFornecedor(codFornecedor));
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void carregarProdutosCompra(String Codigo, DefaultTableModel Tabela) {
        
        try
        {            
            banco.conexaoBanco();
            rs = banco.st.executeQuery("SELECT centros_estoque.Nome , produtos.Nome, produtos_compra.* "
                    + "from produtos,produtos_compra,centros_estoque "
                    + "where produtos_compra.Codigo_Produto = produtos.Codigo_Produto "
                    + "and Codigo_Compra = '"+Codigo+"' and "
                    + "produtos_compra.Codigo_Centro_Estoque = centros_estoque.Codigo_Centro_Estoque");
            Tabela.setRowCount(0);
            while (rs.next())
            {
                Tabela.addRow(new Object[] {
                    rs.getString("produtos.Nome"),
                    rs.getString("centros_estoque.Nome"),
                    rs.getInt("produtos_compra.Quantidade"),
                    rs.getFloat("produtos_compra.Valor"),
                    rs.getFloat("produtos_compra.Subtotal")
                });
            }
                
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void carregarParcelas(String Codigo, DefaultTableModel Tabela) {
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select despesas.Numero_Parcela, despesas.Liquidado "
                    + "from despesas where despesas.Codigo_Despesa = '"+Codigo+"' "
                    + "and despesas.Categoria = 'Compras'");
            Tabela.setRowCount(0);
            while (rs.next())
            {
                Tabela.addRow(new Object[] {
                    rs.getInt("Numero_Parcela"),
                    rs.getBoolean("Liquidado")
                });
            }
            rs.close();
            banco.fecharConexaoBanco();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void carregarPagtoPrimeiraParcela(String Codigo) {
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select despesas.Valor_Total from despesas "
                    + "where despesas.Codigo_Despesa = '"+Codigo+"' "
                    + "and despesas.Categoria = 'Compras' and despesas.Excluido = 0 and despesas.Numero_Parcela = 1");
            while (rs.next())
            {
                txtPagto.setText(rs.getString("Valor_Total"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void updateCompra() {
        
        try
        {
            SimpleDateFormat fds = new SimpleDateFormat("yyyy/MM/dd");
            String dataCompra = fds.format(comboCalendario.getDate());
            
            banco.conexaoBanco();            
            ps = banco.con.prepareStatement("update compras set Descricao = '"+txtDescricao.getText()+"',"
                    + "Codigo_Fornecedor = '"+codFornecedor+"',"
                    + "Numero_Nota = '"+txtNota.getText()+"',"
                    + "Data = '"+dataCompra+"',"
                    + "Responsavel = '"+txtResponsavel.getText()+"' where Codigo_Compra = '"+lblCodigoCompra.getText()+"'");
            ps.executeUpdate();
            
            ps.close();
            rs.close();
            banco.fecharConexaoBanco();
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void updateDespesas() {
        
        try
        {            
            banco.conexaoBanco();
            
            //atualizar os dados da compra na tabela despesas
            ps = banco.con.prepareStatement("update despesas set Descricao = '"+txtDescricao.getText()+"',"
                    + "Codigo_Fornecedor = '"+codFornecedor+"',"
                    + "Responsavel = '"+txtResponsavel.getText()+"' "
                    + "where Codigo_Despesa = '"+lblCodigoCompra.getText()+"' and Categoria = 'Compras'");
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
            
        }
        catch (HeadlessException | SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void excluirCompra(String Codigo) {
        
        try
        {
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update compras set Excluido = 1 where Codigo_Compra = '"+Codigo+"'");
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
            
            carregaCompra("Todos", null, (DefaultTableModel) tabelaCompras.getModel());
            
        }
        catch (HeadlessException | SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame InternalFrameCentrosEstoque;
    private javax.swing.JInternalFrame InternalFrameCompra;
    private javax.swing.JInternalFrame InternalFrameEscolherProduto;
    private javax.swing.JInternalFrame InternalFrameFormaPagto;
    private javax.swing.JInternalFrame InternalFrameFornecedor;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddProduto;
    private javax.swing.JButton btnDados;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnOkCentroEstoque;
    private javax.swing.JButton btnOkFornecedor;
    private javax.swing.JButton btnPesquisaCentroEstoque;
    private javax.swing.JButton btnPesquisarFormaPagto;
    private javax.swing.JButton btnPesquisarFornecedor;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSairCentrosEstoque;
    private javax.swing.JButton btnSairFornecedor;
    private javax.swing.JButton btnSairProduto;
    private javax.swing.JButton btnSalvar;
    private com.toedter.calendar.JDateChooser comboCalendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblCodigoCompra;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblImagemFundo1;
    private javax.swing.JLabel lblImagemFundo3;
    private javax.swing.JLabel lblImagemFundo4;
    private javax.swing.JLabel lblImagemFundo5;
    private javax.swing.JLabel lblPagto;
    private javax.swing.JLabel lblParcelas;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatusCentroEstoque;
    private javax.swing.JLabel lblStatusFornecedor;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTable tabelaCentrosEstoque;
    private javax.swing.JTable tabelaCompras;
    private javax.swing.JTable tabelaFornecedor;
    private javax.swing.JTable tabelaParcela;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTable tabelaProdutosCompra;
    private javax.swing.JTextField txtCentroEstoque;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtFormaPagto;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtPagto;
    private javax.swing.JSpinner txtParcelas;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPesquisarCentroEstoque;
    private javax.swing.JTextField txtPesquisarFornecedor;
    private javax.swing.JTextField txtPesquisarProdutos;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
