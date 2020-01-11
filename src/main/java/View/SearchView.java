package View;


import Controle.DaoCliente;
import Controle.DaoProduto;
import Model.ModCliente;
import Model.ModProduto;
import javax.swing.table.DefaultTableModel;

public class SearchView extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public SearchView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPFOrPJ = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        backgroundPanel = new javax.swing.JPanel();
        CadProductArea = new javax.swing.JPanel();
        productDataPane = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        sClientBtn = new javax.swing.JButton();
        ClientOrProductPanel = new javax.swing.JPanel();
        clientRadioButton = new javax.swing.JRadioButton();
        productRadioButton = new javax.swing.JRadioButton();
        sProdBtn = new javax.swing.JButton();
        ProdTField = new javax.swing.JTextField();
        ClientTField = new javax.swing.JTextField();
        sProdComboBox = new javax.swing.JComboBox<>();
        sClientComboBox = new javax.swing.JComboBox<>();
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

        CadProductArea.setBackground(new java.awt.Color(231, 233, 236));
        CadProductArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productDataPane.setBackground(new java.awt.Color(231, 233, 236));
        productDataPane.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 101, 103), 1, true), "Pesquisa"));
        productDataPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Tipo", "ID", "Preço", "Quantidade", "Descrição", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(listTable);
        if (listTable.getColumnModel().getColumnCount() > 0) {
            listTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        productDataPane.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 510, 390));

        sClientBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttonblue96x25.png"))); // NOI18N
        sClientBtn.setContentAreaFilled(false);
        sClientBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttongreen96x25.png"))); // NOI18N
        sClientBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sClientBtnMouseClicked(evt);
            }
        });
        productDataPane.add(sClientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 96, 25));

        ClientOrProductPanel.setBackground(new java.awt.Color(231, 233, 236));
        ClientOrProductPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 101, 103), 1, true), "Mostrar todos"));

        buttonGroup1.add(clientRadioButton);
        clientRadioButton.setText("Clientes");
        clientRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientRadioButtonMouseClicked(evt);
            }
        });
        clientRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(productRadioButton);
        productRadioButton.setText("Produtos");
        productRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productRadioButtonMouseClicked(evt);
            }
        });
        productRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClientOrProductPanelLayout = new javax.swing.GroupLayout(ClientOrProductPanel);
        ClientOrProductPanel.setLayout(ClientOrProductPanelLayout);
        ClientOrProductPanelLayout.setHorizontalGroup(
            ClientOrProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientOrProductPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClientOrProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productRadioButton)
                    .addComponent(clientRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClientOrProductPanelLayout.setVerticalGroup(
            ClientOrProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientOrProductPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(productRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientRadioButton)
                .addGap(22, 22, 22))
        );

        productDataPane.add(ClientOrProductPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 110, 90));

        sProdBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttonblue96x25.png"))); // NOI18N
        sProdBtn.setContentAreaFilled(false);
        sProdBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sProdBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttongreen96x25.png"))); // NOI18N
        sProdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sProdBtnMouseClicked(evt);
            }
        });
        productDataPane.add(sProdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 96, 25));

        ProdTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProdTFieldKeyPressed(evt);
            }
        });
        productDataPane.add(ProdTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 130, 26));

        ClientTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ClientTFieldKeyPressed(evt);
            }
        });
        productDataPane.add(ClientTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, 26));

        sProdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Tipo", "ID" }));
        productDataPane.add(sProdComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 24));

        sClientComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Sobrenome", "ID", "CPF", "CNPJ" }));
        productDataPane.add(sClientComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 100, 24));

        CadProductArea.add(productDataPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 550, 530));
        productDataPane.getAccessibleContext().setAccessibleName("Dados do Produto");

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelbuttonblue96x25.png"))); // NOI18N
        btnCancel.setToolTipText("");
        btnCancel.setContentAreaFilled(false);
        btnCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelbuttonblackwhite96x25.png"))); // NOI18N
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        CadProductArea.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 96, 25));

        backgroundPanel.add(CadProductArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 680, 610));

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

    private void clientRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientRadioButtonActionPerformed

    private void productRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productRadioButtonActionPerformed

    private void productRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productRadioButtonMouseClicked
        // TODO add your handling code here:
        DaoProduto pDao = new DaoProduto();
        DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
        modelo.setNumRows(0);

        if (productRadioButton.isSelected()) {
            modelo.setColumnIdentifiers(new Object[]{
                "Produto",
                "Tipo",
                "ID",
                "Preço",
                "Quantidade",
                "Descrição"

            });
            for (ModProduto p : pDao.Read()) {
                modelo.addRow(new Object[]{
                    p.getNomeProduto(),
                    p.getTipoProduto(),
                    p.getIdProduto(),
                    p.formatPrecoToReal(p.getPrecoProduto()),
                    p.getQtdProduto(),
                    p.getDescProduto()
                });
            }
        } else {

        }


    }//GEN-LAST:event_productRadioButtonMouseClicked

    private void backgroundPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_backgroundPanelMouseDragged

    private void backgroundPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_backgroundPanelMousePressed

    private void clientRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientRadioButtonMouseClicked
        DaoCliente cDao = new DaoCliente();
        DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
        modelo.setNumRows(0);

        if (clientRadioButton.isSelected()) {
            modelo.setColumnIdentifiers(new Object[]{
                "ID",
                "Nome",
                "Sobrenome",
                "CPF/CNPJ",
                "Data de Nascimento",
                "Genero",
                "Telefone",
                "Celular",
                "E-Mail",
                "Estado",
                "Cidade",
                "Bairro",
                "Rua",
                "Casa",
                "Complemento"
            });
            for (ModCliente c : cDao.Read()) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    c.getSobreNome(),
                    c.getCPF(),
                    c.getDataNascimento(),
                    c.getGenero(),
                    c.getTelefone(),
                    c.getCelular(),
                    c.getEmail(),
                    c.getEstado(),
                    c.getCidade(),
                    c.getBairro(),
                    c.getRua(),
                    c.getNumeroCasa(),
                    c.getComplemento()

                });
            }
            for (ModCliente cpj : cDao.ReadPJ()) {
                modelo.addRow(new Object[]{
                    cpj.getIdCliente(),
                    cpj.getNomeCliente(),
                    "",
                    cpj.getCNPJ(),
                    "",
                    "",
                    cpj.getTelefone(),
                    cpj.getCelular(),
                    cpj.getEmail(),
                    cpj.getEstado(),
                    cpj.getCidade(),
                    cpj.getBairro(),
                    cpj.getRua(),
                    cpj.getNumeroCasa(),
                    cpj.getComplemento()
                });
            }
        } else {

        }
    }//GEN-LAST:event_clientRadioButtonMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void sProdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sProdBtnMouseClicked
        DaoProduto pDao = new DaoProduto();
        DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
        String IDProd;
        IDProd = ProdTField.getText();
        //ORGANIZA AS COLUNAS PARA RECEBER A LISTA DE PRODUTOS//
        modelo.setColumnIdentifiers(new Object[]{
            "Produto",
            "Tipo",
            "ID",
            "Preço",
            "Quantidade",
            "Descrição"
        });
        //BUSCA O PRODUTO DE ACORDO COM O TIPO DE BUSCA//
        if (sProdComboBox.getSelectedItem().equals("ID")) {
            modelo.setNumRows(0);
            for (ModProduto p : pDao.ReadByCode(IDProd)) {
                modelo.addRow(new Object[]{
                    p.getNomeProduto(),
                    p.getTipoProduto(),
                    p.getIdProduto(),
                    p.formatPrecoToReal(p.getPrecoProduto()),
                    p.getQtdProduto(),
                    p.getDescProduto(),});
            }
        } else if (sProdComboBox.getSelectedItem().equals("Nome")) {
            modelo.setNumRows(0);
            for (ModProduto p : pDao.ReadByName(IDProd)) {
                modelo.addRow(new Object[]{
                    p.getNomeProduto(),
                    p.getTipoProduto(),
                    p.getIdProduto(),
                    p.formatPrecoToReal(p.getPrecoProduto()),
                    p.getQtdProduto(),
                    p.getDescProduto(),});
            }
        } else if (sProdComboBox.getSelectedItem().equals("Tipo")) {
            modelo.setNumRows(0);
            for (ModProduto p : pDao.ReadByType(IDProd)) {
                modelo.addRow(new Object[]{
                    p.getNomeProduto(),
                    p.getTipoProduto(),
                    p.getIdProduto(),
                    p.formatPrecoToReal(p.getPrecoProduto()),
                    p.getQtdProduto(),
                    p.getDescProduto(),});
            }
        }
    }//GEN-LAST:event_sProdBtnMouseClicked

    private void sClientBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sClientBtnMouseClicked
        DaoCliente cDao = new DaoCliente();
        DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
        String IDClient;
        IDClient = ClientTField.getText();
        modelo.setColumnIdentifiers(new Object[]{
            "ID",
            "Nome",
            "Sobrenome",
            "CPF/CNPJ",
            "Data de Nascimento",
            "Genero",
            "Telefone",
            "Celular",
            "E-Mail",
            "Estado",
            "Cidade",
            "Bairro",
            "Rua",
            "Casa",
            "Complemento"
        });
        //PESQUISA O CLIENTE PELO NOME
        if (sClientComboBox.getSelectedItem().equals("Nome")) {
            modelo.setNumRows(0);
            for (ModCliente c : cDao.ReadByName(IDClient)) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    c.getSobreNome(),
                    c.getCPF(),
                    c.getDataNascimento(),
                    c.getGenero(),
                    c.getTelefone(),
                    c.getCelular(),
                    c.getEmail(),
                    c.getEstado(),
                    c.getCidade(),
                    c.getBairro(),
                    c.getRua(),
                    c.getNumeroCasa(),
                    c.getComplemento()

                });
            }
            for (ModCliente cpj : cDao.ReadByNamePJ(IDClient)) {
                modelo.addRow(new Object[]{
                    cpj.getIdCliente(),
                    cpj.getNomeCliente(),
                    "",
                    cpj.getCNPJ(),
                    "",
                    "",
                    cpj.getTelefone(),
                    cpj.getCelular(),
                    cpj.getEmail(),
                    cpj.getEstado(),
                    cpj.getCidade(),
                    cpj.getBairro(),
                    cpj.getRua(),
                    cpj.getNumeroCasa(),
                    cpj.getComplemento()

                });
            }
        } //PESQUISA O CLIENTE PELO SOBRENOME
        else if (sClientComboBox.getSelectedItem().equals("Sobrenome")) {
            modelo.setNumRows(0);
            for (ModCliente c : cDao.ReadBySurname(IDClient)) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    c.getSobreNome(),
                    c.getCPF(),
                    c.getDataNascimento(),
                    c.getGenero(),
                    c.getTelefone(),
                    c.getCelular(),
                    c.getEmail(),
                    c.getEstado(),
                    c.getCidade(),
                    c.getBairro(),
                    c.getRua(),
                    c.getNumeroCasa(),
                    c.getComplemento()

                });
            }
        } //PESQUISA O CLIENTE PELO ID
        else if (sClientComboBox.getSelectedItem().equals("ID")) {
            modelo.setNumRows(0);
            for (ModCliente c : cDao.ReadByID(IDClient)) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    c.getSobreNome(),
                    c.getCPF(),
                    c.getDataNascimento(),
                    c.getGenero(),
                    c.getTelefone(),
                    c.getCelular(),
                    c.getEmail(),
                    c.getEstado(),
                    c.getCidade(),
                    c.getBairro(),
                    c.getRua(),
                    c.getNumeroCasa(),
                    c.getComplemento()

                });
            }
            for (ModCliente cpj : cDao.ReadByIDPJ(IDClient)) {
                modelo.addRow(new Object[]{
                    cpj.getIdCliente(),
                    cpj.getNomeCliente(),
                    "",
                    cpj.getCNPJ(),
                    "",
                    "",
                    cpj.getTelefone(),
                    cpj.getCelular(),
                    cpj.getEmail(),
                    cpj.getEstado(),
                    cpj.getCidade(),
                    cpj.getBairro(),
                    cpj.getRua(),
                    cpj.getNumeroCasa(),
                    cpj.getComplemento()

                });
            }
        } //PESQUISA O CLIENTE PELO CPF
        else if (sClientComboBox.getSelectedItem().equals("CPF")) {
            modelo.setNumRows(0);
            for (ModCliente c : cDao.ReadByCPF(IDClient)) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    c.getSobreNome(),
                    c.getCPF(),
                    c.getDataNascimento(),
                    c.getGenero(),
                    c.getTelefone(),
                    c.getCelular(),
                    c.getEmail(),
                    c.getEstado(),
                    c.getCidade(),
                    c.getBairro(),
                    c.getRua(),
                    c.getNumeroCasa(),
                    c.getComplemento()

                });
            }
        } //PESQUISA O CLIENTE PELO CNPJ
        else if (sClientComboBox.getSelectedItem().equals("CNPJ")) {
            modelo.setNumRows(0);
            for (ModCliente c : cDao.ReadByCNPJ(IDClient)) {
                modelo.addRow(new Object[]{
                    c.getIdCliente(),
                    c.getNomeCliente(),
                    "",
                    c.getCNPJ(),
                    "",
                    "",
                    c.getTelefone(),
                    c.getCelular(),
                    c.getEmail(),
                    c.getEstado(),
                    c.getCidade(),
                    c.getBairro(),
                    c.getRua(),
                    c.getNumeroCasa(),
                    c.getComplemento()

                });
            }
        }
    }//GEN-LAST:event_sClientBtnMouseClicked

    private void ClientTFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClientTFieldKeyPressed
        if (evt.getExtendedKeyCode() == evt.VK_ENTER) {
            DaoCliente cDao = new DaoCliente();
            DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
            String IDClient;
            IDClient = ClientTField.getText();
            modelo.setColumnIdentifiers(new Object[]{
                "ID",
                "Nome",
                "Sobrenome",
                "CPF/CNPJ",
                "Data de Nascimento",
                "Genero",
                "Telefone",
                "Celular",
                "E-Mail",
                "Estado",
                "Cidade",
                "Bairro",
                "Rua",
                "Casa",
                "Complemento"
            });
            //PESQUISA O CLIENTE PELO NOME
            if (sClientComboBox.getSelectedItem().equals("Nome")) {
                modelo.setNumRows(0);
                for (ModCliente c : cDao.ReadByName(IDClient)) {
                    modelo.addRow(new Object[]{
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        c.getSobreNome(),
                        c.getCPF(),
                        c.getDataNascimento(),
                        c.getGenero(),
                        c.getTelefone(),
                        c.getCelular(),
                        c.getEmail(),
                        c.getEstado(),
                        c.getCidade(),
                        c.getBairro(),
                        c.getRua(),
                        c.getNumeroCasa(),
                        c.getComplemento()

                    });
                }
                for (ModCliente cpj : cDao.ReadByNamePJ(IDClient)) {
                    modelo.addRow(new Object[]{
                        cpj.getIdCliente(),
                        cpj.getNomeCliente(),
                        "",
                        cpj.getCNPJ(),
                        "",
                        "",
                        cpj.getTelefone(),
                        cpj.getCelular(),
                        cpj.getEmail(),
                        cpj.getEstado(),
                        cpj.getCidade(),
                        cpj.getBairro(),
                        cpj.getRua(),
                        cpj.getNumeroCasa(),
                        cpj.getComplemento()

                    });
                }
            } //PESQUISA O CLIENTE PELO SOBRENOME
            else if (sClientComboBox.getSelectedItem().equals("Sobrenome")) {
                modelo.setNumRows(0);
                for (ModCliente c : cDao.ReadBySurname(IDClient)) {
                    modelo.addRow(new Object[]{
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        c.getSobreNome(),
                        c.getCPF(),
                        c.getDataNascimento(),
                        c.getGenero(),
                        c.getTelefone(),
                        c.getCelular(),
                        c.getEmail(),
                        c.getEstado(),
                        c.getCidade(),
                        c.getBairro(),
                        c.getRua(),
                        c.getNumeroCasa(),
                        c.getComplemento()

                    });
                }
            } //PESQUISA O CLIENTE PELO ID
            else if (sClientComboBox.getSelectedItem().equals("ID")) {
                modelo.setNumRows(0);
                for (ModCliente c : cDao.ReadByID(IDClient)) {
                    modelo.addRow(new Object[]{
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        c.getSobreNome(),
                        c.getCPF(),
                        c.getDataNascimento(),
                        c.getGenero(),
                        c.getTelefone(),
                        c.getCelular(),
                        c.getEmail(),
                        c.getEstado(),
                        c.getCidade(),
                        c.getBairro(),
                        c.getRua(),
                        c.getNumeroCasa(),
                        c.getComplemento()

                    });
                }
                for (ModCliente cpj : cDao.ReadByIDPJ(IDClient)) {
                    modelo.addRow(new Object[]{
                        cpj.getIdCliente(),
                        cpj.getNomeCliente(),
                        "",
                        cpj.getCNPJ(),
                        "",
                        "",
                        cpj.getTelefone(),
                        cpj.getCelular(),
                        cpj.getEmail(),
                        cpj.getEstado(),
                        cpj.getCidade(),
                        cpj.getBairro(),
                        cpj.getRua(),
                        cpj.getNumeroCasa(),
                        cpj.getComplemento()

                    });
                }
            } //PESQUISA O CLIENTE PELO CPF
            else if (sClientComboBox.getSelectedItem().equals("CPF")) {
                modelo.setNumRows(0);
                for (ModCliente c : cDao.ReadByCPF(IDClient)) {
                    modelo.addRow(new Object[]{
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        c.getSobreNome(),
                        c.getCPF(),
                        c.getDataNascimento(),
                        c.getGenero(),
                        c.getTelefone(),
                        c.getCelular(),
                        c.getEmail(),
                        c.getEstado(),
                        c.getCidade(),
                        c.getBairro(),
                        c.getRua(),
                        c.getNumeroCasa(),
                        c.getComplemento()

                    });
                }
            } //PESQUISA O CLIENTE PELO CNPJ
            else if (sClientComboBox.getSelectedItem().equals("CNPJ")) {
                modelo.setNumRows(0);
                for (ModCliente c : cDao.ReadByCNPJ(IDClient)) {
                    modelo.addRow(new Object[]{
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        "",
                        c.getCNPJ(),
                        "",
                        "",
                        c.getTelefone(),
                        c.getCelular(),
                        c.getEmail(),
                        c.getEstado(),
                        c.getCidade(),
                        c.getBairro(),
                        c.getRua(),
                        c.getNumeroCasa(),
                        c.getComplemento()

                    });
                }
            }
        }
    }//GEN-LAST:event_ClientTFieldKeyPressed

    private void ProdTFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProdTFieldKeyPressed
        if (evt.getExtendedKeyCode() == evt.VK_ENTER) {
            DaoProduto pDao = new DaoProduto();
            DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
            String IDProd;
            IDProd = ProdTField.getText();
            //ORGANIZA AS COLUNAS PARA RECEBER A LISTA DE PRODUTOS//
            modelo.setColumnIdentifiers(new Object[]{
                "Produto",
                "Tipo",
                "ID",
                "Preço",
                "Quantidade",
                "Descrição"
            });
            //BUSCA O PRODUTO DE ACORDO COM O TIPO DE BUSCA//
            if (sProdComboBox.getSelectedItem().equals("ID")) {
                modelo.setNumRows(0);
                for (ModProduto p : pDao.ReadByCode(IDProd)) {
                    modelo.addRow(new Object[]{
                        p.getNomeProduto(),
                        p.getTipoProduto(),
                        p.getIdProduto(),
                        p.formatPrecoToReal(p.getPrecoProduto()),
                        p.getQtdProduto(),
                        p.getDescProduto(),});
                }
            } else if (sProdComboBox.getSelectedItem().equals("Nome")) {
                modelo.setNumRows(0);
                for (ModProduto p : pDao.ReadByName(IDProd)) {
                    modelo.addRow(new Object[]{
                        p.getNomeProduto(),
                        p.getTipoProduto(),
                        p.getIdProduto(),
                        p.formatPrecoToReal(p.getPrecoProduto()),
                        p.getQtdProduto(),
                        p.getDescProduto(),});
                }
            } else if (sProdComboBox.getSelectedItem().equals("Tipo")) {
                modelo.setNumRows(0);
                for (ModProduto p : pDao.ReadByType(IDProd)) {
                    modelo.addRow(new Object[]{
                        p.getNomeProduto(),
                        p.getTipoProduto(),
                        p.getIdProduto(),
                        p.formatPrecoToReal(p.getPrecoProduto()),
                        p.getQtdProduto(),
                        p.getDescProduto(),});
                }
            }
        }
    }//GEN-LAST:event_ProdTFieldKeyPressed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadProductArea;
    private javax.swing.JPanel ClientOrProductPanel;
    private javax.swing.JTextField ClientTField;
    private javax.swing.JTextField ProdTField;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupPFOrPJ;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton clientRadioButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listTable;
    private javax.swing.JPanel productDataPane;
    private javax.swing.JRadioButton productRadioButton;
    private javax.swing.JButton sClientBtn;
    private javax.swing.JComboBox<String> sClientComboBox;
    private javax.swing.JButton sProdBtn;
    private javax.swing.JComboBox<String> sProdComboBox;
    // End of variables declaration//GEN-END:variables
}
