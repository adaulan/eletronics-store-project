package View;


import Controle.DaoProduto;
import Model.ModCliente;
import Model.ModProduto;
import javax.swing.table.DefaultTableModel;

public class UpdateProductView extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public UpdateProductView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPFOrPJ = new javax.swing.ButtonGroup();
        backgroundPanel = new javax.swing.JPanel();
        CadProductArea = new javax.swing.JPanel();
        productDataPane = new javax.swing.JPanel();
        productNameTField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        descriptionProductLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        typeProductComboBox = new javax.swing.JComboBox<>();
        typeProductLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        priceFormattedTextField = new javax.swing.JFormattedTextField();
        priceLabel = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        prodTField = new javax.swing.JTextField();
        sProdComboBox = new javax.swing.JComboBox<>();
        searchBttn = new javax.swing.JButton();
        OKBttn = new javax.swing.JButton();

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
        productDataPane.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 101, 103), 1, true), "Dados do Produtos"));
        productDataPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productNameTField.setText("Nome do Produto");
        productNameTField.setToolTipText("");
        productNameTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                productNameTFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                productNameTFieldFocusLost(evt);
            }
        });
        productNameTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameTFieldActionPerformed(evt);
            }
        });
        productDataPane.add(productNameTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 480, -1));

        nameLabel.setText("Nome:");
        productDataPane.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        descriptionProductLabel.setText("Descrição:");
        productDataPane.add(descriptionProductLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setText("Descrição do Produto");
        descriptionTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descriptionTextAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descriptionTextAreaFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(descriptionTextArea);

        productDataPane.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 480, -1));

        typeProductComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acessório", "Smartphone", "Notebook", "Computador/Desktop", "Televisão" }));
        typeProductComboBox.setToolTipText("");
        productDataPane.add(typeProductComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, -1));

        typeProductLabel.setText("Tipo do Produto:");
        productDataPane.add(typeProductLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        quantityLabel.setText("Quantidade:");
        productDataPane.add(quantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        productDataPane.add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 60, -1));

        priceFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        productDataPane.add(priceFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 100, 23));

        priceLabel.setLabelFor(priceFormattedTextField);
        priceLabel.setText("Preço:");
        productDataPane.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        CadProductArea.add(productDataPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 550, 350));
        productDataPane.getAccessibleContext().setAccessibleName("Dados do Produto");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvarbuttonblue97x25.png"))); // NOI18N
        btnSave.setToolTipText("Salvar Cadastro");
        btnSave.setContentAreaFilled(false);
        btnSave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvarbuttongreen97x25.png"))); // NOI18N
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        CadProductArea.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 580, 97, 25));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelbuttonblue96x25.png"))); // NOI18N
        btnCancel.setToolTipText("");
        btnCancel.setContentAreaFilled(false);
        btnCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelbuttonblackwhite96x25.png"))); // NOI18N
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        CadProductArea.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 96, 25));

        jPanel1.setBackground(new java.awt.Color(231, 233, 236));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 101, 103), 1, true), "Encontre o Produto"));

        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Tipo", "ID", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(listTable);

        prodTField.setToolTipText("");
        prodTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prodTFieldKeyPressed(evt);
            }
        });

        sProdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Tipo", "ID" }));

        searchBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttonblue96x25.png"))); // NOI18N
        searchBttn.setContentAreaFilled(false);
        searchBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchBttn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttongreen96x25.png"))); // NOI18N
        searchBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBttnMouseClicked(evt);
            }
        });

        OKBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/okbuttonblue96x25.png"))); // NOI18N
        OKBttn.setContentAreaFilled(false);
        OKBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OKBttn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/okbuttongreen96x25.png"))); // NOI18N
        OKBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKBttnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(sProdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(prodTField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OKBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OKBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prodTField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sProdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        CadProductArea.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 550, 170));

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

    private void productNameTFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameTFieldActionPerformed

    }//GEN-LAST:event_productNameTFieldActionPerformed

    //Texto Sumir ao ganhar Foco//
    private void productNameTFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productNameTFieldFocusGained
        // TODO add your handling code here:
        if (productNameTField.getText().equals("") || productNameTField.getText().equals("Nome do Produto")) {
            productNameTField.setText("");
        }
    }//GEN-LAST:event_productNameTFieldFocusGained

    private void productNameTFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productNameTFieldFocusLost
        // TODO add your handling code here:
        if (productNameTField.getText().equals("") || productNameTField.getText().equals("Nome do Produto")) {
            productNameTField.setText("Nome do Produto");
        }
    }//GEN-LAST:event_productNameTFieldFocusLost

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        ModProduto p = new ModProduto();
        DaoProduto produtoDao = new DaoProduto();
        String IDProd;
        IDProd = listTable.getValueAt(listTable.getSelectedRow(), 2).toString();
        //PRRENCHE OS CAMPOS COM OS DADOS DO PRODUTO
        p.setNomeProduto(productNameTField.getText());
        p.setDescProduto(descriptionTextArea.getText());
        p.setTipoProduto(typeProductComboBox.getSelectedItem().toString());
        p.setQtdProduto((int) quantitySpinner.getValue());
        p.setPrecoProduto(p.formatPrecoToDouble(priceFormattedTextField.getText()));
        //Atualiza os dados do Produto no banco de Dados
        produtoDao.Update(p, IDProd);

        this.dispose();
    }//GEN-LAST:event_btnSaveMouseClicked

    private void descriptionTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descriptionTextAreaFocusGained

        if (descriptionTextArea.getText().equals("") || descriptionTextArea.getText().equals("Descrição do Produto")) {
            descriptionTextArea.setText("");
        }
    }//GEN-LAST:event_descriptionTextAreaFocusGained

    private void descriptionTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descriptionTextAreaFocusLost
        if (descriptionTextArea.getText().equals("") || descriptionTextArea.getText().equals("Descrição do Produto")) {
            descriptionTextArea.setText("Descrição do Produto");
        }
    }//GEN-LAST:event_descriptionTextAreaFocusLost

    private void backgroundPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_backgroundPanelMouseDragged

    private void backgroundPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_backgroundPanelMousePressed

    private void searchBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBttnMouseClicked
        DaoProduto pDao = new DaoProduto();
        DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
        String IDProd;
        IDProd = prodTField.getText();
        //ORGANIZA AS COLUNAS PARA RECEBER A LISTA DE PRODUTOS//
        modelo.setColumnIdentifiers(new Object[]{
            "Produto",
            "Tipo",
            "ID",
            "Preço",
            "Quantidade"
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
                    p.getQtdProduto(),});
            }
        } else if (sProdComboBox.getSelectedItem().equals("Nome")) {
            modelo.setNumRows(0);
            for (ModProduto p : pDao.ReadByName(IDProd)) {
                modelo.addRow(new Object[]{
                    p.getNomeProduto(),
                    p.getTipoProduto(),
                    p.getIdProduto(),
                    p.formatPrecoToReal(p.getPrecoProduto()),
                    p.getQtdProduto(),});
            }
        } else if (sProdComboBox.getSelectedItem().equals("Tipo")) {
            modelo.setNumRows(0);
            for (ModProduto p : pDao.ReadByType(IDProd)) {
                modelo.addRow(new Object[]{
                    p.getNomeProduto(),
                    p.getTipoProduto(),
                    p.getIdProduto(),
                    p.formatPrecoToReal(p.getPrecoProduto()),
                    p.getQtdProduto(),});
            }
        }
    }//GEN-LAST:event_searchBttnMouseClicked

    private void OKBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKBttnMouseClicked
        DaoProduto pDao = new DaoProduto();
        //PEGA O ID DO CLIENTE SELECIONADO E BUSCA TODOS OS DADOS NO BD//
        String IDProd;
        IDProd = listTable.getValueAt(listTable.getSelectedRow(), 2).toString();
        ModProduto p = pDao.getByID(IDProd);

        //PREENCHE AS AREAS
        productNameTField.setText(p.getNomeProduto());
        descriptionTextArea.setText(p.getDescProduto());
        typeProductComboBox.setSelectedItem(p.getTipoProduto());
        quantitySpinner.setValue(p.getQtdProduto());
        priceFormattedTextField.setValue(p.getPrecoProduto());


    }//GEN-LAST:event_OKBttnMouseClicked

    private void prodTFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodTFieldKeyPressed
        if(evt.getExtendedKeyCode() == evt.VK_ENTER){
                    DaoProduto pDao = new DaoProduto();
        DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
        String IDProd;
        IDProd = prodTField.getText();
        //ORGANIZA AS COLUNAS PARA RECEBER A LISTA DE PRODUTOS//
        modelo.setColumnIdentifiers(new Object[]{
            "Produto",
            "Tipo",
            "ID",
            "Preço",
            "Quantidade"
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
                    p.getQtdProduto(),});
            }
        } else if (sProdComboBox.getSelectedItem().equals("Nome")) {
            modelo.setNumRows(0);
            for (ModProduto p : pDao.ReadByName(IDProd)) {
                modelo.addRow(new Object[]{
                    p.getNomeProduto(),
                    p.getTipoProduto(),
                    p.getIdProduto(),
                    p.formatPrecoToReal(p.getPrecoProduto()),
                    p.getQtdProduto(),});
            }
        } else if (sProdComboBox.getSelectedItem().equals("Tipo")) {
            modelo.setNumRows(0);
            for (ModProduto p : pDao.ReadByType(IDProd)) {
                modelo.addRow(new Object[]{
                    p.getNomeProduto(),
                    p.getTipoProduto(),
                    p.getIdProduto(),
                    p.formatPrecoToReal(p.getPrecoProduto()),
                    p.getQtdProduto(),});
            }
        }
        }
    }//GEN-LAST:event_prodTFieldKeyPressed

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
                new UpdateProductView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadProductArea;
    private javax.swing.JButton OKBttn;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupPFOrPJ;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel descriptionProductLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listTable;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JFormattedTextField priceFormattedTextField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField prodTField;
    private javax.swing.JPanel productDataPane;
    private javax.swing.JTextField productNameTField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JComboBox<String> sProdComboBox;
    private javax.swing.JButton searchBttn;
    private javax.swing.JComboBox<String> typeProductComboBox;
    private javax.swing.JLabel typeProductLabel;
    // End of variables declaration//GEN-END:variables
}
