
package MovimentarEstoque;

import ConexaoBanco.ConexaoBanco;
import DimensionaImagem.DimensionaImagem;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class MovimentarEstoque extends javax.swing.JFrame {
    
    DimensionaImagem dimImagem = new DimensionaImagem();
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.ResultSet rs;
    public java.sql.PreparedStatement ps;
    DefaultTableModel tabela;

    public MovimentarEstoque() {
        initComponents();
        
        Font font = new Font("NSimSun", Font.PLAIN, 18);
        JTableHeader cabecalho1 = tabelaCentro1.getTableHeader();
        cabecalho1.setFont(font);
        
        JTableHeader cabecalho2 = tabelaCentro2.getTableHeader();
        cabecalho2.setFont(font);
        
        carregaCentroEstoque();
        
        dimImagem.dimensionaComponentes(lblImagemFundo, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 930, 500);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboCentro1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCentro1 = new javax.swing.JTable();
        btnEnviarCentro2 = new javax.swing.JButton();
        btnEnviarTudoCentro2 = new javax.swing.JButton();
        btnEnviarCentro1 = new javax.swing.JButton();
        btnEnviarTudoCentro1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCentro2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        comboCentro2 = new javax.swing.JComboBox();
        btnSair = new javax.swing.JButton();
        lblImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentar produtos");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setText("Selecione um centro de estoque");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 280, 21);

        comboCentro1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboCentro1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>" }));
        comboCentro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCentro1ActionPerformed(evt);
            }
        });
        getContentPane().add(comboCentro1);
        comboCentro1.setBounds(20, 40, 390, 32);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Produtos cadastrados");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 180, 20);

        tabelaCentro1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaCentro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quant", "Cod"
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
        tabelaCentro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaCentro1.setRowHeight(25);
        tabelaCentro1.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaCentro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaCentro1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCentro1);
        if (tabelaCentro1.getColumnModel().getColumnCount() > 0) {
            tabelaCentro1.getColumnModel().getColumn(0).setPreferredWidth(350);
            tabelaCentro1.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabelaCentro1.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 390, 320);

        btnEnviarCentro2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnEnviarCentro2.setText(">");
        btnEnviarCentro2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarCentro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCentro2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviarCentro2);
        btnEnviarCentro2.setBounds(440, 140, 50, 50);

        btnEnviarTudoCentro2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnEnviarTudoCentro2.setText(">>");
        btnEnviarTudoCentro2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarTudoCentro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarTudoCentro2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviarTudoCentro2);
        btnEnviarTudoCentro2.setBounds(440, 210, 50, 50);

        btnEnviarCentro1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnEnviarCentro1.setText("<");
        btnEnviarCentro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarCentro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCentro1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviarCentro1);
        btnEnviarCentro1.setBounds(440, 280, 50, 50);

        btnEnviarTudoCentro1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnEnviarTudoCentro1.setText("<<");
        btnEnviarTudoCentro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarTudoCentro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarTudoCentro1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviarTudoCentro1);
        btnEnviarTudoCentro1.setBounds(440, 350, 50, 50);

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Produtos cadastrados");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 90, 190, 21);

        tabelaCentro2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaCentro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quant", "Cod"
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
        tabelaCentro2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaCentro2.setRowHeight(25);
        tabelaCentro2.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tabelaCentro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaCentro2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaCentro2);
        if (tabelaCentro2.getColumnModel().getColumnCount() > 0) {
            tabelaCentro2.getColumnModel().getColumn(0).setPreferredWidth(350);
            tabelaCentro2.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabelaCentro2.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(520, 110, 390, 320);

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Selecione um centro de estoque");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 20, 270, 21);

        comboCentro2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        comboCentro2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>" }));
        comboCentro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCentro2ActionPerformed(evt);
            }
        });
        getContentPane().add(comboCentro2);
        comboCentro2.setBounds(520, 40, 390, 32);

        btnSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(20, 450, 100, 35);
        getContentPane().add(lblImagemFundo);
        lblImagemFundo.setBounds(0, 0, 930, 500);

        setSize(new java.awt.Dimension(934, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboCentro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCentro1ActionPerformed
        
        if (comboCentro1.getSelectedIndex() == comboCentro2.getSelectedIndex())
        {
            if (comboCentro1.getSelectedIndex() != 0)
            {
                JOptionPane.showMessageDialog(null, "Escolha outro centro de estoque para movimentar!", "Atenção", JOptionPane.WARNING_MESSAGE);
                tabela = (DefaultTableModel) tabelaCentro1.getModel();
                tabela.setRowCount(0);
                comboCentro1.setSelectedIndex(0);
                comboCentro1.grabFocus();
            }
        }
        else if (!comboCentro1.getSelectedItem().equals("<Selecione>"))
        {
            getProdutosCentroEstoque((DefaultTableModel) tabelaCentro1.getModel(), comboCentro1);
        }
        if (comboCentro1.getSelectedIndex() == 0)
        {
            tabela = (DefaultTableModel) tabelaCentro1.getModel();
            tabela.setRowCount(0);
        }
        
    }//GEN-LAST:event_comboCentro1ActionPerformed

    private void comboCentro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCentro2ActionPerformed
        
        if (comboCentro2.getSelectedIndex() == comboCentro1.getSelectedIndex())
        {
            if (comboCentro2.getSelectedIndex() != 0)
            {
                JOptionPane.showMessageDialog(null, "Escolha outro centro de estoque para movimentar!", "Atenção", JOptionPane.WARNING_MESSAGE);
                tabela = (DefaultTableModel) tabelaCentro2.getModel();
                tabela.setRowCount(0);
                comboCentro2.setSelectedIndex(0);
                comboCentro2.grabFocus();
            }
        }
        else if (!comboCentro2.getSelectedItem().equals("<Selecione>"))
        {
            getProdutosCentroEstoque((DefaultTableModel) tabelaCentro2.getModel(), comboCentro2);
        }
        if (comboCentro2.getSelectedIndex() == 0)
        {
            tabela = (DefaultTableModel) tabelaCentro2.getModel();
            tabela.setRowCount(0);
        }
        
    }//GEN-LAST:event_comboCentro2ActionPerformed

    private void btnEnviarCentro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCentro2ActionPerformed
        
        int linha = tabelaCentro1.getSelectedRow();
        if (linha == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela para transferir!", "Atenção", JOptionPane.WARNING_MESSAGE);
            tabelaCentro1.grabFocus();
        }
        else if (comboCentro2.getSelectedItem().equals("<Selecione>"))
        {
            JOptionPane.showMessageDialog(null, "Selecione um centro de estoque para enviar os produtos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int quant = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite a quantidade que deseja transferir", "Atenção", JOptionPane.QUESTION_MESSAGE));
            if (quant > Integer.valueOf(tabelaCentro1.getModel().getValueAt(linha, 1).toString()))
            {
                JOptionPane.showMessageDialog(null, "Você não possui esta quantidade para transferir!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if (quant <=0)
            {
                JOptionPane.showMessageDialog(null, "Esta quantidade é inválida!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                transfereProduto(quant, linha, "Botao1");
                getProdutosCentroEstoque((DefaultTableModel) tabelaCentro1.getModel(), comboCentro1);
                getProdutosCentroEstoque((DefaultTableModel) tabelaCentro2.getModel(), comboCentro2);
            }
            
        }
        
    }//GEN-LAST:event_btnEnviarCentro2ActionPerformed

    private void tabelaCentro1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCentro1MousePressed
        
        getProdutosCentroEstoque((DefaultTableModel) tabelaCentro2.getModel(), comboCentro2);
        
    }//GEN-LAST:event_tabelaCentro1MousePressed

    private void tabelaCentro2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCentro2MousePressed
        
        getProdutosCentroEstoque((DefaultTableModel) tabelaCentro1.getModel(), comboCentro1);
        
    }//GEN-LAST:event_tabelaCentro2MousePressed

    private void btnEnviarTudoCentro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarTudoCentro2ActionPerformed
        
        int linha = tabelaCentro1.getSelectedRow();
        if (linha == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela para transferir!", "Atenção", JOptionPane.WARNING_MESSAGE);
            tabelaCentro1.grabFocus();
        }
        else if (comboCentro2.getSelectedItem().equals("<Selecione>"))
        {
            JOptionPane.showMessageDialog(null, "Selecione um centro de estoque para enviar os produtos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int quant = Integer.valueOf(tabelaCentro1.getModel().getValueAt(linha, 1).toString());
            int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente transferir "+quant+"?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (resp == 0)
            {                
                transfereProduto(quant, linha, "Botao2");
                getProdutosCentroEstoque((DefaultTableModel) tabelaCentro1.getModel(), comboCentro1);
                getProdutosCentroEstoque((DefaultTableModel) tabelaCentro2.getModel(), comboCentro2);
            }
            
        }
        
    }//GEN-LAST:event_btnEnviarTudoCentro2ActionPerformed

    private void btnEnviarCentro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCentro1ActionPerformed
        
        int linha = tabelaCentro2.getSelectedRow();
        if (linha == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela para transferir!", "Atenção", JOptionPane.WARNING_MESSAGE);
            tabelaCentro2.grabFocus();
        }
        else if (comboCentro1.getSelectedItem().equals("<Selecione>"))
        {
            JOptionPane.showMessageDialog(null, "Selecione um centro de estoque para enviar os produtos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int quant = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite a quantidade que deseja transferir", "Atenção", JOptionPane.QUESTION_MESSAGE));
            if (quant > Integer.valueOf(tabelaCentro2.getModel().getValueAt(linha, 1).toString()))
            {
                JOptionPane.showMessageDialog(null, "Você não possui esta quantidade para transferir!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if (quant <=0)
            {
                JOptionPane.showMessageDialog(null, "Esta quantidade é inválida!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                transfereProduto(quant, linha, "Botao3");
                getProdutosCentroEstoque((DefaultTableModel) tabelaCentro1.getModel(), comboCentro1);
                getProdutosCentroEstoque((DefaultTableModel) tabelaCentro2.getModel(), comboCentro2);
            }
            
        }
        
    }//GEN-LAST:event_btnEnviarCentro1ActionPerformed

    private void btnEnviarTudoCentro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarTudoCentro1ActionPerformed
        
        int linha = tabelaCentro2.getSelectedRow();
        if (linha == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela para transferir!", "Atenção", JOptionPane.WARNING_MESSAGE);
            tabelaCentro2.grabFocus();
        }
        else if (comboCentro1.getSelectedItem().equals("<Selecione>"))
        {
            JOptionPane.showMessageDialog(null, "Selecione um centro de estoque para enviar os produtos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int quant = Integer.valueOf(tabelaCentro2.getModel().getValueAt(linha, 1).toString());
            int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente transferir "+quant+"?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (resp == 0)
            {                
                transfereProduto(quant, linha, "Botao4");
                getProdutosCentroEstoque((DefaultTableModel) tabelaCentro1.getModel(), comboCentro1);
                getProdutosCentroEstoque((DefaultTableModel) tabelaCentro2.getModel(), comboCentro2);
            }
            
        }
        
    }//GEN-LAST:event_btnEnviarTudoCentro1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(MovimentarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovimentarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovimentarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovimentarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovimentarEstoque().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇAM OS METODOS
    
    public void carregaCentroEstoque() {
        
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Nome from centros_estoque where Excluido = 0");
            while (rs.next())
            {
                comboCentro1.addItem(rs.getString("Nome"));
                comboCentro2.addItem(rs.getString("Nome"));
            }
            rs.close();
            banco.fecharConexaoBanco();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void getProdutosCentroEstoque(DefaultTableModel Tabela, javax.swing.JComboBox nomeCombo) {
     
        try
        {            
            banco.conexaoBanco();
            
            rs = banco.st.executeQuery("select produtos_centro_estoque.*, centros_estoque.Codigo_Centro_Estoque "
                    + "from produtos_centro_estoque, centros_estoque "
                    + "where centros_estoque.Codigo_Centro_Estoque = produtos_centro_estoque.Codigo_Centro_Estoque "
                    + "and centros_estoque.Nome = '"+nomeCombo.getSelectedItem().toString()+"'");
            Tabela.setRowCount(0);
            while (rs.next())
            {
                Tabela.addRow(new Object[] {
                    rs.getString("Nome"),
                    rs.getString("Quantidade"),
                    rs.getString("Codigo_Produto")
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
    
    public int getCodigoCentroEstoque1() {
        int codCentroEstoque1 = 0;
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Codigo_Centro_Estoque from centros_Estoque "
                    + "where Nome = '"+comboCentro1.getSelectedItem().toString()+"'");
            while(rs.next())
            {
                codCentroEstoque1 = rs.getInt("Codigo_Centro_Estoque");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return codCentroEstoque1;
    }
    
    public int getCodigoCentroEstoque2() {
        int codCentroEstoque2 = 0;
        try
        {
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select Codigo_Centro_Estoque from centros_Estoque "
                    + "where Nome = '"+comboCentro2.getSelectedItem().toString()+"'");
            while(rs.next())
            {
                codCentroEstoque2 = rs.getInt("Codigo_Centro_Estoque");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return codCentroEstoque2;
    }
    
    public void transfereProduto(int quant, int linha, String Instrucao) {
        
        try
        {
            int Flag = 0;
            String nomeProdutoCentro1;
            String nomeProdutoCentro2;
            int codProdutoCentro1;
            int codProdutoCentro2;
            int codCentroEstoque1 = getCodigoCentroEstoque1();
            int codCentroEstoque2 = getCodigoCentroEstoque2();
            
            banco.conexaoBanco();
            
            switch (Instrucao)
            {
                case "Botao1":
                {
                    
                    nomeProdutoCentro1 = tabelaCentro1.getModel().getValueAt(linha, 0).toString();
                    codProdutoCentro1 = Integer.valueOf(tabelaCentro1.getModel().getValueAt(linha, 2).toString());
                    
                    //primeiro verifico se já existe o produto no centro de estoque que vai entrar
                    //se não existir, preciso criá-lo. Se existir, apenas aumento a quantidade
                    rs = banco.st.executeQuery("select Codigo_Produto from produtos_centro_estoque "
                            + "where Codigo_Produto = "+codProdutoCentro1+" "
                            + "and Codigo_Centro_Estoque = "+codCentroEstoque2);
                    while (rs.next())
                    {
                        Flag = 1;
                    }
                    
                    if (Flag == 0)
                    {
                        ps = banco.con.prepareStatement("insert into produtos_centro_estoque values (?, ?, ?, ?)");
                        ps.setInt(1, codProdutoCentro1);
                        ps.setString(2, nomeProdutoCentro1);
                        ps.setInt(3, codCentroEstoque2);
                        ps.setInt(4, quant);
                        ps.executeUpdate();
                    }
                    else
                    {
                        int quantTotal = 0;
                        rs = banco.st.executeQuery("select Quantidade from produtos_centro_estoque "
                                + "where Codigo_Produto = "+codProdutoCentro1+" "
                                + "and Codigo_Centro_Estoque = "+codCentroEstoque2);
                        while (rs.next())
                        {
                            quantTotal = rs.getInt("Quantidade");
                        }
                         quantTotal = quantTotal + quant;
                        ps = banco.con.prepareStatement("update produtos_centro_estoque set "
                                + "Quantidade = "+quantTotal+" "
                                + "where Codigo_Produto = "+codProdutoCentro1+" "
                                + "and Codigo_Centro_Estoque = "+codCentroEstoque2);
                        ps.executeUpdate();
                        
                    }
                    
                    //por fim eu preciso debitar da quantidade do produto que eu escolhi na tabela
                    
                    int quantAtual1 = Integer.valueOf(tabelaCentro1.getModel().getValueAt(linha, 1).toString()) - quant;
                    
                    if (quantAtual1 == 0)
                    {
                        ps = banco.con.prepareStatement("delete from produtos_centro_estoque "
                                + "where Codigo_Produto = "+codProdutoCentro1+" "
                                + "and Codigo_Centro_estoque = "+codCentroEstoque1);
                        ps.executeUpdate();
                    }
                    else
                    {
                        ps = banco.con.prepareStatement("update produtos_centro_estoque set "
                                + "Quantidade = "+quantAtual1+" "
                                + "where Codigo_Produto = "+codProdutoCentro1+" "
                                + "and Codigo_Centro_estoque = "+codCentroEstoque1);
                        ps.executeUpdate();
                    }
                            
                    ps.close();
                    rs.close();
                    
                    break;
                }
                    
                case "Botao2":
                {
                    
                    nomeProdutoCentro1 = tabelaCentro1.getModel().getValueAt(linha, 0).toString();
                    codProdutoCentro1 = Integer.valueOf(tabelaCentro1.getModel().getValueAt(linha, 2).toString());
                    
                    //primeiro verifico se já existe o produto no centro de estoque que vai entrar
                    //se não existir, preciso criá-lo. Se existir, apenas aumento a quantidade
                    rs = banco.st.executeQuery("select Codigo_Produto from produtos_centro_estoque "
                            + "where Codigo_Produto = "+codProdutoCentro1+" "
                            + "and Codigo_Centro_Estoque = "+codCentroEstoque2);
                    while (rs.next())
                    {
                        Flag = 1;
                    }
                    
                    if (Flag == 0)
                    {
                        ps = banco.con.prepareStatement("insert into produtos_centro_estoque values (?, ?, ?, ?)");
                        ps.setInt(1, codProdutoCentro1);
                        ps.setString(2, nomeProdutoCentro1);
                        ps.setInt(3, codCentroEstoque2);
                        ps.setInt(4, quant);
                        ps.executeUpdate();
                    }
                    else
                    {
                        int quantTotal = 0;
                        rs = banco.st.executeQuery("select Quantidade from produtos_centro_estoque "
                                + "where Codigo_Produto = "+codProdutoCentro1+" "
                                + "and Codigo_Centro_Estoque = "+codCentroEstoque2);
                        while (rs.next())
                        {
                            quantTotal = rs.getInt("Quantidade");
                        }
                         quantTotal = quantTotal + quant;
                        ps = banco.con.prepareStatement("update produtos_centro_estoque set "
                                + "Quantidade = "+quantTotal+" "
                                + "where Codigo_Produto = "+codProdutoCentro1+" "
                                + "and Codigo_Centro_Estoque = "+codCentroEstoque2);
                        ps.executeUpdate();
                        
                    }
                    
                    //por fim eu preciso debitar da quantidade do produto que eu escolhi na tabela
                    //deleto o produto da tabela de origem pois nao sobrou quantidade
                    ps = banco.con.prepareStatement("delete from produtos_centro_estoque "
                            + "where Codigo_Produto = "+codProdutoCentro1+" "
                            + "and Codigo_Centro_estoque = "+codCentroEstoque1);
                    ps.executeUpdate();

                            
                    ps.close();
                    rs.close();
                    
                    break;
                }
                
                case "Botao3":
                {
                    
                    nomeProdutoCentro2 = tabelaCentro2.getModel().getValueAt(linha, 0).toString();
                    codProdutoCentro2 = Integer.valueOf(tabelaCentro2.getModel().getValueAt(linha, 2).toString());
                    
                    //primeiro verifico se já existe o produto no centro de estoque que vai entrar
                    //se não existir, preciso criá-lo. Se existir, apenas aumento a quantidade
                    rs = banco.st.executeQuery("select Codigo_Produto from produtos_centro_estoque "
                            + "where Codigo_Produto = "+codProdutoCentro2+" "
                            + "and Codigo_Centro_Estoque = "+codCentroEstoque1);
                    while (rs.next())
                    {
                        Flag = 1;
                    }
                    
                    if (Flag == 0)
                    {
                        ps = banco.con.prepareStatement("insert into produtos_centro_estoque values (?, ?, ?, ?)");
                        ps.setInt(1, codProdutoCentro2);
                        ps.setString(2, nomeProdutoCentro2);
                        ps.setInt(3, codCentroEstoque1);
                        ps.setInt(4, quant);
                        ps.executeUpdate();
                    }
                    else
                    {
                        int quantTotal = 0;
                        rs = banco.st.executeQuery("select Quantidade from produtos_centro_estoque "
                                + "where Codigo_Produto = "+codProdutoCentro2+" "
                                + "and Codigo_Centro_Estoque = "+codCentroEstoque1);
                        while (rs.next())
                        {
                            quantTotal = rs.getInt("Quantidade");
                        }
                         quantTotal = quantTotal + quant;
                        ps = banco.con.prepareStatement("update produtos_centro_estoque set "
                                + "Quantidade = "+quantTotal+" "
                                + "where Codigo_Produto = "+codProdutoCentro2+" "
                                + "and Codigo_Centro_Estoque = "+codCentroEstoque1);
                        ps.executeUpdate();
                        
                    }
                    
                    //por fim eu preciso debitar da quantidade do produto que eu escolhi na tabela
                    
                    int quantAtual3 = Integer.valueOf(tabelaCentro2.getModel().getValueAt(linha, 1).toString()) - quant;
                    
                    if (quantAtual3 == 0)
                    {
                        ps = banco.con.prepareStatement("delete from produtos_centro_estoque "
                                + "where Codigo_Produto = "+codProdutoCentro2+" "
                                + "and Codigo_Centro_estoque = "+codCentroEstoque2);
                        ps.executeUpdate();
                    }
                    else
                    {
                        ps = banco.con.prepareStatement("update produtos_centro_estoque set "
                                + "Quantidade = "+quantAtual3+" "
                                + "where Codigo_Produto = "+codProdutoCentro2+" "
                                + "and Codigo_Centro_estoque = "+codCentroEstoque2);
                        ps.executeUpdate();
                    }
                            
                    ps.close();
                    rs.close();
                    
                    break;
                }
                
                case "Botao4":
                {
                    
                    nomeProdutoCentro2 = tabelaCentro2.getModel().getValueAt(linha, 0).toString();
                    codProdutoCentro2 = Integer.valueOf(tabelaCentro2.getModel().getValueAt(linha, 2).toString());
                    
                    //primeiro verifico se já existe o produto no centro de estoque que vai entrar
                    //se não existir, preciso criá-lo. Se existir, apenas aumento a quantidade
                    rs = banco.st.executeQuery("select Codigo_Produto from produtos_centro_estoque "
                            + "where Codigo_Produto = "+codProdutoCentro2+" "
                            + "and Codigo_Centro_Estoque = "+codCentroEstoque1);
                    while (rs.next())
                    {
                        Flag = 1;
                    }
                    
                    if (Flag == 0)
                    {
                        ps = banco.con.prepareStatement("insert into produtos_centro_estoque values (?, ?, ?, ?)");
                        ps.setInt(1, codProdutoCentro2);
                        ps.setString(2, nomeProdutoCentro2);
                        ps.setInt(3, codCentroEstoque1);
                        ps.setInt(4, quant);
                        ps.executeUpdate();
                    }
                    else
                    {
                        int quantTotal = 0;
                        rs = banco.st.executeQuery("select Quantidade from produtos_centro_estoque "
                                + "where Codigo_Produto = "+codProdutoCentro2+" "
                                + "and Codigo_Centro_Estoque = "+codCentroEstoque1);
                        while (rs.next())
                        {
                            quantTotal = rs.getInt("Quantidade");
                        }
                         quantTotal = quantTotal + quant;
                        ps = banco.con.prepareStatement("update produtos_centro_estoque set "
                                + "Quantidade = "+quantTotal+" "
                                + "where Codigo_Produto = "+codProdutoCentro2+" "
                                + "and Codigo_Centro_Estoque = "+codCentroEstoque1);
                        ps.executeUpdate();
                        
                    }
                    
                    //por fim eu preciso debitar da quantidade do produto que eu escolhi na tabela
                    //deleto o produto da tabela de origem pois nao sobrou quantidade
                        ps = banco.con.prepareStatement("delete from produtos_centro_estoque "
                                + "where Codigo_Produto = "+codProdutoCentro2+" "
                                + "and Codigo_Centro_estoque = "+codCentroEstoque2);
                        ps.executeUpdate();
                            
                    ps.close();
                    rs.close();
                    
                    break;
                }
            }
            
            banco.fecharConexaoBanco();
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarCentro1;
    private javax.swing.JButton btnEnviarCentro2;
    private javax.swing.JButton btnEnviarTudoCentro1;
    private javax.swing.JButton btnEnviarTudoCentro2;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox comboCentro1;
    private javax.swing.JComboBox comboCentro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JTable tabelaCentro1;
    private javax.swing.JTable tabelaCentro2;
    // End of variables declaration//GEN-END:variables
}
