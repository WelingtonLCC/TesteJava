/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CrudBanco;

import java.sql.Connection;

/**
 *
 * @author Welington
 */
public class CriaBanco {
    private Connection con;
        
    public CriaBanco(Connection con){
        setCon(con);
    }
    
    public String verificaBase(){
     
    
        return null;
    }



    public Connection getCon() {
            return con;
        }
        public void setCon(Connection con) {
            this.con = con;
        }    
    
}
    