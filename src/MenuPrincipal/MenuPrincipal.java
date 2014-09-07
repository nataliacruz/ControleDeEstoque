
package MenuPrincipal;

import CentroEstoque.CentroEstoque;
import ConexaoBanco.ConexaoBanco;
import Clientes.Clientes;
import Compras.Compras;
import ConfiguracoesSistema.ConfiguracoesSistema;
import DadosEmpresa.DadosEmpresa;
import Funcionarios.Funcionarios;
import Usuarios.Usuarios;
import Empresas.Empresas;
import Caixa.Caixa;
import Fornecedores.Fornecedores;
import Login.Login;
import OrdemServiço.OrdemServico;
import Produtos.Produtos;
import Calendario.Calendario;
import FormasPagamento.FormasPagamento;
import MovimentarEstoque.MovimentarEstoque;
import Venda.Venda;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public final class MenuPrincipal extends javax.swing.JFrame {
    
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;
    Process proc;
    
    Clientes clientes = new Clientes();
    Produtos produtos = new Produtos();
    Fornecedores fornecedores = new Fornecedores();
    Compras compras = new Compras();
    DadosEmpresa dadosEmpresa = new DadosEmpresa();
    CentroEstoque centrosEstoque = new CentroEstoque();
    Usuarios usuarios = new Usuarios();
    OrdemServico ordemServico = new OrdemServico();
    Empresas empresas = new Empresas();
    Venda vendas = new Venda();
    Funcionarios funcionarios = new Funcionarios();
    Calendario calendario = new Calendario();
    Caixa caixa = new Caixa();
    FormasPagamento formasPagto = new FormasPagamento();
    ConfiguracoesSistema configuracoes = new ConfiguracoesSistema();
    
    public MenuPrincipal() {
        initComponents();
        
        dimensionaComponentes();
        
        lblCalendario.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/Calendario.jpg"));
        lblCliente.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/Cliente.jpg"));
        lblEmpresa.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/Empresa.jpg"));
        lblProduto.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/Produto.jpg"));
        lblCentroEstoque.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/CentroEstoque.jpg"));
        lblFornecedor.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/Fornecedor.jpg"));
        lblCaixa.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/Caixa.jpg"));
        lblCompras.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/Compras.jpg"));
        lblVendas.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/Vendas.jpg"));
        lblOrdemServico.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/OrdemServico.jpg"));
        lblLogout.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/Logout.jpg"));
        lblSair.setIcon(new ImageIcon("/ControleDeEstoque/Imagens/Sair.jpg"));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblOrdemServico = new javax.swing.JLabel();
        lblVendas = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblCompras = new javax.swing.JLabel();
        lblCaixa = new javax.swing.JLabel();
        lblFornecedor = new javax.swing.JLabel();
        lblCentroEstoque = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblCalendario = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblHoraLogin = new javax.swing.JLabel();
        lblImagemFundo = new javax.swing.JLabel();
        menuSistema = new javax.swing.JMenuBar();
        menuConfiguracoes = new javax.swing.JMenu();
        itemMenuDadosEmpresa = new javax.swing.JMenuItem();
        itemMenuUsuarios = new javax.swing.JMenuItem();
        itemMenuFuncionarios = new javax.swing.JMenuItem();
        itemMenuFormasPagamento = new javax.swing.JMenuItem();
        itemMenuConfiguracoes = new javax.swing.JMenuItem();
        itemMenuConfigracaoEmail = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        itemMenuClientes = new javax.swing.JMenuItem();
        menuEmpresas = new javax.swing.JMenu();
        itemMenuEmpresas = new javax.swing.JMenuItem();
        itemMenuFaturamentos = new javax.swing.JMenuItem();
        menuEstoque = new javax.swing.JMenu();
        itemMenuProdutos = new javax.swing.JMenuItem();
        itemMenuCentrosEstoque = new javax.swing.JMenuItem();
        itemMenuFornecedores = new javax.swing.JMenuItem();
        itemMenuMovimentarProdutos = new javax.swing.JMenuItem();
        menuComprasVendas = new javax.swing.JMenu();
        itemMenuCompras = new javax.swing.JMenuItem();
        itemMenuVendas = new javax.swing.JMenuItem();
        itemMenuOrdemServico = new javax.swing.JMenuItem();
        menuFinanceiro = new javax.swing.JMenu();
        itemMenuCaixa = new javax.swing.JMenuItem();
        itemMenuControleFinanceiro = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuRelClientes = new javax.swing.JMenu();
        itemMenuRelacaoClientes = new javax.swing.JMenuItem();
        menuUtilidades = new javax.swing.JMenu();
        itemMenuEnviarEmails = new javax.swing.JMenuItem();
        itemMenuAgendaContatos = new javax.swing.JMenuItem();
        itemMenuAvisos = new javax.swing.JMenuItem();
        itemMenuCalendario = new javax.swing.JMenuItem();
        menuBackup = new javax.swing.JMenu();
        itemMenuRealizarBackup = new javax.swing.JMenuItem();
        itemMenuRestaurarBackup = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuPainelControle = new javax.swing.JMenu();
        itemMenuLogout = new javax.swing.JMenuItem();
        itemMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(MAXIMIZED_BOTH);
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setName("MenuPrincipal"); // NOI18N
        getContentPane().setLayout(null);

        lblLogo.setFont(new java.awt.Font("NSimSun", 0, 36)); // NOI18N
        lblLogo.setText("StockMax LTDA");
        getContentPane().add(lblLogo);
        lblLogo.setBounds(530, 220, 250, 70);

        lblOrdemServico.setToolTipText("Cadastro de Ordem de Serviço");
        lblOrdemServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOrdemServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblOrdemServicoMousePressed(evt);
            }
        });
        getContentPane().add(lblOrdemServico);
        lblOrdemServico.setBounds(770, 10, 70, 70);

        lblVendas.setToolTipText("Cadastro de Vendas");
        lblVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVendasMousePressed(evt);
            }
        });
        getContentPane().add(lblVendas);
        lblVendas.setBounds(690, 10, 70, 70);

        lblLogout.setToolTipText("Fazer Logout no Sistema");
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLogoutMousePressed(evt);
            }
        });
        getContentPane().add(lblLogout);
        lblLogout.setBounds(870, 10, 70, 70);

        lblCompras.setToolTipText("Cadastro de Compras");
        lblCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblComprasMousePressed(evt);
            }
        });
        getContentPane().add(lblCompras);
        lblCompras.setBounds(610, 10, 70, 70);

        lblCaixa.setToolTipText("Caixa");
        lblCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCaixaMousePressed(evt);
            }
        });
        getContentPane().add(lblCaixa);
        lblCaixa.setBounds(530, 10, 70, 70);

        lblFornecedor.setToolTipText("Cadastro de Fornecedores");
        lblFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblFornecedorMousePressed(evt);
            }
        });
        getContentPane().add(lblFornecedor);
        lblFornecedor.setBounds(430, 10, 70, 70);

        lblCentroEstoque.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lblCentroEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCentroEstoque.setToolTipText("Cadastro de Centros de Estoque");
        lblCentroEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCentroEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCentroEstoqueMousePressed(evt);
            }
        });
        getContentPane().add(lblCentroEstoque);
        lblCentroEstoque.setBounds(350, 10, 70, 70);

        lblProduto.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lblProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProduto.setToolTipText("Cadastro de Produtos");
        lblProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblProdutoMousePressed(evt);
            }
        });
        getContentPane().add(lblProduto);
        lblProduto.setBounds(270, 10, 70, 70);

        lblEmpresa.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lblEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresa.setToolTipText("Cadastro de Empresas");
        lblEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEmpresaMousePressed(evt);
            }
        });
        getContentPane().add(lblEmpresa);
        lblEmpresa.setBounds(170, 10, 70, 70);

        lblCliente.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente.setToolTipText("Cadastro de Clientes");
        lblCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblClienteMousePressed(evt);
            }
        });
        getContentPane().add(lblCliente);
        lblCliente.setBounds(90, 10, 70, 70);

        lblCalendario.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lblCalendario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalendario.setToolTipText("Calendário");
        lblCalendario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCalendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCalendarioMousePressed(evt);
            }
        });
        getContentPane().add(lblCalendario);
        lblCalendario.setBounds(10, 10, 70, 70);

        lblSair.setToolTipText("Sair do Sistema");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSairMousePressed(evt);
            }
        });
        getContentPane().add(lblSair);
        lblSair.setBounds(950, 10, 70, 70);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("Logado no sistema como:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 120, 210, 21);

        lblNomeUsuario.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblNomeUsuario.setText("Usuario");
        getContentPane().add(lblNomeUsuario);
        lblNomeUsuario.setBounds(220, 120, 170, 21);

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Horário do login:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 150, 153, 21);

        lblHoraLogin.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblHoraLogin.setForeground(new java.awt.Color(255, 0, 0));
        lblHoraLogin.setText("Login");
        getContentPane().add(lblHoraLogin);
        lblHoraLogin.setBounds(170, 150, 210, 25);
        getContentPane().add(lblImagemFundo);
        lblImagemFundo.setBounds(0, 0, 1260, 430);

        menuSistema.setBackground(new java.awt.Color(255, 255, 255));
        menuSistema.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        menuConfiguracoes.setText("Configurações");
        menuConfiguracoes.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        itemMenuDadosEmpresa.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuDadosEmpresa.setText("Dados da Empresa");
        itemMenuDadosEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuDadosEmpresaActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(itemMenuDadosEmpresa);

        itemMenuUsuarios.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuUsuarios.setText("Usuários");
        itemMenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuUsuariosActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(itemMenuUsuarios);

        itemMenuFuncionarios.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuFuncionarios.setText("Funcionários");
        itemMenuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuFuncionariosActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(itemMenuFuncionarios);

        itemMenuFormasPagamento.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuFormasPagamento.setText("Formas de pagamento");
        itemMenuFormasPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuFormasPagamentoActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(itemMenuFormasPagamento);

        itemMenuConfiguracoes.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuConfiguracoes.setText("Configurações do Sistema");
        itemMenuConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuConfiguracoesActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(itemMenuConfiguracoes);

        itemMenuConfigracaoEmail.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuConfigracaoEmail.setText("Enviar Relatórios");
        menuConfiguracoes.add(itemMenuConfigracaoEmail);

        menuSistema.add(menuConfiguracoes);

        menuClientes.setText("Clientes");
        menuClientes.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        itemMenuClientes.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuClientes.setText("Cadastro de Clientes");
        itemMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuClientesActionPerformed(evt);
            }
        });
        menuClientes.add(itemMenuClientes);

        menuSistema.add(menuClientes);

        menuEmpresas.setBackground(new java.awt.Color(255, 255, 255));
        menuEmpresas.setText("Empresas");
        menuEmpresas.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        itemMenuEmpresas.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuEmpresas.setText("Cadastro de Empresas");
        itemMenuEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuEmpresasActionPerformed(evt);
            }
        });
        menuEmpresas.add(itemMenuEmpresas);

        itemMenuFaturamentos.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuFaturamentos.setText("Faturamentos");
        menuEmpresas.add(itemMenuFaturamentos);

        menuSistema.add(menuEmpresas);

        menuEstoque.setText("Estoque");
        menuEstoque.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        itemMenuProdutos.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuProdutos.setText("Produtos");
        itemMenuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuProdutosActionPerformed(evt);
            }
        });
        menuEstoque.add(itemMenuProdutos);

        itemMenuCentrosEstoque.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuCentrosEstoque.setText("Centros de Estoque");
        itemMenuCentrosEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCentrosEstoqueActionPerformed(evt);
            }
        });
        menuEstoque.add(itemMenuCentrosEstoque);

        itemMenuFornecedores.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuFornecedores.setText("Fornecedores");
        itemMenuFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuFornecedoresActionPerformed(evt);
            }
        });
        menuEstoque.add(itemMenuFornecedores);

        itemMenuMovimentarProdutos.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuMovimentarProdutos.setText("Movimentar Produtos");
        itemMenuMovimentarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuMovimentarProdutosActionPerformed(evt);
            }
        });
        menuEstoque.add(itemMenuMovimentarProdutos);

        menuSistema.add(menuEstoque);

        menuComprasVendas.setText("Compras/Vendas");
        menuComprasVendas.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        itemMenuCompras.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuCompras.setText("Compras");
        itemMenuCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuComprasActionPerformed(evt);
            }
        });
        menuComprasVendas.add(itemMenuCompras);

        itemMenuVendas.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuVendas.setText("Vendas");
        itemMenuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVendasActionPerformed(evt);
            }
        });
        menuComprasVendas.add(itemMenuVendas);

        itemMenuOrdemServico.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuOrdemServico.setText("Ordem de Serviço");
        itemMenuOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuOrdemServicoActionPerformed(evt);
            }
        });
        menuComprasVendas.add(itemMenuOrdemServico);

        menuSistema.add(menuComprasVendas);

        menuFinanceiro.setText("Financeiro");
        menuFinanceiro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        itemMenuCaixa.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuCaixa.setText("Caixa");
        itemMenuCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCaixaActionPerformed(evt);
            }
        });
        menuFinanceiro.add(itemMenuCaixa);

        itemMenuControleFinanceiro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuControleFinanceiro.setText("Controle Financeiro");
        menuFinanceiro.add(itemMenuControleFinanceiro);

        menuSistema.add(menuFinanceiro);

        menuRelatorios.setText("Relatórios");
        menuRelatorios.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        menuRelClientes.setText("Clientes");
        menuRelClientes.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        itemMenuRelacaoClientes.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuRelacaoClientes.setText("Relação de Clientes");
        itemMenuRelacaoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuRelacaoClientesActionPerformed(evt);
            }
        });
        menuRelClientes.add(itemMenuRelacaoClientes);

        menuRelatorios.add(menuRelClientes);

        menuSistema.add(menuRelatorios);

        menuUtilidades.setText("Utilidades");
        menuUtilidades.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        itemMenuEnviarEmails.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuEnviarEmails.setText("Enviar E-mails");
        menuUtilidades.add(itemMenuEnviarEmails);

        itemMenuAgendaContatos.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuAgendaContatos.setText("Agenda de Contatos");
        menuUtilidades.add(itemMenuAgendaContatos);

        itemMenuAvisos.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuAvisos.setText("Avisos");
        menuUtilidades.add(itemMenuAvisos);

        itemMenuCalendario.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuCalendario.setText("Calendário");
        itemMenuCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCalendarioActionPerformed(evt);
            }
        });
        menuUtilidades.add(itemMenuCalendario);

        menuBackup.setText("Backup");
        menuBackup.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        itemMenuRealizarBackup.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuRealizarBackup.setText("Realizar Backup");
        itemMenuRealizarBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuRealizarBackupActionPerformed(evt);
            }
        });
        menuBackup.add(itemMenuRealizarBackup);

        itemMenuRestaurarBackup.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        itemMenuRestaurarBackup.setText("Restaurar Backup");
        itemMenuRestaurarBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuRestaurarBackupActionPerformed(evt);
            }
        });
        menuBackup.add(itemMenuRestaurarBackup);

        menuUtilidades.add(menuBackup);

        jMenuItem1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jMenuItem1.setText("Orçamento");
        menuUtilidades.add(jMenuItem1);

        menuSistema.add(menuUtilidades);

        menuPainelControle.setText("Sistema");
        menuPainelControle.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        itemMenuLogout.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        itemMenuLogout.setText("Fazer logout");
        itemMenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuLogoutActionPerformed(evt);
            }
        });
        menuPainelControle.add(itemMenuLogout);

        itemMenuSair.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        itemMenuSair.setText("Sair");
        itemMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSairActionPerformed(evt);
            }
        });
        menuPainelControle.add(itemMenuSair);

        menuSistema.add(menuPainelControle);

        setJMenuBar(menuSistema);

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(1275, 493));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuProdutosActionPerformed
      
        produtos.setVisible(true);
        
    }//GEN-LAST:event_itemMenuProdutosActionPerformed

    private void itemMenuFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuFornecedoresActionPerformed
     
        fornecedores.setVisible(true);
        
    }//GEN-LAST:event_itemMenuFornecedoresActionPerformed

    private void itemMenuComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuComprasActionPerformed
        
        compras.setVisible(true);
        compras.setUsuario(lblNomeUsuario.getText());
        
    }//GEN-LAST:event_itemMenuComprasActionPerformed

    private void itemMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuClientesActionPerformed
        
        clientes.setVisible(true);
        
    }//GEN-LAST:event_itemMenuClientesActionPerformed

    private void itemMenuConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuConfiguracoesActionPerformed
        
        configuracoes.setVisible(true);
        
    }//GEN-LAST:event_itemMenuConfiguracoesActionPerformed

    private void itemMenuDadosEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuDadosEmpresaActionPerformed
        
        dadosEmpresa.setVisible(true);
        
    }//GEN-LAST:event_itemMenuDadosEmpresaActionPerformed

    private void itemMenuCentrosEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCentrosEstoqueActionPerformed
       
        centrosEstoque.setVisible(true);
        
    }//GEN-LAST:event_itemMenuCentrosEstoqueActionPerformed

    private void itemMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSairActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (resp ==0)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_itemMenuSairActionPerformed

    private void itemMenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuLogoutActionPerformed
        
        Login login = new Login();
        login.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_itemMenuLogoutActionPerformed

    private void itemMenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuUsuariosActionPerformed
        
        usuarios.setVisible(true);
        
    }//GEN-LAST:event_itemMenuUsuariosActionPerformed

    private void itemMenuOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuOrdemServicoActionPerformed
        
        ordemServico.setVisible(true);
        
    }//GEN-LAST:event_itemMenuOrdemServicoActionPerformed

    private void itemMenuEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuEmpresasActionPerformed
        
        empresas.setVisible(true);
        
    }//GEN-LAST:event_itemMenuEmpresasActionPerformed

    private void itemMenuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVendasActionPerformed
        
        vendas.setVisible(true);
        
    }//GEN-LAST:event_itemMenuVendasActionPerformed

    private void itemMenuRelacaoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuRelacaoClientesActionPerformed

        
        
    }//GEN-LAST:event_itemMenuRelacaoClientesActionPerformed

    private void itemMenuCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCaixaActionPerformed
        
        caixa.setVisible(true);
        caixa.setUsuario(lblNomeUsuario.getText());
        
    }//GEN-LAST:event_itemMenuCaixaActionPerformed

    private void itemMenuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuFuncionariosActionPerformed
        
        funcionarios.setVisible(true);
        
    }//GEN-LAST:event_itemMenuFuncionariosActionPerformed

    private void lblClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClienteMousePressed
        
        clientes.setVisible(true);
        
    }//GEN-LAST:event_lblClienteMousePressed

    private void lblEmpresaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpresaMousePressed
        
        empresas.setVisible(true);
        
    }//GEN-LAST:event_lblEmpresaMousePressed

    private void lblProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdutoMousePressed
        
        produtos.setVisible(true);
        
    }//GEN-LAST:event_lblProdutoMousePressed

    private void lblCentroEstoqueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCentroEstoqueMousePressed
        
        centrosEstoque.setVisible(true);
        
    }//GEN-LAST:event_lblCentroEstoqueMousePressed

    private void lblFornecedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFornecedorMousePressed
        
        fornecedores.setVisible(true);
        
    }//GEN-LAST:event_lblFornecedorMousePressed

    private void lblCaixaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCaixaMousePressed
        
        caixa.setVisible(true);
        caixa.setUsuario(lblNomeUsuario.getText());
        
    }//GEN-LAST:event_lblCaixaMousePressed

    private void lblComprasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprasMousePressed
        
        compras.setVisible(true);
        compras.setUsuario(lblNomeUsuario.getText());
        
    }//GEN-LAST:event_lblComprasMousePressed

    private void lblVendasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendasMousePressed
        
        vendas.setVisible(true);
        
    }//GEN-LAST:event_lblVendasMousePressed

    private void lblOrdemServicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrdemServicoMousePressed
        
        ordemServico.setVisible(true);
        
    }//GEN-LAST:event_lblOrdemServicoMousePressed

    private void lblLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMousePressed
        
        Login login = new Login();
        login.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_lblLogoutMousePressed

    private void lblSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMousePressed
        
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (resp ==0)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_lblSairMousePressed

    private void itemMenuCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCalendarioActionPerformed
        
        calendario.setVisible(true);
        
    }//GEN-LAST:event_itemMenuCalendarioActionPerformed

    private void lblCalendarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCalendarioMousePressed
        
        calendario.setVisible(true);
        
    }//GEN-LAST:event_lblCalendarioMousePressed

    private void itemMenuMovimentarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuMovimentarProdutosActionPerformed
        
        MovimentarEstoque movimentar = new MovimentarEstoque();
        movimentar.setVisible(true);
        
    }//GEN-LAST:event_itemMenuMovimentarProdutosActionPerformed

    private void itemMenuRestaurarBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuRestaurarBackupActionPerformed
       
        try 
        {            
            JFileChooser JFC_Backup = new JFileChooser();
            JFC_Backup.setDialogTitle("Selecione o arquivo de backup para restaurá-lo");
            JFC_Backup.setVisible(true);  
            
            int result = JFC_Backup.showOpenDialog(null); 

            if(result == JFileChooser.OPEN_DIALOG)
            {

                File bkp;  
                bkp = JFC_Backup.getSelectedFile();  
                String arq = bkp.getPath();  

                String[] cmd = new String[3];
                   cmd[0] = "cmd.exe" ;
                    cmd[1] = "/C" ;
                     cmd[2] = "C:\\\"Program Files (x86)\"\\MySQL\\\"MySQL Server 5.5\"\\bin\\mysql -u estoque -p estoque -h localhost estoque < "+arq ;

                Runtime rt = Runtime.getRuntime();
                proc = rt.exec(cmd);
                this.setCursor(Cursor.WAIT_CURSOR);

                            // any error message?
                StreamGobbler errorGobbler = new StreamGobbler(proc.getErrorStream(), "ERROR");            

                // any output?
                StreamGobbler outputGobbler = new StreamGobbler(proc.getInputStream(), "OUTPUT");

                // kick them off
                errorGobbler.run();
                outputGobbler.run();

                // any error???
                int exitVal = proc.waitFor();


                if (exitVal == 0)
                {  
                    JOptionPane.showMessageDialog(null, "Backup Restaurado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE); 
                    this.setCursor(Cursor.DEFAULT_CURSOR);
                }  
                else
                {  
                    JOptionPane.showMessageDialog(null, "Falha ao restaurar backup.\nVerifique as configurações ou entre em contato com o suporte!", "Atenção", JOptionPane.ERROR_MESSAGE);  
                    this.setCursor(Cursor.DEFAULT_CURSOR);
                }
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e, "Erro!", 2);            
        }      
        
    }//GEN-LAST:event_itemMenuRestaurarBackupActionPerformed

    private void itemMenuRealizarBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuRealizarBackupActionPerformed
        
        try 
        {            
            JFileChooser fileChooser = new JFileChooser();
            //use FILES_ONLY caso deseje que o usuario selecione apenas arquivos
            fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
            fileChooser.setDialogTitle("Selecione um local para salvar o backup");
            
            int status = fileChooser.showSaveDialog(null);
            
            if (status == JFileChooser.APPROVE_OPTION) 
            {
                
                String caminho = fileChooser.getSelectedFile().toString().concat(".sql");
                
                File arquivo = new File(caminho);
                
                if (arquivo.exists()) 
                {
                    Object[] options = {"Sim", "Não"};
                    int opcao = JOptionPane.showOptionDialog(null, "Este arquivo já existe. Deseja substituí-lo?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                    if (opcao == JOptionPane.YES_OPTION) 
                    {
                        Runtime backup = Runtime.getRuntime();
                        proc = backup.exec("C:/Program Files (x86)/MySQL/MySQL Server 5.5/bin/mysqldump.exe -v -v -v --host=localhost --user=estoque --password=estoque --port=3306 --protocol=tcp --force --allow-keywords --compress --add-drop-table --default-character-set=latin1 --hex-blob --result-file=" + caminho + " --databases estoque");
                        this.setCursor(Cursor.WAIT_CURSOR);
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Backup cancelado pelo usuário", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    }
                } 
                else 
                {
                    Runtime backup = Runtime.getRuntime();
                    proc = backup.exec("C:/Program Files (x86)/MySQL/MySQL Server 5.5/bin/mysqldump.exe -v -v -v --host=localhost --user=estoque --password=estoque --port=3306 --protocol=tcp --force --allow-keywords --compress --add-drop-table --default-character-set=latin1 --hex-blob --result-file=" + caminho + " --databases estoque");
                    this.setCursor(Cursor.WAIT_CURSOR);
                }
                
                int exitVal = proc.waitFor();
                
                if (exitVal == 0) 
                {
                    JOptionPane.showMessageDialog(null, "Backup realizado com sucesso !", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    this.setCursor(Cursor.DEFAULT_CURSOR);
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Falha ao realizar backup. \n Verifique as configurações ou entre em contato com o suporte!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    this.setCursor(Cursor.DEFAULT_CURSOR);
                }
                
            } 
            else 
            {
                // o usuario desistiu, faça algo
                fileChooser.setVisible(false);
                
            }
            
        } 
        catch (HeadlessException | IOException | InterruptedException e) 
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_itemMenuRealizarBackupActionPerformed

    private void itemMenuFormasPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuFormasPagamentoActionPerformed
                
        formasPagto.setVisible(true);
        
    }//GEN-LAST:event_itemMenuFormasPagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇAM OS METODOS
    
    public void setUsuario(String nomeUsuario, String Data) {

        
        try
        {
            lblNomeUsuario.setText(nomeUsuario);
            lblHoraLogin.setText(Data);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void dimensionaComponentes() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int eixoX = (d.width / 2) - 250;
        int eixoY = (d.height / 2 - 200);
        
        lblImagemFundo.setBounds(eixoX, eixoY, 500, 250);
        //PainelBotoes.setBounds(5, 5, d.width - 10, 70);

        lblLogo.setBounds(d.width - 240, d.height - 300, 240, 170);
        lblImagemFundo.setBounds(0, 0, d.width + 300, d.height);
        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
        
        File foto = new File("/ControleDeEstoque/Imagens/ImagemFundoMenuPrincipal.jpg");
        BufferedImage bi;
        try {
            bi = ImageIO.read(foto); //carrega a imagem real num buffer
            BufferedImage aux = new BufferedImage(d.width, d.height, bi.getType());//cria um buffer auxiliar com o tamanho desejado    
        Graphics2D g = aux.createGraphics();//pega a classe graphics do aux para edicao    
        AffineTransform at = AffineTransform.getScaleInstance((double) d.width / bi.getWidth(), (double) d.height / bi.getHeight());//cria a transformacao    
        g.drawRenderedImage(bi, at);//pinta e transforma a imagem real no auxiliar
        lblImagemFundo.setIcon(new ImageIcon(aux));
        } catch (IOException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMenuAgendaContatos;
    private javax.swing.JMenuItem itemMenuAvisos;
    private javax.swing.JMenuItem itemMenuCaixa;
    private javax.swing.JMenuItem itemMenuCalendario;
    private javax.swing.JMenuItem itemMenuCentrosEstoque;
    private javax.swing.JMenuItem itemMenuClientes;
    private javax.swing.JMenuItem itemMenuCompras;
    private javax.swing.JMenuItem itemMenuConfigracaoEmail;
    private javax.swing.JMenuItem itemMenuConfiguracoes;
    private javax.swing.JMenuItem itemMenuControleFinanceiro;
    private javax.swing.JMenuItem itemMenuDadosEmpresa;
    private javax.swing.JMenuItem itemMenuEmpresas;
    private javax.swing.JMenuItem itemMenuEnviarEmails;
    private javax.swing.JMenuItem itemMenuFaturamentos;
    private javax.swing.JMenuItem itemMenuFormasPagamento;
    private javax.swing.JMenuItem itemMenuFornecedores;
    private javax.swing.JMenuItem itemMenuFuncionarios;
    private javax.swing.JMenuItem itemMenuLogout;
    private javax.swing.JMenuItem itemMenuMovimentarProdutos;
    private javax.swing.JMenuItem itemMenuOrdemServico;
    private javax.swing.JMenuItem itemMenuProdutos;
    private javax.swing.JMenuItem itemMenuRealizarBackup;
    private javax.swing.JMenuItem itemMenuRelacaoClientes;
    private javax.swing.JMenuItem itemMenuRestaurarBackup;
    private javax.swing.JMenuItem itemMenuSair;
    private javax.swing.JMenuItem itemMenuUsuarios;
    private javax.swing.JMenuItem itemMenuVendas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblCaixa;
    private javax.swing.JLabel lblCalendario;
    private javax.swing.JLabel lblCentroEstoque;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblHoraLogin;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblOrdemServico;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblVendas;
    private javax.swing.JMenu menuBackup;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuComprasVendas;
    private javax.swing.JMenu menuConfiguracoes;
    private javax.swing.JMenu menuEmpresas;
    private javax.swing.JMenu menuEstoque;
    private javax.swing.JMenu menuFinanceiro;
    private javax.swing.JMenu menuPainelControle;
    private javax.swing.JMenu menuRelClientes;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenuBar menuSistema;
    private javax.swing.JMenu menuUtilidades;
    // End of variables declaration//GEN-END:variables
}
