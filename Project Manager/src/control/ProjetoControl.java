
package control;

import database.ConectaDB;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Projeto;

/**
 *
 * @author Raiff
 */
public class ProjetoControl {
    
    private static ProjetoControl controladorProjeto;
    
    /**
     * Instantica a classe somente uma vez se necessário.
     * @return 
     */
    public static ProjetoControl getInstance(){
        if(controladorProjeto == null){
            controladorProjeto = new ProjetoControl();
            return controladorProjeto;
        }
        return controladorProjeto;
    }
    
    /**
     * Método que recebe os dados do projeto e salva no banco de dados
     * Recebe um objeto do tipo Projeto como parametro
     * @author Raiff
     * @param projeto
     * @return boolean
     */
    public static boolean cadastrarProjeto(Projeto projeto){
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        try {
            String sql = "INSERT INTO projeto() VALUES(?,?,?,?)";
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, projeto.getDescricaoGeral());
            pst.setDate(3, (Date) projeto.getDataDeCriacao());
            pst.setDate(4, (Date) projeto.getDataDeFinalizacao());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProjetoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.desconecta();
        return true;    
    }
    
    public void deletarProjeto(){
    
    }
    
    public void editarProjeto(){
    
    }
    
    public void listarProjeto(){
    
    }
}
