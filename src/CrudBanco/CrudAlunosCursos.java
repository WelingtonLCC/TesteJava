/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CrudBanco;


import Conectar.bean.AlunosCursosBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Welington
 */
public class CrudAlunosCursos {
    private Connection con ;
    
    public CrudAlunosCursos(Connection con){
        setCon(con);
    }
    
    public String inserir(AlunosCursosBean Alunos){
        String sql = "INSERT INTO curso_aluno(codigo, aluno_codigo,curso_codigo) values(?,?)";
        try{
            PreparedStatement pr = getCon().prepareStatement(sql);
            
            pr.setString(1, String.valueOf(Alunos.getCodigo()));
            pr.setString(2, String.valueOf(Alunos.getAluno_codigo()));
            pr.setString(3, String.valueOf(Alunos.getCurso_codigo()));
         
            if(pr.executeUpdate() > 0){
                return "Inserido com Sucesso";
            }else{
                return "Erro ao inserir";
            }
            
        }catch(SQLException er){
            return er.getMessage();
        }
    }
    
    public String alterar(AlunosCursosBean Alunos){
        String sql = "UPDATE curso_aluno SET curso_codigo = ? , aluno_codigo = ? WHERE codigo = ?;";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, String.valueOf(Alunos.getCurso_codigo()));
            ps.setString(2, String.valueOf(Alunos.getAluno_codigo()));
            ps.setString(3, String.valueOf(Alunos.getCodigo()));
          
            
            if(ps.executeUpdate() > 0){
                return "Alterado com sucesso";
            }else{
                return "Erro ao alterar";
            }
            
        }catch(SQLException er){
            return er.getMessage();
        }
    }
    
    public String excluir(AlunosCursosBean Alunos){
        String sql = "delete from curso_aluno where codigo = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, String.valueOf(Alunos.getCodigo()));
            
            if(ps.executeUpdate() > 0){
                return "Exluido com sucesso";
            }else{
                return "Erro ao excluir";
            }
        }catch(SQLException er){
            return er.getMessage();
        }
        
    }
    
    public List<AlunosCursosBean> listar(String where){
        String sql;
        if(where.equals("")){
            sql = "select * from curso_aluno";
        }else{
            sql = "select * from curso_aluno where "+where;
        }
        List<AlunosCursosBean> listaAlunos = new ArrayList<AlunosCursosBean>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery(sql);
             if(rs != null){
                 while(rs.next()){
                     AlunosCursosBean pb = new AlunosCursosBean();
                     
                     pb.setCodigo(Integer.parseInt(rs.getString(1)));
                     pb.setAluno_codigo(Integer.parseInt(rs.getString(2)));
                     pb.setCurso_codigo(Integer.parseInt(rs.getString(3)));
           
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
