

package Empresas;

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


public final class Empresas extends javax.swing.JFrame {
    
    DimensionaImagem dimImagem = new DimensionaImagem();
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;
    public String razaoSocial;
    
    public Empresas() {
        initComponents();
        
        Font font = new Font("NSimSun", Font.PLAIN, 18);
        JTableHeader cabecalho = tabelaEmpresa.getTableHeader();
        cabecalho.setFont(font);
                
        carregaEmpresa("Todos", txtPesquisar.getText(), (DefaultTableModel) tabelaEmpresa.getModel());
        
        dimImagem.dimensionaComponentes(lblImagemFundo, "/ControleDeEstoque/Imagens/ImagemFundoEmpresa.jpg", 430, 150);
        dimImagem.dimensionaComponentes(lblImagemFundo1, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 800, 560);
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelEmpresa = new javax.swing.JPanel();
        InternalFrameEmpresa = new javax.swing.JInternalFrame();
        btnFechar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblSituacao = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtInscricaoEstadual = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblDataCadastro = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox();
        lblImagemFundo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEmpresa = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnDados = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empresas");
        setName("Empresas"); // NOI18N
        setResizable(false);

        PainelEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        PainelEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        PainelEmpresa.setLayout(null);

        InternalFrameEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        InternalFrameEmpresa.setClosable(true);
        InternalFrameEmpresa.setTitle("Novo cadastro");
        InternalFrameEmpresa.setName("Novo cadastro"); // NOI18N
        InternalFrameEmpresa.setVisible(false);
        InternalFrameEmpresa.getContentPane().setLayout(null);

        btnFechar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnFechar.setText("Sair");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        InternalFrameEmpresa.getContentPane().add(btnFechar);
        btnFechar.setBounds(130, 510, 100, 35);

        btnSalvar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        InternalFrameEmpresa.getContentPane().add(btnSalvar);
        btnSalvar.setBounds(20, 510, 100, 35);

        lblSituacao.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblSituacao.setForeground(new java.awt.Color(255, 0, 0));
        lblSituacao.setText("Empresa não cadastrada");
        InternalFrameEmpresa.getContentPane().add(lblSituacao);
        lblSituacao.setBounds(500, 440, 270, 30);

        jLabel22.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel22.setText("Situação");
        InternalFrameEmpresa.getContentPane().add(jLabel22);
        jLabel22.setBounds(500, 410, 72, 30);

        jLabel12.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel12.setText("Inscrição Estadual");
        InternalFrameEmpresa.getContentPane().add(jLabel12);
        jLabel12.setBounds(280, 250, 162, 30);

        txtInscricaoEstadual.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmpresa.getContentPane().add(txtInscricaoEstadual);
        txtInscricaoEstadual.setBounds(280, 280, 490, 32);

        txtEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmpresa.getContentPane().add(txtEmail);
        txtEmail.setBounds(280, 210, 290, 32);

        jLabel16.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel16.setText("E-mail");
        InternalFrameEmpresa.getContentPane().add(jLabel16);
        jLabel16.setBounds(280, 180, 70, 30);

        jLabel11.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel11.setText("Telefone");
        InternalFrameEmpresa.getContentPane().add(jLabel11);
        jLabel11.setBounds(590, 180, 72, 30);

        txtTelefone.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmpresa.getContentPane().add(txtTelefone);
        txtTelefone.setBounds(590, 210, 180, 32);

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmpresa.getContentPane().add(txtCNPJ);
        txtCNPJ.setBounds(590, 140, 180, 32);

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setText("CNPJ");
        InternalFrameEmpresa.getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 110, 40, 30);

        txtNomeFantasia.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmpresa.getContentPane().add(txtNomeFantasia);
        txtNomeFantasia.setBounds(280, 140, 290, 32);

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Nome Fantasia");
        InternalFrameEmpresa.getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 110, 130, 30);

        txtRazaoSocial.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmpresa.getContentPane().add(txtRazaoSocial);
        txtRazaoSocial.setBounds(100, 40, 470, 32);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("Razão Social");
        InternalFrameEmpresa.getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 10, 110, 30);

        jLabel15.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel15.setText("Código");
        InternalFrameEmpresa.getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 10, 60, 30);

        lblCodigo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("Código");
        InternalFrameEmpresa.getContentPane().add(lblCodigo);
        lblCodigo.setBounds(20, 40, 60, 30);

        jLabel13.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel13.setText("Cadastrado em");
        InternalFrameEmpresa.getContentPane().add(jLabel13);
        jLabel13.setBounds(620, 10, 130, 30);

        lblDataCadastro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblDataCadastro.setForeground(new java.awt.Color(255, 0, 0));
        lblDataCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataCadastro.setText("Data do cadastro");
        InternalFrameEmpresa.getContentPane().add(lblDataCadastro);
        lblDataCadastro.setBounds(620, 40, 150, 30);

        lblImagem.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lblImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblImagem.setName(""); // NOI18N
        lblImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagemMouseClicked(evt);
            }
        });
        InternalFrameEmpresa.getContentPane().add(lblImagem);
        lblImagem.setBounds(20, 110, 230, 210);

        jLabel10.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel10.setText("CEP");
        InternalFrameEmpresa.getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 340, 28, 30);

        txtCEP.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCEPKeyTyped(evt);
            }
        });
        InternalFrameEmpresa.getContentPane().add(txtCEP);
        txtCEP.setBounds(20, 370, 120, 32);

        jLabel14.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel14.setText("Endereço");
        InternalFrameEmpresa.getContentPane().add(jLabel14);
        jLabel14.setBounds(160, 340, 90, 30);

        txtEndereco.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmpresa.getContentPane().add(txtEndereco);
        txtEndereco.setBounds(160, 370, 320, 32);

        jLabel20.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel20.setText("Bairro");
        InternalFrameEmpresa.getContentPane().add(jLabel20);
        jLabel20.setBounds(500, 340, 70, 30);

        txtBairro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmpresa.getContentPane().add(txtBairro);
        txtBairro.setBounds(500, 370, 270, 32);

        txtCidade.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmpresa.getContentPane().add(txtCidade);
        txtCidade.setBounds(20, 440, 390, 32);

        jLabel23.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel23.setText("Cidade");
        InternalFrameEmpresa.getContentPane().add(jLabel23);
        jLabel23.setBounds(20, 410, 70, 30);

        jLabel24.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel24.setText("Estado");
        InternalFrameEmpresa.getContentPane().add(jLabel24);
        jLabel24.setBounds(420, 410, 60, 30);

        comboEstado.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboEstado.setMaximumRowCount(27);
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" }));
        InternalFrameEmpresa.getContentPane().add(comboEstado);
        comboEstado.setBounds(420, 440, 60, 32);
        InternalFrameEmpresa.getContentPane().add(lblImagemFundo1);
        lblImagemFundo1.setBounds(0, 0, 800, 560);

        PainelEmpresa.add(InternalFrameEmpresa);
        InternalFrameEmpresa.setBounds(0, 0, 810, 590);

        tabelaEmpresa.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Razão Social", "Cidade", "Cod"
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
        tabelaEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaEmpresa.setRowHeight(25);
        tabelaEmpresa.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaEmpresa.getTableHeader().setReorderingAllowed(false);
        tabelaEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEmpresaMouseClicked(evt);
            }
        });
        tabelaEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaEmpresaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEmpresa);
        if (tabelaEmpresa.getColumnModel().getColumnCount() > 0) {
            tabelaEmpresa.getColumnModel().getColumn(0).setPreferredWidth(800);
            tabelaEmpresa.getColumnModel().getColumn(1).setPreferredWidth(600);
            tabelaEmpresa.getColumnModel().getColumn(2).setPreferredWidth(90);
        }

        PainelEmpresa.add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 770, 340);

        btnSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        PainelEmpresa.add(btnSair);
        btnSair.setBounds(690, 540, 100, 35);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar Empresas");
        PainelEmpresa.add(jLabel1);
        jLabel1.setBounds(20, 20, 162, 30);

        txtPesquisar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtPesquisar.setToolTipText("");
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });
        PainelEmpresa.add(txtPesquisar);
        txtPesquisar.setBounds(20, 50, 770, 32);

        btnDados.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnDados.setText("Dados");
        btnDados.setBorder(null);
        btnDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosActionPerformed(evt);
            }
        });
        PainelEmpresa.add(btnDados);
        btnDados.setBounds(130, 540, 100, 35);

        lblStatus.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatus.setText("Empresas cadastradas:");
        PainelEmpresa.add(lblStatus);
        lblStatus.setBounds(20, 470, 460, 30);

        btnNovo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        PainelEmpresa.add(btnNovo);
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
        PainelEmpresa.add(btnExcluir);
        btnExcluir.setBounds(240, 540, 100, 35);
        PainelEmpresa.add(lblImagemFundo);
        lblImagemFundo.setBounds(380, 440, 430, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        this.dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased

        carregaEmpresa("Like", txtPesquisar.getText(), (DefaultTableModel) tabelaEmpresa.getModel());

        if (txtPesquisar.getText().equals(""))
        {

            //label recebe cor preta
            lblStatus.setForeground(Color.BLACK);

        }
        else
        {
            lblStatus.setForeground(Color.red);
            lblStatus.setText("Status: Pesquisando empresas");
        }
        
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed
       
        int linha = tabelaEmpresa.getSelectedRow();
        if (linha== -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione uma empresa para alterar!","Atenção",JOptionPane.INFORMATION_MESSAGE);
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
            
            //pegando o codigo da linha selecionada            
            carregarEmpresa(Integer.valueOf(tabelaEmpresa.getModel().getValueAt(linha, 2).toString()));
            
            dimImagem.dimensionaComponentes(lblImagem, lblImagem.getName(), 230, 210);
            
            InternalFrameEmpresa.setVisible(true);
            InternalFrameEmpresa.setTitle("Alteração de dados");
            
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
        lblSituacao.setText("Empresa não cadastrada");
        
        lblCodigo.setText(String.valueOf(getMaxCodigoEmpresa()+1));
        
        lblImagem.setName("C:/ControleDeEstoque/Imagens/EmpresaPadrao.jpg");
        lblImagem.setIcon(new ImageIcon("C:/ControleDeEstoque/Imagens/EmpresaPadrao.jpg"));
        
        InternalFrameEmpresa.setTitle("Novo cadastro");
        InternalFrameEmpresa.setVisible(true);
        
        txtRazaoSocial.grabFocus();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int linha = tabelaEmpresa.getSelectedRow();
        if (linha== -1){
            JOptionPane.showMessageDialog(null, "Selecione uma empresa para excluir!","Atenção",JOptionPane.WARNING_MESSAGE);
        }
        else
        {               
            if (verificaExclusaoEmpresa(String.valueOf( tabelaEmpresa.getModel().getValueAt(linha, 2))) == true)
            {
                JOptionPane.showMessageDialog(null, "Esta empresa está vinculada a um cliente! Desvincule-a para depois excluir! ", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                int cont = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?","Atenção",JOptionPane.YES_NO_OPTION);
                if (cont == 0)
                {
                    excluirEmpresa(String.valueOf( tabelaEmpresa.getModel().getValueAt(linha, 2)));
                    carregaEmpresa("Todos", txtPesquisar.getText(), (DefaultTableModel) tabelaEmpresa.getModel());
                }
            }
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

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
            if (InternalFrameEmpresa.getTitle().equals("Novo cadastro"))
            {

                cadastrarEmpresa(txtRazaoSocial.getText(), txtNomeFantasia.getText(), txtCNPJ.getText(), txtCEP.getText(),
                        txtCidade.getText(), comboEstado.getSelectedItem().toString(), txtEndereco.getText(), 
                        txtBairro.getText(), txtTelefone.getText(), txtEmail.getText(), txtInscricaoEstadual.getText());
                
                lblCodigo.setText(String.valueOf(getMaxCodigoEmpresa()));
                
                lblCodigo.setText(String.valueOf(getMaxCodigoEmpresa()));
                
                copiaFoto(lblImagem.getName(), lblCodigo.getText());
                updateFoto(lblImagem.getName(), lblCodigo.getText());
                
                carregaEmpresa("Todos", txtPesquisar.getText(), (DefaultTableModel) tabelaEmpresa.getModel());
                InternalFrameEmpresa.dispose();                
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                
            }
            else
            {                
                alterarEmpresa(Integer.valueOf(lblCodigo.getText()), txtRazaoSocial.getText(), txtNomeFantasia.getText(), txtCNPJ.getText(), txtCEP.getText(),
                        txtCidade.getText(), comboEstado.getSelectedItem().toString(), txtEndereco.getText(), 
                        txtBairro.getText(), txtTelefone.getText(), txtEmail.getText(), txtInscricaoEstadual.getText());
                
                copiaFoto(lblImagem.getName(), lblCodigo.getText());
                updateFoto(lblImagem.getName(), lblCodigo.getText());
                
                JOptionPane.showMessageDialog(null, "Cadastro editado com sucesso!","Atenção", JOptionPane.INFORMATION_MESSAGE);
                InternalFrameEmpresa.dispose();
                carregaEmpresa("Todos", txtPesquisar.getText(), (DefaultTableModel) tabelaEmpresa.getModel());
                
            }

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        InternalFrameEmpresa.dispose();
        
    }//GEN-LAST:event_btnFecharActionPerformed

    private void tabelaEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaEmpresaKeyPressed
        
        int key = evt.getKeyCode();
        if (key == evt.VK_DELETE)
        {            
            btnExcluirActionPerformed(null);
        }
        
    }//GEN-LAST:event_tabelaEmpresaKeyPressed

    private void tabelaEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEmpresaMouseClicked
        
        if (evt.getClickCount()==2)
        {
            btnDadosActionPerformed(null);
            
            carregaEmpresa("Todos", txtPesquisar.getText(), (DefaultTableModel) tabelaEmpresa.getModel());
        }
        
    }//GEN-LAST:event_tabelaEmpresaMouseClicked

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

                lblImagem.setIcon(new ImageIcon("C:/ControleDeEstoque/Imagens/EmpresaPadrao.jpg"));
                lblImagem.setName("C:/ControleDeEstoque/Imagens/EmpresaPadrao.jpg");

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
            java.util.logging.Logger.getLogger(Empresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empresas().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇA OS MÉTODOS
    
    public void carregaEmpresa(String Instrucao, String Texto, DefaultTableModel tabela) {
        
        String Query = "";
        if (Instrucao.equals("Todos"))
        {
            Query = "select * from empresas where Excluido = 0 order by Razao_Social";
        }
        if (Instrucao.equals("Like"))
        {
            Query = "select * from empresas where Razao_Social like '%"+Texto+"%' and Excluido = 0 order by Razao_Social";
        }
        
        tabela.setRowCount(0);
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery(Query);
            
            int Contador = 0;
            while (rs.next())
            {
                tabela.addRow(new Object[] {
                    rs.getString("Razao_Social"),
                    rs.getString("Cidade"),
                    rs.getInt("Codigo_Empresa")
                });
                
                Contador = Contador +1;
            }
            
            lblStatus.setText("Empresas cadastradas: "+Contador);
            
            rs.close();
            banco.fecharConexaoBanco();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void carregarEmpresa (int Codigo) {
        
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from empresas where Excluido = 0 and Codigo_Empresa = '"+Codigo+"'");
            
            while (rs.next())
            {
                String data = sdf.format(rs.getDate("Data_Cadastro"));
                
                lblCodigo.setText((rs.getString("Codigo_Empresa")));
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
                lblDataCadastro.setText(data);
            }
            
            rs = banco.st.executeQuery("select Codigo_Empresa from clientes "
                    + "where Codigo_Empresa = '"+Codigo+"'");
            if (rs.next())
            {
                lblSituacao.setText("Empresa vinculada a cliente");
            }
            else
            {
                lblSituacao.setText("Empresa não vinculada");
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
    
    public int getMaxCodigoEmpresa() {
        int codigoEmpresa = 0;
        try 
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select MAX(Codigo_Empresa) as CodEmpresa from empresas");
            while (rs.next()) 
            {
                codigoEmpresa = rs.getInt("CodEmpresa");
            }
            rs.close();
            banco.fecharConexaoBanco();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        return codigoEmpresa;
    }
    
    public boolean verificaExclusaoEmpresa(String Codigo) {
        
        int flag = 0;
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Codigo_Empresa from clientes where Excluido = 0");
            String comparaCodigo;
            while (rs.next())
            {
                comparaCodigo = rs.getString("Codigo_Empresa");
                if (comparaCodigo.equals(Codigo))
                {
                    flag = 1;
                }
            }
            
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        if (flag ==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public void excluirEmpresa(String Codigo) {
                
        try
        {
            banco.conexaoBanco();
            
            ps = banco.con.prepareStatement("update empresas set Excluido = 1 where Codigo_Empresa = '"+Codigo+"'");
            ps.executeUpdate();

            ps.close();
            
            rs.close();
            banco.fecharConexaoBanco();
             
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void cadastrarEmpresa(String razaoSocial, String nomeFantasia, String CNPJ, String CEP, String Cidade, 
            String Estado, String Endereco, String Bairro, String Telefone, String Email, String inscricaoEstadual) {
        
        int cont = 0;
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Razao_Social from empresas where Excluido = 0");
            
            while (rs.next())
            {
                if (razaoSocial.equals(rs.getString("Razao_Social")))
                {
                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com este nome!","Atenção", JOptionPane.WARNING_MESSAGE);
                    cont = 1;
                }
            }
            
            if (cont == 0)
            {
            
                ps = banco.con.prepareStatement("insert into empresas "
                        + "(Razao_Social, Nome_Fantasia, CNPJ, CEP, Cidade, Estado, Endereco, Bairro, Telefone, Email, "
                        + "Inscricao_Estadual) "
                        + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
        
        String Nome = "Empresa";     
    	String Diretorio = foto;
    	String Nome_Da_Imagem =  Nome + codigo +".jpg" ; 
        String caminho = "C:/ControleDeEstoque/Imagens/Empresas/" + Nome_Da_Imagem;
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
    
    public void updateFoto(String foto, String codigo) {
        
        try
        {            
            String Query = "update empresas set foto = '"+foto+"' where Codigo_Empresa = '"+codigo+"'";
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
    
    public void alterarEmpresa(int codigoEmpresa, String RazaoSocial, String nomeFantasia, String CNPJ, String CEP, String Cidade, 
            String Estado, String Endereco, String Bairro, String Telefone, String Email, String inscricaoEstadual) {
                
        try
        {
            banco.conexaoBanco();
            
            rs = banco.st.executeQuery("select Razao_Social from empresas where Excluido = 0");
            
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
            
                ps = banco.con.prepareStatement("update empresas set Razao_Social = '"+RazaoSocial+"',"
                +"Nome_Fantasia = '"+nomeFantasia+"'," 
                +"CNPJ = '"+CNPJ+"'," 
                +"CEP = '"+CEP+"'," 
                +"Cidade = '"+Cidade+"'," 
                +"Estado = '"+Estado+"'," 
                +"Endereco = '"+Endereco+"'," 
                +"Bairro = '"+Bairro+"'," 
                +"Telefone = '"+Telefone+"'," 
                +"Email = '"+Email+"'," 
                +"Inscricao_Estadual = '"+inscricaoEstadual+"' where Codigo_Empresa = '"+codigoEmpresa+"'");
                ps.executeUpdate();
            
                ps.close();
                                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Já existe uma empresa com este nome!","Atenção", JOptionPane.WARNING_MESSAGE);
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
    private javax.swing.JInternalFrame InternalFrameEmpresa;
    private javax.swing.JPanel PainelEmpresa;
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
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JTable tabelaEmpresa;
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
