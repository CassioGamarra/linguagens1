/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulorh;


import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author cassio
 */
public class FormCadastro extends javax.swing.JFrame {

    /**
     * Creates new form FormCadastro
     */
    public FormCadastro() {
        initComponents();
    }
    public int i = 0;
    //Sets e Gets dos componentes
    public JTable getTableInfo() {
        return tableInfo;
    }

    public void setTableInfo(JTable tableInfo) {
        this.tableInfo = tableInfo;
    }
    
    public ButtonGroup getBtnGroupEscolaridade() {
        return btnGroupEscolaridade;
    }

    public void setBtnGroupEscolaridade(ButtonGroup btnGroupEscolaridade) {
        this.btnGroupEscolaridade = btnGroupEscolaridade;
    }

    public ButtonGroup getBtnGroupEstadoCivil() {
        return btnGroupEstadoCivil;
    }

    public void setBtnGroupEstadoCivil(ButtonGroup btnGroupEstadoCivil) {
        this.btnGroupEstadoCivil = btnGroupEstadoCivil;
    }
    
    public JTextField getTextEmail() {
        return textEmail;
    }

    public void setTextEmail(JTextField textEmail) {
        this.textEmail = textEmail;
    }

    public JTextField getTextNome() {
        return textNome;
    }

    public void setTextNome(JTextField textNome) {
        this.textNome = textNome;
    }

    public JRadioButton getRadioCasado() {
        return radioCasado;
    }

    public void setRadioCasado(JRadioButton radioCasado) {
        this.radioCasado = radioCasado;
    }

    public JRadioButton getRadioSolteiro() {
        return radioSolteiro;
    }

    public void setRadioSolteiro(JRadioButton radioSolteiro) {
        this.radioSolteiro = radioSolteiro;
    }

    
    public JRadioButton getRadioFundamental() {
        return radioFundamental;
    }

    public void setRadioFundamental(JRadioButton radioFundamental) {
        this.radioFundamental = radioFundamental;
    }

    public JRadioButton getRadioMedio() {
        return radioMedio;
    }

    public void setRadioMedio(JRadioButton radioMedio) {
        this.radioMedio = radioMedio;
    }

    public JRadioButton getRadioSuperior() {
        return radioSuperior;
    }

    public void setRadioSuperior(JRadioButton radioSuperior) {
        this.radioSuperior = radioSuperior;
    }
    
    
    
    public JComboBox getComboBoxCidade() {
        return comboBoxCidade;
    }

    public void setComboBoxCidade(JComboBox comboBoxCidade) {
        this.comboBoxCidade = comboBoxCidade;
    }

    public JComboBox getComboBoxUF() {
        return comboBoxUF;
    }

    public void setComboBoxUF(JComboBox comboBoxUF) {
        this.comboBoxUF = comboBoxUF;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupEstadoCivil = new javax.swing.ButtonGroup();
        btnGroupEscolaridade = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        panelEscolaridade = new javax.swing.JPanel();
        radioFundamental = new javax.swing.JRadioButton();
        radioMedio = new javax.swing.JRadioButton();
        radioSuperior = new javax.swing.JRadioButton();
        panelEstadoCivil = new javax.swing.JPanel();
        radioSolteiro = new javax.swing.JRadioButton();
        radioCasado = new javax.swing.JRadioButton();
        panelPerfil = new javax.swing.JPanel();
        checkBoxPerfil1 = new javax.swing.JCheckBox();
        checkBoxPerfil2 = new javax.swing.JCheckBox();
        checkBoxPerfil3 = new javax.swing.JCheckBox();
        panelCidadeUF = new javax.swing.JPanel();
        comboBoxUF = new javax.swing.JComboBox();
        comboBoxCidade = new javax.swing.JComboBox();
        panelFooter = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();

        jDialog1.setMaximumSize(new java.awt.Dimension(400, 300));
        jDialog1.setMinimumSize(new java.awt.Dimension(400, 300));

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableInfo);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Módulo RH - UFN Systems");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(860, 600));
        setMinimumSize(new java.awt.Dimension(860, 600));
        setPreferredSize(new java.awt.Dimension(860, 600));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UFN Systems");

        textNome.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        textNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do Colaborador"));
        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        textEmail.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        textEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email:"));

        panelEscolaridade.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolaridade:"));

        btnGroupEscolaridade.add(radioFundamental);
        radioFundamental.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        radioFundamental.setText("Ensino Fundamental");
        radioFundamental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFundamentalActionPerformed(evt);
            }
        });

        btnGroupEscolaridade.add(radioMedio);
        radioMedio.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        radioMedio.setText("Ensino Médio");

        btnGroupEscolaridade.add(radioSuperior);
        radioSuperior.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        radioSuperior.setText("Ensino Superior");

        javax.swing.GroupLayout panelEscolaridadeLayout = new javax.swing.GroupLayout(panelEscolaridade);
        panelEscolaridade.setLayout(panelEscolaridadeLayout);
        panelEscolaridadeLayout.setHorizontalGroup(
            panelEscolaridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscolaridadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEscolaridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(radioMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioFundamental, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(radioSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelEscolaridadeLayout.setVerticalGroup(
            panelEscolaridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEscolaridadeLayout.createSequentialGroup()
                .addComponent(radioFundamental, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Civil:"));

        btnGroupEstadoCivil.add(radioSolteiro);
        radioSolteiro.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        radioSolteiro.setText("Solteiro");
        radioSolteiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSolteiroActionPerformed(evt);
            }
        });

        btnGroupEstadoCivil.add(radioCasado);
        radioCasado.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        radioCasado.setText("Casado");

        javax.swing.GroupLayout panelEstadoCivilLayout = new javax.swing.GroupLayout(panelEstadoCivil);
        panelEstadoCivil.setLayout(panelEstadoCivilLayout);
        panelEstadoCivilLayout.setHorizontalGroup(
            panelEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(radioCasado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(radioSolteiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelEstadoCivilLayout.setVerticalGroup(
            panelEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoCivilLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(radioSolteiro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioCasado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        panelPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Perfil"));

        checkBoxPerfil1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        checkBoxPerfil1.setText("Experiência em TI");
        checkBoxPerfil1.setMaximumSize(new java.awt.Dimension(135, 23));
        checkBoxPerfil1.setMinimumSize(new java.awt.Dimension(135, 23));
        checkBoxPerfil1.setPreferredSize(new java.awt.Dimension(135, 23));

        checkBoxPerfil2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        checkBoxPerfil2.setText("Liderança");

        checkBoxPerfil3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        checkBoxPerfil3.setText("Trabalho em Equipe");

        javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(panelPerfil);
        panelPerfil.setLayout(panelPerfilLayout);
        panelPerfilLayout.setHorizontalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkBoxPerfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(checkBoxPerfil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(checkBoxPerfil3, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );
        panelPerfilLayout.setVerticalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addComponent(checkBoxPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxPerfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxPerfil3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCidadeUF.setBorder(javax.swing.BorderFactory.createTitledBorder("Cidade e Estado"));

        comboBoxUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "RIO GRANDE DO SUL", "SANTA CATARINA", "PARANÁ" }));
        comboBoxUF.setToolTipText("");
        comboBoxUF.setBorder(javax.swing.BorderFactory.createTitledBorder("UF"));
        comboBoxUF.setName(""); // NOI18N
        comboBoxUF.setPrototypeDisplayValue("TESTE");
        comboBoxUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxUFActionPerformed(evt);
            }
        });

        comboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE" }));
        comboBoxCidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Cidade"));

        javax.swing.GroupLayout panelCidadeUFLayout = new javax.swing.GroupLayout(panelCidadeUF);
        panelCidadeUF.setLayout(panelCidadeUFLayout);
        panelCidadeUFLayout.setHorizontalGroup(
            panelCidadeUFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comboBoxUF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(comboBoxCidade, javax.swing.GroupLayout.Alignment.TRAILING, 0, 327, Short.MAX_VALUE)
        );
        panelCidadeUFLayout.setVerticalGroup(
            panelCidadeUFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCidadeUFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelFooterLayout = new javax.swing.GroupLayout(panelFooter);
        panelFooter.setLayout(panelFooterLayout);
        panelFooterLayout.setHorizontalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        panelFooterLayout.setVerticalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        btnCadastrar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnCadastrar)
                            .addComponent(jLabel1))
                        .addGap(65, 65, 65)
                        .addComponent(panelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelCidadeUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEscolaridade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCidadeUF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(315, 315, 315))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void radioSolteiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSolteiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSolteiroActionPerformed

    private void radioFundamentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFundamentalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFundamentalActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Cadastro cadastro = new Cadastro();
        
        if(cadastro.validarCadastro(this, i)){
            textNome.setText("");
            textEmail.setText("");
            comboBoxUF.setSelectedIndex(0);
            jDialog1.setLocationRelativeTo(null);
            jDialog1.show(true);
            i++;
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void comboBoxUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxUFActionPerformed
        Cadastro cadastro = new Cadastro();
        
        cadastro.listarCidades(this);
    }//GEN-LAST:event_comboBoxUFActionPerformed

    private void tableInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInfoMouseClicked
        int i = tableInfo.getSelectedRow();
        
        textNome.setText(tableInfo.getValueAt(i,0).toString());
        textEmail.setText(tableInfo.getValueAt(i,1).toString());
        comboBoxCidade.setSelectedItem(tableInfo.getValueAt(i,2));
        comboBoxUF.setSelectedItem(tableInfo.getValueAt(i,3));
    }//GEN-LAST:event_tableInfoMouseClicked

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
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup btnGroupEscolaridade;
    private javax.swing.ButtonGroup btnGroupEstadoCivil;
    private javax.swing.JCheckBox checkBoxPerfil1;
    private javax.swing.JCheckBox checkBoxPerfil2;
    private javax.swing.JCheckBox checkBoxPerfil3;
    private javax.swing.JComboBox comboBoxCidade;
    private javax.swing.JComboBox comboBoxUF;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCidadeUF;
    private javax.swing.JPanel panelEscolaridade;
    private javax.swing.JPanel panelEstadoCivil;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelPerfil;
    private javax.swing.JRadioButton radioCasado;
    private javax.swing.JRadioButton radioFundamental;
    private javax.swing.JRadioButton radioMedio;
    private javax.swing.JRadioButton radioSolteiro;
    private javax.swing.JRadioButton radioSuperior;
    private javax.swing.JTable tableInfo;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}
