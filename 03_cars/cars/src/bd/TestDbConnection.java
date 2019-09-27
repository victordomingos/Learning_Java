/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EFA
 */
public class TestDbConnection {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        String baseDados = bd.Config.getBaseDados();
        String servidor = bd.Config.getServidor();
        String user = bd.Config.getUser();
        String password = bd.Config.getPassword();

        String url = "jdbc:mysql://" + servidor + ":3306/" + baseDados 
                + "?autoReconnect=true&useSSL=false";
        
        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            
            
        rs = st.executeQuery("SELECT * FROM veiculo");
        
        while (rs.next()) {
            String matricula = rs.getString("matricula");
            String marca = rs.getString("marca");
            String modelo = rs.getString("modelo");
            String n_portas = rs.getString("n_portas");
         
            System.out.println("Matrícula: " + matricula + "  Marca: " + marca
            + "  Modelo: " + modelo + "    Nº de portas: " + n_portas);
            
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }
        finally {
            try {
                if (rs != null)     { rs.close();}
                if (st != null)     { st.close(); }
                if (con != null)    { con.close(); } 
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getErrorCode());
            }
        }
        
        
        
    }
}
