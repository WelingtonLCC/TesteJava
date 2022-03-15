/*
 * Esté arquivo fara a coneção com o banco de dados 
 * Ja criada com o nome de Java_MySQL
 */
package Conectar;

import java.sql.*;

/**
 *
 * @author Welington Luiz 
 */

//Inicio da classe conecta

public class conecta {
    public static String status = "Não Conectou";
    
    
    public static Connection abrirConexao(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String useDB = "java_mysql"; // Nome do banco de dados
            String diretorioDB = "127.0.0.1"; //Diretorio do banco da maquina wampServer
            String loginDB = "root"; // login padão
            String senhaDB = ""; // Banco sem senha
            //String url = "jdbc:mysql://127.0.0.1/java_mysql";
            //String url += "user=root&password=";
            String url = "jdbc:mysql://"+diretorioDB+"/"+useDB+"?";
            url += "user = "+loginDB+"&password = "+senhaDB;
            con =  DriverManager.getConnection(url);
            status = "Conexão criada com sucesso!";

        }catch(SQLException er){
            System.out.println(er.getMessage());
            
        }catch(ClassNotFoundException er){
             System.out.println(er.getMessage());
        }
        catch(Exception er){
             System.out.println(er.getMessage());
        }
        
        System.out.println(status);
        return con;
    }
    public static void fecharConexao(Connection con){
        try{
            con.close();
            status = "Conexão encerrada!";
        }catch(SQLException e){
            System.out.println(e.getMessage());
            
        }catch(Exception er){
            System.out.println(er.getMessage());
            
        }
        System.out.println(status);
    }
}
