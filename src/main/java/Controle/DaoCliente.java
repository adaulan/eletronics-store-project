/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.ModCliente;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DaoCliente {

    //CONECTA COM O BANCO DE DADOS
    ConexaoBD conex = new ConexaoBD();
    //ARMAZENA OS ELEMENTOS RETIRADOS DO BANCO DE DADOS
    ModCliente cadastro = new ModCliente();
    List<ModCliente> ClientArray = new ArrayList<>();

    //MÉTODOS
    public void addClientArray(ModCliente cliente) {
        ClientArray.add(cliente);
    }

    public List<ModCliente> getClientArray() {
        return ClientArray;
    }

    //SALVA O CLIENTE PF NO BANCO DE DADOS
    public void Salvar(ModCliente cadastro) {
        conex.conexao();
        try {
            PreparedStatement pst = (PreparedStatement) conex.con.prepareStatement(
                    "insert into clientes"
                    + "(Nome,Sobrenome,Nascimento,CPF,"
                    + "Telefone,Celular,email,Sexo,estado,"
                    + "cidade,bairro,rua,numeroCasa,complemento)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, cadastro.getNomeCliente());
            pst.setString(2, cadastro.getSobreNome());
            pst.setString(3, cadastro.formatDataNascimento(cadastro.getDataNascimento()));
            pst.setString(4, (cadastro.getCPF()));
            pst.setString(5, (cadastro.getTelefone()));
            pst.setString(6, (cadastro.getCelular()));
            pst.setString(7, cadastro.getEmail());
            pst.setString(8, cadastro.getGenero());
            pst.setString(9, cadastro.getEstado());
            pst.setString(10, cadastro.getCidade());
            pst.setString(11, cadastro.getBairro());
            pst.setString(12, cadastro.getRua());
            pst.setInt(13, cadastro.getNumeroCasa());
            pst.setString(14, cadastro.getComplemento());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro Salvo com sucesso");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro sp insserir os dados" + ex);
        }
    }

    //SALVA CLIENTES PJ NO BANCO DE DADOS
    public void SalvarPJ(ModCliente cadastro) {
        conex.conexao();
        try {
            PreparedStatement pst = (PreparedStatement) conex.con.prepareStatement(
                    "insert into clientespj"
                    + "(Nome,CNPJ,"
                    + "Telefone,Celular,email,estado,"
                    + "cidade,bairro,rua,numeroCasa,complemento)values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, cadastro.getNomeCliente());
            pst.setString(2, (cadastro.getCNPJ()));
            pst.setString(3, (cadastro.getTelefone()));
            pst.setString(4, (cadastro.getCelular()));
            pst.setString(5, cadastro.getEmail());
            pst.setString(6, cadastro.getEstado());
            pst.setString(7, cadastro.getCidade());
            pst.setString(8, cadastro.getBairro());
            pst.setString(9, cadastro.getRua());
            pst.setInt(10, cadastro.getNumeroCasa());
            pst.setString(11, cadastro.getComplemento());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro Salvo com sucesso");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao insserir os dados" + ex);
        }
    }

    //ATUALIZA OS DADOS DO CLIENTE PF NO BANCO DE DADOS
    public void Update(ModCliente cadastro, String IDCliente) {
        conex.conexao();

        try {
            PreparedStatement pst = (PreparedStatement) conex.con.prepareStatement(
                    "UPDATE clientes SET Nome = ?,Sobrenome = ?,Nascimento = ?,CPF = ?,"
                    + "Telefone = ?,Celular = ?,email = ?,Sexo = ?,estado = ?,"
                    + "cidade = ?,bairro = ?,rua = ?,numeroCasa = ?,complemento = ? Where idCliente = ?");

            pst.setString(1, cadastro.getNomeCliente());
            pst.setString(2, cadastro.getSobreNome());
            pst.setString(3, cadastro.formatDataNascimento(cadastro.getDataNascimento()));
            pst.setString(4, cadastro.getCPF());
            pst.setString(5, cadastro.getTelefone());
            pst.setString(6, cadastro.getCelular());
            pst.setString(7, cadastro.getEmail());
            pst.setString(8, cadastro.getGenero());
            pst.setString(9, cadastro.getEstado());
            pst.setString(10, cadastro.getCidade());
            pst.setString(11, cadastro.getBairro());
            pst.setString(12, cadastro.getRua());
            pst.setInt(13, cadastro.getNumeroCasa());
            pst.setString(14, cadastro.getComplemento());
            pst.setString(15, IDCliente);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro sp insserir os dados" + ex);
        }
    }

    //ATUALIZA OS DADOS DO CLIENTE PJ NO BANCO DE DADOS
    public void UpdatePJ(ModCliente cadastro, String IDCliente) {
        conex.conexao();

        try {
            PreparedStatement pst = (PreparedStatement) conex.con.prepareStatement(
                    "UPDATE clientespj SET Nome = ?,CNPJ = ?,"
                    + "Telefone = ?,Celular = ?,email = ?,estado = ?,"
                    + "cidade = ?,bairro = ?,rua = ?,NumeroCasa = ?,complemento = ? Where idCliente = ?");

            pst.setString(1, cadastro.getNomeCliente());
            pst.setString(2, cadastro.getCNPJ());
            pst.setString(3, cadastro.getTelefone());
            pst.setString(4, cadastro.getCelular());
            pst.setString(5, cadastro.getEmail());
            pst.setString(6, cadastro.getEstado());
            pst.setString(7, cadastro.getCidade());
            pst.setString(8, cadastro.getBairro());
            pst.setString(9, cadastro.getRua());
            pst.setInt(10, cadastro.getNumeroCasa());
            pst.setString(11, cadastro.getComplemento());
            pst.setString(12, IDCliente);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao insserir os dados" + ex);
        }
    }

    //PESQUISA TODOS OS CLIENTES PF CADASTRADOS NO BANCO DE DADOS
    public List<ModCliente> Read() {

        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModCliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModCliente cliente = new ModCliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("Nome"));
                cliente.setSobreNome(rs.getString("Sobrenome"));
                cliente.setCPF(rs.getString("CPF"));
                cliente.setTelefone(rs.getString("Telefone"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setBairro((rs.getString("Bairro")));
                cliente.setGenero((rs.getString("Sexo")));
                cliente.setEstado((rs.getString("Estado")));
                cliente.setCidade((rs.getString("Cidade")));
                cliente.setRua((rs.getString("Rua")));
                cliente.setComplemento((rs.getString("Complemento")));
                cliente.setDataNascimento((rs.getString("Nascimento")));
                cliente.setNumeroCasa((rs.getInt("NumeroCasa")));

                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

    //PESQUISA TODOS OS CLIENTES PJ CADASTRADOS NO BANCO DE DADOS
    public List<ModCliente> ReadPJ() {

        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModCliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientespj");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModCliente cliente = new ModCliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("Nome"));
                cliente.setCNPJ(rs.getString("CNPJ"));
                cliente.setTelefone(rs.getString("Telefone"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setBairro((rs.getString("Bairro")));
                cliente.setEstado((rs.getString("Estado")));
                cliente.setCidade((rs.getString("Cidade")));
                cliente.setRua((rs.getString("Rua")));
                cliente.setComplemento((rs.getString("Complemento")));
                cliente.setNumeroCasa((rs.getInt("NumeroCasa")));

                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

    //PESQUISA UM CLIENTE PF NO BANCO DE DADOS PELO NOME
    public List<ModCliente> ReadByName(String nome) {

        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModCliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE nome LIKE ? ");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModCliente cliente = new ModCliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("Nome"));
                cliente.setSobreNome(rs.getString("Sobrenome"));
                cliente.setCPF(rs.getString("CPF"));
                cliente.setTelefone(rs.getString("Telefone"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setBairro((rs.getString("Bairro")));
                cliente.setGenero((rs.getString("Sexo")));
                cliente.setEstado((rs.getString("Estado")));
                cliente.setCidade((rs.getString("Cidade")));
                cliente.setRua((rs.getString("Rua")));
                cliente.setComplemento((rs.getString("Complemento")));
                cliente.setDataNascimento((rs.getString("Nascimento")));
                cliente.setNumeroCasa((rs.getInt("NumeroCasa")));

                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

    //PESQUISA UM CLIENTE PJ NO BANCO DE DADOS PELO NOME
    public List<ModCliente> ReadByNamePJ(String nome) {

        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModCliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientespj WHERE nome LIKE ? ");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModCliente cliente = new ModCliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("Nome"));
                cliente.setCNPJ(rs.getString("CNPJ"));
                cliente.setTelefone(rs.getString("Telefone"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setBairro((rs.getString("Bairro")));
                cliente.setEstado((rs.getString("Estado")));
                cliente.setCidade((rs.getString("Cidade")));
                cliente.setRua((rs.getString("Rua")));
                cliente.setComplemento((rs.getString("Complemento")));
                cliente.setNumeroCasa((rs.getInt("NumeroCasa")));

                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

    //PESQUISA UM CLIENTE PF NO BANCO DE DADOS PELO SOBRENOME
    public List<ModCliente> ReadBySurname(String sobrenome) {

        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModCliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE sobrenome LIKE ? ");
            stmt.setString(1, "%" + sobrenome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModCliente cliente = new ModCliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("Nome"));
                cliente.setSobreNome(rs.getString("Sobrenome"));
                cliente.setCPF(rs.getString("CPF"));
                cliente.setTelefone(rs.getString("Telefone"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setBairro((rs.getString("Bairro")));
                cliente.setGenero((rs.getString("Sexo")));
                cliente.setEstado((rs.getString("Estado")));
                cliente.setCidade((rs.getString("Cidade")));
                cliente.setRua((rs.getString("Rua")));
                cliente.setComplemento((rs.getString("Complemento")));
                cliente.setDataNascimento((rs.getString("Nascimento")));
                cliente.setNumeroCasa((rs.getInt("NumeroCasa")));

                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

    //PESQUISA UM CLIENTE NO BANCO DE DADOS PELO CPF
    public List<ModCliente> ReadByCPF(String CPF) {

        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModCliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE CPF LIKE ? ");
            stmt.setString(1, "%" + CPF + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModCliente cliente = new ModCliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("Nome"));
                cliente.setSobreNome(rs.getString("Sobrenome"));
                cliente.setCPF(rs.getString("CPF"));
                cliente.setTelefone(rs.getString("Telefone"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setBairro((rs.getString("Bairro")));
                cliente.setGenero((rs.getString("Sexo")));
                cliente.setEstado((rs.getString("Estado")));
                cliente.setCidade((rs.getString("Cidade")));
                cliente.setRua((rs.getString("Rua")));
                cliente.setComplemento((rs.getString("Complemento")));
                cliente.setDataNascimento((rs.getString("Nascimento")));
                cliente.setNumeroCasa((rs.getInt("NumeroCasa")));

                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

    //PESQUISA UM CLIENTE NO BANCO DE DADOS PELO CNPJ
    public List<ModCliente> ReadByCNPJ(String CNPJ) {

        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModCliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientespj WHERE CNPJ LIKE ? ");
            stmt.setString(1, "%" + CNPJ + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModCliente cliente = new ModCliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("Nome"));
                cliente.setCNPJ(rs.getString("CNPJ"));
                cliente.setTelefone(rs.getString("Telefone"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setBairro((rs.getString("Bairro")));
                cliente.setEstado((rs.getString("Estado")));
                cliente.setCidade((rs.getString("Cidade")));
                cliente.setRua((rs.getString("Rua")));
                cliente.setComplemento((rs.getString("Complemento")));
                cliente.setNumeroCasa((rs.getInt("NumeroCasa")));

                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

    //PESQUISA UM CLIENTE PF NO BANCO DE DADOS PELO ID
    public List<ModCliente> ReadByID(String ID) {

        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModCliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE idCliente LIKE ? ");
            stmt.setString(1, "%" + ID + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModCliente cliente = new ModCliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("Nome"));
                cliente.setSobreNome(rs.getString("Sobrenome"));
                cliente.setCPF(rs.getString("CPF"));
                cliente.setTelefone(rs.getString("Telefone"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setBairro((rs.getString("Bairro")));
                cliente.setGenero((rs.getString("Sexo")));
                cliente.setEstado((rs.getString("Estado")));
                cliente.setCidade((rs.getString("Cidade")));
                cliente.setRua((rs.getString("Rua")));
                cliente.setComplemento((rs.getString("Complemento")));
                cliente.setDataNascimento((rs.getString("Nascimento")));
                cliente.setNumeroCasa((rs.getInt("NumeroCasa")));

                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

    //PESQUISA UM CLIENTE PJ NO BANCO DE DADOS PELO ID
    public List<ModCliente> ReadByIDPJ(String ID) {

        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ModCliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientespj WHERE idCliente LIKE ? ");
            stmt.setString(1, "%" + ID + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ModCliente cliente = new ModCliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("Nome"));
                cliente.setCNPJ(rs.getString("CNPJ"));
                cliente.setTelefone(rs.getString("Telefone"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setBairro((rs.getString("Bairro")));
                cliente.setEstado((rs.getString("Estado")));
                cliente.setCidade((rs.getString("Cidade")));
                cliente.setRua((rs.getString("Rua")));
                cliente.setComplemento((rs.getString("Complemento")));
                cliente.setNumeroCasa((rs.getInt("NumeroCasa")));

                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

    //PEGA OS DADOS DO CLIENTE PF PELO ID EXATO JÁ CONFIRMADO COMO EXISTENTE
    public ModCliente getByID(String ID) {

        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;
        ResultSet rs = null;
        ModCliente cliente = new ModCliente();
        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE idCliente = " + ID);

            rs = stmt.executeQuery();

            while (rs.next()) {

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("Nome"));
                cliente.setSobreNome(rs.getString("Sobrenome"));
                cliente.setCPF(rs.getString("CPF"));
                cliente.setTelefone(rs.getString("Telefone"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setBairro((rs.getString("Bairro")));
                cliente.setGenero((rs.getString("Sexo")));
                cliente.setEstado((rs.getString("Estado")));
                cliente.setCidade((rs.getString("Cidade")));
                cliente.setRua((rs.getString("Rua")));
                cliente.setComplemento((rs.getString("Complemento")));
                cliente.setDataNascimento((rs.getString("Nascimento")));
                cliente.setNumeroCasa((rs.getInt("NumeroCasa")));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return cliente;

    }

    //PEGA OS DADOS DO CLIENTE PJ PELO ID EXATO JÁ CONFIRMADO COMO EXISTENTE
    public ModCliente getByIDPJ(String ID) {

        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;
        ResultSet rs = null;
        ModCliente cliente = new ModCliente();
        try {
            stmt = con.prepareStatement("SELECT * FROM clientespj WHERE idCliente = " + ID);

            rs = stmt.executeQuery();

            while (rs.next()) {

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("Nome"));
                cliente.setCNPJ(rs.getString("CNPJ"));
                cliente.setTelefone(rs.getString("Telefone"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setBairro((rs.getString("Bairro")));
                cliente.setEstado((rs.getString("Estado")));
                cliente.setCidade((rs.getString("Cidade")));
                cliente.setRua((rs.getString("Rua")));
                cliente.setComplemento((rs.getString("Complemento")));
                cliente.setNumeroCasa((rs.getInt("NumeroCasa")));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return cliente;

    }

    //REMOVE UM CLIENTE PF DO BANCO DE DADOS
    public void Remove(String ID) {
        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM clientes WHERE idCliente = " + ID);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Cliente Removido com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt);
        }
    }

    //REMOVE UM CLIENTE PJ DO BANCO DE DADOS
    public void RemovePJ(String ID) {
        Connection con = ConexaoBD.getConnection();
        java.sql.PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM clientespj WHERE idCliente = " + ID);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Cliente Removido com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt);
        }
    }
}
