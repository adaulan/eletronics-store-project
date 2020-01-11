/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;


import Model.ModProduto;
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
 * @author User valter lafuente junior
 */
public class DaoProduto {

    //Conecta com o Banco de Dados
    ConexaoBD conex = new ConexaoBD();
    //Armazena os dados do Produto retirados do Banco
    ModProduto cadastro = new ModProduto();

    //Salva um produto no Banco de Dados
    public void Salvar(ModProduto cadastro) {
        conex.conexao();
        try {
            PreparedStatement pst = (PreparedStatement) conex.con.prepareStatement("insert into produto(Nome,Descricao,Preco,Tipo,Quantidade,CodProduto) values(?,?,?,?,?,?)");
            pst.setString(1, cadastro.getNomeProduto());
            pst.setString(2, cadastro.getDescProduto());
            pst.setDouble(3, cadastro.getPrecoProduto());
            pst.setString(4, cadastro.getTipoProduto());
            pst.setInt(5, cadastro.getQtdProduto());
            pst.setInt(6, cadastro.getIdProduto());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro sp insserir os dados" + ex);
        }
    }

    //Pesquisa todos os Produtos no Banco de Dados
    public List<ModProduto> Read() {

        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModProduto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModProduto produto = new ModProduto();

                produto.setIdProduto(rs.getInt("CodProduto"));
                produto.setDescProduto(rs.getString("Descricao"));
                produto.setNomeProduto(rs.getString("Nome"));
                produto.setPrecoProduto(rs.getDouble("Preco"));
                produto.setQtdProduto(rs.getInt("Quantidade"));
                produto.setTipoProduto(rs.getString("Tipo"));
                
                produtos.add(produto);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return produtos;

    }

    //Pesquisa um Produto no Banco de Dados pelo seu Codigo
    public List<ModProduto> ReadByCode(String CodProduto) {

        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModProduto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE CodProduto = " + CodProduto);
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModProduto produto = new ModProduto();

                produto.setIdProduto(rs.getInt("CodProduto"));
                produto.setDescProduto(rs.getString("Descricao"));
                produto.setNomeProduto(rs.getString("Nome"));
                produto.setPrecoProduto(rs.getDouble("Preco"));
                produto.setQtdProduto(rs.getInt("Quantidade"));
                produto.setTipoProduto(rs.getString("Tipo"));

                produtos.add(produto);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return produtos;

    }

    //Pega os dados do Produto pelo ID já verificado diferente do ReadByID
    public ModProduto getByID(String ID) {

        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;
        ResultSet rs = null;
        ModProduto produto = new ModProduto();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE CodProduto = " + ID);

            rs = stmt.executeQuery();

            while (rs.next()) {

                produto.setIdProduto(rs.getInt("CodProduto"));
                produto.setNomeProduto(rs.getString("Nome"));
                produto.setDescProduto(rs.getString("Descricao"));
                produto.setTipoProduto(rs.getString("Tipo"));
                produto.setQtdProduto(rs.getInt("Quantidade"));
                produto.setPrecoProduto(rs.getDouble("Preco"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return produto;

    }
    
    //Pesquisa um Produto no Banco de Dados pelo seu nome
    public List<ModProduto> ReadByName(String name) {

        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModProduto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE Nome like ?");
            stmt.setString(1, "%" + name + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModProduto produto = new ModProduto();

                produto.setIdProduto(rs.getInt("CodProduto"));
                produto.setDescProduto(rs.getString("Descricao"));
                produto.setNomeProduto(rs.getString("Nome"));
                produto.setPrecoProduto(rs.getDouble("Preco"));
                produto.setQtdProduto(rs.getInt("Quantidade"));
                produto.setTipoProduto(rs.getString("Tipo"));
                
                produtos.add(produto);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
    
    //Pesquisa um Produto no Banco de Dados pelo seu Tipo
    public List<ModProduto> ReadByType(String type) {
        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModProduto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE tipo like ?");
            stmt.setString(1, "%" + type + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModProduto produto = new ModProduto();

                produto.setIdProduto(rs.getInt("CodProduto"));
                produto.setDescProduto(rs.getString("Descricao"));
                produto.setNomeProduto(rs.getString("Nome"));
                produto.setPrecoProduto(rs.getDouble("Preco"));
                produto.setQtdProduto(rs.getInt("Quantidade"));
                produto.setTipoProduto(rs.getString("Tipo"));

                produtos.add(produto);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
    
    //Atualiza todos os dados do Produto no Banco de Dados
    public void Update(ModProduto cadastro, String CodProduto) {
        conex.conexao();

        try {
            PreparedStatement pst = (PreparedStatement) conex.con.prepareStatement(
                    "UPDATE produto SET Nome = ?,Descricao = ?,Tipo = ?,Quantidade = ?,"
                    + "Preco = ? Where CodProduto = ?");

            pst.setString(1, cadastro.getNomeProduto());
            pst.setString(2, cadastro.getDescProduto());
            pst.setString(3, cadastro.getTipoProduto());
            pst.setInt(4, cadastro.getQtdProduto());
            pst.setDouble(5, cadastro.getPrecoProduto());
            pst.setString(6, CodProduto);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro do Produto atualizado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro sp insserir os dados" + ex);
        }
    }
    
    //Remove um Produto do Banco de Dados
    public void Remove(String ID) {
        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE CodProduto = " + ID);
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Produto Removido com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt);
        }
    }
}
