
package Produtos;

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

public final class Produtos extends javax.swing.JFrame {
    
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;
    public String nome;

    public Produtos() {
        initComponents();
        
        Font font = new Font("NSimSun", Font.PLAIN, 18);
        JTableHeader cabecalho = tabelaProdutos.getTableHeader();
        cabecalho.setFont(font);
        
        carregaEstoque("Todos", txtPesquisar.getText(), (DefaultTableModel) tabelaProdutos.getModel());
        
        txtDescricao.setLineWrap(true);
        txtDescricao.setWrapStyleWord(true);
        
        DimensionaImagem dimImagem = new DimensionaImagem();
        dimImagem.dimensionaComponentes(lblImagemFundo, "/ControleDeEstoque/Imagens/ImagemFundoProduto.jpg", 330, 160);
        dimImagem.dimensionaComponentes(lblImagemFundo1, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 570, 380);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        InternalFrameProdutos = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblDataCadastro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        txtCodPersonalizado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        lblImagemFundo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnDados = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        lblImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");
        setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        setName("Estoque"); // NOI18N
        setResizable(false);

        PainelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PainelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        PainelPrincipal.setLayout(null);

        InternalFrameProdutos.setBackground(new java.awt.Color(255, 255, 255));
        InternalFrameProdutos.setClosable(true);
        InternalFrameProdutos.setTitle("Novo cadastro");
        try {
            InternalFrameProdutos.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        InternalFrameProdutos.setVisible(false);
        InternalFrameProdutos.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                InternalFrameProdutosInternalFrameClosed(evt);
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
        InternalFrameProdutos.getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel5.setText("Codigo");
        InternalFrameProdutos.getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 10, 60, 30);

        lblCodigo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("Código");
        InternalFrameProdutos.getContentPane().add(lblCodigo);
        lblCodigo.setBounds(20, 40, 60, 30);

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Nome");
        InternalFrameProdutos.getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 10, 50, 30);

        txtNome.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameProdutos.getContentPane().add(txtNome);
        txtNome.setBounds(100, 40, 270, 32);

        jLabel8.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel8.setText("Cadastrado em");
        InternalFrameProdutos.getContentPane().add(jLabel8);
        jLabel8.setBounds(390, 10, 130, 30);

        lblDataCadastro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblDataCadastro.setForeground(new java.awt.Color(255, 0, 0));
        lblDataCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataCadastro.setText("Não cadastrado");
        InternalFrameProdutos.getContentPane().add(lblDataCadastro);
        lblDataCadastro.setBounds(390, 40, 150, 30);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("Descrição");
        InternalFrameProdutos.getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 100, 90, 30);

        txtDescricao.setColumns(5);
        txtDescricao.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtDescricao.setRows(5);
        txtDescricao.setTabSize(3);
        txtDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(txtDescricao);

        InternalFrameProdutos.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(270, 130, 260, 130);

        txtCodPersonalizado.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameProdutos.getContentPane().add(txtCodPersonalizado);
        txtCodPersonalizado.setBounds(470, 280, 60, 32);

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setText("Código personalizado:");
        InternalFrameProdutos.getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 280, 190, 30);

        btnFechar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnFechar.setText("Sair");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        InternalFrameProdutos.getContentPane().add(btnFechar);
        btnFechar.setBounds(130, 330, 100, 35);

        btnSalvar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        InternalFrameProdutos.getContentPane().add(btnSalvar);
        btnSalvar.setBounds(20, 330, 100, 35);

        lblImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagemMouseClicked(evt);
            }
        });
        InternalFrameProdutos.getContentPane().add(lblImagem);
        lblImagem.setBounds(20, 100, 230, 210);
        InternalFrameProdutos.getContentPane().add(lblImagemFundo1);
        lblImagemFundo1.setBounds(0, 0, 570, 380);

        PainelPrincipal.add(InternalFrameProdutos);
        InternalFrameProdutos.setBounds(0, 0, 580, 410);

        tabelaProdutos.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Cod", "Cod Pers."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        tabelaProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaProdutos.setRowHeight(25);
        tabelaProdutos.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaProdutos.getTableHeader().setReorderingAllowed(false);
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        tabelaProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaProdutosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(500);
            tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(800);
            tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(220);
        }

        PainelPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 720, 260);

        btnNovo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setBorder(null);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnNovo);
        btnNovo.setBounds(20, 460, 100, 35);

        btnSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnSair);
        btnSair.setBounds(640, 460, 100, 35);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar produtos");
        PainelPrincipal.add(jLabel1);
        jLabel1.setBounds(20, 10, 162, 30);

        txtPesquisar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisar.setToolTipText("");
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });
        PainelPrincipal.add(txtPesquisar);
        txtPesquisar.setBounds(20, 40, 720, 32);

        btnDados.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnDados.setText("Dados");
        btnDados.setBorder(null);
        btnDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnDados);
        btnDados.setBounds(130, 460, 100, 35);

        lblStatus.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatus.setText("Produtos cadastrados:");
        PainelPrincipal.add(lblStatus);
        lblStatus.setBounds(20, 380, 380, 40);

        btnExcluir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnExcluir);
        btnExcluir.setBounds(240, 460, 100, 35);
        PainelPrincipal.add(lblImagemFundo);
        lblImagemFundo.setBounds(380, 350, 330, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    
        this.dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        txtNome.setText("");
        txtDescricao.setText("");
        txtCodPersonalizado.setText("");
        
        tabelaProdutos.setEnabled(false);
        txtPesquisar.setEnabled(false);
        btnNovo.setEnabled(false);
        btnDados.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSair.setEnabled(false);
        
        lblCodigo.setText(String.valueOf(getMaxCodigoEstoque()+1));
        
        lblImagem.setName("C:/ControleDeEstoque/Imagens/ProdutoPadrao.jpg");
        lblImagem.setIcon(new ImageIcon("C:/ControleDeEstoque/Imagens/ProdutoPadrao.jpg"));
        
        //chamar o internal frame para add um item no estoque
        InternalFrameProdutos.setTitle("Novo cadastro");
        InternalFrameProdutos.setVisible(true);
        
        txtNome.grabFocus();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed

        int linha = tabelaProdutos.getSelectedRow();
        if (linha== -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um produto para alterar!","Atenção",JOptionPane.INFORMATION_MESSAGE);
        }
        
        else
        {   
            txtNome.setText("");
            txtDescricao.setText("");
            txtCodPersonalizado.setText("");
            
            tabelaProdutos.setEnabled(false);
            txtPesquisar.setEnabled(false);
            btnNovo.setEnabled(false);
            btnDados.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnSair.setEnabled(false);

            carregarEstoque(String.valueOf(tabelaProdutos.getModel().getValueAt(linha, 2)));
            
            File foto = new File(lblImagem.getName());
            formataFoto(foto);

            lblCodigo.setText(String.valueOf(tabelaProdutos.getModel().getValueAt(linha, 2)));
            
            InternalFrameProdutos.setTitle("Alteração de dados");
            InternalFrameProdutos.setVisible(true);
            
            txtNome.grabFocus();

        }
        
    }//GEN-LAST:event_btnDadosActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        
        carregaEstoque("Like", txtPesquisar.getText(), (DefaultTableModel) tabelaProdutos.getModel());    

        if (txtPesquisar.getText().equals(""))
        {

            //label recebe cor preta
            lblStatus.setForeground(Color.BLACK);

        }
        else
        {
            //label status adquire o texto e a cor abaixo
            lblStatus.setText("Status: Pesquisando Produto");
            lblStatus.setForeground(Color.red);
        }
        
        
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int linha = tabelaProdutos.getSelectedRow();
        if (linha== -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir!","Atenção",JOptionPane.INFORMATION_MESSAGE);
        }
        
        else
        {        
            int con = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?","Atenção",JOptionPane.YES_NO_OPTION);
            if (con==0)
            {        
                excluirEstoque(String.valueOf(tabelaProdutos.getModel().getValueAt(linha, 2)));

            }
                
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if(txtNome.getText().equals("") || txtNome.getText().equals("Campo obrigatório"))
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome","Atenção", JOptionPane.WARNING_MESSAGE);
            txtNome.grabFocus();
        }
        else if (txtNome.getText().length()>30)
        {
            JOptionPane.showMessageDialog(null, "Nome excede o limite de caracteres","Atenção", JOptionPane.WARNING_MESSAGE);
            txtNome.grabFocus();
        }
        else if (txtCodPersonalizado.getText().length()>5)
        {
            JOptionPane.showMessageDialog(null, "Código Personalizado excede o limite de caracteres","Atenção", JOptionPane.WARNING_MESSAGE);
            txtCodPersonalizado.grabFocus();
        }
        else
        {

            if (InternalFrameProdutos.getTitle().equals("Novo cadastro"))
            {
                
                cadastrarEstoque(txtNome.getText(), txtDescricao.getText(), txtCodPersonalizado.getText());
                
                lblCodigo.setText(String.valueOf(getMaxCodigoEstoque()));
                
                copiaFoto(lblImagem.getName(), lblCodigo.getText());
                updateFoto(lblImagem.getName(), lblCodigo.getText());
                
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                carregaEstoque("Todos", txtPesquisar.getText(), (DefaultTableModel) tabelaProdutos.getModel());
                InternalFrameProdutos.dispose();
                
            }
            else
            {
                alterarEstoque(txtNome.getText(), txtDescricao.getText(), txtCodPersonalizado.getText(),
                        Integer.valueOf(lblCodigo.getText()));    
                copiaFoto(lblImagem.getName(), lblCodigo.getText());
                updateFoto(lblImagem.getName(), lblCodigo.getText());
                
                JOptionPane.showMessageDialog(null, "Cadastro editado com sucesso!","Atenção", JOptionPane.INFORMATION_MESSAGE);
                carregaEstoque("Todos", txtPesquisar.getText(), (DefaultTableModel) tabelaProdutos.getModel());               
                InternalFrameProdutos.dispose();
                
            }

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        InternalFrameProdutos.dispose();

    }//GEN-LAST:event_btnFecharActionPerformed

    private void InternalFrameProdutosInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_InternalFrameProdutosInternalFrameClosed
        
        tabelaProdutos.setEnabled(true);
        txtPesquisar.setEnabled(true);
        btnNovo.setEnabled(true);
        btnDados.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnSair.setEnabled(true);
        
    }//GEN-LAST:event_InternalFrameProdutosInternalFrameClosed

    private void tabelaProdutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaProdutosKeyPressed
        
        int key = evt.getKeyCode();
        if (key == evt.VK_DELETE)
        {            
            btnExcluirActionPerformed(null);
        }
        
    }//GEN-LAST:event_tabelaProdutosKeyPressed

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        
        if (evt.getClickCount()==2)
        {
            btnDadosActionPerformed(null);
            
            carregaEstoque("Todos", txtPesquisar.getText(), (DefaultTableModel) tabelaProdutos.getModel());
        }
        
    }//GEN-LAST:event_tabelaProdutosMouseClicked

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

                lblImagem.setIcon(new ImageIcon("C:/ControleDeEstoque/Imagens/ProdutoPadrao.jpg"));
                lblImagem.setName("C:/ControleDeEstoque/Imagens/ProdutoPadrao.jpg");

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

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇAM OS MÉTODOS
    
    public void carregaEstoque(String Instrucao, String Texto, DefaultTableModel tabela) {
        
        String Query = "";
        if(Instrucao.equals("Todos")){
        Query = "select * from produtos where Excluido = 0 order by Nome";                
        }
        if(Instrucao.equals("Like")){
        Query = "select * from produtos where Excluido = 0 and Nome like '%"+Texto+"%' order by Nome";                
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
                rs.getString( "Descricao" ), 
                rs.getInt( "Codigo_Produto" ),
                rs.getString("Codigo_Personalizado")
                });
                Contador++;
            }
            lblStatus.setText("Produtos cadastrados: "+Contador);
            rs.close();
            banco.fecharConexaoBanco();
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    public void carregarEstoque(String Codigo) {
                
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from produtos where Codigo_Produto = '"+Codigo+"'");
            
            while (rs.next())
            {
                lblCodigo.setText(String.valueOf(rs.getInt("Codigo_Produto")));
                txtNome.setText(rs.getString("Nome"));
                nome = txtNome.getText();
                txtDescricao.setText(rs.getString("Descricao"));
                txtCodPersonalizado.setText(rs.getString("Codigo_Personalizado"));
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
    
    public int getMaxCodigoEstoque() {
        int codProduto = 0;
        try 
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select MAX(Codigo_Produto) as CodProduto from produtos");
            while (rs.next()) 
            {
                codProduto = rs.getInt("CodProduto");
            }
            rs.close();
            banco.fecharConexaoBanco();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        return codProduto;
    }
    
    public void alterarEstoque(String Nome, String Descricao, String codPersonalizado, int codProduto) {
                
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Nome from produtos where Excluido = 0");
            
            int cont = 0;
            while (rs.next())
            {
                if (txtNome.getText().equals(rs.getString("Nome")))
                {
                    cont = 1;
                }
                if (txtNome.getText().equals(nome))
                {
                    cont = 0;
                }
            }
            
            if (cont == 0)
            {            
                ps = banco.con.prepareStatement("update produtos set Nome = '"+Nome+"',"
                + "Descricao = '"+Descricao+"',"
                + "Codigo_Personalizado = '"+codPersonalizado+"' where Codigo_Produto = '"+codProduto+"'");
                ps.executeUpdate();

                ps.close();
                banco.fecharConexaoBanco();     
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Já existe um centro de estoque com este nome!","Atenção", JOptionPane.WARNING_MESSAGE);
                txtNome.grabFocus();
            }
        }
        catch (SQLException | HeadlessException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void cadastrarEstoque(String Nome, String Descricao, String codPersonalizado) {
        
        int cont = 0;
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Nome from produtos where Excluido = 0");
            
            while (rs.next())
            {
                if (Nome.equals(rs.getString("Nome")))
                {
                    JOptionPane.showMessageDialog(null, "Já existe um produto com este nome!","Atenção", JOptionPane.WARNING_MESSAGE);
                    cont = 1;
                }
            }
            
            if (cont == 0)
            {
                ps = banco.con.prepareStatement("insert into produtos "
                        + "(Codigo_Personalizado, Nome, Descricao) values (?, ?, ?)");
                ps.setString(1, codPersonalizado);
                ps.setString(2, Nome);
                ps.setString(3, Descricao);
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
    
    public void excluirEstoque(String codigo) {
                
        try
        {
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update produtos set Excluido = 1 where Codigo_Produto = '"+codigo+"'");
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
            
            carregaEstoque("Todos", txtPesquisar.getText(), (DefaultTableModel) tabelaProdutos.getModel());
            
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
            BufferedImage aux = new BufferedImage(230, 210, bi.getType());//cria um buffer auxiliar com o tamanho desejado    
            Graphics2D g = aux.createGraphics();//pega a classe graphics do aux para edicao    
            AffineTransform at = AffineTransform.getScaleInstance((double) 230 / bi.getWidth(), (double) 210 / bi.getHeight());//cria a transformacao    
            g.drawRenderedImage(bi, at);//pinta e transforma a imagem real no auxiliar
            lblImagem.setIcon(new ImageIcon(aux));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Foto do produto não encontrada! Verifique se foi deletada ou movida!","Atenção", JOptionPane.ERROR_MESSAGE);
            lblImagem.setIcon(new ImageIcon("C:/ControleDeEstoque/Imagens/FotoProdutoNaoDisponivel.jpg"));
        }
        
    }
    
    public void copiaFoto(String foto, String codigo) {
        
        String Nome = "Produto";     
    	String Diretorio = foto;
    	String Nome_Da_Imagem =  Nome + codigo +".jpg" ; 
        String caminho = "C:/ControleDeEstoque/Imagens/Produtos/" + Nome_Da_Imagem;
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
            ps = banco.con.prepareStatement("update produtos set Foto = '"+Foto+"' where Codigo_Produto = '"+Codigo+"'");
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
    private javax.swing.JInternalFrame InternalFrameProdutos;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JButton btnDados;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblImagemFundo1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtCodPersonalizado;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
