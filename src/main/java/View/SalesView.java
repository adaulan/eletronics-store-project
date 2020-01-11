package View;


import Controle.DaoVenda;
import Model.ModVendas;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SalesView extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public boolean testaMes(String dataInicio, String dataFim) {
        int mesInicio, mesFim, diferenca;
        boolean teste;
        mesInicio = Integer.parseInt(getMes(dataInicio));
        mesFim = Integer.parseInt(getMes(dataFim));
        diferenca = mesInicio - mesFim;
        if (diferenca == -1) {
            teste = true;
            return teste;
        } else if (diferenca == 11) {
            teste = true;
            return teste;
        } else if (diferenca == 0) {
            teste = true;
            return teste;
        } else {
            teste = false;
            return teste;
        }
    }

    public String getDia(String data) {
        String dia;
        dia = data.substring(8);
        return dia;
    }

    public String getMes(String data) {
        String mes;
        mes = data.substring(5, 7);
        return mes;
    }

    public String formatDataToSql(String data) {
        String dia, mes, ano, dataSql;
        dia = data.substring(0, 2);
        mes = data.substring(3, 5);
        ano = data.substring(6);
        dataSql = ano + "-" + mes + "-" + dia;
        return dataSql;
    }

    public String formatDataToTable(String data) {
        String dia, mes, ano, dataTable;
        ano = data.substring(0, 4);
        mes = data.substring(5, 7);
        dia = data.substring(8);
        dataTable = dia + "/" + mes + "/" + ano;
        return dataTable;
    }

    private double formatToDouble(String preco) {
        double precoNovo;
        String precoFormatado;
        precoFormatado = preco.replaceAll("\\.", "").replaceAll("\\,", ".").replaceAll("R", "").replaceAll("\\$", "");
        precoNovo = Double.parseDouble(precoFormatado);
        return precoNovo;
    }

    private String formatToReal(double preco) {
        Locale ptBr = new Locale("pt", "Br");
        NumberFormat nf = NumberFormat.getCurrencyInstance(ptBr);
        String formatado = nf.format(preco);
        return formatado;
    }

    public SalesView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        CadProductArea = new javax.swing.JPanel();
        productDataPane = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        totalValueLabel = new javax.swing.JLabel();
        periodLabel = new javax.swing.JLabel();
        firstDateFormattedTextField = new javax.swing.JFormattedTextField();
        lastDateFormattedTextField = new javax.swing.JFormattedTextField();
        firstDateLabel = new javax.swing.JLabel();
        lastDateLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        valueTField = new javax.swing.JTextField();
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
        productDataPane.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 101, 103), 1, true), "Vendas"));
        productDataPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID da Venda", "ID Cliente", "Nome do Cliente", "Data", "Produto", "ID do Produto", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        salesTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(salesTable);

        productDataPane.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 510, 390));

        totalValueLabel.setText("Valor Total:");
        productDataPane.add(totalValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        periodLabel.setText("Período:");
        productDataPane.add(periodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        try {
            firstDateFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        firstDateFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productDataPane.add(firstDateFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, 26));

        try {
            lastDateFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        lastDateFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastDateFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lastDateFormattedTextFieldKeyPressed(evt);
            }
        });
        productDataPane.add(lastDateFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 100, 26));

        firstDateLabel.setLabelFor(firstDateFormattedTextField);
        firstDateLabel.setText("Início");
        firstDateLabel.setToolTipText("");
        productDataPane.add(firstDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        lastDateLabel.setLabelFor(lastDateFormattedTextField);
        lastDateLabel.setText("Fim");
        productDataPane.add(lastDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttonblue96x25.png"))); // NOI18N
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttongreen96x25.png"))); // NOI18N
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        productDataPane.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 96, 25));
        searchButton.getAccessibleContext().setAccessibleDescription("");

        productDataPane.add(valueTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 100, 24));

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

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

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
        String dataInicio, dataFim;
        int dataLimite, diaInicio, diaFim;
        int rowCount;
        DaoVenda vDao = new DaoVenda();
        DefaultTableModel modelo = (DefaultTableModel) salesTable.getModel();
        modelo.setNumRows(0);
        dataInicio = formatDataToSql(firstDateFormattedTextField.getText());
        dataFim = formatDataToSql(lastDateFormattedTextField.getText());
        //VERIFICA SE A DATA DIGITADA ESTA DENTRO DO LIMITE MENSAL
        diaInicio = Integer.parseInt(getDia(dataInicio));
        diaFim = Integer.parseInt(getDia(dataFim));
        dataLimite = diaInicio - diaFim;
        if ((dataLimite >= 0) && (testaMes(dataInicio, dataFim) == true)) {
            
            for (ModVendas v : vDao.ReadBetweenDates(dataInicio, dataFim)) {
                modelo.addRow(new Object[]{
                    v.getVenda(),
                    v.getIdCliente(),
                    v.getNomeCliente(),
                    formatDataToTable(v.getDataVenda()),
                    v.getNomeProduto(),
                    v.getCodProduto(),
                    v.getqtdProduto(),
                    formatToReal(v.getValorProd() * v.getqtdProduto()),});
            }

            //ALTERA O VALOR NA CAIXA DE VALOR TOTAL//
            double somaTotal = 0, preco;
            String res;
            rowCount = salesTable.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                preco = formatToDouble(String.valueOf(salesTable.getValueAt(i, 7)));
                somaTotal += preco;
            }
            res = formatToReal(somaTotal);
            valueTField.setText(res);
        } else if (dataLimite < 0) {
            if (getMes(dataInicio).equals(getMes(dataFim))) {

                for (ModVendas v : vDao.ReadBetweenDates(dataInicio, dataFim)) {
                    modelo.addRow(new Object[]{
                        v.getVenda(),
                        v.getIdCliente(),
                        v.getNomeCliente(),
                        formatDataToTable(v.getDataVenda()),
                        v.getNomeProduto(),
                        v.getCodProduto(),
                        v.getqtdProduto(),
                        formatToReal(v.getValorProd() * v.getqtdProduto()),});
                }

                //ALTERA O VALOR NA CAIXA DE VALOR TOTAL//
                double somaTotal = 0, preco;
                String res;
                rowCount = salesTable.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    preco = formatToDouble(String.valueOf(salesTable.getValueAt(i, 7)));
                    somaTotal += preco;
                }
                res = formatToReal(somaTotal);
                valueTField.setText(res);
            } else {
                JOptionPane.showMessageDialog(this, "Insira datas no intervalo máximo de 1 mês");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Insira datas no intervalo máximo de 1 mês");
        }
    }//GEN-LAST:event_searchButtonMouseClicked

    private void lastDateFormattedTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastDateFormattedTextFieldKeyPressed
        if (evt.getExtendedKeyCode() == evt.VK_ENTER) {
            String dataInicio, dataFim;
            int dataLimite, diaInicio, diaFim;
            int rowCount;
            DaoVenda vDao = new DaoVenda();
            DefaultTableModel modelo = (DefaultTableModel) salesTable.getModel();
            modelo.setNumRows(0);
            dataInicio = formatDataToSql(firstDateFormattedTextField.getText());
            dataFim = formatDataToSql(lastDateFormattedTextField.getText());
            //VERIFICA SE A DATA DIGITADA ESTA DENTRO DO LIMITE MENSAL
            diaInicio = Integer.parseInt(getDia(dataInicio));
            diaFim = Integer.parseInt(getDia(dataFim));
            dataLimite = diaInicio - diaFim;
            if (dataLimite >= 0) {

                for (ModVendas v : vDao.ReadBetweenDates(dataInicio, dataFim)) {
                    modelo.addRow(new Object[]{
                        v.getVenda(),
                        v.getIdCliente(),
                        v.getNomeCliente(),
                        formatDataToTable(v.getDataVenda()),
                        v.getNomeProduto(),
                        v.getCodProduto(),
                        v.getqtdProduto(),
                        formatToReal(v.getValorProd() * v.getqtdProduto()),});
                }

                //ALTERA O VALOR NA CAIXA DE VALOR TOTAL//
                double somaTotal = 0, preco;
                String res;
                rowCount = salesTable.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    preco = formatToDouble(String.valueOf(salesTable.getValueAt(i, 7)));
                    somaTotal += preco;
                }
                res = formatToReal(somaTotal);
                valueTField.setText(res);
            } else if (dataLimite < 0) {
                if (getMes(dataInicio).equals(getMes(dataFim))) {

                    for (ModVendas v : vDao.ReadBetweenDates(dataInicio, dataFim)) {
                        modelo.addRow(new Object[]{
                            v.getVenda(),
                            v.getIdCliente(),
                            v.getNomeCliente(),
                            formatDataToTable(v.getDataVenda()),
                            v.getNomeProduto(),
                            v.getCodProduto(),
                            v.getqtdProduto(),
                            formatToReal(v.getValorProd() * v.getqtdProduto()),});
                    }

                    //ALTERA O VALOR NA CAIXA DE VALOR TOTAL//
                    double somaTotal = 0, preco;
                    String res;
                    rowCount = salesTable.getRowCount();
                    for (int i = 0; i < rowCount; i++) {
                        preco = formatToDouble(String.valueOf(salesTable.getValueAt(i, 7)));
                        somaTotal += preco;
                    }
                    res = formatToReal(somaTotal);
                    valueTField.setText(res);
                } else {
                    JOptionPane.showMessageDialog(this, "Insira datas no intervalo máximo de 1 mês após a data de inicio");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Insira datas no intervalo máximo de 1 mês após a data de inicio");
            }
        }
    }//GEN-LAST:event_lastDateFormattedTextFieldKeyPressed

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
                new SalesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadProductArea;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JFormattedTextField firstDateFormattedTextField;
    private javax.swing.JLabel firstDateLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField lastDateFormattedTextField;
    private javax.swing.JLabel lastDateLabel;
    private javax.swing.JLabel periodLabel;
    private javax.swing.JPanel productDataPane;
    private javax.swing.JTable salesTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel totalValueLabel;
    private javax.swing.JTextField valueTField;
    // End of variables declaration//GEN-END:variables
}
