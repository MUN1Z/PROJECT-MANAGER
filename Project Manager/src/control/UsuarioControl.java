
package control;

import DAO.ConectaDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Raiff
 */
public class UsuarioControl {
    
    public void cadastrarUsuario(Usuario usuario){
        
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        
        String sql = "INSERT INTO usuario() VALUES(?,?,?,?,?)";
        
        try {
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, usuario.getNomeCompleto());
            pst.setString(3, usuario.getEmail());
            pst.setString(4, usuario.getLogin());
            pst.setString(5, usuario.getSenha());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioControl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Conectar! \n Erro: " + ex.getMessage());
        }
        conecta.desconecta();
    }
    
    public void deletarUsuario(Usuario usuario){
    
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        
        try {
            String sql = "DELETE FROM usuario WHERE id = ?";
            PreparedStatement pst;
            pst = conecta.conn.prepareStatement(sql);
            pst.setLong(1, usuario.getId());//pegar id do usuario vindo do banco de dados
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioControl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao deletar usuario! \n Erro: " + ex.getMessage());
        }
        conecta.desconecta();
    }
    
    public void editarUsuario(Usuario usuario){
        
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        
        try {
            String sql = "UPDATE usuario SET nome = ?, email = ?, login = ?, senha = ? WHERE id = ?";
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, usuario.getNomeCompleto());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getLogin());
            pst.setString(4, usuario.getSenha());
            pst.setLong(5, usuario.getId()); //pegar id do usuario vindo do banco de dados
            pst.execute();
            JOptionPane.showMessageDialog(null, "Editado com suceso!");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioControl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao editar usuario! " + ex.getMessage());
        }
        conecta.desconecta();
    }
    
}
