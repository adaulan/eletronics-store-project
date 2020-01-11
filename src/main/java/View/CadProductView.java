package View;


import Controle.DaoProduto;
import Model.ModProduto;


public class CadProductView extends javax.swing.JFrame {
    int xMouse;
    int yMouse;

    public CadProductView() {
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
        jPanel2 = new javax.swing.JPanel();
        priceFormattedTextField = new javax.swing.JFormattedTextField();
        priceLabel = new javax.swing.JLabel();
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

        jPanel2.setBackground(new java.awt.Color(231, 233, 236));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 101, 103), 1, true), "Imagens do Produto"));
        jPanel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );

        productDataPane.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 500, 200));

        priceFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        productDataPane.add(priceFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 100, 26));

        priceLabel.setLabelFor(priceFormattedTextField);
        priceLabel.setText("Preço:");
        productDataPane.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        CadProductArea.add(productDataPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 550, 530));
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

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nextbuttonblue97x25.png"))); // NOI18N
        btnNext.setToolTipText("Salvar e Abrir um novo formulário");
        btnNext.setContentAreaFilled(false);
        btnNext.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nextbuttongreen97x25.png"))); // NOI18N
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });
        CadProductArea.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 97, 25));

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

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        ModProduto p = new ModProduto();
        DaoProduto produtoDao = new DaoProduto();

        p.setNomeProduto(productNameTField.getText());
        p.setDescProduto(descriptionTextArea.getText());
        p.setTipoProduto(typeProductComboBox.getSelectedItem().toString());
        p.setQtdProduto((int) quantitySpinner.getValue());
        p.setPrecoProduto(p.formatPrecoToDouble(priceFormattedTextField.getText()));
        
        produtoDao.Salvar(p);
        CadProductView novoCad = new CadProductView();
        novoCad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNextMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        ModProduto p = new ModProduto();
        DaoProduto produtoDao = new DaoProduto();
        
        p.setNomeProduto(productNameTField.getText());
        p.setDescProduto(descriptionTextArea.getText());
        p.setTipoProduto(typeProductComboBox.getSelectedItem().toString());
        p.setQtdProduto((int) quantitySpinner.getValue());
        p.setPrecoProduto(p.formatPrecoToDouble(priceFormattedTextField.getText()));
        
        produtoDao.Salvar(p);
        
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
                new CadProductView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadProductArea;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupPFOrPJ;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel descriptionProductLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JFormattedTextField priceFormattedTextField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JPanel productDataPane;
    private javax.swing.JTextField productNameTField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JComboBox<String> typeProductComboBox;
    private javax.swing.JLabel typeProductLabel;
    // End of variables declaration//GEN-END:variables
}
