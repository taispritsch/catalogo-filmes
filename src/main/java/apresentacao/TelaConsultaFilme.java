/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.Filme;
import persistencia.FilmeControle;

/**
 *
 * @author tais
 */
public class TelaConsultaFilme extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultaFilme
     */
    
    private TelaCadastroFilmes telaCadastroFilme;
    
    public TelaConsultaFilme() {
        initComponents();
    }
    
    public TelaConsultaFilme(TelaCadastroFilmes telaCadastroFilme){
        this.telaCadastroFilme = telaCadastroFilme;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buscarFilme = new javax.swing.JTextField();
        btnBuscarFilme = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsultaFilme = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnVoltarTelaCadastro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharJanela(evt);
            }
        });

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setForeground(new java.awt.Color(153, 153, 153));
        panel.setPreferredSize(new java.awt.Dimension(559, 454));

        jLabel2.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Informe o Título do filme:");

        buscarFilme.setBackground(new java.awt.Color(204, 204, 204));
        buscarFilme.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        buscarFilme.setForeground(new java.awt.Color(0, 0, 0));
        buscarFilme.setToolTipText("Informe o nome do filme"); // NOI18N
        buscarFilme.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        buscarFilme.setHighlighter(null);
        buscarFilme.setSelectionColor(new java.awt.Color(0, 0, 0));
        buscarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarFilmeActionPerformed(evt);
            }
        });

        btnBuscarFilme.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarFilme.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 12)); // NOI18N
        btnBuscarFilme.setForeground(new java.awt.Color(204, 204, 204));
        btnBuscarFilme.setText("Pesquisar");
        btnBuscarFilme.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnBuscarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFilme(evt);
            }
        });

        tabelaConsultaFilme.setBackground(new java.awt.Color(204, 204, 204));
        tabelaConsultaFilme.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null, new java.awt.Color(255, 255, 255)));
        tabelaConsultaFilme.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 12)); // NOI18N
        tabelaConsultaFilme.setForeground(new java.awt.Color(0, 0, 0));
        tabelaConsultaFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Título", "Sinopse", "Duração"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        tabelaConsultaFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConsultaFilmeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaConsultaFilme);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Consulta Filmes");

        btnVoltarTelaCadastro.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltarTelaCadastro.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 12)); // NOI18N
        btnVoltarTelaCadastro.setForeground(new java.awt.Color(204, 204, 204));
        btnVoltarTelaCadastro.setText("Voltar");
        btnVoltarTelaCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnVoltarTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTelaCadastroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("**Clique duas vezes sobre o registro para editar.");

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/tais/Imagens/lupa_1.png")); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(buscarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btnBuscarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnVoltarTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addGap(33, 33, 33)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buscarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(btnVoltarTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buscarFilme.getAccessibleContext().setAccessibleName("aaaa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarFilmeActionPerformed

    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
        this.dispose();
        this.telaCadastroFilme.setVisible(true);
    }//GEN-LAST:event_fecharJanela

    private void tabelaConsultaFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConsultaFilmeMouseClicked
        if(evt.getClickCount() == 2){
            Integer codFilme = (Integer) tabelaConsultaFilme.getModel().getValueAt(tabelaConsultaFilme.getSelectedRow(), 0);
            String titulo = (String) tabelaConsultaFilme.getModel().getValueAt(tabelaConsultaFilme.getSelectedRow(), 1);
            String sinopse = (String) tabelaConsultaFilme.getModel().getValueAt(tabelaConsultaFilme.getSelectedRow(), 2);
            Integer duracao = (Integer) tabelaConsultaFilme.getModel().getValueAt(tabelaConsultaFilme.getSelectedRow(), 3);
       
            this.telaCadastroFilme.buscarFilmes(codFilme, titulo, sinopse, duracao);
            this.telaCadastroFilme.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_tabelaConsultaFilmeMouseClicked

    private void consultarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFilme
        String nome = buscarFilme.getText();
        DefaultTableModel tableModel = (DefaultTableModel) tabelaConsultaFilme.getModel();
        tableModel.setRowCount(0);
        FilmeControle filmeControle = new FilmeControle();
        try{
            ArrayList<Filme> filmes = filmeControle.listarFilmes(nome);
            filmes.forEach((Filme filme) ->{
                tableModel.addRow(new Object [] {
                    filme.getCodFilme(),
                    filme.getTitulo(),
                    filme.getSinopse(),
                    filme.getDuracao()});
        });
        tabelaConsultaFilme.setModel(tableModel);
        }catch(Exception e){
            System.out.println("Errooooo");
        }
    }//GEN-LAST:event_consultarFilme

    private void btnVoltarTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTelaCadastroActionPerformed
        new TelaCadastroFilmes().show();
        this.dispose();
    }//GEN-LAST:event_btnVoltarTelaCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConsultaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarFilme;
    private javax.swing.JButton btnVoltarTelaCadastro;
    private javax.swing.JTextField buscarFilme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabelaConsultaFilme;
    // End of variables declaration//GEN-END:variables
}
