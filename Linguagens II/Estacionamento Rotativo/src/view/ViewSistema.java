package view;

import controller.ControllerConfig;
import controller.ControllerEntradaSaida;
import controller.ControllerHistorico;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cassio
 */
public class ViewSistema extends javax.swing.JFrame {

    /**
     * Creates new form ViewPainelAdministrador
     */
    public ViewSistema() {
        initComponents();
    }
     //Getter

    public JTable getTabelaHistorico() {
        return tabelaHistorico;
    }

    public JTextField getFieldPlacaEntrada() {
        return fieldPlaca;
    }

    public JComboBox<String> getFieldTipoVeiculo() {
        return comboTipoVeiculo;
    }
    
    
    public JButton getBtnSalvarConfig() {
        return btnSalvarConfig;
    }
    
    public JTextField getFieldNomeGaragem() {
        return fieldNomeGaragem;
    }
 
    public JTextField getFieldQtdVagas() {    
        return fieldQtdVagas;
    }

    public JLabel getLabelNomeGaragem() {
        return labelNomeGaragem;
    }

    public JFrame getViewEntrada() {
        return ViewGerenciamento;
    }

    public JTable getTabelaVagas() {
        return tabelaVagas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewGerenciamento = new javax.swing.JFrame();
        panelEntrada = new javax.swing.JPanel();
        fieldPlaca = new javax.swing.JTextField();
        comboTipoVeiculo = new javax.swing.JComboBox<>();
        btnEntrada = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaVagas = new javax.swing.JTable();
        btnSaida = new javax.swing.JButton();
        ViewPainelAdm = new javax.swing.JTabbedPane();
        GuiaPrincipal = new javax.swing.JPanel();
        btnGerenciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelNomeGaragem = new javax.swing.JLabel();
        GuiaHistorico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHistorico = new javax.swing.JTable();
        GuiaConfig = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalvarConfig = new javax.swing.JButton();
        fieldQtdVagas = new javax.swing.JTextField();
        fieldNomeGaragem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        GuiaSobre = new javax.swing.JPanel();

        ViewGerenciamento.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        ViewGerenciamento.setMinimumSize(new java.awt.Dimension(580, 480));

        panelEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GERENCIADOR - ENTRADA E SAÍDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        fieldPlaca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PLACA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        comboTipoVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Carro", "Caminhão", "Moto", "Ônibus" }));
        comboTipoVeiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        comboTipoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoVeiculoActionPerformed(evt);
            }
        });

        btnEntrada.setText("ENTRADA");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VAGAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tabelaVagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VAGA", "PLACA", "TIPO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tabelaVagas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaVagasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaVagas);

        btnSaida.setText("SAÍDA");
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEntradaLayout = new javax.swing.GroupLayout(panelEntrada);
        panelEntrada.setLayout(panelEntradaLayout);
        panelEntradaLayout.setHorizontalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldPlaca)
                    .addComponent(comboTipoVeiculo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEntradaLayout.createSequentialGroup()
                        .addComponent(btnEntrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEntradaLayout.setVerticalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrada)
                    .addComponent(btnVoltar)
                    .addComponent(btnSaida))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ViewGerenciamentoLayout = new javax.swing.GroupLayout(ViewGerenciamento.getContentPane());
        ViewGerenciamento.getContentPane().setLayout(ViewGerenciamentoLayout);
        ViewGerenciamentoLayout.setHorizontalGroup(
            ViewGerenciamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewGerenciamentoLayout.createSequentialGroup()
                .addComponent(panelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ViewGerenciamentoLayout.setVerticalGroup(
            ViewGerenciamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 500));
        setMinimumSize(new java.awt.Dimension(1024, 500));

        ViewPainelAdm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        GuiaPrincipal.setBackground(new java.awt.Color(1, 96, 173));
        GuiaPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        btnGerenciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGerenciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnGerenciar.png"))); // NOI18N
        btnGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(189, 219, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sistema.png"))); // NOI18N

        labelNomeGaragem.setBackground(new java.awt.Color(255, 255, 255));
        labelNomeGaragem.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        labelNomeGaragem.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeGaragem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout GuiaPrincipalLayout = new javax.swing.GroupLayout(GuiaPrincipal);
        GuiaPrincipal.setLayout(GuiaPrincipalLayout);
        GuiaPrincipalLayout.setHorizontalGroup(
            GuiaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuiaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GuiaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeGaragem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        GuiaPrincipalLayout.setVerticalGroup(
            GuiaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuiaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNomeGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        ViewPainelAdm.addTab("ESTACIONAMENTO", GuiaPrincipal);

        GuiaHistorico.setBackground(new java.awt.Color(1, 96, 173));

        tabelaHistorico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabelaHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLACA", "VAGA", "DATA ENTRADA", "HORA ENTRADA", "DATA SAÍDA", "HORA SAÍDA", "TIPO VEÍCULO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaHistorico.setEnabled(false);
        jScrollPane1.setViewportView(tabelaHistorico);

        javax.swing.GroupLayout GuiaHistoricoLayout = new javax.swing.GroupLayout(GuiaHistorico);
        GuiaHistorico.setLayout(GuiaHistoricoLayout);
        GuiaHistoricoLayout.setHorizontalGroup(
            GuiaHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1228, Short.MAX_VALUE)
        );
        GuiaHistoricoLayout.setVerticalGroup(
            GuiaHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        ViewPainelAdm.addTab("HISTÓRICO", GuiaHistorico);

        GuiaConfig.setBackground(new java.awt.Color(1, 96, 173));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/config.png"))); // NOI18N

        btnSalvarConfig.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvarConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalvar.png"))); // NOI18N
        btnSalvarConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarConfigActionPerformed(evt);
            }
        });

        fieldQtdVagas.setBackground(new java.awt.Color(189, 219, 255));
        fieldQtdVagas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fieldQtdVagas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° DE VAGAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        fieldQtdVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldQtdVagasActionPerformed(evt);
            }
        });

        fieldNomeGaragem.setBackground(new java.awt.Color(189, 219, 255));
        fieldNomeGaragem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fieldNomeGaragem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOME DA GARAGEM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        fieldNomeGaragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeGaragemActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/config.png"))); // NOI18N

        javax.swing.GroupLayout GuiaConfigLayout = new javax.swing.GroupLayout(GuiaConfig);
        GuiaConfig.setLayout(GuiaConfigLayout);
        GuiaConfigLayout.setHorizontalGroup(
            GuiaConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuiaConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GuiaConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuiaConfigLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldQtdVagas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuiaConfigLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldNomeGaragem))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuiaConfigLayout.createSequentialGroup()
                        .addGap(0, 1066, Short.MAX_VALUE)
                        .addComponent(btnSalvarConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        GuiaConfigLayout.setVerticalGroup(
            GuiaConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuiaConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GuiaConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldNomeGaragem)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GuiaConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldQtdVagas)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        ViewPainelAdm.addTab("CONFIGURAÇÕES", GuiaConfig);

        javax.swing.GroupLayout GuiaSobreLayout = new javax.swing.GroupLayout(GuiaSobre);
        GuiaSobre.setLayout(GuiaSobreLayout);
        GuiaSobreLayout.setHorizontalGroup(
            GuiaSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1228, Short.MAX_VALUE)
        );
        GuiaSobreLayout.setVerticalGroup(
            GuiaSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        ViewPainelAdm.addTab("SOBRE", GuiaSobre);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewPainelAdm)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewPainelAdm)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTipoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoVeiculoActionPerformed

    private void fieldQtdVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldQtdVagasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldQtdVagasActionPerformed

    private void btnSalvarConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarConfigActionPerformed
        // TODO add your handling code here:
       ControllerConfig configurar = new ControllerConfig();
       configurar.configurarGaragem(fieldNomeGaragem.getText(), Integer.parseInt(fieldQtdVagas.getText()));
       configurar.buscarConfig(this);
    }//GEN-LAST:event_btnSalvarConfigActionPerformed

    private void btnGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarActionPerformed
            // TODO add your handling code here:
        ViewGerenciamento.setLocationRelativeTo(null);
        ViewGerenciamento.setVisible(true);
    }//GEN-LAST:event_btnGerenciarActionPerformed

    private void fieldNomeGaragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeGaragemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomeGaragemActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        ViewGerenciamento.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        // TODO add your handling code here:
        ControllerEntradaSaida entradaSaida = new ControllerEntradaSaida();
        String msg = "";
        msg = entradaSaida.entradaGaragem(this);
        if(!msg.equals("")){
            JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed
        // TODO add your handling code here:
        ControllerEntradaSaida entradaSaida = new ControllerEntradaSaida();
        ControllerHistorico historico = new ControllerHistorico();
        String msg = "";
        msg = entradaSaida.saidaGaragem(this);
        if(!msg.equals("")){
            JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_btnSaidaActionPerformed

    private void tabelaVagasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVagasMouseClicked
        // TODO add your handling code here:
        String placa, tipo;
        try {
            placa = tabelaVagas.getValueAt(tabelaVagas.getSelectedRow(), 1).toString();
            tipo = tabelaVagas.getValueAt(tabelaVagas.getSelectedRow(), 2).toString();
            if(!placa.equals("")){
                fieldPlaca.setText(placa);
                comboTipoVeiculo.setSelectedItem(tipo);
                
            } 
        } 
        catch (Exception e) {
            fieldPlaca.setText("");
            comboTipoVeiculo.setSelectedItem("Selecione");
        }
    }//GEN-LAST:event_tabelaVagasMouseClicked

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
            java.util.logging.Logger.getLogger(ViewSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GuiaConfig;
    private javax.swing.JPanel GuiaHistorico;
    private javax.swing.JPanel GuiaPrincipal;
    private javax.swing.JPanel GuiaSobre;
    private javax.swing.JFrame ViewGerenciamento;
    private javax.swing.JTabbedPane ViewPainelAdm;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnGerenciar;
    private javax.swing.JButton btnSaida;
    private javax.swing.JButton btnSalvarConfig;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboTipoVeiculo;
    private javax.swing.JTextField fieldNomeGaragem;
    private javax.swing.JTextField fieldPlaca;
    private javax.swing.JTextField fieldQtdVagas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNomeGaragem;
    private javax.swing.JPanel panelEntrada;
    private javax.swing.JTable tabelaHistorico;
    private javax.swing.JTable tabelaVagas;
    // End of variables declaration//GEN-END:variables
}