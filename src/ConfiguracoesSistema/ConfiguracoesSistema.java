
package ConfiguracoesSistema;

import ConexaoBanco.ConexaoBanco;
import DimensionaImagem.DimensionaImagem;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class ConfiguracoesSistema extends javax.swing.JFrame {
    
    DimensionaImagem dimImagem = new DimensionaImagem();
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;

    public ConfiguracoesSistema() {
        initComponents();
        
        txtCaminhoImagem.setEditable(false);
        txtHoraBackup.setEditable(false);
        
        carregaConfiguracoes();
        
        dimImagem.dimensionaComponentes(lblImagemFundo, "/ControleDeEstoque/Imagens/ImagemFundoConfiguracoes.png", 330, 330);
        dimImagem.dimensionaComponentes(lblImagemFundo0, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 810, 500);
        dimImagem.dimensionaComponentes(lblImagemFundo1, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 390, 450);
        dimImagem.dimensionaComponentes(lblImagemFundo2, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 390, 450);
        dimImagem.dimensionaComponentes(lblImagemFundo4, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 390, 450);
        dimImagem.dimensionaComponentes(lblImagemFundo5, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 390, 450);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel18 = new javax.swing.JPanel();
        InternalFrameAtalhos = new javax.swing.JInternalFrame();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        comboClientes = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        comboCompras = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        comboVendas = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        comboOrdemServico = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        comboAbrirCaixa = new javax.swing.JComboBox();
        btnOkAtalho = new javax.swing.JButton();
        lblImagemFundo1 = new javax.swing.JLabel();
        InternalFrameSeguranca = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        checkValidadorCPF = new javax.swing.JCheckBox();
        checkValidadorCNPJ = new javax.swing.JCheckBox();
        checkSaldoCaixa = new javax.swing.JCheckBox();
        checkEnviarEmail = new javax.swing.JCheckBox();
        btnOkSeguranca = new javax.swing.JButton();
        lblImagemFundo2 = new javax.swing.JLabel();
        InternalFrameEmail = new javax.swing.JInternalFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEnderecoEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pTxtSenhaEmail = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        txtServidorSMTP = new javax.swing.JTextField();
        checkStartTLS = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        txtPorta = new javax.swing.JTextField();
        btnOkEmail = new javax.swing.JButton();
        lblImagemFundo4 = new javax.swing.JLabel();
        InternalFrameOutrasConfiguracoes = new javax.swing.JInternalFrame();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtCaminhoImagem = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        checkBackup = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        txtHoraBackup = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        btnOkOutrasConfiguracoes = new javax.swing.JButton();
        lblImagemFundo5 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblConfigurarAtalho = new javax.swing.JLabel();
        lblConfiguracaoSeguranca = new javax.swing.JLabel();
        lblConfigurarEmail = new javax.swing.JLabel();
        lblOutrasConfiguracoes = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblImagemFundo = new javax.swing.JLabel();
        lblImagemFundo0 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurações do Sistema");
        setName("Configuracoes"); // NOI18N
        setResizable(false);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(null);

        InternalFrameAtalhos.setTitle("Configuração de atalhos");
        InternalFrameAtalhos.setVisible(false);
        InternalFrameAtalhos.getContentPane().setLayout(null);

        jLabel32.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("Teclas de atalho do sistema");
        InternalFrameAtalhos.getContentPane().add(jLabel32);
        jLabel32.setBounds(10, 10, 243, 30);

        jLabel33.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel33.setText("Tecla de atalho para cadastrar clientes");
        InternalFrameAtalhos.getContentPane().add(jLabel33);
        jLabel33.setBounds(10, 40, 360, 30);

        comboClientes.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12" }));
        comboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClientesActionPerformed(evt);
            }
        });
        InternalFrameAtalhos.getContentPane().add(comboClientes);
        comboClientes.setBounds(10, 70, 150, 32);

        jLabel34.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel34.setText("Tecla de atalho para compras");
        InternalFrameAtalhos.getContentPane().add(jLabel34);
        jLabel34.setBounds(10, 110, 252, 30);

        comboCompras.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboCompras.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12" }));
        comboCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboComprasActionPerformed(evt);
            }
        });
        InternalFrameAtalhos.getContentPane().add(comboCompras);
        comboCompras.setBounds(10, 140, 150, 32);

        jLabel35.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel35.setText("Tecla de atalho para vendas");
        InternalFrameAtalhos.getContentPane().add(jLabel35);
        jLabel35.setBounds(10, 180, 243, 30);

        comboVendas.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboVendas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12" }));
        comboVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVendasActionPerformed(evt);
            }
        });
        InternalFrameAtalhos.getContentPane().add(comboVendas);
        comboVendas.setBounds(10, 210, 150, 32);

        jLabel36.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel36.setText("Tecla de atalho para ordem de serviço");
        InternalFrameAtalhos.getContentPane().add(jLabel36);
        jLabel36.setBounds(10, 250, 333, 30);

        comboOrdemServico.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboOrdemServico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12" }));
        comboOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrdemServicoActionPerformed(evt);
            }
        });
        InternalFrameAtalhos.getContentPane().add(comboOrdemServico);
        comboOrdemServico.setBounds(10, 280, 150, 32);

        jLabel37.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel37.setText("Tecla de atalho para abrir caixa");
        InternalFrameAtalhos.getContentPane().add(jLabel37);
        jLabel37.setBounds(10, 320, 288, 30);

        comboAbrirCaixa.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboAbrirCaixa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12" }));
        comboAbrirCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAbrirCaixaActionPerformed(evt);
            }
        });
        InternalFrameAtalhos.getContentPane().add(comboAbrirCaixa);
        comboAbrirCaixa.setBounds(10, 350, 150, 32);

        btnOkAtalho.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnOkAtalho.setText("Ok");
        btnOkAtalho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOkAtalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkAtalhoActionPerformed(evt);
            }
        });
        InternalFrameAtalhos.getContentPane().add(btnOkAtalho);
        btnOkAtalho.setBounds(10, 400, 100, 35);
        InternalFrameAtalhos.getContentPane().add(lblImagemFundo1);
        lblImagemFundo1.setBounds(0, 0, 390, 450);

        jPanel18.add(InternalFrameAtalhos);
        InternalFrameAtalhos.setBounds(390, 10, 400, 480);

        InternalFrameSeguranca.setTitle("Configurações de segurança");
        InternalFrameSeguranca.setVisible(false);
        InternalFrameSeguranca.getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Configurações de segurança");
        InternalFrameSeguranca.getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 234, 30);

        checkValidadorCPF.setBackground(new java.awt.Color(203, 235, 235));
        checkValidadorCPF.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        checkValidadorCPF.setText("Usar validador de CPF");
        InternalFrameSeguranca.getContentPane().add(checkValidadorCPF);
        checkValidadorCPF.setBounds(10, 50, 220, 29);

        checkValidadorCNPJ.setBackground(new java.awt.Color(203, 235, 235));
        checkValidadorCNPJ.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        checkValidadorCNPJ.setText("Usar validador de CNPJ");
        InternalFrameSeguranca.getContentPane().add(checkValidadorCNPJ);
        checkValidadorCNPJ.setBounds(10, 90, 223, 29);

        checkSaldoCaixa.setBackground(new java.awt.Color(203, 235, 235));
        checkSaldoCaixa.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        checkSaldoCaixa.setText("Abrir caixa com saldo do caixa anterior");
        InternalFrameSeguranca.getContentPane().add(checkSaldoCaixa);
        checkSaldoCaixa.setBounds(10, 130, 380, 29);

        checkEnviarEmail.setBackground(new java.awt.Color(203, 235, 235));
        checkEnviarEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        checkEnviarEmail.setText("Enviar emails para administradores");
        InternalFrameSeguranca.getContentPane().add(checkEnviarEmail);
        checkEnviarEmail.setBounds(10, 170, 340, 29);

        btnOkSeguranca.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnOkSeguranca.setText("Ok");
        btnOkSeguranca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOkSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkSegurancaActionPerformed(evt);
            }
        });
        InternalFrameSeguranca.getContentPane().add(btnOkSeguranca);
        btnOkSeguranca.setBounds(10, 400, 100, 35);
        InternalFrameSeguranca.getContentPane().add(lblImagemFundo2);
        lblImagemFundo2.setBounds(0, 0, 390, 450);

        jPanel18.add(InternalFrameSeguranca);
        InternalFrameSeguranca.setBounds(390, 10, 400, 480);

        InternalFrameEmail.setTitle("Configuração de email");
        InternalFrameEmail.setVisible(false);
        InternalFrameEmail.getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Configuração do E-mail");
        InternalFrameEmail.getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 10, 198, 30);

        jLabel8.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel8.setText("Endereço de e-mail");
        InternalFrameEmail.getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 50, 170, 30);

        txtEnderecoEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmail.getContentPane().add(txtEnderecoEmail);
        txtEnderecoEmail.setBounds(10, 80, 360, 32);

        jLabel9.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel9.setText("Senha");
        InternalFrameEmail.getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 110, 45, 30);

        pTxtSenhaEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmail.getContentPane().add(pTxtSenhaEmail);
        pTxtSenhaEmail.setBounds(10, 140, 360, 32);

        jLabel10.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel10.setText("Servidor SMTP");
        InternalFrameEmail.getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 170, 120, 30);

        txtServidorSMTP.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmail.getContentPane().add(txtServidorSMTP);
        txtServidorSMTP.setBounds(10, 200, 280, 32);

        checkStartTLS.setBackground(new java.awt.Color(198, 235, 235));
        checkStartTLS.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        checkStartTLS.setText("Start TLS");
        InternalFrameEmail.getContentPane().add(checkStartTLS);
        checkStartTLS.setBounds(10, 250, 110, 30);

        jLabel11.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel11.setText("Porta");
        InternalFrameEmail.getContentPane().add(jLabel11);
        jLabel11.setBounds(310, 170, 45, 30);

        txtPorta.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameEmail.getContentPane().add(txtPorta);
        txtPorta.setBounds(310, 200, 60, 32);

        btnOkEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnOkEmail.setText("Ok");
        btnOkEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOkEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkEmailActionPerformed(evt);
            }
        });
        InternalFrameEmail.getContentPane().add(btnOkEmail);
        btnOkEmail.setBounds(10, 400, 100, 35);
        InternalFrameEmail.getContentPane().add(lblImagemFundo4);
        lblImagemFundo4.setBounds(0, 0, 390, 450);

        jPanel18.add(InternalFrameEmail);
        InternalFrameEmail.setBounds(390, 10, 400, 480);

        InternalFrameOutrasConfiguracoes.setTitle("Outras configurações");
        InternalFrameOutrasConfiguracoes.setVisible(false);
        InternalFrameOutrasConfiguracoes.getContentPane().setLayout(null);

        jLabel25.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("Caminho para armazenar as imagens");
        InternalFrameOutrasConfiguracoes.getContentPane().add(jLabel25);
        jLabel25.setBounds(10, 10, 310, 30);

        jLabel24.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel24.setText("Caminho das imagens");
        InternalFrameOutrasConfiguracoes.getContentPane().add(jLabel24);
        jLabel24.setBounds(10, 50, 180, 30);

        txtCaminhoImagem.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameOutrasConfiguracoes.getContentPane().add(txtCaminhoImagem);
        txtCaminhoImagem.setBounds(10, 80, 360, 32);

        jLabel29.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel29.setText("Exemplo: /ControleDeEstoque/Imagens");
        InternalFrameOutrasConfiguracoes.getContentPane().add(jLabel29);
        jLabel29.setBounds(10, 110, 250, 30);

        jLabel26.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("Backup");
        InternalFrameOutrasConfiguracoes.getContentPane().add(jLabel26);
        jLabel26.setBounds(10, 150, 54, 30);

        checkBackup.setBackground(new java.awt.Color(191, 238, 238));
        checkBackup.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        checkBackup.setText("Backup automático");
        checkBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBackupActionPerformed(evt);
            }
        });
        InternalFrameOutrasConfiguracoes.getContentPane().add(checkBackup);
        checkBackup.setBounds(10, 190, 180, 29);

        jLabel27.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel27.setText("Todo dia às");
        InternalFrameOutrasConfiguracoes.getContentPane().add(jLabel27);
        jLabel27.setBounds(10, 220, 99, 30);

        try {
            txtHoraBackup.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraBackup.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameOutrasConfiguracoes.getContentPane().add(txtHoraBackup);
        txtHoraBackup.setBounds(120, 220, 60, 32);

        jLabel28.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel28.setText("Hrs");
        InternalFrameOutrasConfiguracoes.getContentPane().add(jLabel28);
        jLabel28.setBounds(190, 220, 27, 30);

        btnOkOutrasConfiguracoes.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnOkOutrasConfiguracoes.setText("Ok");
        btnOkOutrasConfiguracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOkOutrasConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkOutrasConfiguracoesActionPerformed(evt);
            }
        });
        InternalFrameOutrasConfiguracoes.getContentPane().add(btnOkOutrasConfiguracoes);
        btnOkOutrasConfiguracoes.setBounds(10, 400, 100, 35);
        InternalFrameOutrasConfiguracoes.getContentPane().add(lblImagemFundo5);
        lblImagemFundo5.setBounds(0, 0, 390, 450);

        jPanel18.add(InternalFrameOutrasConfiguracoes);
        InternalFrameOutrasConfiguracoes.setBounds(390, 10, 400, 480);

        jLabel31.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setText("Defina as configurações do sistema");
        jPanel18.add(jLabel31);
        jLabel31.setBounds(20, 10, 310, 30);

        lblConfigurarAtalho.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblConfigurarAtalho.setText("Configurar atalhos");
        lblConfigurarAtalho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConfigurarAtalho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblConfigurarAtalhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConfigurarAtalhoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblConfigurarAtalhoMousePressed(evt);
            }
        });
        jPanel18.add(lblConfigurarAtalho);
        lblConfigurarAtalho.setBounds(20, 70, 170, 30);

        lblConfiguracaoSeguranca.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblConfiguracaoSeguranca.setText("Configurações de segurança");
        lblConfiguracaoSeguranca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConfiguracaoSeguranca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblConfiguracaoSegurancaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConfiguracaoSegurancaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblConfiguracaoSegurancaMousePressed(evt);
            }
        });
        jPanel18.add(lblConfiguracaoSeguranca);
        lblConfiguracaoSeguranca.setBounds(20, 130, 240, 30);

        lblConfigurarEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblConfigurarEmail.setText("Configurar email");
        lblConfigurarEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConfigurarEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblConfigurarEmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConfigurarEmailMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblConfigurarEmailMousePressed(evt);
            }
        });
        jPanel18.add(lblConfigurarEmail);
        lblConfigurarEmail.setBounds(20, 190, 150, 30);

        lblOutrasConfiguracoes.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblOutrasConfiguracoes.setText("Outras configurações");
        lblOutrasConfiguracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOutrasConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOutrasConfiguracoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOutrasConfiguracoesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblOutrasConfiguracoesMousePressed(evt);
            }
        });
        jPanel18.add(lblOutrasConfiguracoes);
        lblOutrasConfiguracoes.setBounds(20, 250, 190, 30);

        btnSalvar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel18.add(btnSalvar);
        btnSalvar.setBounds(20, 450, 100, 35);

        jButton2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jButton2.setText("Sair");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton2);
        jButton2.setBounds(130, 450, 100, 35);
        jPanel18.add(lblImagemFundo);
        lblImagemFundo.setBounds(420, 80, 330, 330);
        jPanel18.add(lblImagemFundo0);
        lblImagemFundo0.setBounds(0, 0, 810, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "Para que algumas configurações entrem em vigor, o sistema precisa ser reiniciado.\nVocê quer reiniciar agora?", "Atenção", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0)
        {
            configuraCheckBox();
            configuraTeclaAtalho();      
            
            int startTLS;
            if (checkStartTLS.isSelected() == true) {
                startTLS = 1;
            } else {
                startTLS = 0;
            }
            configuraEmail(txtEnderecoEmail.getText(), pTxtSenhaEmail.getText(), txtServidorSMTP.getText(),
                    Integer.valueOf(txtPorta.getText()), startTLS);
            
            configuraCaminhoImagens(txtCaminhoImagem.getText());

            try 
            {                
                Runtime runt = Runtime.getRuntime();
                runt.exec("C:\\Program Files (x86)\\Java\\jre7\\bin\\javaw.exe -jar C:\\ControleDeEstoque\\dist\\ControleDeEstoque.jar");

                System.exit(0);
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(ConfiguracoesSistema.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (resp == 1)
        {
            configuraCheckBox();
            configuraTeclaAtalho();      
            
            int startTLS;
            if (checkStartTLS.isSelected() == true) {
                startTLS = 1;
            } else {
                startTLS = 0;
            }
            configuraEmail(txtEnderecoEmail.getText(), pTxtSenhaEmail.getText(), txtServidorSMTP.getText(),
                    Integer.valueOf(txtPorta.getText()), startTLS);
            
            configuraCaminhoImagens(txtCaminhoImagem.getText());

            this.dispose();
            JOptionPane.showMessageDialog(null, "Configurações alteradas com sucesso!","Atenção",JOptionPane.INFORMATION_MESSAGE);        

        }        
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void lblConfigurarAtalhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfigurarAtalhoMouseEntered
        
        lblConfigurarAtalho.setForeground(Color.RED);
        
    }//GEN-LAST:event_lblConfigurarAtalhoMouseEntered

    private void lblConfigurarAtalhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfigurarAtalhoMouseExited
        
        lblConfigurarAtalho.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_lblConfigurarAtalhoMouseExited

    private void lblConfiguracaoSegurancaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfiguracaoSegurancaMouseEntered
        
        lblConfiguracaoSeguranca.setForeground(Color.RED);
        
    }//GEN-LAST:event_lblConfiguracaoSegurancaMouseEntered

    private void lblConfiguracaoSegurancaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfiguracaoSegurancaMouseExited
        
        lblConfiguracaoSeguranca.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_lblConfiguracaoSegurancaMouseExited

    private void lblConfigurarEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfigurarEmailMouseEntered
        
        lblConfigurarEmail.setForeground(Color.RED);
        
    }//GEN-LAST:event_lblConfigurarEmailMouseEntered

    private void lblConfigurarEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfigurarEmailMouseExited
        
        lblConfigurarEmail.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_lblConfigurarEmailMouseExited

    private void lblOutrasConfiguracoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOutrasConfiguracoesMouseEntered
        
        lblOutrasConfiguracoes.setForeground(Color.RED);
        
    }//GEN-LAST:event_lblOutrasConfiguracoesMouseEntered

    private void lblOutrasConfiguracoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOutrasConfiguracoesMouseExited
        
        lblOutrasConfiguracoes.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_lblOutrasConfiguracoesMouseExited

    private void comboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClientesActionPerformed
        if (comboClientes.getSelectedItem().equals(comboCompras.getSelectedItem()) ||
            comboClientes.getSelectedItem().equals(comboVendas.getSelectedItem()) ||
            comboClientes.getSelectedItem().equals(comboOrdemServico.getSelectedItem()) ||
            comboClientes.getSelectedItem().equals(comboAbrirCaixa.getSelectedItem()))
        {
            if (!comboClientes.getSelectedItem().equals("<Selecione>"))
            {
                JOptionPane.showMessageDialog(null, "Já existe um atalho com esta tecla!", "Atenção", JOptionPane.WARNING_MESSAGE);
                comboClientes.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_comboClientesActionPerformed

    private void comboComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboComprasActionPerformed
        if (comboCompras.getSelectedItem().equals(comboClientes.getSelectedItem()) ||
            comboCompras.getSelectedItem().equals(comboVendas.getSelectedItem()) ||
            comboCompras.getSelectedItem().equals(comboOrdemServico.getSelectedItem()) ||
            comboCompras.getSelectedItem().equals(comboAbrirCaixa.getSelectedItem()))
        {
            if (!comboCompras.getSelectedItem().equals("<Selecione>"))
            {
                JOptionPane.showMessageDialog(null, "Já existe um atalho com esta tecla!", "Atenção", JOptionPane.WARNING_MESSAGE);
                comboCompras.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_comboComprasActionPerformed

    private void comboVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVendasActionPerformed
        if (comboVendas.getSelectedItem().equals(comboClientes.getSelectedItem()) ||
            comboVendas.getSelectedItem().equals(comboCompras.getSelectedItem()) ||
            comboVendas.getSelectedItem().equals(comboOrdemServico.getSelectedItem()) ||
            comboVendas.getSelectedItem().equals(comboAbrirCaixa.getSelectedItem()))
        {
            if (!comboVendas.getSelectedItem().equals("<Selecione>"))
            {
                JOptionPane.showMessageDialog(null, "Já existe um atalho com esta tecla!", "Atenção", JOptionPane.WARNING_MESSAGE);
                comboVendas.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_comboVendasActionPerformed

    private void comboOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrdemServicoActionPerformed
        if (comboOrdemServico.getSelectedItem().equals(comboClientes.getSelectedItem()) ||
            comboOrdemServico.getSelectedItem().equals(comboCompras.getSelectedItem()) ||
            comboOrdemServico.getSelectedItem().equals(comboVendas.getSelectedItem()) ||
            comboOrdemServico.getSelectedItem().equals(comboAbrirCaixa.getSelectedItem()))
        {
            if (!comboOrdemServico.getSelectedItem().equals("<Selecione>"))
            {
                JOptionPane.showMessageDialog(null, "Já existe um atalho com esta tecla!", "Atenção", JOptionPane.WARNING_MESSAGE);
                comboOrdemServico.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_comboOrdemServicoActionPerformed

    private void comboAbrirCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAbrirCaixaActionPerformed
        if (comboAbrirCaixa.getSelectedItem().equals(comboClientes.getSelectedItem()) ||
            comboAbrirCaixa.getSelectedItem().equals(comboCompras.getSelectedItem()) ||
            comboAbrirCaixa.getSelectedItem().equals(comboVendas.getSelectedItem()) ||
            comboAbrirCaixa.getSelectedItem().equals(comboOrdemServico.getSelectedItem()))
        {
            if (!comboAbrirCaixa.getSelectedItem().equals("<Selecione>"))
            {
                JOptionPane.showMessageDialog(null, "Já existe um atalho com esta tecla!", "Atenção", JOptionPane.WARNING_MESSAGE);
                comboAbrirCaixa.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_comboAbrirCaixaActionPerformed

    private void lblConfigurarAtalhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfigurarAtalhoMousePressed
        
        InternalFrameAtalhos.setVisible(true);
        InternalFrameEmail.setVisible(false);
        InternalFrameOutrasConfiguracoes.setVisible(false);
        InternalFrameSeguranca.setVisible(false);
        
    }//GEN-LAST:event_lblConfigurarAtalhoMousePressed

    private void checkBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBackupActionPerformed

        if (checkBackup.isSelected() == true)
        {
            txtHoraBackup.setEditable(true);
        }
        else
        {
            txtHoraBackup.setEditable(false);
            txtHoraBackup.setText("");
        }

    }//GEN-LAST:event_checkBackupActionPerformed

    private void btnOkAtalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkAtalhoActionPerformed
        
        InternalFrameAtalhos.setVisible(false);
        
    }//GEN-LAST:event_btnOkAtalhoActionPerformed

    private void btnOkSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkSegurancaActionPerformed
        InternalFrameSeguranca.setVisible(false);
    }//GEN-LAST:event_btnOkSegurancaActionPerformed

    private void lblConfiguracaoSegurancaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfiguracaoSegurancaMousePressed
        
        InternalFrameAtalhos.setVisible(false);
        InternalFrameEmail.setVisible(false);
        InternalFrameOutrasConfiguracoes.setVisible(false);
        InternalFrameSeguranca.setVisible(true);
        
    }//GEN-LAST:event_lblConfiguracaoSegurancaMousePressed

    private void btnOkEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkEmailActionPerformed
        InternalFrameEmail.setVisible(false);
    }//GEN-LAST:event_btnOkEmailActionPerformed

    private void lblConfigurarEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfigurarEmailMousePressed
        
        InternalFrameAtalhos.setVisible(false);
        InternalFrameEmail.setVisible(true);
        InternalFrameOutrasConfiguracoes.setVisible(false);
        InternalFrameSeguranca.setVisible(false);
        
    }//GEN-LAST:event_lblConfigurarEmailMousePressed

    private void lblOutrasConfiguracoesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOutrasConfiguracoesMousePressed
        
        InternalFrameAtalhos.setVisible(false);
        InternalFrameEmail.setVisible(false);
        InternalFrameOutrasConfiguracoes.setVisible(true);
        InternalFrameSeguranca.setVisible(false);
        
    }//GEN-LAST:event_lblOutrasConfiguracoesMousePressed

    private void btnOkOutrasConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkOutrasConfiguracoesActionPerformed
        InternalFrameOutrasConfiguracoes.setVisible(false);
    }//GEN-LAST:event_btnOkOutrasConfiguracoesActionPerformed

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
            java.util.logging.Logger.getLogger(ConfiguracoesSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracoesSistema().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇAM OS METODOS
    
    public void configuraCheckBox() {
        
        try
        {
            String ValorCPF = "0";
            if (checkValidadorCPF.isSelected())
            {
                ValorCPF = "1";
            }
            
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update configuracoes set Valor = '"+ValorCPF+"' where Descricao = 'ValidadorCPF'");
            ps.executeUpdate();
            
            String ValorCNPJ = "0";
            if (checkValidadorCNPJ.isSelected())
            {
                ValorCNPJ = "1";
            }
            
            ps = banco.con.prepareStatement("update configuracoes set Valor = '"+ValorCNPJ+"' where Descricao = 'ValidadorCNPJ'");
            ps.executeUpdate();
            
            String ValorCaixa = "0";
            if (checkSaldoCaixa.isSelected())
            {
                ValorCaixa = "1";
            }
            
            ps = banco.con.prepareStatement("update configuracoes set Valor = '"+ValorCaixa+"' where Descricao = 'SaldoCaixaAnterior'");
            ps.executeUpdate();
            
            String ValorEmail = "0";
            if (checkEnviarEmail.isSelected())
            {
                ValorEmail = "1";
            }
            
            ps = banco.con.prepareStatement("update configuracoes set Valor = '"+ValorEmail+"' where Descricao = 'EnviarEmail'");
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void configuraTeclaAtalho() {
        
        try
        {
            String atalhoCliente = comboClientes.getSelectedItem().toString();
            String atalhoCompra = comboCompras.getSelectedItem().toString();
            String atalhoVenda = comboVendas.getSelectedItem().toString();
            String atalhoOrdemServico = comboOrdemServico.getSelectedItem().toString();
            String atalhoCaixa = comboAbrirCaixa.getSelectedItem().toString();
            
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update configuracoes set Valor = '"+atalhoCliente+"' where Descricao = 'TeclaAtalhoClientes'");
            ps.executeUpdate();
            
            ps = banco.con.prepareStatement("update configuracoes set Valor = '"+atalhoCompra+"' where Descricao = 'TeclaAtalhoCompras'");
            ps.executeUpdate();
            
            ps = banco.con.prepareStatement("update configuracoes set Valor = '"+atalhoVenda+"' where Descricao = 'TeclaAtalhoVendas'");
            ps.executeUpdate();
            
            ps = banco.con.prepareStatement("update configuracoes set Valor = '"+atalhoOrdemServico+"' where Descricao = 'TeclaAtalhoOrdemServico'");
            ps.executeUpdate();
            
            ps = banco.con.prepareStatement("update configuracoes set Valor = '"+atalhoCaixa+"' where Descricao = 'TeclaAtalhoCaixa'");
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void carregaConfiguracoes() {
        
        try
        {            
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Valor from configuracoes where Descricao = 'ValidadorCPF'");
            while (rs.next()) {
                if (rs.getInt("Valor")==0) {
                    checkValidadorCPF.setSelected(false);
                } else {
                    checkValidadorCPF.setSelected(true);
                }
            }
            
            rs = banco.st.executeQuery("select Valor from configuracoes where Descricao = 'ValidadorCNPJ'");
            while (rs.next()) {
                if (rs.getInt("Valor")==0) {
                    checkValidadorCNPJ.setSelected(false);
                } else {
                    checkValidadorCNPJ.setSelected(true);
                }
            }
            
            rs = banco.st.executeQuery("select Valor from configuracoes where Descricao = 'SaldoCaixaAnterior'");
            while (rs.next()) {
                if (rs.getInt("Valor")==0) {
                    checkSaldoCaixa.setSelected(false);
                } else {
                    checkSaldoCaixa.setSelected(true);
                }
            }
            
            rs = banco.st.executeQuery("select Valor from configuracoes where Descricao = 'EnviarEmail'");
            while (rs.next()) {
                if (rs.getInt("Valor")==0) {
                    checkEnviarEmail.setSelected(false);
                } else {
                    checkEnviarEmail.setSelected(true);
                }
            }
            
            rs = banco.st.executeQuery("select Valor from configuracoes where Descricao = 'TeclaAtalhoClientes'");
            while (rs.next()) {
                comboClientes.setSelectedItem(rs.getString("Valor"));
            }
            
            rs = banco.st.executeQuery("select Valor from configuracoes where Descricao = 'TeclaAtalhoCompras'");
            while (rs.next()) {
                comboCompras.setSelectedItem(rs.getString("Valor"));
            }
            
            rs = banco.st.executeQuery("select Valor from configuracoes where Descricao = 'TeclaAtalhoVendas'");
            while (rs.next()) {
                comboVendas.setSelectedItem(rs.getString("Valor"));
            }
            
            rs = banco.st.executeQuery("select Valor from configuracoes where Descricao = 'TeclaAtalhoOrdemServico'");
            while (rs.next()) {
                comboOrdemServico.setSelectedItem(rs.getString("Valor"));
            }
            
            rs = banco.st.executeQuery("select Valor from configuracoes where Descricao = 'TeclaAtalhoCaixa'");
            while (rs.next()) {
                comboAbrirCaixa.setSelectedItem(rs.getString("Valor"));
            }
            
            rs = banco.st.executeQuery("select * from configuracoes_email where Codigo_Email = 1");
            while (rs.next()) {
                txtEnderecoEmail.setText(rs.getString("Endereco_Email"));
                pTxtSenhaEmail.setText(rs.getString("Senha"));
                txtServidorSMTP.setText(rs.getString("Servidor_SMTP"));
                txtPorta.setText(rs.getString("Porta"));
                if (rs.getInt("Start_TLS")==0) {
                    checkStartTLS.setSelected(false);
                } else {
                    checkStartTLS.setSelected(true);
                }
            }
            
            rs = banco.st.executeQuery("select Valor from configuracoes where Descricao = 'CaminhoImagens'");
            while (rs.next()) {
                txtCaminhoImagem.setText(rs.getString("Valor"));
            }
            
            rs.close();
            banco.fecharConexaoBanco();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void configuraEmail(String Email, String Senha, String SMTP, int Porta, int StartTLS) {   
        
        try
        {            
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update configuracoes_email set Endereco_Email = '"+Email+"', "
                    + "Senha = '"+Senha+"', Servidor_SMTP = '"+SMTP+"', Porta = '"+Porta+"', "
                    + "Start_TLS = '"+StartTLS+"' where Codigo_Email = 1");
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void configuraCaminhoImagens(String Caminho) {
        
        try
        {            
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("update configuracoes set Valor = '"+Caminho+"' "
                    + "where Descricao = 'CaminhoImagens'");
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public boolean verificaSaldoCaixaAnterior() {
        
        boolean Flag = false;
        
        try
        {            
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Valor from configuracoes where Descricao =  'SaldoCaixaAnterior'");
            while (rs.next())
            {
                if (rs.getInt("Valor") == 1)
                {
                    Flag = true;
                }
            }
            
            rs.close();
            banco.fecharConexaoBanco();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        return Flag;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame InternalFrameAtalhos;
    private javax.swing.JInternalFrame InternalFrameEmail;
    private javax.swing.JInternalFrame InternalFrameOutrasConfiguracoes;
    private javax.swing.JInternalFrame InternalFrameSeguranca;
    private javax.swing.JButton btnOkAtalho;
    private javax.swing.JButton btnOkEmail;
    private javax.swing.JButton btnOkOutrasConfiguracoes;
    private javax.swing.JButton btnOkSeguranca;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox checkBackup;
    private javax.swing.JCheckBox checkEnviarEmail;
    private javax.swing.JCheckBox checkSaldoCaixa;
    private javax.swing.JCheckBox checkStartTLS;
    private javax.swing.JCheckBox checkValidadorCNPJ;
    private javax.swing.JCheckBox checkValidadorCPF;
    private javax.swing.JComboBox comboAbrirCaixa;
    private javax.swing.JComboBox comboClientes;
    private javax.swing.JComboBox comboCompras;
    private javax.swing.JComboBox comboOrdemServico;
    private javax.swing.JComboBox comboVendas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JLabel lblConfiguracaoSeguranca;
    private javax.swing.JLabel lblConfigurarAtalho;
    private javax.swing.JLabel lblConfigurarEmail;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblImagemFundo0;
    private javax.swing.JLabel lblImagemFundo1;
    private javax.swing.JLabel lblImagemFundo2;
    private javax.swing.JLabel lblImagemFundo4;
    private javax.swing.JLabel lblImagemFundo5;
    private javax.swing.JLabel lblOutrasConfiguracoes;
    private javax.swing.JPasswordField pTxtSenhaEmail;
    private javax.swing.JTextField txtCaminhoImagem;
    private javax.swing.JTextField txtEnderecoEmail;
    private javax.swing.JFormattedTextField txtHoraBackup;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JTextField txtServidorSMTP;
    // End of variables declaration//GEN-END:variables
}
