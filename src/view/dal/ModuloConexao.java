/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.dal;

import java.sql.*;
/**
 *
 * @author Tacio
 */
public class ModuloConexao {
    // metodo responsavel por estabelecer a conexão com o banco de dados
    public static Connection connector(){
        java.sql.Connection conexao = null;
        
        // a linha abaixo chama o driver
        String driver = "org.postgresql.Driver";
        
        // a linha abaixo armazena informações referentes ao banco de dados
        String url = "jdbc:postgresql://localhost:5432/ProjetoBD";
        String user = "postgres";
        String password = "2003";
        
        // estabelecendo conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println("FALHA NA CONEXAO: " + e);
            return null;
        }
        
    }
}
