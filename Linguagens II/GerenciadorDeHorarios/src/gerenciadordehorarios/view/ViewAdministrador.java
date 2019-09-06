/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordehorarios.view;

import gerenciadordehorarios.controller.ControllerHorario;
import gerenciadordehorarios.controller.ControllerTurma;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author CPD
 */
public class ViewAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form ViewAdministrador
     */
    public ViewAdministrador() {
        initComponents();
    }
    //Gets
    
    //View Horarios
    public JFrame getViewHorarios() {    
        return ViewHorarios;
    }

    public JComboBox<String> getComboNivelHorarios() {
        return comboNivelHorarios;
    }

    public JComboBox<String> getComboTurmaHorarios() {
        return comboTurmaHorarios;
    }

    public JComboBox<String> getComboTurnoHorarios() {
        return comboTurnoHorarios;
    }
    
    public JTable getTabelaHorarios() {
        return tabelaHorarios;
    }
    

    //Turmas
    public JComboBox<String> getComboNivelTurma() {
        return comboNivelTurma;
    }

    public JComboBox<String> getComboTurnoTurma() {
        return comboTurnoTurma;
    }

    public JTextField getFieldTurmaTurma() {
        return fieldTurmaTurma;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewDisciplinas = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        ViewTurmas = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnVoltarTurma = new javax.swing.JButton();
        btnCadastrarTurma = new javax.swing.JButton();
        comboNivelTurma = new javax.swing.JComboBox<>();
        fieldTurmaTurma = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboTurnoTurma = new javax.swing.JComboBox<>();
        ViewHorarios = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboNivelHorarios = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHorarios = new javax.swing.JTable();
        comboTurmaHorarios = new javax.swing.JComboBox<>();
        comboTurnoHorarios = new javax.swing.JComboBox<>();
        btnAlterarHorarios = new javax.swing.JButton();
        btnCarregarHorarios = new javax.swing.JButton();
        btnVoltarHorarios = new javax.swing.JButton();
        panelAdm = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCadastrarTurmas = new javax.swing.JButton();
        btnCadastrarDisciplinas = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();
        lblDisciplinas = new javax.swing.JLabel();
        lblTurmas = new javax.swing.JLabel();
        lblMenuPrincipal = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRAR DISCIPLINAS");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DISCIPLINA:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-list.png"))); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SIGLA:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2))))
                        .addGap(35, 35, 35)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout ViewDisciplinasLayout = new javax.swing.GroupLayout(ViewDisciplinas.getContentPane());
        ViewDisciplinas.getContentPane().setLayout(ViewDisciplinasLayout);
        ViewDisciplinasLayout.setHorizontalGroup(
            ViewDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewDisciplinasLayout.setVerticalGroup(
            ViewDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ViewTurmas.setMaximumSize(new java.awt.Dimension(480, 320));
        ViewTurmas.setMinimumSize(new java.awt.Dimension(480, 320));
        ViewTurmas.setPreferredSize(new java.awt.Dimension(480, 320));
        ViewTurmas.setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CADASTRAR TURMAS");

        btnVoltarTurma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVoltarTurma.setText("VOLTAR");
        btnVoltarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTurmaActionPerformed(evt);
            }
        });

        btnCadastrarTurma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadastrarTurma.setText("CADASTRAR");
        btnCadastrarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarTurmaActionPerformed(evt);
            }
        });

        comboNivelTurma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboNivelTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "EM", "EF" }));
        comboNivelTurma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NÍVEL:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        fieldTurmaTurma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fieldTurmaTurma.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "TURMA:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-class.png"))); // NOI18N

        comboTurnoTurma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboTurnoTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "MANHÃ", "TARDE" }));
        comboTurnoTurma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TURNO:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCadastrarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnVoltarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fieldTurmaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboNivelTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTurnoTurma, 0, 143, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldTurmaTurma, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(comboNivelTurma)
                    .addComponent(comboTurnoTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarTurma)
                    .addComponent(btnVoltarTurma))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout ViewTurmasLayout = new javax.swing.GroupLayout(ViewTurmas.getContentPane());
        ViewTurmas.getContentPane().setLayout(ViewTurmasLayout);
        ViewTurmasLayout.setHorizontalGroup(
            ViewTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewTurmasLayout.setVerticalGroup(
            ViewTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ViewHorarios.setMaximumSize(new java.awt.Dimension(500, 450));
        ViewHorarios.setMinimumSize(new java.awt.Dimension(500, 450));
        ViewHorarios.setPreferredSize(new java.awt.Dimension(500, 450));
        ViewHorarios.setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ALTERAR HORÁRIOS");

        comboNivelHorarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboNivelHorarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "ENSINO FUNDAMENTAL", "ENSINO MÉDIO" }));
        comboNivelHorarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NÍVEL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tabelaHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HORÁRIO", "SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaHorarios);

        comboTurmaHorarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboTurmaHorarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        comboTurmaHorarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TURMA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        comboTurmaHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTurmaHorariosActionPerformed(evt);
            }
        });

        comboTurnoHorarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboTurnoHorarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "MANHÃ", "TARDE" }));
        comboTurnoHorarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TURNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        comboTurnoHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTurnoHorariosActionPerformed(evt);
            }
        });

        btnAlterarHorarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterarHorarios.setText("ALTERAR");
        btnAlterarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarHorariosActionPerformed(evt);
            }
        });

        btnCarregarHorarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCarregarHorarios.setText("CARREGAR");
        btnCarregarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarHorariosActionPerformed(evt);
            }
        });

        btnVoltarHorarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltarHorarios.setText("VOLTAR");
        btnVoltarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarHorariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCarregarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comboNivelHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTurmaHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTurnoHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAlterarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboNivelHorarios)
                    .addComponent(comboTurmaHorarios)
                    .addComponent(comboTurnoHorarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarregarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout ViewHorariosLayout = new javax.swing.GroupLayout(ViewHorarios.getContentPane());
        ViewHorarios.getContentPane().setLayout(ViewHorariosLayout);
        ViewHorariosLayout.setHorizontalGroup(
            ViewHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewHorariosLayout.setVerticalGroup(
            ViewHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAdm.setMaximumSize(new java.awt.Dimension(691, 227));
        panelAdm.setMinimumSize(new java.awt.Dimension(691, 227));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PAINEL DO ADMINISTRADOR");

        btnCadastrarTurmas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrarTurmas.setText("CADASTRAR TURMAS");
        btnCadastrarTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarTurmasActionPerformed(evt);
            }
        });

        btnCadastrarDisciplinas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrarDisciplinas.setText("CADASTRAR DISCIPLINAS");

        btnMenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMenuPrincipal.setText("ALTERAR HORÁRIOS");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        lblDisciplinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisciplinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-list.png"))); // NOI18N

        lblTurmas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTurmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-class.png"))); // NOI18N

        lblMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-menu.png"))); // NOI18N

        javax.swing.GroupLayout panelAdmLayout = new javax.swing.GroupLayout(panelAdm);
        panelAdm.setLayout(panelAdmLayout);
        panelAdmLayout.setHorizontalGroup(
            panelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrarDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(panelAdmLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        panelAdmLayout.setVerticalGroup(
            panelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTurmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarTurmas)
                    .addComponent(btnCadastrarDisciplinas)
                    .addComponent(btnMenuPrincipal))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ViewHorarios.setLocationRelativeTo(null);
        ViewHorarios.setVisible(true);
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCadastrarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarTurmaActionPerformed
        // TODO add your handling code here:
        ControllerTurma turma = new ControllerTurma();
        turma.salvarTurma(this);
    }//GEN-LAST:event_btnCadastrarTurmaActionPerformed

    private void btnVoltarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarTurmaActionPerformed

    private void comboTurmaHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTurmaHorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTurmaHorariosActionPerformed

    private void btnCadastrarTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarTurmasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViewTurmas.setLocationRelativeTo(null);
        ViewTurmas.setVisible(true);
    }//GEN-LAST:event_btnCadastrarTurmasActionPerformed

    private void comboTurnoHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTurnoHorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTurnoHorariosActionPerformed

    private void btnAlterarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarHorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarHorariosActionPerformed

    private void btnVoltarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarHorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarHorariosActionPerformed

    private void btnCarregarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarHorariosActionPerformed
        // TODO add your handling code here:
        ControllerHorario horario = new ControllerHorario();
        horario.horarios(this);
    }//GEN-LAST:event_btnCarregarHorariosActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ViewDisciplinas;
    private javax.swing.JFrame ViewHorarios;
    private javax.swing.JFrame ViewTurmas;
    private javax.swing.JButton btnAlterarHorarios;
    private javax.swing.JButton btnCadastrarDisciplinas;
    private javax.swing.JButton btnCadastrarTurma;
    private javax.swing.JButton btnCadastrarTurmas;
    private javax.swing.JButton btnCarregarHorarios;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnVoltarHorarios;
    private javax.swing.JButton btnVoltarTurma;
    private javax.swing.JComboBox<String> comboNivelHorarios;
    private javax.swing.JComboBox<String> comboNivelTurma;
    private javax.swing.JComboBox<String> comboTurmaHorarios;
    private javax.swing.JComboBox<String> comboTurnoHorarios;
    private javax.swing.JComboBox<String> comboTurnoTurma;
    private javax.swing.JTextField fieldTurmaTurma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDisciplinas;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTurmas;
    private javax.swing.JPanel panelAdm;
    private javax.swing.JTable tabelaHorarios;
    // End of variables declaration//GEN-END:variables
}