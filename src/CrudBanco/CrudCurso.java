/*
 * Crud dos produtos 
 */
package CrudBanco;

import Conectar.bean.CursosBean;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Welington Luiz Correa Campos
 */
public class CrudCurso {
    private Connection con ;
    
    public CrudCurso(Connection con){
        setCon(con);
    }
    
    public String inserir(CursosBean Cursos){
        String sql = "INSERT INTO curso(codigo, descricao, ementa) values(?,?,?)";
        try{
            PreparedStatement pr = getCon().prepareStatement(sql);
            
            pr.setString(1, String.valueOf(Cursos.getCodigo()));
            pr.setString(2, Cursos.getDescricao());
            pr.setString(3, Cursos.getEmenta());
        
            if(pr.executeUpdate() > 0){
                return "Inserido com Sucesso";
            }else{
                return "Erro ao inserir";
            }
            
        }catch(SQLException er){
            return er.getMessage();
        }
    }
    public String alterar(CursosBean Cursos){
        String sql = "UPDATE curso SET descricao = ?, ementa = ? WHERE codigo = ?;";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, Cursos.getDescricao());
            ps.setString(2, Cursos.getEmenta());
            ps.setString(3, String.valueOf(Cursos.getCodigo()));
          
            
            if(ps.executeUpdate() > 0){
                return "Alterado com sucesso";
            }else{
                return "Erro ao alterar";
            }
            
        }catch(SQLException er){
            return er.getMessage();
        }
    }
    public String excluir(CursosBean Cursos){
        String sql = "delete from curso where codigo = ?";
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
    public List<CursosBean> listar(String where){
        String sql;
        if(where.equals("")){
            sql = "select * from curso";
        }else{
            sql = "select * from curso where "+where;
        }
        List<CursosBean> listaCursos = new ArrayList<CursosBean>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery(sql);
             if(rs != null){
                 while(rs.next()){
                     CursosBean pb = new CursosBean();
                     
                     pb.setCodigo(Integer.parseInt(rs.getString(1)));
                     pb.setDescricao(rs.getString(2));
                     pb.setEmenta(rs.getString(3));
                     
                     listaCursos.add(pb);
                 }
                 return listaCursos;
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
