package View;


import Controle.DaoCliente;
import Controle.DaoProduto;
import Model.ModCliente;
import Model.ModProduto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RemoveProductView extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public RemoveProductView() {
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
        sProdBtn = new javax.swing.JButton();
        ProdTField = new javax.swing.JTextField();
        sProdComboBox = new javax.swing.JComboBox<>();
        btnCancel = new javax.swing.JButton();
        removeBttn = new javax.swing.JButton();

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
                "Produto", "Tipo", "ID", "Preço", "Quantidade", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        listTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(listTable);
        if (listTable.getColumnModel().getColumnCount() > 0) {
            listTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        productDataPane.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 510, 420));

        sProdBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttonblue96x25.png"))); // NOI18N
        sProdBtn.setContentAreaFilled(false);
        sProdBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sProdBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttongreen96x25.png"))); // NOI18N
        sProdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sProdBtnMouseClicked(evt);
            }
        });
        productDataPane.add(sProdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 96, 25));

        ProdTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProdTFieldKeyPressed(evt);
            }
        });
        productDataPane.add(ProdTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 130, 26));

        sProdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Tipo", "ID" }));
        productDataPane.add(sProdComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, 24));

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

        removeBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removebuttonblue96x25.png"))); // NOI18N
        removeBttn.setContentAreaFilled(false);
        removeBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        removeBttn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removebuttongray96x25.png"))); // NOI18N
        removeBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBttnMouseClicked(evt);
            }
        });
        CadProductArea.add(removeBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 96, 26));

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

    private void backgroundPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_backgroundPanelMouseDragged

    private void backgroundPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_backgroundPanelMousePressed

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

    private void removeBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeBttnMouseClicked
        /**
         * @param selected pega o número da linha selecionada pelo cliente
         * @param cliente Verifica se o que o usuario selecionou foi um cliente
         * ou Produto
         * @param produto Verifica se o que o usuario selecionou foi um cliente
         * ou Produto
         * @param confirm Verifica se o usuário quer mesmo deletar a linha
         * selecionada
         */
        int selected = listTable.getSelectedRow();
        String confirmText;
        int confirm;
        confirmText = "Deseja remover o cadastro selecionado?";
        confirm = JOptionPane.showConfirmDialog(this, confirmText, "Remover", 0);
        //VERIFICA SE O USUARIO CONFIRMOU A EXCLUSÃO
        if (confirm == 0) {
            DaoProduto pDao = new DaoProduto();
            String IDProd = listTable.getValueAt(listTable.getSelectedRow(), 2).toString();
            pDao.Remove(IDProd);
            DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
            modelo.removeRow(selected);
        } else {

        }

    }//GEN-LAST:event_removeBttnMouseClicked

    private void ProdTFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProdTFieldKeyPressed
        if (evt.getExtendedKeyCode() == evt.VK_ENTER) {
            DaoProduto pDao = new DaoProduto();
            DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
            String IDProd;
            IDProd = ProdTField.getText();
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
                new RemoveProductView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadProductArea;
    private javax.swing.JTextField ProdTField;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupPFOrPJ;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listTable;
    private javax.swing.JPanel productDataPane;
    private javax.swing.JButton removeBttn;
    private javax.swing.JButton sProdBtn;
    private javax.swing.JComboBox<String> sProdComboBox;
    // End of variables declaration//GEN-END:variables
}
