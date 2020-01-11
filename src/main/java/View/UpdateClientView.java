package View;


import Controle.DaoCliente;
import Model.ModCliente;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

public class UpdateClientView extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public static String complementoToSql(String complemento) {
        String atualizado = "'" + complemento + "'";
        return atualizado;
    }

    public UpdateClientView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPFOrPJ = new javax.swing.ButtonGroup();
        genderBtnGroup = new javax.swing.ButtonGroup();
        backgroundPanel = new javax.swing.JPanel();
        CadClientArea = new javax.swing.JPanel();
        ClientDataPane = new javax.swing.JPanel();
        surnameTField = new javax.swing.JTextField();
        nameTField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        CPForCNPJPane = new javax.swing.JPanel();
        CNPJRadioBtn = new javax.swing.JRadioButton();
        CPFRadioBtn = new javax.swing.JRadioButton();
        FormattedCPFField = new javax.swing.JFormattedTextField();
        FormattedCNPJField = new javax.swing.JFormattedTextField();
        FormattedDateField = new javax.swing.JFormattedTextField();
        FormattedPhoneField = new javax.swing.JFormattedTextField();
        phoneLabel = new javax.swing.JLabel();
        FormattedCelularField = new javax.swing.JFormattedTextField();
        phone2Label = new javax.swing.JLabel();
        emailTField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mRadioButton = new javax.swing.JRadioButton();
        fRadioButton = new javax.swing.JRadioButton();
        clientIconLabel = new javax.swing.JLabel();
        addressPane = new javax.swing.JPanel();
        stateLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        streetTField = new javax.swing.JTextField();
        streetLabel = new javax.swing.JLabel();
        districtLabel = new javax.swing.JLabel();
        districtTField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        numberTField = new javax.swing.JFormattedTextField();
        complementTField = new javax.swing.JTextField();
        complementLabel = new javax.swing.JLabel();
        stateTField = new javax.swing.JTextField();
        cityTField = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        searchTField = new javax.swing.JTextField();
        sClientComboBox = new javax.swing.JComboBox<>();
        OKBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(100, 101, 103));
        setUndecorated(true);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(100, 101, 103));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        backgroundPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundPanelMouseDragged(evt);
            }
        });
        backgroundPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundPanelMousePressed(evt);
            }
        });
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadClientArea.setBackground(new java.awt.Color(231, 233, 236));
        CadClientArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ClientDataPane.setBackground(new java.awt.Color(231, 233, 236));
        ClientDataPane.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 101, 103), 1, true), "Dados do Cliente"));
        ClientDataPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        surnameTField.setText("Sobrenome");
        surnameTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                surnameTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                surnameTFieldFocusLost(evt);
            }
        });
        surnameTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameTFieldActionPerformed(evt);
            }
        });
        ClientDataPane.add(surnameTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 235, -1));

        nameTField.setText("Nome");
        nameTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTFieldFocusLost(evt);
            }
        });
        nameTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFieldActionPerformed(evt);
            }
        });
        ClientDataPane.add(nameTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 235, -1));

        ageLabel.setText("Data de Nascimento:");
        ClientDataPane.add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 20));

        CPForCNPJPane.setBackground(new java.awt.Color(231, 233, 236));
        CPForCNPJPane.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 101, 103), 1, true), "CPF ou CNPJ"));
        CPForCNPJPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CNPJRadioBtn.setBackground(new java.awt.Color(231, 233, 236));
        btnGroupPFOrPJ.add(CNPJRadioBtn);
        CNPJRadioBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CNPJRadioBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CNPJRadioBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CNPJRadioBtnStateChanged(evt);
            }
        });
        CPForCNPJPane.add(CNPJRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 64, 20, 20));

        CPFRadioBtn.setBackground(new java.awt.Color(231, 233, 236));
        btnGroupPFOrPJ.add(CPFRadioBtn);
        CPFRadioBtn.setSelected(true);
        CPFRadioBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CPFRadioBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CPFRadioBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CPFRadioBtnStateChanged(evt);
            }
        });
        CPForCNPJPane.add(CPFRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 33, 20, 20));

        try {
            FormattedCPFField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormattedCPFField.setText("123.456.789-10");
        FormattedCPFField.setToolTipText("");
        FormattedCPFField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FormattedCPFFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FormattedCPFFieldFocusLost(evt);
            }
        });
        CPForCNPJPane.add(FormattedCPFField, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 33, 200, -1));

        try {
            FormattedCNPJField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormattedCNPJField.setText("12.345.678/9012-34  ");
        FormattedCNPJField.setEnabled(false);
        FormattedCNPJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FormattedCNPJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FormattedCNPJFieldFocusLost(evt);
            }
        });
        CPForCNPJPane.add(FormattedCNPJField, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 64, 200, -1));

        ClientDataPane.add(CPForCNPJPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 250, 110));

        try {
            FormattedDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormattedDateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FormattedDateField.setText("31/12/1900");
        FormattedDateField.setToolTipText("");
        FormattedDateField.setName("DateField"); // NOI18N
        FormattedDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FormattedDateFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FormattedDateFieldFocusLost(evt);
            }
        });
        ClientDataPane.add(FormattedDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 110, 26));

        try {
            FormattedPhoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormattedPhoneField.setText("(  )  -    ");
        ClientDataPane.add(FormattedPhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 110, 26));

        phoneLabel.setText("Telefone:");
        ClientDataPane.add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        try {
            FormattedCelularField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormattedCelularField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ClientDataPane.add(FormattedCelularField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 110, 26));

        phone2Label.setText("Celular:");
        ClientDataPane.add(phone2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        emailTField.setText("example@example.com");
        emailTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTFieldFocusLost(evt);
            }
        });
        ClientDataPane.add(emailTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 145, 25));

        emailLabel.setText("E-mail:");
        ClientDataPane.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel1.setText("Sexo:");
        ClientDataPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        genderBtnGroup.add(mRadioButton);
        mRadioButton.setText("Masculino");
        mRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mRadioButtonStateChanged(evt);
            }
        });
        ClientDataPane.add(mRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        genderBtnGroup.add(fRadioButton);
        fRadioButton.setText("Feminino");
        fRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fRadioButtonStateChanged(evt);
            }
        });
        fRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fRadioButtonActionPerformed(evt);
            }
        });
        ClientDataPane.add(fRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        clientIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user100x100.png"))); // NOI18N
        clientIconLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ClientDataPane.add(clientIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 26, 100, 100));

        CadClientArea.add(ClientDataPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 550, 260));

        addressPane.setBackground(new java.awt.Color(231, 233, 236));
        addressPane.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 101, 103), 1, true), "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(100, 101, 103))); // NOI18N
        addressPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stateLabel.setText("Estado:");
        addressPane.add(stateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        cityLabel.setText("Cidade:");
        addressPane.add(cityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        streetTField.setText("Rua/Avenida/Logradouro");
        streetTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                streetTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                streetTFieldFocusLost(evt);
            }
        });
        addressPane.add(streetTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 350, -1));

        streetLabel.setText("Rua/Avenida:");
        addressPane.add(streetLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, -1));

        districtLabel.setText("Bairro:");
        addressPane.add(districtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        districtTField.setText("Bairro");
        districtTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                districtTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                districtTFieldFocusLost(evt);
            }
        });
        addressPane.add(districtTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 170, -1));

        jLabel9.setText("Número");
        addressPane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        numberTField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));
        addressPane.add(numberTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 58, -1));

        complementTField.setText("Complemento");
        complementTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                complementTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                complementTFieldFocusLost(evt);
            }
        });
        addressPane.add(complementTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 350, -1));

        complementLabel.setText("Complemento:");
        addressPane.add(complementLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        addressPane.add(stateTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 170, -1));
        addressPane.add(cityTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 190, -1));

        CadClientArea.add(addressPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 550, 150));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvarbuttonblue97x25.png"))); // NOI18N
        btnSave.setToolTipText("Salvar Cadastro");
        btnSave.setContentAreaFilled(false);
        btnSave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvarbuttongreen97x25.png"))); // NOI18N
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        CadClientArea.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 580, 97, 25));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelbuttonblue96x25.png"))); // NOI18N
        btnCancel.setToolTipText("");
        btnCancel.setContentAreaFilled(false);
        btnCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelbuttonblackwhite96x25.png"))); // NOI18N
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        CadClientArea.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 96, 25));

        searchPanel.setBackground(new java.awt.Color(231, 233, 236));
        searchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 101, 103), 1, true), "Busca"));

        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome", "CPF/CNPJ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listTable);

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttonblue96x25.png"))); // NOI18N
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttongreen96x25.png"))); // NOI18N
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        searchTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTFieldKeyPressed(evt);
            }
        });

        sClientComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Sobrenome", "ID", "CPF", "CNPJ" }));

        OKBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/okbuttonblue96x25.png"))); // NOI18N
        OKBtn.setToolTipText("");
        OKBtn.setContentAreaFilled(false);
        OKBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/okbuttongreen96x25.png"))); // NOI18N
        OKBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(sClientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sClientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CadClientArea.add(searchPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 550, 140));

        backgroundPanel.add(CadClientArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 680, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFieldActionPerformed

    }//GEN-LAST:event_nameTFieldActionPerformed

    private void surnameTFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameTFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameTFieldActionPerformed

    //Texto Sumir ao ganhar Foco//
    private void nameTFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTFieldFocusGained
        // TODO add your handling code here:
        if (nameTField.getText().equals("") || nameTField.getText().equals("Nome")) {
            nameTField.setText("");
        }
    }//GEN-LAST:event_nameTFieldFocusGained

    private void nameTFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTFieldFocusLost
        // TODO add your handling code here:
        if (nameTField.getText().equals("") || nameTField.getText().equals("Nome")) {
            nameTField.setText("Nome");
        }
    }//GEN-LAST:event_nameTFieldFocusLost

    private void surnameTFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameTFieldFocusGained
        // TODO add your handling code here:
        if (surnameTField.getText().equals("") || surnameTField.getText().equals("Sobrenome")) {
            surnameTField.setText("");
        }
    }//GEN-LAST:event_surnameTFieldFocusGained

    private void surnameTFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameTFieldFocusLost
        // TODO add your handling code here:
        if (surnameTField.getText().equals("") || surnameTField.getText().equals("Sobrenome")) {
            surnameTField.setText("Sobrenome");
        }
    }//GEN-LAST:event_surnameTFieldFocusLost

    private void FormattedDateFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormattedDateFieldFocusGained
        // TODO add your handling code here:
        if (FormattedDateField.getText().equals("  /  /    ") || FormattedDateField.getText().equals("31/12/1900")) {
            FormattedDateField.setText("");
        }
    }//GEN-LAST:event_FormattedDateFieldFocusGained

    private void FormattedDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormattedDateFieldFocusLost
        // TODO add your handling code here:
        if (FormattedDateField.getText().equals("  /  /    ") || FormattedDateField.getText().equals("31/12/1900")) {
            FormattedDateField.setText("31/12/1900");
        }
    }//GEN-LAST:event_FormattedDateFieldFocusLost

    private void emailTFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTFieldFocusGained
        // TODO add your handling code here:
        if (emailTField.getText().equals("") || emailTField.getText().equals("example@example.com")) {
            emailTField.setText("");
        }
    }//GEN-LAST:event_emailTFieldFocusGained

    private void emailTFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTFieldFocusLost
        // TODO add your handling code here:
        if (emailTField.getText().equals("") || emailTField.getText().equals("example@example.com")) {
            emailTField.setText("example@example.com");
        }
    }//GEN-LAST:event_emailTFieldFocusLost

    private void FormattedCPFFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormattedCPFFieldFocusGained
        // TODO add your handling code here:
        if (FormattedCPFField.getText().equals("   .   .   -  ") || FormattedCPFField.getText().equals("123.456.789-10")) {
            FormattedCPFField.setText("");
        }
    }//GEN-LAST:event_FormattedCPFFieldFocusGained

    private void FormattedCPFFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormattedCPFFieldFocusLost
        // TODO add your handling code here:
        if (FormattedCPFField.getText().equals("   .   .   -  ") || FormattedCPFField.getText().equals("123.456.789-10")) {
            FormattedCPFField.setText("123.456.789-10");
        }
    }//GEN-LAST:event_FormattedCPFFieldFocusLost

    private void FormattedCNPJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormattedCNPJFieldFocusGained
        // TODO add your handling code here:
        if (FormattedCNPJField.getText().equals("  .   .   /    -  ") || FormattedCNPJField.getText().equals("12.345.678/9012-34")) {
            FormattedCNPJField.setText("");
        }
    }//GEN-LAST:event_FormattedCNPJFieldFocusGained

    private void FormattedCNPJFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormattedCNPJFieldFocusLost
        // TODO add your handling code here:
        if (FormattedCNPJField.getText().equals("  .   .   /    -  ") || FormattedCNPJField.getText().equals("12.345.678/9012-34")) {
            FormattedCNPJField.setText("12.345.678/9012-34");
        }
    }//GEN-LAST:event_FormattedCNPJFieldFocusLost

    private void districtTFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_districtTFieldFocusGained
        // TODO add your handling code here:
        if (districtTField.getText().equals("") || districtTField.getText().equals("Bairro")) {
            districtTField.setText("");
        }
    }//GEN-LAST:event_districtTFieldFocusGained

    private void districtTFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_districtTFieldFocusLost
        // TODO add your handling code here:
        if (districtTField.getText().equals("") || districtTField.getText().equals("Bairro")) {
            districtTField.setText("Bairro");
        }
    }//GEN-LAST:event_districtTFieldFocusLost

    private void streetTFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetTFieldFocusGained
        // TODO add your handling code here:
        if (streetTField.getText().equals("") || streetTField.getText().equals("Rua/Avenida/Logradouro")) {
            streetTField.setText("");
        }
    }//GEN-LAST:event_streetTFieldFocusGained

    private void streetTFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetTFieldFocusLost
        // TODO add your handling code here:
        if (streetTField.getText().equals("") || streetTField.getText().equals("Rua/Avenida/Logradouro")) {
            streetTField.setText("Rua/Avenida/Logradouro");
        }
    }//GEN-LAST:event_streetTFieldFocusLost

    private void complementTFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_complementTFieldFocusGained
        // TODO add your handling code here:
        if (complementTField.getText().equals("") || complementTField.getText().equals("Complemento")) {
            complementTField.setText("");
        }
    }//GEN-LAST:event_complementTFieldFocusGained

    private void complementTFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_complementTFieldFocusLost
        // TODO add your handling code here:
        if (complementTField.getText().equals("") || complementTField.getText().equals("Complemento")) {
            complementTField.setText("Complemento");
        }
    }//GEN-LAST:event_complementTFieldFocusLost

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        ModCliente c = new ModCliente();
        DaoCliente clienteDao = new DaoCliente();
        String CPForCNPJ;
        CPForCNPJ = listTable.getValueAt(listTable.getSelectedRow(), 3).toString();

        //CASO SEJA PESSOA FÍSICA
        if (CPForCNPJ.length() <= 14) {

            String m = "M", f = "F", gender = null;
            String IDCliente;
            if (mRadioButton.isSelected()) {
                gender = m;
            } else if (fRadioButton.isSelected()) {
                gender = f;
            }
            IDCliente = Integer.toString((int) listTable.getValueAt(listTable.getSelectedRow(), 0));
            c.setNomeCliente(nameTField.getText());
            c.setSobreNome(surnameTField.getText());
            c.setDataNascimento(FormattedDateField.getText());
            c.setTelefone(FormattedPhoneField.getText());
            c.setCelular(FormattedCelularField.getText());
            c.setEmail(emailTField.getText());
            c.setGenero(gender);
            c.setCPF(FormattedCPFField.getText());
            c.setEstado(stateTField.getText());
            c.setCidade(cityTField.getText());
            c.setBairro(districtTField.getText());
            c.setRua(streetTField.getText());
            c.setNumeroCasa(Integer.parseInt(numberTField.getText()));
            c.setComplemento(complementTField.getText());

            clienteDao.Update(c, IDCliente);
        } //CASO SEJA PESSOA JURIDICA
        else if (CPForCNPJ.length() > 14) {
            String IDCliente;
            IDCliente = Integer.toString((int) listTable.getValueAt(listTable.getSelectedRow(), 0));
            c.setNomeCliente(nameTField.getText());
            c.setTelefone(FormattedPhoneField.getText());
            c.setCelular(FormattedCelularField.getText());
            c.setEmail(emailTField.getText());
            c.setCNPJ(FormattedCNPJField.getText());
            c.setEstado(stateTField.getText());
            c.setCidade(cityTField.getText());
            c.setBairro(districtTField.getText());
            c.setRua(streetTField.getText());
            c.setNumeroCasa(Integer.parseInt(numberTField.getText()));
            c.setComplemento(complementTField.getText());

            clienteDao.UpdatePJ(c, IDCliente);
        }

        this.dispose();
    }//GEN-LAST:event_btnSaveMouseClicked

    private void mRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mRadioButtonStateChanged
        if (CPFRadioBtn.isSelected()) {
            if (mRadioButton.isSelected()) {
                clientIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user100x100.png")));

            } else if (fRadioButton.isSelected()) {
                clientIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/femaleuser100x100.png")));
            }
        }
    }//GEN-LAST:event_mRadioButtonStateChanged

    private void fRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fRadioButtonStateChanged
        if (CPFRadioBtn.isSelected()) {
            if (fRadioButton.isSelected()) {
                clientIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/femaleuser100x100.png")));
            } else if (mRadioButton.isSelected()) {
                clientIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user100x100.png")));
            }
        }
    }//GEN-LAST:event_fRadioButtonStateChanged

    private void fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fRadioButtonActionPerformed

    }//GEN-LAST:event_fRadioButtonActionPerformed

    private void backgroundPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_backgroundPanelMouseDragged

    private void backgroundPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_backgroundPanelMousePressed

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        DaoCliente cDao = new DaoCliente();
        DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
        String IDClient;
        IDClient = searchTField.getText();

        if (sClientComboBox.getSelectedItem().equals("Nome")) {
            modelo.setNumRows(0);
            for (ModCliente c : cDao.ReadByName(IDClient)) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    c.getSobreNome(),
                    c.getCPF(),});
            }
            for (ModCliente c : cDao.ReadByNamePJ(IDClient)) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    "",
                    c.getCNPJ(),});
            }
        } else if (sClientComboBox.getSelectedItem().equals("Sobrenome")) {
            modelo.setNumRows(0);
            for (ModCliente c : cDao.ReadBySurname(IDClient)) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    c.getSobreNome(),
                    c.getCPF(),});
            }
        } else if (sClientComboBox.getSelectedItem().equals("ID")) {
            modelo.setNumRows(0);
            for (ModCliente c : cDao.ReadByID(IDClient)) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    c.getSobreNome(),
                    c.getCPF(),});
            }
            for (ModCliente c : cDao.ReadByIDPJ(IDClient)) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    "",
                    c.getCNPJ(),});
            }
        } else if (sClientComboBox.getSelectedItem().equals("CPF")) {
            modelo.setNumRows(0);
            for (ModCliente c : cDao.ReadByCPF(IDClient)) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    c.getSobreNome(),
                    c.getCPF(),});
            }
        } else if (sClientComboBox.getSelectedItem().equals("CNPJ")) {
            modelo.setNumRows(0);
            for (ModCliente c : cDao.ReadByCNPJ(IDClient)) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    "",
                    c.getCNPJ(),});
            }
        }


    }//GEN-LAST:event_searchButtonMouseClicked

    private void OKBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKBtnMouseClicked
        DaoCliente cDao = new DaoCliente();
        String IDClient, gender, CPForCNPJ;

        //PEGA O ID DO CLIENTE SELECIONADO E BUSCA TODOS OS DADOS NO BD//
        IDClient = listTable.getValueAt(listTable.getSelectedRow(), 0).toString();
        CPForCNPJ = listTable.getValueAt(listTable.getSelectedRow(), 3).toString();
        //CASO SEJA PESSOA FÍSICA
        if (CPForCNPJ.length() <= 14) {
            ModCliente c = cDao.getByID(IDClient);

            //SELECIONA O GENERO//
            gender = c.getGenero();
            if (gender.equals("M")) {
                mRadioButton.setSelected(true);
                clientIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user100x100.png")));
            } else if (gender.equals("F")) {
                fRadioButton.setSelected(true);
                clientIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/femaleuser100x100.png")));
            }
            //HABILITA AS AREAS
            CPFRadioBtn.setSelected(true);
            FormattedCNPJField.setEnabled(false);
            FormattedCPFField.setEnabled(true);
            FormattedDateField.setEnabled(true);
            surnameTField.setEnabled(true);
            mRadioButton.setEnabled(true);
            fRadioButton.setEnabled(true);
            //PREENCHE AS AREAS//
            nameTField.setText(c.getNomeCliente());
            surnameTField.setText(c.getSobreNome());
            FormattedDateField.setText(c.getDataNascimento());
            FormattedPhoneField.setText(c.getTelefone());
            FormattedCelularField.setText(c.getCelular());
            emailTField.setText(c.getEmail());
            FormattedCPFField.setText(c.getCPF());
            stateTField.setText(c.getEstado());
            cityTField.setText(c.getCidade());
            districtTField.setText(c.getBairro());
            streetTField.setText(c.getRua());
            numberTField.setText(String.valueOf(c.getNumeroCasa()));
            complementTField.setText(c.getComplemento());
        } //CASO SEJA PESSOA JURIDICA
        else if (CPForCNPJ.length() > 14) {
            ModCliente c = cDao.getByIDPJ(IDClient);
            //ATUALIZA O ICONE
            clientIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessicon100x100.png")));
            //DESABILITA AS AREAS
            CNPJRadioBtn.setSelected(true);
            mRadioButton.setSelected(false);
            fRadioButton.setSelected(false);
            FormattedCNPJField.setEnabled(true);
            FormattedCPFField.setEnabled(false);
            FormattedDateField.setEnabled(false);
            surnameTField.setEnabled(false);
            mRadioButton.setEnabled(false);
            fRadioButton.setEnabled(false);
            //PREENCHE AS AREAS//
            nameTField.setText(c.getNomeCliente());
            FormattedPhoneField.setText(c.getTelefone());
            FormattedCelularField.setText(c.getCelular());
            emailTField.setText(c.getEmail());
            FormattedCNPJField.setText(c.getCNPJ());
            stateTField.setText(c.getEstado());
            cityTField.setText(c.getCidade());
            districtTField.setText(c.getBairro());
            streetTField.setText(c.getRua());
            numberTField.setText(String.valueOf(c.getNumeroCasa()));
            complementTField.setText(c.getComplemento());
        }

    }//GEN-LAST:event_OKBtnMouseClicked

    private void searchTFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DaoCliente cDao = new DaoCliente();
            DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
            String IDClient;
            IDClient = searchTField.getText();

            if (sClientComboBox.getSelectedItem().equals("Nome")) {
                modelo.setNumRows(0);
                for (ModCliente c : cDao.ReadByName(IDClient)) {
                    modelo.addRow(new Object[]{
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        c.getSobreNome(),
                        c.getCPF(),});
                }
                for (ModCliente c : cDao.ReadByNamePJ(IDClient)) {
                    modelo.addRow(new Object[]{
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        "",
                        c.getCNPJ(),});
                }
            } else if (sClientComboBox.getSelectedItem().equals("Sobrenome")) {
                modelo.setNumRows(0);
                for (ModCliente c : cDao.ReadBySurname(IDClient)) {
                    modelo.addRow(new Object[]{
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        c.getSobreNome(),
                        c.getCPF(),});
                }
            } else if (sClientComboBox.getSelectedItem().equals("ID")) {
                modelo.setNumRows(0);
                for (ModCliente c : cDao.ReadByID(IDClient)) {
                    modelo.addRow(new Object[]{
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        c.getSobreNome(),
                        c.getCPF(),});
                }
                for (ModCliente c : cDao.ReadByIDPJ(IDClient)) {
                    modelo.addRow(new Object[]{
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        "",
                        c.getCNPJ(),});
                }
            } else if (sClientComboBox.getSelectedItem().equals("CPF")) {
                modelo.setNumRows(0);
                for (ModCliente c : cDao.ReadByCPF(IDClient)) {
                    modelo.addRow(new Object[]{
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        c.getSobreNome(),
                        c.getCPF(),});
                }
            } else if (sClientComboBox.getSelectedItem().equals("CNPJ")) {
                modelo.setNumRows(0);
                for (ModCliente c : cDao.ReadByCNPJ(IDClient)) {
                    modelo.addRow(new Object[]{
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        "",
                        c.getCNPJ(),});
                }
            }
        }
    }//GEN-LAST:event_searchTFieldKeyPressed

    private void CNPJRadioBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CNPJRadioBtnStateChanged
        // TODO add your handling code here:
        if (CNPJRadioBtn.isSelected()) {
            FormattedCNPJField.setEnabled(true);
            FormattedDateField.setEnabled(false);
            surnameTField.setEnabled(false);
        } else {
            FormattedCNPJField.setEnabled(false);
        }
    }//GEN-LAST:event_CNPJRadioBtnStateChanged

    private void CPFRadioBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CPFRadioBtnStateChanged
        // TODO add your handling code here:
        if (CPFRadioBtn.isSelected()) {
            FormattedCPFField.setEnabled(true);
            FormattedDateField.setEnabled(true);
            surnameTField.setEnabled(true);
        } else {
            FormattedCPFField.setEnabled(false);
        }
    }//GEN-LAST:event_CPFRadioBtnStateChanged

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(CadClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateClientView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CNPJRadioBtn;
    private javax.swing.JRadioButton CPFRadioBtn;
    private javax.swing.JPanel CPForCNPJPane;
    private javax.swing.JPanel CadClientArea;
    private javax.swing.JPanel ClientDataPane;
    private javax.swing.JFormattedTextField FormattedCNPJField;
    private javax.swing.JFormattedTextField FormattedCPFField;
    private javax.swing.JFormattedTextField FormattedCelularField;
    private javax.swing.JFormattedTextField FormattedDateField;
    private javax.swing.JFormattedTextField FormattedPhoneField;
    private javax.swing.JButton OKBtn;
    private javax.swing.JPanel addressPane;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupPFOrPJ;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTField;
    private javax.swing.JLabel clientIconLabel;
    private javax.swing.JLabel complementLabel;
    private javax.swing.JTextField complementTField;
    private javax.swing.JLabel districtLabel;
    private javax.swing.JTextField districtTField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTField;
    private javax.swing.JRadioButton fRadioButton;
    private javax.swing.ButtonGroup genderBtnGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listTable;
    private javax.swing.JRadioButton mRadioButton;
    private javax.swing.JTextField nameTField;
    private javax.swing.JFormattedTextField numberTField;
    private javax.swing.JLabel phone2Label;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JComboBox<String> sClientComboBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField searchTField;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField stateTField;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JTextField streetTField;
    private javax.swing.JTextField surnameTField;
    // End of variables declaration//GEN-END:variables
}
