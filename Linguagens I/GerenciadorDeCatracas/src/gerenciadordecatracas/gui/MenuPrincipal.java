/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordecatracas.gui;


import gerenciadordecatracas.gerenciamento.Cadastro;
import gerenciadordecatracas.gerenciamento.Historico;
import java.sql.SQLException;

/**
 *
 * @author CassioGamarra
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrameInicio
     */
    public MenuPrincipal() {
        initComponents();
    }
    //Classes utilizadas
    Historico historico = new Historico();
    
    //
    String nomeCampo = "";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogExcluidos = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textPanelExcluidos = new javax.swing.JTextPane();
        btnFecharExcluidos = new javax.swing.JButton();
        dialogAtivos = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPanelAtivos = new javax.swing.JTextPane();
        btnFecharAtivos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnPessoas = new javax.swing.JButton();
        btnCatracas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAtivos = new javax.swing.JButton();
        btnExcluidos = new javax.swing.JButton();
        btnHistEntrada = new javax.swing.JButton();
        btnHistSaida = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        textPanelHistorico = new javax.swing.JTextPane();
        btnResetar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        dialogExcluidos.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogExcluidos.setTitle("HISTÓRICO");
        dialogExcluidos.setAlwaysOnTop(true);
        dialogExcluidos.setBackground(new java.awt.Color(255, 255, 255));
        dialogExcluidos.setMinimumSize(new java.awt.Dimension(400, 500));
        dialogExcluidos.setResizable(false);
        dialogExcluidos.setLocationRelativeTo(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("USUÁRIOS EXCLUÍDOS");

        textPanelExcluidos.setEditable(false);
        jScrollPane3.setViewportView(textPanelExcluidos);

        btnFecharExcluidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFecharExcluidos.setText("FECHAR");
        btnFecharExcluidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharExcluidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogExcluidosLayout = new javax.swing.GroupLayout(dialogExcluidos.getContentPane());
        dialogExcluidos.getContentPane().setLayout(dialogExcluidosLayout);
        dialogExcluidosLayout.setHorizontalGroup(
            dialogExcluidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogExcluidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogExcluidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnFecharExcluidos)
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        dialogExcluidosLayout.setVerticalGroup(
            dialogExcluidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogExcluidosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFecharExcluidos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dialogAtivos.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogAtivos.setTitle("HISTÓRICO");
        dialogAtivos.setAlwaysOnTop(true);
        dialogAtivos.setBackground(new java.awt.Color(255, 255, 255));
        dialogAtivos.setMinimumSize(new java.awt.Dimension(400, 500));
        dialogAtivos.setResizable(false);
        dialogAtivos.setLocationRelativeTo(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USUÁRIOS ATIVOS");

        textPanelAtivos.setEditable(false);
        jScrollPane1.setViewportView(textPanelAtivos);

        btnFecharAtivos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFecharAtivos.setText("FECHAR");
        btnFecharAtivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharAtivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogAtivosLayout = new javax.swing.GroupLayout(dialogAtivos.getContentPane());
        dialogAtivos.getContentPane().setLayout(dialogAtivosLayout);
        dialogAtivosLayout.setHorizontalGroup(
            dialogAtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAtivosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogAtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnFecharAtivos)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        dialogAtivosLayout.setVerticalGroup(
            dialogAtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAtivosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFecharAtivos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROJETO FINAL ");
        setMinimumSize(new java.awt.Dimension(340, 230));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerenciadordecatracas/gui/pessoa.png"))); // NOI18N
        btnPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoasActionPerformed(evt);
            }
        });

        btnCatracas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerenciadordecatracas/gui/catraca.png"))); // NOI18N
        btnCatracas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatracasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PESSOAS");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CATRACAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCatracas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCatracas)
                    .addComponent(btnPessoas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INÍCIO", jPanel1);

        btnAtivos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtivos.setText("ATIVOS");
        btnAtivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivosActionPerformed(evt);
            }
        });

        btnExcluidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluidos.setText("EXCLUÍDOS");
        btnExcluidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluidosActionPerformed(evt);
            }
        });

        btnHistEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHistEntrada.setText("ENTRADA");
        btnHistEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistEntradaActionPerformed(evt);
            }
        });

        btnHistSaida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHistSaida.setText("SAÍDA");
        btnHistSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistSaidaActionPerformed(evt);
            }
        });

        scrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GERENCIADOR DE CATRACAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        textPanelHistorico.setEditable(false);
        textPanelHistorico.setBorder(null);
        textPanelHistorico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scrollPane.setViewportView(textPanelHistorico);

        btnResetar.setText("RESETAR EXCLUÍDOS");
        btnResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetarActionPerformed(evt);
            }
        });
        btnResetar.setVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExcluidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAtivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHistEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHistSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnResetar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAtivos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluidos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHistEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHistSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HISTÓRICO", jPanel2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Sobre");
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("SOBRE", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharAtivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharAtivosActionPerformed
        dialogAtivos.dispose();
    }//GEN-LAST:event_btnFecharAtivosActionPerformed

    private void btnFecharExcluidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharExcluidosActionPerformed
        dialogExcluidos.dispose();
    }//GEN-LAST:event_btnFecharExcluidosActionPerformed

    private void btnAtivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivosActionPerformed
        btnResetar.setVisible(false);
        textPanelHistorico.setText(historico.ativos());
        nomeCampo = "USUÁRIOS ATIVOS";
        scrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, nomeCampo, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)));
    }//GEN-LAST:event_btnAtivosActionPerformed

    private void btnPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoasActionPerformed
        new MenuPessoas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPessoasActionPerformed

    private void btnExcluidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluidosActionPerformed
        textPanelHistorico.setText(historico.excluidos());
        nomeCampo = "USUÁRIOS EXCLUÍDOS";
        scrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, nomeCampo, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)));
        if(!textPanelHistorico.getText().equals("SEM HISTÓRICO")){
            btnResetar.setVisible(true);
        }
    }//GEN-LAST:event_btnExcluidosActionPerformed

    private void btnHistEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistEntradaActionPerformed
        btnResetar.setVisible(false);
        textPanelHistorico.setText(historico.historicoEntrada());
        nomeCampo = "HISTÓRICO DE ENTRADA";
        scrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, nomeCampo, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)));
    }//GEN-LAST:event_btnHistEntradaActionPerformed

    private void btnHistSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistSaidaActionPerformed
        btnResetar.setVisible(false);
        textPanelHistorico.setText(historico.historicoSaida());
        nomeCampo = "HISTÓRICO DE SAÍDA";
        scrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, nomeCampo, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)));
    }//GEN-LAST:event_btnHistSaidaActionPerformed

    private void btnResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetarActionPerformed
        Cadastro cadastro = new Cadastro();
        cadastro.resetarExcluidos();
        textPanelHistorico.setText(historico.excluidos());
        btnResetar.setVisible(false);
    }//GEN-LAST:event_btnResetarActionPerformed

    private void btnCatracasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatracasActionPerformed
        new MenuCatracas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCatracasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
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
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtivos;
    private javax.swing.JButton btnCatracas;
    private javax.swing.JButton btnExcluidos;
    private javax.swing.JButton btnFecharAtivos;
    private javax.swing.JButton btnFecharExcluidos;
    private javax.swing.JButton btnHistEntrada;
    private javax.swing.JButton btnHistSaida;
    private javax.swing.JButton btnPessoas;
    private javax.swing.JButton btnResetar;
    private javax.swing.JDialog dialogAtivos;
    private javax.swing.JDialog dialogExcluidos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextPane textPanelAtivos;
    private javax.swing.JTextPane textPanelExcluidos;
    private javax.swing.JTextPane textPanelHistorico;
    // End of variables declaration//GEN-END:variables
}
