/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.ModLogin;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adaulan Esdras
 */
public class DaoLogin {
    
public boolean checkLogin(String login, String senha) {

        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;


        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM login WHERE Usuario = ? and Senha = ? ");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            
            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;   
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return check;
        
    }
}
