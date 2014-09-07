

package CentroEstoque;

import ConexaoBanco.ConexaoBanco;
import DimensionaImagem.DimensionaImagem;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public final class CentroEstoque extends javax.swing.JFrame {
    
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;
    DefaultTableModel tabela;
    public String nome;
    public int codCentroEstoque;
    
    public CentroEstoque() {
        initComponents();
        
        Font font = new Font("NSimSun", Font.PLAIN, 18);
        
        JTableHeader cabecalho = tabelaCentroEstoque.getTableHeader();
        cabecalho.setFont(font);
        
        JTableHeader cabecalhoProdutos = tabelaProdutosCentro.getTableHeader();
        cabecalhoProdutos.setFont(font);
        
        carregaCentroEstoque(txtPesquisar.getText(), (DefaultTableModel) tabelaCentroEstoque.getModel(), lblStatus);
                
        DimensionaImagem dimImagem = new DimensionaImagem();
        dimImagem.dimensionaComponentes(lblImagemFundo, "/ControleDeEstoque/Imagens/ImagemFundoCentroEstoque1.jpg", 310, 150);
        dimImagem.dimensionaComponentes(lblImagemFundo1, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 400, 170);
        dimImagem.dimensionaComponentes(lblImagemFundoProdutos, "/ControleDeEstoque/Imagens/ImagemFundoCentroEstoque2.jpg", 280, 130);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        InternalFrameProdutosCentro = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPesquisarProduto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutosCentro = new javax.swing.JTable();
        lblStatusProduto = new javax.swing.JLabel();
        btnSairProduto = new javax.swing.JButton();
        btnDiminuirQnt = new javax.swing.JButton();
        lblImagemFundoProdutos = new javax.swing.JLabel();
        InternalFrameCentro = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblDataCadastro = new javax.swing.JLabel();
        lblImagemFundo1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCentroEstoque = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        btnDados = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        lblImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Centros de Estoque");
        setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        setResizable(false);

        PainelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PainelPrincipal.setLayout(null);

        InternalFrameProdutosCentro.setClosable(true);
        InternalFrameProdutosCentro.setTitle("Produtos no centro de estoque");
        InternalFrameProdutosCentro.setVisible(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Pesquisar produtos");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 30);

        txtPesquisarProduto.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarProdutoKeyReleased(evt);
            }
        });
        jPanel4.add(txtPesquisarProduto);
        txtPesquisarProduto.setBounds(20, 40, 610, 32);

        tabelaProdutosCentro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaProdutosCentro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quant", "Cod"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        tabelaProdutosCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaProdutosCentro.setRowHeight(25);
        tabelaProdutosCentro.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaProdutosCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosCentroMouseClicked(evt);
            }
        });
        tabelaProdutosCentro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaProdutosCentroKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaProdutosCentro);
        if (tabelaProdutosCentro.getColumnModel().getColumnCount() > 0) {
            tabelaProdutosCentro.getColumnModel().getColumn(0).setPreferredWidth(1100);
            tabelaProdutosCentro.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelaProdutosCentro.getColumnModel().getColumn(2).setPreferredWidth(90);
        }

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(20, 80, 610, 220);

        lblStatusProduto.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatusProduto.setText("Produtos cadastrados:");
        jPanel4.add(lblStatusProduto);
        lblStatusProduto.setBounds(20, 310, 470, 40);

        btnSairProduto.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSairProduto.setText("Sair");
        btnSairProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSairProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairProdutoActionPerformed(evt);
            }
        });
        jPanel4.add(btnSairProduto);
        btnSairProduto.setBounds(200, 380, 100, 35);

        btnDiminuirQnt.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnDiminuirQnt.setText("Diminuir quant.");
        btnDiminuirQnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiminuirQnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiminuirQntActionPerformed(evt);
            }
        });
        jPanel4.add(btnDiminuirQnt);
        btnDiminuirQnt.setBounds(20, 380, 167, 35);
        jPanel4.add(lblImagemFundoProdutos);
        lblImagemFundoProdutos.setBounds(370, 300, 280, 130);

        javax.swing.GroupLayout InternalFrameProdutosCentroLayout = new javax.swing.GroupLayout(InternalFrameProdutosCentro.getContentPane());
        InternalFrameProdutosCentro.getContentPane().setLayout(InternalFrameProdutosCentroLayout);
        InternalFrameProdutosCentroLayout.setHorizontalGroup(
            InternalFrameProdutosCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        InternalFrameProdutosCentroLayout.setVerticalGroup(
            InternalFrameProdutosCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        PainelPrincipal.add(InternalFrameProdutosCentro);
        InternalFrameProdutosCentro.setBounds(0, 0, 670, 460);

        InternalFrameCentro.setBackground(new java.awt.Color(255, 255, 255));
        InternalFrameCentro.setClosable(true);
        InternalFrameCentro.setTitle("Novo cadastro");
        InternalFrameCentro.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        InternalFrameCentro.setName("Novo cadastro"); // NOI18N
        InternalFrameCentro.setVisible(false);
        InternalFrameCentro.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                InternalFrameCentroInternalFrameClosed(evt);
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
        InternalFrameCentro.getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setText("Código");
        InternalFrameCentro.getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 10, 60, 30);

        lblCodigo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("Código");
        InternalFrameCentro.getContentPane().add(lblCodigo);
        lblCodigo.setBounds(20, 40, 60, 30);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("Nome");
        InternalFrameCentro.getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 10, 49, 30);

        txtNome.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameCentro.getContentPane().add(txtNome);
        txtNome.setBounds(100, 40, 270, 30);

        btnSalvar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        InternalFrameCentro.getContentPane().add(btnSalvar);
        btnSalvar.setBounds(20, 110, 100, 40);

        btnFechar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnFechar.setText("Sair");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        InternalFrameCentro.getContentPane().add(btnFechar);
        btnFechar.setBounds(130, 110, 100, 40);

        jLabel8.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel8.setText("Cadastrado em");
        InternalFrameCentro.getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 90, 130, 30);

        lblDataCadastro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblDataCadastro.setForeground(new java.awt.Color(255, 0, 0));
        lblDataCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataCadastro.setText("Não cadastrado");
        InternalFrameCentro.getContentPane().add(lblDataCadastro);
        lblDataCadastro.setBounds(250, 120, 150, 30);
        InternalFrameCentro.getContentPane().add(lblImagemFundo1);
        lblImagemFundo1.setBounds(0, 0, 400, 170);

        PainelPrincipal.add(InternalFrameCentro);
        InternalFrameCentro.setBounds(0, 0, 410, 200);

        btnNovo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnNovo);
        btnNovo.setBounds(20, 410, 110, 35);

        tabelaCentroEstoque.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaCentroEstoque.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaCentroEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaCentroEstoque.setRowHeight(25);
        tabelaCentroEstoque.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaCentroEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCentroEstoqueMouseClicked(evt);
            }
        });
        tabelaCentroEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaCentroEstoqueKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCentroEstoque);
        if (tabelaCentroEstoque.getColumnModel().getColumnCount() > 0) {
            tabelaCentroEstoque.getColumnModel().getColumn(0).setPreferredWidth(600);
            tabelaCentroEstoque.getColumnModel().getColumn(1).setPreferredWidth(90);
        }

        PainelPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(20, 92, 630, 220);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar Centros de Estoque");
        PainelPrincipal.add(jLabel1);
        jLabel1.setBounds(20, 10, 252, 30);

        txtPesquisar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });
        PainelPrincipal.add(txtPesquisar);
        txtPesquisar.setBounds(20, 42, 630, 32);

        btnSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnSair);
        btnSair.setBounds(540, 410, 110, 35);

        lblStatus.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatus.setText("Centros de estoque cadastrados:");
        PainelPrincipal.add(lblStatus);
        lblStatus.setBounds(20, 330, 460, 40);

        btnDados.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnDados.setText("Dados");
        btnDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnDados);
        btnDados.setBounds(140, 410, 110, 35);

        btnExcluir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnExcluir);
        btnExcluir.setBounds(260, 410, 110, 35);

        btnProdutos.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnProdutos.setText("Produtos");
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnProdutos);
        btnProdutos.setBounds(380, 410, 110, 35);
        PainelPrincipal.add(lblImagemFundo);
        lblImagemFundo.setBounds(360, 310, 310, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        txtNome.setText("");
        btnNovo.setEnabled(false);
        btnDados.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnProdutos.setEnabled(false);
        btnSair.setEnabled(false);
        tabelaCentroEstoque.setEnabled(false);
        txtPesquisar.setEnabled(false);
        lblDataCadastro.setText("Nao cadastrado");
        
        getMaxCodigo();
        
        InternalFrameCentro.setVisible(true);
        InternalFrameCentro.setTitle("Novo cadastro");
        
        txtNome.grabFocus();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        
        carregaCentroEstoque(txtPesquisar.getText(), (DefaultTableModel) tabelaCentroEstoque.getModel(),lblStatus);
        
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed
        
        int linha = tabelaCentroEstoque.getSelectedRow();
        if (linha== -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um centro de estoque para alterar","Atenção",JOptionPane.INFORMATION_MESSAGE);
        }
        
        else
        {
            
            btnNovo.setEnabled(false);
            btnDados.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnProdutos.setEnabled(false);
            btnSair.setEnabled(false);
            tabelaCentroEstoque.setEnabled(false);
            txtPesquisar.setEnabled(false);

            carregarCentroEstoque(String.valueOf(tabelaCentroEstoque.getModel().getValueAt(linha, 1)));

            InternalFrameCentro.setTitle("Alteração de dados");
            InternalFrameCentro.setVisible(true);
            txtNome.grabFocus();
                
        }
        
    }//GEN-LAST:event_btnDadosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int linha = tabelaCentroEstoque.getSelectedRow();
        if (linha== -1){
            JOptionPane.showMessageDialog(null, "Selecione um centro de estoque para excluir","Atenção",JOptionPane.WARNING_MESSAGE);
        }
        else
        {            
            if (verificaExclusaoCentroEstoque(String.valueOf(tabelaCentroEstoque.getModel().getValueAt(linha, 1))) == true)
            {
                JOptionPane.showMessageDialog(null, "Existem produtos neste centro de estoque!\nNão será possível excluir!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                    
                int con = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?","Atenção",JOptionPane.YES_NO_OPTION);
                if (con==0)
                {        

                    excluirCentroEstoque(String.valueOf(tabelaCentroEstoque.getModel().getValueAt(linha, 1)));
                    carregaCentroEstoque(txtPesquisar.getText(), (DefaultTableModel) tabelaCentroEstoque.getModel(), lblStatus);

                }
            }    
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        
        int linha = tabelaCentroEstoque.getSelectedRow();
        
        if (linha<0)
        {
            JOptionPane.showMessageDialog(null, "Escolha um centro de estoque para visualizar os produtos", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else
        {            
            carregaProdutos(Integer.valueOf(tabelaCentroEstoque.getModel().getValueAt(linha, 1).toString()), 
                    (DefaultTableModel) tabelaProdutosCentro.getModel());
            
            codCentroEstoque = Integer.valueOf(tabelaCentroEstoque.getModel().getValueAt(linha, 1).toString());
            
            InternalFrameProdutosCentro.setVisible(true);
        }
        
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        //caso acontecer uma das situações o sistema não deixará salvar
        if (txtNome.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtNome.grabFocus();
        }
        else if (txtNome.getText().length()> 30)
        {
            JOptionPane.showMessageDialog(null, "Nome excede o limite de caracteres", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtNome.grabFocus();
        }

        //se não ocorreu nenhuma situação acima o sistema tentará salvar as informações
        else
        {
            //se o título do formulário for Novo cadastro irá realizar as operações abaixo
            if (InternalFrameCentro.getTitle().equals("Novo cadastro"))
            {
                
                cadastrarCentroEstoque(); 
                carregaCentroEstoque(txtPesquisar.getText(), (DefaultTableModel) tabelaCentroEstoque.getModel(), lblStatus);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                InternalFrameCentro.dispose();
                
            }
            //se o título do formulário não for Novo cadastro o sistema irá realizar os procedimentos abaixo
            else
            {
                alterarCentroEstoque(codCentroEstoque, txtNome.getText());
                JOptionPane.showMessageDialog(null, "Cadastro editado com sucesso!","Atenção", JOptionPane.INFORMATION_MESSAGE);           
                carregaCentroEstoque(txtPesquisar.getText(), (DefaultTableModel) tabelaCentroEstoque.getModel(),lblStatus);          
                InternalFrameCentro.dispose();
                
            }

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        InternalFrameCentro.dispose();

    }//GEN-LAST:event_btnFecharActionPerformed

    private void txtPesquisarProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarProdutoKeyReleased
        
        pesquisaProdutos(txtPesquisarProduto.getText(), (DefaultTableModel) tabelaProdutosCentro.getModel());

        if (txtPesquisarProduto.getText().equals(""))
        {

            //label recebe cor preta
            lblStatusProduto.setForeground(Color.BLACK);
        }
        else
        {
            lblStatusProduto.setText("Status: Pesquisando Produto no Centro de Estoque");
            lblStatusProduto.setForeground(Color.red);
        }


    }//GEN-LAST:event_txtPesquisarProdutoKeyReleased

    private void btnSairProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairProdutoActionPerformed

        InternalFrameProdutosCentro.dispose();

    }//GEN-LAST:event_btnSairProdutoActionPerformed

    private void InternalFrameCentroInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_InternalFrameCentroInternalFrameClosed
        
        btnNovo.setEnabled(true);
        btnDados.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnProdutos.setEnabled(true);
        btnSair.setEnabled(true);
        tabelaCentroEstoque.setEnabled(true);
        txtPesquisar.setEnabled(true);
        
    }//GEN-LAST:event_InternalFrameCentroInternalFrameClosed

    private void tabelaCentroEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCentroEstoqueMouseClicked
        
        if (evt.getClickCount() ==2)
        {
            btnProdutosActionPerformed(null);
            carregaCentroEstoque(txtPesquisar.getText(), (DefaultTableModel) tabelaCentroEstoque.getModel(), lblStatus);
        }
        
    }//GEN-LAST:event_tabelaCentroEstoqueMouseClicked

    private void tabelaCentroEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaCentroEstoqueKeyPressed
        
        int key = evt.getKeyCode();
        if (key == evt.VK_DELETE)
        {            
            btnExcluirActionPerformed(null);
        }
        
    }//GEN-LAST:event_tabelaCentroEstoqueKeyPressed

    private void btnDiminuirQntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiminuirQntActionPerformed
        
        int linha = tabelaProdutosCentro.getSelectedRow();
        if (linha == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um produto para diminuir a quantidade!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente diminuir a quantidade deste produto?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (resp == 0) 
            {
                int quantDebitar = Integer.valueOf(JOptionPane.showInputDialog(null, "Entre com uma quantidade para debitar", "Atenção", JOptionPane.QUESTION_MESSAGE));
                while (quantDebitar <0)
                {
                    quantDebitar = Integer.valueOf(JOptionPane.showInputDialog(null, "Entre com uma quantidade válida para debitar", "Atenção", JOptionPane.WARNING_MESSAGE));
                }
                if (quantDebitar > 0)
                {
                    if (quantDebitar > Integer.valueOf(tabelaProdutosCentro.getModel().getValueAt(linha, 1).toString()))
                    {
                        JOptionPane.showMessageDialog(null, "Você não possui esta quantidade para debitar!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    }
                    else
                    {
                        diminuirQuantidade(String.valueOf(tabelaProdutosCentro.getModel().getValueAt(linha, 2)), 
                            Integer.valueOf(tabelaProdutosCentro.getModel().getValueAt(linha, 1).toString()), 
                            quantDebitar);
                    }
                    
                }
            }
        }
        
    }//GEN-LAST:event_btnDiminuirQntActionPerformed

    private void tabelaProdutosCentroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaProdutosCentroKeyPressed
        
        int key = evt.getKeyCode();
        if (key == evt.VK_DELETE) {
            btnDiminuirQntActionPerformed(null);
        }
        
    }//GEN-LAST:event_tabelaProdutosCentroKeyPressed

    private void tabelaProdutosCentroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosCentroMouseClicked
        
        if (evt.getClickCount() == 2) {
            btnDiminuirQntActionPerformed(null);
        }
        
    }//GEN-LAST:event_tabelaProdutosCentroMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentroEstoque().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇAM OS MÉTODOS
    
    public void cadastrarCentroEstoque() {
        
        int cont = 0;
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Nome from centros_estoque where Excluido = 0");
            
            while (rs.next())
            {
                if (txtNome.getText().equals(rs.getString("Nome")))
                {
                    JOptionPane.showMessageDialog(null, "Já existe um centro de estoque com este nome!","Atenção", JOptionPane.WARNING_MESSAGE);
                    cont = 1;
                }
            }
            
            if (cont == 0)
            {
                ps = banco.con.prepareStatement("insert into centros_estoque (Nome) values (?)");
                ps.setString(1, txtNome.getText());
                ps.executeUpdate();
                
                ps.close();
            }
            
            rs.close();
            banco.fecharConexaoBanco();
            
        }
        catch (SQLException | HeadlessException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void carregarCentroEstoque(String Codigo) {
                
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from centros_estoque where Codigo_Centro_Estoque = '"+Codigo+"'");
            
            while (rs.next())
            {
                lblCodigo.setText(rs.getString("Codigo_Centro_Estoque"));
                txtNome.setText(rs.getString("Nome"));
                nome = txtNome.getText();
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
    
    public boolean verificaExclusaoCentroEstoque(String Codigo) {
        boolean Flag = false;
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from produtos_centro_estoque where Codigo_Centro_Estoque = '"+Codigo+"'");
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
    
    public void excluirCentroEstoque(String Codigo) {
                
        try 
        {
            
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update centros_estoque set Excluido = 1 where Codigo_Centro_Estoque = '"+Codigo+"'");
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
    
    public void alterarCentroEstoque(int Codigo, String Nome) {
                
        try
        {
            banco.conexaoBanco();
            
            rs = banco.st.executeQuery("select Nome from centros_estoque where Excluido = 0");
            
            int cont = 0;
            while (rs.next())
            {
                if (Nome.equals(rs.getString("Nome")))
                {
                    cont = 1;
                }
                if (Nome.equals(nome))
                {
                    cont = 0;
                }
            }
            
            if (cont == 0)
            {
            
                ps = banco.con.prepareStatement("update centros_estoque set Nome = '"+Nome+"' where Codigo_Centro_Estoque = '"+Codigo+"'");
                ps.executeUpdate();
            
                ps.close();
                banco.fecharConexaoBanco();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Já existe um centro de estoque com este nome!","Atenção", JOptionPane.WARNING_MESSAGE);
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
    
    public void carregaCentroEstoque(String Texto, DefaultTableModel tabela, javax.swing.JLabel lblStatus) {
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from centros_estoque where Excluido = 0 and Nome like '%"+Texto+"%' order by Nome");
            
            tabela.setRowCount(0);
            int Contador = 0;
            while (rs.next())
            {
                tabela.addRow( new Object[] {
                rs.getString( "Nome" ), 
                rs.getInt("Codigo_Centro_Estoque")
                });
                Contador++;
            }
            
            if (Texto.equals(""))
            {
                //label recebe cor preta
                lblStatus.setForeground(Color.BLACK);
                lblStatus.setText("Centros de estoque cadastrados: "+Contador);
            }
            else
            {
                //label status adquire o texto e a cor abaixo
                lblStatus.setText("Status: Pesquisando Centros de estoque");
                lblStatus.setForeground(Color.red);            
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
    
    public void carregaProdutos(int codigo, DefaultTableModel tabela) {
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from produtos_centro_estoque where Codigo_Centro_Estoque = '"+codigo+"' order by Nome");

            tabela.setRowCount(0);
            int Contador = 0;
            while (rs.next())
            {
                tabela.addRow(new Object[] {
                    rs.getString("Nome"),
                    rs.getInt("Quantidade"),
                    rs.getInt("Codigo_Produto")
                });
                Contador++;
            }
            
            lblStatusProduto.setText("Produtos cadastrados: "+Contador);

            banco.fecharConexaoBanco();
            rs.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void pesquisaProdutos(String Texto, DefaultTableModel tabela) {
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from produtos_centro_estoque where Nome like '%"+Texto+"%' and Codigo_Centro_Estoque = '"+codCentroEstoque+"' order by Nome");

            tabela.setRowCount(0);
            int Contador = 0;
            while (rs.next())
            {
                tabela.addRow(new Object[] {
                    rs.getString("Nome"),
                    rs.getInt("Quantidade"),
                    rs.getInt("Codigo_Produto")
                });
                Contador++;
            }
            
            lblStatusProduto.setText("Produtos cadastrados: "+Contador);

            banco.fecharConexaoBanco();
            rs.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void getMaxCodigo() {
        try 
        {
        banco.conexaoBanco();
        rs = banco.st.executeQuery("select MAX(Codigo_Centro_Estoque) as CodCentro from centros_estoque");
        while (rs.next()) 
        {
            int codigo = rs.getInt("CodCentro");
            codigo = codigo +1;
            lblCodigo.setText(String.valueOf(codigo));
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
    
    public void diminuirQuantidade(String codProduto, int quantAtual, int quantDebitar) {
        
        try
        {
            int quantFinal = 0;
            
            quantFinal = quantAtual - quantDebitar;
            
            banco.conexaoBanco();
            
            if (quantFinal == 0)
            {
                ps = banco.con.prepareStatement("delete from produtos_centro_estoque "
                        + "where Codigo_Produto = '"+codProduto+"' "
                        + "and Codigo_Centro_Estoque = '"+codCentroEstoque+"'");
            }
            else
            {
                ps = banco.con.prepareStatement("update produtos_centro_estoque set Quantidade = '"+quantFinal+"' "
                        + "where Codigo_Produto = '"+codProduto+"' "
                        + "and Codigo_Centro_Estoque = '"+codCentroEstoque+"'");
                ps.executeUpdate();
            }
            
            ps.close();
            banco.fecharConexaoBanco();
            
            carregaProdutos(codCentroEstoque, (DefaultTableModel) tabelaProdutosCentro.getModel());
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame InternalFrameCentro;
    private javax.swing.JInternalFrame InternalFrameProdutosCentro;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JButton btnDados;
    private javax.swing.JButton btnDiminuirQnt;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSairProduto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblImagemFundo1;
    private javax.swing.JLabel lblImagemFundoProdutos;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatusProduto;
    private javax.swing.JTable tabelaCentroEstoque;
    private javax.swing.JTable tabelaProdutosCentro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPesquisarProduto;
    // End of variables declaration//GEN-END:variables
}
