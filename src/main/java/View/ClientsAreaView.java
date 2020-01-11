package View;


public class ClientsAreaView extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public ClientsAreaView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        ClientsAreaPane = new javax.swing.JPanel();
        btnCadClient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnReturnMain = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        updateBttn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        HeaderLabel = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgroundPanel.setBackground(new java.awt.Color(51, 51, 51));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(600, 500));
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

        ClientsAreaPane.setBackground(new java.awt.Color(250, 250, 250));
        ClientsAreaPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 2, true));
        ClientsAreaPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadClient.setBackground(new java.awt.Color(102, 102, 102));
        btnCadClient.setForeground(new java.awt.Color(102, 102, 102));
        btnCadClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CadClient100x100.png"))); // NOI18N
        btnCadClient.setBorder(null);
        btnCadClient.setBorderPainted(false);
        btnCadClient.setContentAreaFilled(false);
        btnCadClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadClient.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CadClient100x100green.png"))); // NOI18N
        btnCadClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadClientMouseClicked(evt);
            }
        });
        ClientsAreaPane.add(btnCadClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 119, 100, 100));

        jLabel1.setForeground(new java.awt.Color(45, 45, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(btnCadClient);
        jLabel1.setText("Cadastrar Clientes");
        ClientsAreaPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 130, -1));

        btnReturnMain.setBackground(new java.awt.Color(102, 102, 102));
        btnReturnMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return100x100.png"))); // NOI18N
        btnReturnMain.setContentAreaFilled(false);
        btnReturnMain.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReturnMain.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return100x100green.png"))); // NOI18N
        btnReturnMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMainMouseClicked(evt);
            }
        });
        ClientsAreaPane.add(btnReturnMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 100, 100));

        jLabel2.setForeground(new java.awt.Color(45, 45, 81));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setLabelFor(btnReturnMain);
        jLabel2.setText("Retornar");
        ClientsAreaPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 124, -1));

        updateBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change100x100.png"))); // NOI18N
        updateBttn.setContentAreaFilled(false);
        updateBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateBttn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change100x100green.png"))); // NOI18N
        updateBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBttnMouseClicked(evt);
            }
        });
        ClientsAreaPane.add(updateBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 260, 100, 100));
        updateBttn.getAccessibleContext().setAccessibleName("btnSearch");
        updateBttn.getAccessibleContext().setAccessibleDescription("");

        jLabel3.setForeground(new java.awt.Color(45, 45, 81));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Alterar Clientes");
        ClientsAreaPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 130, -1));

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove100x100.png"))); // NOI18N
        btnRemove.setContentAreaFilled(false);
        btnRemove.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemove.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removeuser100x100.png"))); // NOI18N
        btnRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveMouseClicked(evt);
            }
        });
        ClientsAreaPane.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 100, 100));

        jLabel4.setForeground(new java.awt.Color(45, 45, 81));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setLabelFor(btnRemove);
        jLabel4.setText("Remover Clientes");
        ClientsAreaPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 100, -1));

        HeaderLabel.setBackground(new java.awt.Color(250, 250, 250));
        HeaderLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Header450x.png"))); // NOI18N
        HeaderLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 2, true));
        ClientsAreaPane.add(HeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 100));
        HeaderLabel.getAccessibleContext().setAccessibleName("Header");

        backgroundPanel.add(ClientsAreaPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 40, 450, 430));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closebuttonred25x25.png"))); // NOI18N
        btnClose.setToolTipText("Close App");
        btnClose.setContentAreaFilled(false);
        btnClose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closebuttonred2-25x25.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        backgroundPanel.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 25, 25));
        btnClose.getAccessibleContext().setAccessibleName("btnClose");
        btnClose.getAccessibleContext().setAccessibleParent(ClientsAreaPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnReturnMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMainMouseClicked
        MainView mainView = new MainView();
        this.dispose();
        mainView.setVisible(true);
    }//GEN-LAST:event_btnReturnMainMouseClicked

    private void btnCadClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadClientMouseClicked

        new CadClientView().setVisible(true);
    }//GEN-LAST:event_btnCadClientMouseClicked

    private void backgroundPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_backgroundPanelMouseDragged

    private void backgroundPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_backgroundPanelMousePressed

    private void updateBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBttnMouseClicked
        UpdateClientView upC = new UpdateClientView();
        upC.setVisible(true);
    }//GEN-LAST:event_updateBttnMouseClicked

    private void btnRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseClicked
        RemoveClientView remove = new RemoveClientView();
        remove.setVisible(true);
    }//GEN-LAST:event_btnRemoveMouseClicked

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClientsAreaPane;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnCadClient;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReturnMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton updateBttn;
    // End of variables declaration//GEN-END:variables
}
