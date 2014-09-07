
package Calendario;

import ConexaoBanco.ConexaoBanco;
import DimensionaImagem.DimensionaImagem;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Calendario extends javax.swing.JFrame {
    
    DimensionaImagem dimImagem = new DimensionaImagem();
    ConexaoBanco banco = new ConexaoBanco();
    public java.sql.PreparedStatement ps;
    public java.sql.ResultSet rs;
    DefaultTableModel modelo;

    public Calendario() {
        initComponents();
        
        Font font = new Font("NSimSun", Font.PLAIN, 18);
        
        JTableHeader cabecalhoEventos = tabelaEventos.getTableHeader();
        cabecalhoEventos.setFont(font);
        
        carregaEvento();
        
        txtDescricaoEvento.setLineWrap(true);
        txtDescricaoEvento.setWrapStyleWord(true);
        
        dimImagem.dimensionaComponentes(lblImagemFundo1, "/ControleDeEstoque/Imagens/ImagemFundoCadastro.jpg", 630, 350);
        dimImagem.dimensionaComponentes(lblImagemFundo, "/ControleDeEstoque/Imagens/ImagemFundoFuncionario.jpg", 550, 160);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        InternalFrameAddEvento = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricaoEvento = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        calendarioEvento = new com.toedter.calendar.JDateChooser();
        btnOk = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDataCadastro = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomeEvento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        lblImagemFundo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        calendarioAnual = new com.toedter.calendar.JCalendar();
        btnAddEvento = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        lblImagemFundo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaEventos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calendário");
        setName("Calendario"); // NOI18N
        setResizable(false);

        PainelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PainelPrincipal.setPreferredSize(new java.awt.Dimension(872, 471));
        PainelPrincipal.setLayout(null);

        InternalFrameAddEvento.setClosable(true);
        InternalFrameAddEvento.setTitle("Adicionar evento");
        InternalFrameAddEvento.setVisible(false);
        InternalFrameAddEvento.getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Descrição do evento");
        InternalFrameAddEvento.getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 90, 180, 30);

        txtDescricaoEvento.setColumns(20);
        txtDescricaoEvento.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtDescricaoEvento.setRows(5);
        jScrollPane2.setViewportView(txtDescricaoEvento);

        InternalFrameAddEvento.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 120, 380, 140);

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setText("Data do evento");
        InternalFrameAddEvento.getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 110, 130, 30);

        calendarioEvento.setBackground(new java.awt.Color(241, 248, 248));
        calendarioEvento.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameAddEvento.getContentPane().add(calendarioEvento);
        calendarioEvento.setBounds(430, 140, 160, 35);

        btnOk.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnOk.setText("OK");
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        InternalFrameAddEvento.getContentPane().add(btnOk);
        btnOk.setBounds(20, 290, 100, 35);

        btnSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        InternalFrameAddEvento.getContentPane().add(btnSair);
        btnSair.setBounds(130, 290, 100, 35);

        jLabel22.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel22.setText("Código");
        InternalFrameAddEvento.getContentPane().add(jLabel22);
        jLabel22.setBounds(20, 10, 60, 30);

        lblCodigo.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("Código");
        InternalFrameAddEvento.getContentPane().add(lblCodigo);
        lblCodigo.setBounds(20, 40, 60, 30);

        jLabel8.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel8.setText("Cadastrado em");
        InternalFrameAddEvento.getContentPane().add(jLabel8);
        jLabel8.setBounds(430, 10, 130, 30);

        lblDataCadastro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblDataCadastro.setForeground(new java.awt.Color(255, 0, 0));
        lblDataCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataCadastro.setText("Data do cadastro");
        InternalFrameAddEvento.getContentPane().add(lblDataCadastro);
        lblDataCadastro.setBounds(430, 40, 150, 30);

        jLabel10.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel10.setText("Evento");
        InternalFrameAddEvento.getContentPane().add(jLabel10);
        jLabel10.setBounds(120, 10, 54, 30);

        txtNomeEvento.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameAddEvento.getContentPane().add(txtNomeEvento);
        txtNomeEvento.setBounds(120, 40, 280, 32);

        jLabel5.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel5.setText("Definir Horário");
        InternalFrameAddEvento.getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 190, 150, 30);

        try {
            txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHora.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        InternalFrameAddEvento.getContentPane().add(txtHora);
        txtHora.setBounds(430, 220, 60, 32);

        jLabel6.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel6.setText("Hrs");
        InternalFrameAddEvento.getContentPane().add(jLabel6);
        jLabel6.setBounds(500, 220, 40, 30);
        InternalFrameAddEvento.getContentPane().add(lblImagemFundo1);
        lblImagemFundo1.setBounds(0, 0, 630, 350);

        PainelPrincipal.add(InternalFrameAddEvento);
        InternalFrameAddEvento.setBounds(0, 0, 640, 380);

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Eventos para o dia selecionado");
        PainelPrincipal.add(jLabel1);
        jLabel1.setBounds(450, 10, 280, 30);

        jButton3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jButton3.setText("Fechar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PainelPrincipal.add(jButton3);
        jButton3.setBounds(880, 490, 100, 35);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Selecione um período no calendário abaixo");
        PainelPrincipal.add(jLabel2);
        jLabel2.setBounds(20, 10, 380, 30);

        calendarioAnual.setBackground(new java.awt.Color(255, 255, 255));
        calendarioAnual.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        calendarioAnual.setSundayForeground(new java.awt.Color(255, 0, 0));
        calendarioAnual.setWeekOfYearVisible(false);
        calendarioAnual.setWeekdayForeground(new java.awt.Color(0, 0, 255));
        calendarioAnual.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarioAnualPropertyChange(evt);
            }
        });
        PainelPrincipal.add(calendarioAnual);
        calendarioAnual.setBounds(21, 40, 410, 330);

        btnAddEvento.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnAddEvento.setText("Novo");
        btnAddEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEventoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnAddEvento);
        btnAddEvento.setBounds(20, 490, 100, 35);

        btnExcluir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        PainelPrincipal.add(btnExcluir);
        btnExcluir.setBounds(240, 490, 100, 35);

        jButton6.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jButton6.setText("Mostrar todos");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PainelPrincipal.add(jButton6);
        jButton6.setBounds(690, 490, 180, 35);

        lblStatus.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        lblStatus.setText("Eventos do dia selecionado: 0");
        PainelPrincipal.add(lblStatus);
        lblStatus.setBounds(20, 410, 400, 30);
        PainelPrincipal.add(lblImagemFundo);
        lblImagemFundo.setBounds(450, 380, 550, 160);

        tabelaEventos.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        tabelaEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data", "Evento", "Cod"
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
        tabelaEventos.setRowHeight(25);
        jScrollPane3.setViewportView(tabelaEventos);
        if (tabelaEventos.getColumnModel().getColumnCount() > 0) {
            tabelaEventos.getColumnModel().getColumn(0).setPreferredWidth(250);
            tabelaEventos.getColumnModel().getColumn(1).setPreferredWidth(400);
            tabelaEventos.getColumnModel().getColumn(2).setPreferredWidth(70);
        }

        PainelPrincipal.add(jScrollPane3);
        jScrollPane3.setBounds(450, 40, 530, 330);

        jButton1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jButton1.setText("Dados");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jButton1);
        jButton1.setBounds(130, 490, 100, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEventoActionPerformed
        
        calendarioEvento.setDate(new Date());
        txtNomeEvento.setText("");
        txtDescricaoEvento.setText("");
        
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        txtHora.setText(sdf.format(new Date()));
        
        InternalFrameAddEvento.setVisible(true);
        txtNomeEvento.grabFocus();
        
    }//GEN-LAST:event_btnAddEventoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        InternalFrameAddEvento.dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        
        if (txtNomeEvento.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome do Evento!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else if (txtNomeEvento.getText().length() > 30)
        {
            JOptionPane.showMessageDialog(null, "Campo Nome do Evento excede o limite de caracteres!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            addEvento();
        }
        
    }//GEN-LAST:event_btnOkActionPerformed

    private void calendarioAnualPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarioAnualPropertyChange
        
        carregaEvento();
        
    }//GEN-LAST:event_calendarioAnualPropertyChange

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendario().setVisible(true);
            }
        });
    }
    
    //AQUI COMEÇAM OS MÉTODOS
    
    public void addEvento() {
        
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String Data = sdf.format(calendarioEvento.getDate());
            Data = Data + " " + txtHora.getText() + ":00";
            
            banco.conexaoBanco();
            ps = banco.con.prepareStatement("insert into calendario (Evento, Descricao, Data) values (?, ?, ?)");
            ps.setString(1, txtNomeEvento.getText());
            ps.setString(2, txtDescricaoEvento.getText());
            ps.setString(3, Data);
            ps.executeUpdate();
            
            ps.close();
            banco.fecharConexaoBanco();
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            
            carregaEvento();
            
            InternalFrameAddEvento.dispose();
        }
        catch (HeadlessException | SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void carregaEvento() {
        
        try
        {
            SimpleDateFormat dataInicio = new SimpleDateFormat("yyyy/MM/dd 00:00:00");
            String DataInicio = dataInicio.format(calendarioAnual.getDate());
            
            SimpleDateFormat dataFim = new SimpleDateFormat("yyyy/MM/dd 23:59:59");
            String DataFim = dataFim.format(calendarioAnual.getDate());
            
            SimpleDateFormat dateFormatBrasil = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String DataBrasil;
            
            int cont = 0;
            
            modelo = (DefaultTableModel) tabelaEventos.getModel();
            modelo.setRowCount(0);
            
            banco.conexaoBanco();
            rs = banco.st.executeQuery("select * from calendario where Data between '"+DataInicio+"' and '"+DataFim+"' "
                    + "and Excluido = 0 order by Data");
            while (rs.next())
            {
                DataBrasil = dateFormatBrasil.format(rs.getTimestamp("Data"));
                modelo.addRow(new Object[] {
                    DataBrasil,
                    rs.getString("Evento"),
                    rs.getString("Codigo_Evento")
                });
                
                cont = cont +1 ;
            }
            
            lblStatus.setText("Eventos cadastrados: "+cont);
            
            rs.close();
            banco.fecharConexaoBanco();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: "+e,"Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame InternalFrameAddEvento;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JButton btnAddEvento;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSair;
    private com.toedter.calendar.JCalendar calendarioAnual;
    private com.toedter.calendar.JDateChooser calendarioEvento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblImagemFundo1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tabelaEventos;
    private javax.swing.JTextArea txtDescricaoEvento;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JTextField txtNomeEvento;
    // End of variables declaration//GEN-END:variables
}
