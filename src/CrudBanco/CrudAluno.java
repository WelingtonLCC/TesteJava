/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CrudBanco;

import Conectar.bean.AlunosBean;
import Conectar.bean.CursosBean;
import java.sql.Connection;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Welington
 */
public class CrudAluno {
    private Connection con ;
    
    public CrudAluno(Connection con){
        setCon(con);
    }
    
    public String inserir(AlunosBean Cursos){
        String sql = "INSERT INTO aluno(codigo, nome) values(?,?)";
        try{
            PreparedStatement pr = getCon().prepareStatement(sql);
            
            pr.setString(1, String.valueOf(Cursos.getCodigo()));
            pr.setString(2, Cursos.getNome());
         
            if(pr.executeUpdate() > 0){
                return "Inserido com Sucesso";
            }else{
                return "Erro ao inserir";
            }
            
        }catch(SQLException er){
            return er.getMessage();
        }
    }
    
    public String alterar(AlunosBean Cursos){
        String sql = "UPDATE Aluno SET NOME = ? WHERE codigo = ?;";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, Cursos.getNome());
            ps.setString(2, String.valueOf(Cursos.getCodigo()));
          
            
            if(ps.executeUpdate() > 0){
                return "Alterado com sucesso";
            }else{
                return "Erro ao alterar";
            }
            
        }catch(SQLException er){
            return er.getMessage();
        }
    }
    
    public String excluir(AlunosBean Cursos){
        String sql = "delete from Aluno where codigo = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, String.valueOf(Cursos.getCodigo()));
            
            if(ps.executeUpdate() > 0){
                return "Exluido com sucesso";
            }else{
                return "Erro ao excluir";
            }
        }catch(SQLException er){
            return er.getMessage();
        }
        
    }
    
    public List<AlunosBean> listar(String where){
        String sql;
        if(where.equals("")){
            sql = "select * from Aluno";
        }else{
            sql = "select * from Aluno where "+where;
        }
        List<AlunosBean> listaAlunos = new ArrayList<AlunosBean>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery(sql);
             if(rs != null){
                 while(rs.next()){
                     AlunosBean pb = new AlunosBean();
                     
                     pb.setCodigo(Integer.parseInt(rs.getString(1)));
                     pb.setNome(rs.getString(2));
           
                     listaAlunos.add(pb);
                 }
                 return listaAlunos;
             }else{
                 return null;
             }
            
        }catch(SQLException er){
            return null;
        }
    }
    
    public Connection getCon() {
        return con;
    }
    public void setCon(Connection con) {
        this.con = con;
    }
    
}
