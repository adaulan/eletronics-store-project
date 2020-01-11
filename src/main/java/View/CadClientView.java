package View;


import Controle.DaoCliente;
import Model.ModCliente;

public class CadClientView extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public CadClientView() {
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
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        CPForCNPJPane = new javax.swing.JPanel();
        CNPJRadioBtn = new javax.swing.JRadioButton();
        CPFRadioBttn = new javax.swing.JRadioButton();
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
        addressPane = new javax.swing.JPanel();
        stateComboBox = new javax.swing.JComboBox<>();
        cityComboBox = new javax.swing.JComboBox<>();
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
        btnSave = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

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
        ClientDataPane.add(surnameTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 42, 235, -1));

        nameTField.setText("Nome");
        nameTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTFieldFocusLost(evt);
            }
        });
        ClientDataPane.add(nameTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 42, 252, -1));

        nameLabel.setText("Nome:");
        ClientDataPane.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 27, -1, -1));

        ageLabel.setText("Data de Nascimento:");
        ClientDataPane.add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

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

        CPFRadioBttn.setBackground(new java.awt.Color(231, 233, 236));
        btnGroupPFOrPJ.add(CPFRadioBttn);
        CPFRadioBttn.setSelected(true);
        CPFRadioBttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CPFRadioBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CPFRadioBttn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CPFRadioBttnStateChanged(evt);
            }
        });
        CPForCNPJPane.add(CPFRadioBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 33, 20, 20));

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

        ClientDataPane.add(CPForCNPJPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 250, 110));

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
        ClientDataPane.add(FormattedDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 89, 100, 26));

        try {
            FormattedPhoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormattedPhoneField.setText("(  )  -    ");
        ClientDataPane.add(FormattedPhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 121, 100, 26));

        phoneLabel.setText("Telefone:");
        ClientDataPane.add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        try {
            FormattedCelularField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormattedCelularField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ClientDataPane.add(FormattedCelularField, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 153, 100, 26));

        phone2Label.setText("Celular:");
        ClientDataPane.add(phone2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        emailTField.setText("example@example.com");
        emailTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTFieldFocusLost(evt);
            }
        });
        ClientDataPane.add(emailTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, 26));

        emailLabel.setText("E-mail:");
        ClientDataPane.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel1.setText("Sexo:");
        ClientDataPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        genderBtnGroup.add(mRadioButton);
        mRadioButton.setText("Masculino");
        mRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mRadioButtonStateChanged(evt);
            }
        });
        ClientDataPane.add(mRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

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
        ClientDataPane.add(fRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        CadClientArea.add(ClientDataPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 550, 260));

        addressPane.setBackground(new java.awt.Color(231, 233, 236));
        addressPane.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 101, 103), 1, true), "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(100, 101, 103))); // NOI18N
        addressPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Acre ", "Alagoas ", "Amapá", "Amazonas (AM)", "Bahia ", "Ceará ", "Distrito Federal ", "Espírito Santo ", "Goiás ", "Maranhão ", "Mato Grosso ", "Mato Grosso do Sul ", "Minas Gerais ", "Pará ", "Paraíba ", "Paraná ", "Pernambuco ", "Piauí ", "Rio de Janeiro ", "Rio Grande do Norte ", "Rio Grande do Sul ", "Rondônia ", "Roraima ", "Santa Catarina ", "São Paulo", "Sergipe ", "Tocantins " }));
        stateComboBox.setBorder(null);
        addressPane.add(stateComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 47, 170, -1));

        cityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cidade", "Rio Branco", "Macapá", "Manaus", "Belém", "Porto Velho", "Boa Vista", "Palmas", "Maceió", "Salvador", "Fortaleza", "São Luís", "João Pessoa", " Recife", "Teresina", "Natal", "Aracaju", "Goiânia", "Cuiabá", "Campo Grande", "Brasília", "Vitória", "Belo Horizonte", "São Paulo", "Rio de Janeiro", "Curitiba", "Porto Alegre", "Florianópolis" }));
        addressPane.add(cityComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 47, 201, -1));

        stateLabel.setText("Estado:");
        addressPane.add(stateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 27, -1, -1));

        cityLabel.setText("Cidade:");
        addressPane.add(cityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 27, -1, -1));

        streetTField.setText("Rua/Avenida/Logradouro");
        streetTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                streetTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                streetTFieldFocusLost(evt);
            }
        });
        addressPane.add(streetTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 149, 350, -1));

        streetLabel.setText("Rua/Avenida:");
        addressPane.add(streetLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 129, -1, -1));

        districtLabel.setText("Bairro:");
        addressPane.add(districtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 78, -1, -1));

        districtTField.setText("Bairro");
        districtTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                districtTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                districtTFieldFocusLost(evt);
            }
        });
        addressPane.add(districtTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 98, 185, -1));

        jLabel9.setText("Número");
        addressPane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 129, -1, -1));

        numberTField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));
        addressPane.add(numberTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 149, 58, -1));

        complementTField.setText("Complemento");
        complementTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                complementTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                complementTFieldFocusLost(evt);
            }
        });
        addressPane.add(complementTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 207, 350, -1));

        complementLabel.setText("Complemento:");
        addressPane.add(complementLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 187, -1, -1));

        CadClientArea.add(addressPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 550, 250));

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

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nextbuttonblue97x25.png"))); // NOI18N
        btnNext.setToolTipText("Salvar e Abrir um novo formulário");
        btnNext.setContentAreaFilled(false);
        btnNext.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nextbuttongreen97x25.png"))); // NOI18N
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });
        CadClientArea.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 97, 25));

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

    private void CPFRadioBttnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CPFRadioBttnStateChanged
        // Habilita os Campos se o botão CPF estiver selecionado
        if (CPFRadioBttn.isSelected()) {
            FormattedCPFField.setEnabled(true);
            FormattedDateField.setEnabled(true);
            surnameTField.setEnabled(true);
            mRadioButton.setEnabled(true);
            fRadioButton.setEnabled(true);
        } else {
            FormattedCPFField.setEnabled(false);
        }
    }//GEN-LAST:event_CPFRadioBttnStateChanged

    private void CNPJRadioBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CNPJRadioBtnStateChanged
        // Desabilita os Campos se o Botão CNPJ estiver selecionado
        if (CNPJRadioBtn.isSelected()) {
            FormattedCNPJField.setEnabled(true);
            FormattedDateField.setEnabled(false);
            surnameTField.setEnabled(false);
            mRadioButton.setEnabled(false);
            fRadioButton.setEnabled(false);
        } else {
            FormattedCNPJField.setEnabled(false);
        }
    }//GEN-LAST:event_CNPJRadioBtnStateChanged

    //EVENTOS QUE FAZEM O TEXTO SUMIR-APARECER AO GANHAR FOCO
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

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        ModCliente c = new ModCliente();
        DaoCliente clienteDao = new DaoCliente();
        String m = "M", f = "F", gender = null;

        if (mRadioButton.isSelected()) {
            gender = m;
        } else if (fRadioButton.isSelected()) {
            gender = f;
        }
        c.setNomeCliente(nameTField.getText());
        c.setSobreNome(surnameTField.getText());
        c.setDataNascimento(FormattedDateField.getText());
        c.setTelefone(FormattedPhoneField.getText());
        c.setCelular(FormattedCelularField.getText());
        c.setEmail(emailTField.getText());
        c.setGenero(gender);
        c.setCPF(FormattedCPFField.getText());
        c.setEstado(stateComboBox.getSelectedItem().toString());
        c.setCidade(cityComboBox.getSelectedItem().toString());
        c.setBairro(districtTField.getText());
        c.setRua(streetTField.getText());
        c.setNumeroCasa(Integer.parseInt(numberTField.getText()));
        c.setComplemento(complementTField.getText());
        clienteDao.addClientArray(c);
        clienteDao.Salvar(c);
        CadClientView novoCad = new CadClientView();
        novoCad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNextMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        ModCliente c = new ModCliente();
        DaoCliente clienteDao = new DaoCliente();
        String m = "M", f = "F", gender = null;
        if (CPFRadioBttn.isSelected() == true) {
            if (mRadioButton.isSelected()) {
                gender = m;
            } else if (fRadioButton.isSelected()) {
                gender = f;
            }

            c.setNomeCliente(nameTField.getText());
            c.setSobreNome(surnameTField.getText());
            c.setDataNascimento(FormattedDateField.getText());
            c.setTelefone(FormattedPhoneField.getText());
            c.setCelular(FormattedCelularField.getText());
            c.setEmail(emailTField.getText());
            c.setGenero(gender);
            c.setCPF(FormattedCPFField.getText());
            c.setEstado(stateComboBox.getSelectedItem().toString());
            c.setCidade(cityComboBox.getSelectedItem().toString());
            c.setBairro(districtTField.getText());
            c.setRua(streetTField.getText());
            c.setNumeroCasa(Integer.parseInt(numberTField.getText()));
            c.setComplemento(complementTField.getText());

            clienteDao.Salvar(c);
        } else if (CNPJRadioBtn.isSelected() == true){
            c.setNomeCliente(nameTField.getText());
            c.setTelefone(FormattedPhoneField.getText());
            c.setCelular(FormattedCelularField.getText());
            c.setEmail(emailTField.getText());
            c.setCNPJ(FormattedCNPJField.getText());
            c.setEstado(stateComboBox.getSelectedItem().toString());
            c.setCidade(cityComboBox.getSelectedItem().toString());
            c.setBairro(districtTField.getText());
            c.setRua(streetTField.getText());
            c.setNumeroCasa(Integer.parseInt(numberTField.getText()));
            c.setComplemento(complementTField.getText());
            
            clienteDao.SalvarPJ(c);
        }

        this.dispose();
    }//GEN-LAST:event_btnSaveMouseClicked

    private void mRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mRadioButtonStateChanged

    }//GEN-LAST:event_mRadioButtonStateChanged

    private void fRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fRadioButtonStateChanged

    }//GEN-LAST:event_fRadioButtonStateChanged

    private void fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fRadioButtonActionPerformed
        // TODO add your handling code here:
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
                new CadClientView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CNPJRadioBtn;
    private javax.swing.JRadioButton CPFRadioBttn;
    private javax.swing.JPanel CPForCNPJPane;
    private javax.swing.JPanel CadClientArea;
    private javax.swing.JPanel ClientDataPane;
    private javax.swing.JFormattedTextField FormattedCNPJField;
    private javax.swing.JFormattedTextField FormattedCPFField;
    private javax.swing.JFormattedTextField FormattedCelularField;
    private javax.swing.JFormattedTextField FormattedDateField;
    private javax.swing.JFormattedTextField FormattedPhoneField;
    private javax.swing.JPanel addressPane;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupPFOrPJ;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cityComboBox;
    private javax.swing.JLabel cityLabel;
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
    private javax.swing.JRadioButton mRadioButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTField;
    private javax.swing.JFormattedTextField numberTField;
    private javax.swing.JLabel phone2Label;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JComboBox<String> stateComboBox;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JTextField streetTField;
    private javax.swing.JTextField surnameTField;
    // End of variables declaration//GEN-END:variables
}
