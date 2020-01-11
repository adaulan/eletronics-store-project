/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author User
 */
public class ModProduto {
    private int idProduto;
    private String nomeProduto;
    private String descProduto;
    private String tipoProduto;
    private int qtdProduto;
    private double precoProduto;
    

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    
    public double formatPrecoToDouble(String precoProduto){
        double precoNovo;String precoFormatado;
        precoFormatado = precoProduto.replaceAll("\\.", "").replaceAll("\\,", ".");
        precoNovo = Double.parseDouble(precoFormatado);
        return precoNovo;  
    }
    
    public String formatPrecoToReal (double preco){
        Locale ptBr = new Locale("pt", "Br");
        NumberFormat nf = NumberFormat.getCurrencyInstance(ptBr);
        String formatado = nf.format(preco);
        return formatado;
    }
}
