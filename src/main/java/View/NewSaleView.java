package View;


import Controle.DaoCliente;
import Controle.DaoProduto;
import Controle.DaoVenda;
import Model.ModProduto;
import Model.ModVendas;
import Model.ModCliente;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewSaleView extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public NewSaleView() {
        initComponents();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        CadProductArea = new javax.swing.JPanel();
        productDataPane = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        totalValueLabel = new javax.swing.JLabel();
        addPButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        IDTField = new javax.swing.JTextField();
        searchBttn = new javax.swing.JButton();
        searchComboBox = new javax.swing.JComboBox<>();
        showAllCheckBox = new javax.swing.JCheckBox();
        valueTField = new javax.swing.JTextField();
        removeBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        searchTField = new javax.swing.JTextField();
        sClientComboBox = new javax.swing.JComboBox<>();
        ClienteLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        VendaLabel = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        salesBtn = new javax.swing.JButton();

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

            },
            new String [] {
                "Produto", "Tipo", "ID", "Valor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(salesTable);

        productDataPane.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 510, 180));

        totalValueLabel.setText("Valor Total:");
        productDataPane.add(totalValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, -1, -1));

        addPButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addbuttonblue96x25.png"))); // NOI18N
        addPButton.setContentAreaFilled(false);
        addPButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addbuttongreen96x25.png"))); // NOI18N
        addPButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPButtonMouseClicked(evt);
            }
        });
        productDataPane.add(addPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 96, 25));

        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Tipo ", "ID", "Preço", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productsTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                productsTableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(productsTable);

        productDataPane.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 510, 90));

        IDTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDTFieldKeyPressed(evt);
            }
        });
        productDataPane.add(IDTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 100, 24));

        searchBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttonblue96x25.png"))); // NOI18N
        searchBttn.setContentAreaFilled(false);
        searchBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchBttn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttongreen96x25.png"))); // NOI18N
        searchBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBttnMouseClicked(evt);
            }
        });
        productDataPane.add(searchBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 96, 25));

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "Tipo" }));
        searchComboBox.setSelectedIndex(1);
        productDataPane.add(searchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 75, 26));

        showAllCheckBox.setText("Mostrar Todos");
        showAllCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                showAllCheckBoxStateChanged(evt);
            }
        });
        productDataPane.add(showAllCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));
        productDataPane.add(valueTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 150, -1));

        removeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removebuttonblue96x25.png"))); // NOI18N
        removeBtn.setContentAreaFilled(false);
        removeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removebuttongray96x25.png"))); // NOI18N
        removeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBtnMouseClicked(evt);
            }
        });
        productDataPane.add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 96, 25));

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
        jScrollPane3.setViewportView(listTable);

        productDataPane.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 510, 60));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttonblue96x25.png"))); // NOI18N
        searchButton.setContentAreaFilled(false);
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchbuttongreen96x25.png"))); // NOI18N
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        productDataPane.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 96, 25));

        searchTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTFieldKeyPressed(evt);
            }
        });
        productDataPane.add(searchTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 100, 26));

        sClientComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Sobrenome", "ID", "CPF", "CNPJ" }));
        productDataPane.add(sClientComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 75, 26));

        ClienteLabel.setText("Cliente:");
        productDataPane.add(ClienteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel1.setText("Produto:");
        productDataPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        VendaLabel.setText("Venda:");
        productDataPane.add(VendaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        CadProductArea.add(productDataPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 550, 550));
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

        salesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generatebuttonblue96x25.png"))); // NOI18N
        salesBtn.setContentAreaFilled(false);
        salesBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generatebuttongreen96x25.png"))); // NOI18N
        salesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesBtnMouseClicked(evt);
            }
        });
        CadProductArea.add(salesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 96, 25));

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

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        ModVendas v = new ModVendas();
        DaoVenda vDao = new DaoVenda();

        int qtdDeProd = 0, somaProd, CodVenda;
        LocalDate data = LocalDate.now();

        int rowCount = salesTable.getRowCount();
        System.out.println(rowCount);

        //Soma a quantidade de Produtos da Venda//
        if (rowCount > 0) {
            for (int i = 0; i < rowCount; i++) {
                somaProd = (int) salesTable.getValueAt(i, 4);
                qtdDeProd += somaProd;
            }
        }
        System.out.println(qtdDeProd);
        CodVenda = vDao.GetVendaNumber();

        //Registra a Venda no Banco de Dados//
        for (int i = 0; i < rowCount; i++) {
            v.setIdCliente((int) listTable.getValueAt(listTable.getSelectedRow(), 0));
            v.setVenda(CodVenda);
            v.setCodProduto((int) salesTable.getValueAt(i, 2));
            v.setValor(formatToDouble(valueTField.getText()));
            v.setDataVenda(data.toString());
            v.setTotalProdutos(qtdDeProd);
            v.setqtdProduto((int) salesTable.getValueAt(i, 4));

            vDao.Salvar(v);
        }

        this.dispose();
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        ModVendas v = new ModVendas();
        int qtdDeProd = 0, somaProd, CodVenda;
        DaoVenda vDao = new DaoVenda();
        LocalDate data = LocalDate.now();
        int rowCount = salesTable.getRowCount();
        System.out.println(rowCount);

        //Soma a quantidade de Produtos da Venda//
        if (rowCount > 0) {
            for (int i = 0; i < rowCount; i++) {
                somaProd = (int) salesTable.getValueAt(i, 4);
                qtdDeProd += somaProd;
            }
        }
        System.out.println(qtdDeProd);
        CodVenda = vDao.GetVendaNumber();
        //Gera um código para a venda atual//

        //Registra a Venda no Banco de Dados//
        for (int i = 0; i < rowCount; i++) {
            v.setVenda(CodVenda);
            v.setCodProduto((int) salesTable.getValueAt(i, 2));
            v.setValor(formatToDouble(valueTField.getText()));
            v.setDataVenda(data.toString());
            v.setTotalProdutos(qtdDeProd);
            v.setqtdProduto((int) salesTable.getValueAt(i, 4));

            vDao.Salvar(v);
        }
        NewSaleView newSale = new NewSaleView();
        newSale.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNextMouseClicked

    private void backgroundPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_backgroundPanelMouseDragged

    private void backgroundPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_backgroundPanelMousePressed

    private void productsTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productsTableFocusGained

    }//GEN-LAST:event_productsTableFocusGained

    private void addPButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPButtonMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) salesTable.getModel();
        //TESTA SE A QUANTIDADE DE PRODUTOS DISPONÍVEIS É MAIOR QUE 0
        if ((int) productsTable.getValueAt(productsTable.getSelectedRow(), 4) > 0) {
            int qtd = 1, rowCount, soma, sub;
            boolean added = false;
            rowCount = salesTable.getRowCount();
            //VERIFICA SE O PRODUTO JA FOI ADICIONADO ANTERIORMENTE, CASO TENHA SIDO APENAS ACRESCENTA +1 A QUANTIDADE//
            for (int i = 0; i < rowCount; i++) {
                if (productsTable.getValueAt(productsTable.getSelectedRow(), 2).equals(salesTable.getValueAt(i, 2))) {
                    added = true;
                    soma = qtd + (int) salesTable.getValueAt(i, 4);
                    salesTable.setValueAt(soma, i, 4);
                    //SUBTRAI O PRODUTO ADICIONADO DA TABELA DE PRODUTOS
                    sub = (int) productsTable.getValueAt(productsTable.getSelectedRow(), 4) - qtd;
                    productsTable.setValueAt(sub, productsTable.getSelectedRow(), 4);

                };
            }
            //ADICIONA O PRODUTO NOVO NA TABELA DE VENDA//
            if (added == false) {
                modelo.addRow(new Object[]{
                    productsTable.getValueAt(productsTable.getSelectedRow(), 0),
                    productsTable.getValueAt(productsTable.getSelectedRow(), 1),
                    productsTable.getValueAt(productsTable.getSelectedRow(), 2),
                    productsTable.getValueAt(productsTable.getSelectedRow(), 3),
                    qtd,});
                //SUBTRAI O PRODUTO ADICIONADO DA TABELA DE PRODUTOS
                sub = (int) productsTable.getValueAt(productsTable.getSelectedRow(), 4) - qtd;
                productsTable.setValueAt(sub, productsTable.getSelectedRow(), 4);
            } else {

            }

            //ALTERA O VALOR NA CAIXA DE VALOR TOTAL//
            double somaTotal = 0, preco, qtdMult;
            String res;
            rowCount = salesTable.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                preco = formatToDouble(String.valueOf(salesTable.getValueAt(i, 3)));
                qtdMult = (int) salesTable.getValueAt(i, 4);
                somaTotal += (preco * qtdMult);
            }
            res = formatToReal(somaTotal);
            valueTField.setText(res);
        } else {
            String message = "Este Produto não está disponível no estoque";
            JOptionPane.showMessageDialog(this, message);
        }
    }//GEN-LAST:event_addPButtonMouseClicked

    private void searchBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBttnMouseClicked
        //VERIFICA SE O CHECKBOX SHOW ALL ESTÁ ATIVO//
        if (showAllCheckBox.isSelected()) {
            showAllCheckBox.doClick();
        } else {

        }
        //PESQUISA DE ACORDO COM O ID, NOME OU TIPO//
        DaoProduto pDao = new DaoProduto();
        DefaultTableModel modelo = (DefaultTableModel) productsTable.getModel();
        String IDProd;
        IDProd = IDTField.getText();
        if (searchComboBox.getSelectedItem().equals("ID")) {
            modelo.setNumRows(0);
            for (ModProduto p : pDao.ReadByCode(IDProd)) {
                modelo.addRow(new Object[]{
                    p.getNomeProduto(),
                    p.getTipoProduto(),
                    p.getIdProduto(),
                    p.formatPrecoToReal(p.getPrecoProduto()),
                    p.getQtdProduto(),});
            }
        } else if (searchComboBox.getSelectedItem().equals("Nome")) {
            modelo.setNumRows(0);
            for (ModProduto p : pDao.ReadByName(IDProd)) {
                modelo.addRow(new Object[]{
                    p.getNomeProduto(),
                    p.getTipoProduto(),
                    p.getIdProduto(),
                    p.formatPrecoToReal(p.getPrecoProduto()),
                    p.getQtdProduto(),});
            }
        } else if (searchComboBox.getSelectedItem().equals("Tipo")) {
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

    private void salesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesBtnMouseClicked
        new SalesView().setVisible(true);
    }//GEN-LAST:event_salesBtnMouseClicked

    private void removeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeBtnMouseClicked
        //Subtrai o valor//
        /**
         * @param valor VALOR ATUAL NA CAIXA DE VALOR TOTAL
         * @param valorFinal VALOR FINAL DEPOIS DO CALCULO A SER COLOCADO NA
         * CAIXA DE VALOR TOTAL EM FORMATO DE REAIS
         * @param valorD VALOR RETIRADO DO FORMATO EM REAIS E TRANSFORMADO EM
         * DOUBLE
         * @param qtdMult QUANTIDADE DE PRODUTOS QUE VAO MULTIPLICAR O PREÇO
         * PARA QUE SEJA REALIZADA A SUBTRAÇAO DO TOTAL
         * @param valorTotal PREÇO DO PRODUTO MULTIPLICADO PELA SUA QUANTIDADE
         * PARA SER SUBTRAÍDO
         * @param result VALOR TOTAL SUBTRAIDO PELO VALOR DOS PRODUTOS REMOVIDOS
         */
        String valor, valorFinal;
        double valorD, valorTotal, preco, qtdMult, result;
        int selected;
        selected = salesTable.getSelectedRow();
        valor = valueTField.getText();
        preco = formatToDouble(String.valueOf(salesTable.getValueAt(selected, 3)));
        qtdMult = (int) salesTable.getValueAt(selected, 4);
        valorTotal = qtdMult * preco;
        valorD = formatToDouble(valor);
        result = valorD - valorTotal;
        valorFinal = formatToReal(result);
        valueTField.setText(valorFinal);
        //RE-ADICIONA A QUANTIDADE DO PRODUTO NA TABELA DE PRODUTOS
        for (int i = 0; i < productsTable.getRowCount(); i++) {
            if (productsTable.getValueAt(i, 2).equals(salesTable.getValueAt(salesTable.getSelectedRow(), 2))) {
                int qtd = (int) productsTable.getValueAt(i, 4);
                qtd += (int) salesTable.getValueAt(selected, 4);
                productsTable.setValueAt(qtd, i, 4);
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) salesTable.getModel();
        modelo.removeRow(selected);

    }//GEN-LAST:event_removeBtnMouseClicked

    private void IDTFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTFieldKeyPressed
        if (evt.getExtendedKeyCode() == evt.VK_ENTER) {
            //VERIFICA SE O CHECKBOX SHOW ALL ESTÁ ATIVO//
            if (showAllCheckBox.isSelected()) {
                showAllCheckBox.doClick();
            } else {

            }
            //PESQUISA DE ACORDO COM O ID, NOME OU TIPO//
            DaoProduto pDao = new DaoProduto();
            DefaultTableModel modelo = (DefaultTableModel) productsTable.getModel();
            String IDProd;
            IDProd = IDTField.getText();
            if (searchComboBox.getSelectedItem().equals("ID")) {
                modelo.setNumRows(0);
                for (ModProduto p : pDao.ReadByCode(IDProd)) {
                    modelo.addRow(new Object[]{
                        p.getNomeProduto(),
                        p.getTipoProduto(),
                        p.getIdProduto(),
                        p.formatPrecoToReal(p.getPrecoProduto()),
                        p.getQtdProduto(),});
                }
            } else if (searchComboBox.getSelectedItem().equals("Nome")) {
                modelo.setNumRows(0);
                for (ModProduto p : pDao.ReadByName(IDProd)) {
                    modelo.addRow(new Object[]{
                        p.getNomeProduto(),
                        p.getTipoProduto(),
                        p.getIdProduto(),
                        p.formatPrecoToReal(p.getPrecoProduto()),
                        p.getQtdProduto(),});
                }
            } else if (searchComboBox.getSelectedItem().equals("Tipo")) {
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
    }//GEN-LAST:event_IDTFieldKeyPressed

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

    private void showAllCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_showAllCheckBoxStateChanged
        DefaultTableModel modelo = (DefaultTableModel) productsTable.getModel();
        if (showAllCheckBox.isSelected()) {
            DaoProduto pDao = new DaoProduto();
            modelo.setNumRows(0);
            modelo.setColumnIdentifiers(new Object[]{
                "Produto",
                "Tipo",
                "ID",
                "Preço",
                "Quantidade",});
            for (ModProduto p : pDao.Read()) {
                modelo.addRow(new Object[]{
                    p.getNomeProduto(),
                    p.getTipoProduto(),
                    p.getIdProduto(),
                    p.formatPrecoToReal(p.getPrecoProduto()),
                    p.getQtdProduto(),});
            }
        } else {
            
        }

    }//GEN-LAST:event_showAllCheckBoxStateChanged

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
                new NewSaleView().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadProductArea;
    private javax.swing.JLabel ClienteLabel;
    private javax.swing.JTextField IDTField;
    private javax.swing.JLabel VendaLabel;
    private javax.swing.JButton addPButton;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable listTable;
    private javax.swing.JPanel productDataPane;
    private javax.swing.JTable productsTable;
    private javax.swing.JButton removeBtn;
    private javax.swing.JComboBox<String> sClientComboBox;
    private javax.swing.JButton salesBtn;
    private javax.swing.JTable salesTable;
    private javax.swing.JButton searchBttn;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchTField;
    private javax.swing.JCheckBox showAllCheckBox;
    private javax.swing.JLabel totalValueLabel;
    private javax.swing.JTextField valueTField;
    // End of variables declaration//GEN-END:variables
}
