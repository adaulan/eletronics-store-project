/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.ModCliente;
import Model.ModProduto;
import Model.ModVendas;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author adn_e
 */
public class DaoVenda {

    ConexaoBD conex = new ConexaoBD();
    ModVendas registro = new ModVendas();

    public void Salvar(ModVendas venda) {
        conex.conexao();
        try {
            //STATEMENTS
            PreparedStatement pst = (PreparedStatement) conex.con.prepareStatement(
                    "insert into venda(idCliente,Venda,CodProduto,"
                    + "Valor,TotalProdutos, "
                    + "Dia, qtdProduto) values(?,?,?,?,?,?,?)");
            PreparedStatement subQtd = (PreparedStatement) conex.con.prepareStatement(
                    "UPDATE produto SET Quantidade = ? WHERE CodProduto = " + Integer.toString(venda.getCodProduto()));
            //SUBTRAÇÃO DA QUANTIDADE DO PRODUTO NO BANCO DE DADOS
            DaoProduto pDao = new DaoProduto();
            ModProduto p = pDao.getByID(Integer.toString(venda.getCodProduto()));
            int qtdProd;
            qtdProd = p.getQtdProduto() - venda.getqtdProduto();
            subQtd.setInt(1, qtdProd);
            subQtd.executeUpdate();

            
            //REGISTRA A VENDA NO BANCO DE DADOS
            pst.setInt(1, venda.getIdCliente());
            pst.setInt(2, venda.getVenda());
            pst.setInt(3, venda.getCodProduto());
            pst.setDouble(4, venda.getValor());
            pst.setInt(5, venda.getTotalProdutos());
            pst.setString(6, venda.getDataVenda());
            pst.setInt(7, venda.getqtdProduto());
            
            pst.executeUpdate();

            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro sp insserir os dados" + ex);
        }
    }

    public int GetVendaNumber() {
        int CodVenda = 0;

        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt;
        ResultSet rs;

        try {
            stmt = con.prepareStatement("SELECT Venda FROM Venda");
            rs = stmt.executeQuery();

            while (rs.next()) {
                CodVenda++;
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro sp insserir os dados" + ex);
        }
        return CodVenda;
    }

    public List<ModVendas> Read() {

        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModVendas> vendas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * from produto join venda\n"
                    + "ON produto.CodProduto = venda.CodProduto\n"
                    + "join clientes ON clientes.idCliente = venda.idCliente");
            rs = stmt.executeQuery();
            
            
            while (rs.next()) {
                
                ModVendas venda = new ModVendas();
                
                venda.setIdCliente(rs.getInt("clientes.idCliente"));
                venda.setNomeCliente(rs.getString("clientes.Nome") + " " + rs.getString("clientes.Sobrenome"));
                venda.setCodProduto(rs.getInt("produto.CodProduto"));
                venda.setNomeProduto(rs.getString("produto.Nome"));
                venda.setVenda(rs.getInt("venda.venda"));
                venda.setDataVenda(rs.getString("venda.Dia"));
                venda.setValor(rs.getDouble("venda.valor"));
                venda.setqtdProduto(rs.getInt("venda.qtdProduto"));
                venda.setTotalProdutos(rs.getInt("venda.TotalProdutos"));
                venda.setValorProd(rs.getDouble("produto.Preco"));

                vendas.add(venda);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return vendas;

    }

    public List<ModVendas> ReadBetweenDates(String dataInicio, String dataFim) {

        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModVendas> vendas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto join venda ON produto.CodProduto = venda.CodProduto\n"
                    + "join clientes ON clientes.idCliente = venda.idCliente\n"
                    + " WHERE dia BETWEEN (?) AND (?)\n"
                    + "ORDER BY dia");
            stmt.setString(1, dataInicio);
            stmt.setString(2, dataFim);
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModVendas venda = new ModVendas();

                venda.setIdCliente(rs.getInt("clientes.idCliente"));
                venda.setNomeCliente(rs.getString("clientes.Nome") + " " + rs.getString("clientes.Sobrenome"));
                venda.setCodProduto(rs.getInt("produto.CodProduto"));
                venda.setNomeProduto(rs.getString("produto.Nome"));
                venda.setVenda(rs.getInt("venda.venda"));
                venda.setDataVenda(rs.getString("venda.Dia"));
                venda.setValor(rs.getDouble("venda.valor"));
                venda.setqtdProduto(rs.getInt("venda.qtdProduto"));
                venda.setTotalProdutos(rs.getInt("venda.TotalProdutos"));
                venda.setValorProd(rs.getDouble("produto.Preco"));

                vendas.add(venda);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return vendas;

    }

}
