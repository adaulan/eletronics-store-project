package View;


import Controle.DaoCliente;
import Controle.DaoProduto;
import Model.ModCliente;
import Model.ModProduto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RemoveClientView extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public RemoveClientView() {
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
        ClientTField = new javax.swing.JTextField();
        sClientComboBox = new javax.swing.JComboBox<>();
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
                "ID", "Nome", "Sobrenome", "CPF/CNPJ", "Data de Nascimento", "Genero", "Telefone", "Celular", "E-mail", "Estado", "Cidade", "Bairro", "Rua", "Casa", ""
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

        productDataPane.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 510, 420));

        sClientBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttonblue96x25.png"))); // NOI18N
        sClientBtn.setContentAreaFilled(false);
        sClientBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttongreen96x25.png"))); // NOI18N
        sClientBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sClientBtnMouseClicked(evt);
            }
        });
        sClientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sClientBtnActionPerformed(evt);
            }
        });
        productDataPane.add(sClientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 96, 25));

        ClientTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ClientTFieldKeyPressed(evt);
            }
        });
        productDataPane.add(ClientTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 130, 26));

        sClientComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Sobrenome", "ID", "CPF", "CNPJ" }));
        productDataPane.add(sClientComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, 24));

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

    private void sClientBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sClientBtnMouseClicked
        DaoCliente cDao = new DaoCliente();
        DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
        String IDClient;
        IDClient = ClientTField.getText();
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
        String confirmText, CPForCNPJ;
        int confirm;
        confirmText = "Deseja remover o cadastro selecionado?";
        confirm = JOptionPane.showConfirmDialog(this, confirmText, "Remover", 0);
        CPForCNPJ = listTable.getValueAt(listTable.getSelectedRow(), 3).toString();
        //VERIFICA SE O USUARIO CONFIRMOU A EXCLUSÃO
        if (confirm == 0) {
            //VERIFICA SE O CLIENTE É PESSOA FISICA OU JURIDICA
            //CASO PESSOA FISICA
            if (CPForCNPJ.length() <= 14) {
                DaoCliente cDao = new DaoCliente();
                String IDCliente = listTable.getValueAt(listTable.getSelectedRow(), 0).toString();
                cDao.Remove(IDCliente);
                DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
                modelo.removeRow(selected);
            } //CASO PESSOA JURIDICA
            else if (CPForCNPJ.length() > 14) {
                DaoCliente cDao = new DaoCliente();
                String IDCliente = listTable.getValueAt(listTable.getSelectedRow(), 0).toString();
                cDao.RemovePJ(IDCliente);
                DefaultTableModel modelo = (DefaultTableModel) listTable.getModel();
                modelo.removeRow(selected);
            }

        } else {

        }

    }//GEN-LAST:event_removeBttnMouseClicked

    private void sClientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sClientBtnActionPerformed
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
    }//GEN-LAST:event_sClientBtnActionPerformed

    private void ClientTFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClientTFieldKeyPressed
        if (evt.getExtendedKeyCode() == evt.VK_ENTER) {
            sClientBtn.doClick();
        }
    }//GEN-LAST:event_ClientTFieldKeyPressed

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
                new RemoveClientView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadProductArea;
    private javax.swing.JTextField ClientTField;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupPFOrPJ;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listTable;
    private javax.swing.JPanel productDataPane;
    private javax.swing.JButton removeBttn;
    private javax.swing.JButton sClientBtn;
    private javax.swing.JComboBox<String> sClientComboBox;
    // End of variables declaration//GEN-END:variables
}
