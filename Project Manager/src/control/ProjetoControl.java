
package control;

import database.ConectaDB;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
        String sql = "INSERT INTO projeto() VALUES(?,?,?,?)";
        try {
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, projeto.getDescricaoGeral());
            pst.setString(3, projeto.getDataDeCriacao());
            pst.setString(4, projeto.getDataDeFinalizacao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ProjetoControl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Conectar! \n Erro: " + ex.getMessage());
        }
        conecta.desconecta();
        return true;
    }
    
    /**
     * Método que recebe um objeto do tipo Projeto e deleta o objeto do Banco de
     * dados atraves do id
     * @author Raiff
     * @param projeto
     * @return boolean
     */
    public static boolean deletarProjeto(Projeto projeto){
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        String sql = "DELETE FROM projeto WHERE id = ?";
        try {
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setLong(1, projeto.getId());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ProjetoControl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Conectar! \n Erro: " + ex.getMessage());
        }
        return true;
    }
    
    /**
     * Método que recebe um objeto do tipo projeto e faz a atualização dos dados
     * do objeto no banco de dados.
     * @author Raiff
     * @param projeto
     * @return boolean
     */
    public static boolean editarProjeto(Projeto projeto){
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        String sql = "UPDATE projeto SET descricao = ?, data_criacao = ?, data_final = ?";
        try {
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, projeto.getDescricaoGeral());
            pst.setString(2, projeto.getDataDeCriacao());
            pst.setString(3, projeto.getDataDeFinalizacao());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProjetoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    /**
     * Método que seleciona todos os atributos da tabela projeto do banco de
     * dados e insere as informações em um ArrayList de objetos do tipo Projeto
     * @author Raiff
     * @return ArrayList
     */
    public static ArrayList listarProjeto(){
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();
        try {
            ArrayList projeto = new ArrayList();
            String sql = "SELECT * FROM projeto";
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                projeto.add(new Object[]{ rs.getInt("id"),
                rs.getString("descricao"), 
                rs.getString("data_criacao"), 
                rs.getString("data_final")});
            }
            return projeto;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
