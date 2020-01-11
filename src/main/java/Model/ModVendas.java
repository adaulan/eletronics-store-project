/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Valter lafuente junior
 */
public class ModVendas {

    private int idCliente;
    private String nomeCliente;
    private int codProduto;
    private int venda;
    private double valor;
    private int qtdProduto;
    private String dataVenda;
    private int totalProdutos;
    private String nomeProduto;
    private double valorProd;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorProd() {
        return valorProd;
    }

    public void setValorProd(double valorProd) {
        this.valorProd = valorProd;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getTotalProdutos() {
        return totalProdutos;
    }

    public void setTotalProdutos(int totalProdutos) {
        this.totalProdutos = totalProdutos;
    }

    public ModVendas() {

    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int CodProduto) {
        this.codProduto = CodProduto;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int Venda) {
        this.venda = Venda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double Valor) {
        this.valor = Valor;
    }

    public int getqtdProduto() {
        return qtdProduto;
    }

    public void setqtdProduto(int qProdutos) {
        this.qtdProduto = qProdutos;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String DataVenda) {
        this.dataVenda = DataVenda;
    }

}
