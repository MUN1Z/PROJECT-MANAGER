
package control;

import database.ConectaDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Backlog;
import model.Usuario;

/**
 *
 * @author Raiff
 */
public class BacklogControl {
    
    private static BacklogControl controladorBacklog;
    
    //singleton
    public static BacklogControl getInstance(){
        if(controladorBacklog == null){
            controladorBacklog = new BacklogControl();
            return controladorBacklog;
        }
        return controladorBacklog;
    }
    
    /**
     * Método responsávem por cadastrar um backlog no banco de dados.
     * O método recebe como parametro um objeto do tipo Backlog.
     * @author Felipe Muniz
     * @param backlog
     * @return boolean
     */
    public static boolean cadastrarBacklog(Backlog backlog){
        
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        
        String sql = "INSERT INTO backlog() VALUES(?,?,?,?)";
        
        try {
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, backlog.getDataDeCriacao());
            pst.setString(3, backlog.getDataUltimaModificacao());
            pst.setInt(4, backlog.getId_projeto());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(BacklogControl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Conectar! \n Erro: " + ex.getMessage());
        }
        conecta.desconecta();
        return true;
    }
    
    /**
     * Método responsávem por deletar um backlog no banco de dados.
     * O método recebe como parametro um objeto do tipo Backlog.
     * @author Felipe Muniz
     * @param backlog
     * @return boolean
     */
    public static boolean deletarBacklog(Backlog backlog){
        
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        
        try {
            String sql = "DELETE FROM backlog WHERE id = ?";
            PreparedStatement pst;
            pst = conecta.conn.prepareStatement(sql);
            pst.setLong(1, backlog.getId()); 
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioControl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao deletar Backlog! \n Erro: " + ex.getMessage());
        }
        conecta.desconecta();
        return true;
    }
    
    /**
     * Método responsávem por editar um backlog no banco de dados.
     * O método recebe como parametro um objeto do tipo Backlog.
     * @author Felipe Muniz
     * @param backlog
     * @return boolean
     */
    public static boolean editarBacklog(Backlog backlog){
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        
        try {
            String sql = "UPDATE backlog SET data_criacao = ?, data_modificacao = ? WHERE id = ?";
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, backlog.getDataDeCriacao().toString());
            pst.setString(2, backlog.getDataUltimaModificacao().toString());
            pst.setLong(3, backlog.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Editado com suceso!");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioControl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao editar Backlog! " + ex.getMessage());
        }
        conecta.desconecta();
        return true;
    }
    
    /**
     * Método responsávem por listar todos os backlogs do banco de dados.
     * @author Felipe Muniz
     * @return ArrayList
     */
    public static ArrayList listarBacklog(){
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        
        try {
            ArrayList backlogs = new ArrayList();
            String sql = "SELECT * FROM backlog";
            
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                
                backlogs.add(new Object[]{ rs.getInt("id"),
                    rs.getString("data_criacao"),
                    rs.getString("data_modificacao")});
            }
            return backlogs;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
