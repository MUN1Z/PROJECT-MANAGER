
import database.ConectaDB;
import com.mysql.jdbc.PreparedStatement;
import control.UsuarioControl;
import java.util.ArrayList;
import model.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raiff
 */
public class TesteUsuario {
    
    public TesteUsuario() {
    }
    
    @Test
    public void testeDeCadastroDeUsuario(){
        Usuario user = new Usuario();        
        
        user.setNomeCompleto("teste nome");
        user.setEmail("teste@email.com");
        user.setLogin("teste login");
        user.setSenha("teste senha");
        
        ArrayList<Usuario> usuarios = UsuarioControl.getInstance().listarUsuario();
        int tamanho = usuarios.size();
        
        UsuarioControl.getInstance().cadastrarUsuario(user);
        usuarios = UsuarioControl.getInstance().listarUsuario();
        
        assertEquals(tamanho+1, usuarios.size());
        assertTrue(UsuarioControl.getInstance().cadastrarUsuario(user));
    }
    
    @Test
    public void testeDeDetetarUsuario(){
        Usuario user = new Usuario();
        
        user.setId(23);//informar id do usuario a ser deletado
        
        ArrayList<Usuario> usuarios = UsuarioControl.getInstance().listarUsuario();
        int tamanho = usuarios.size();
        
        assertTrue(UsuarioControl.getInstance().deletarUsuario(user));
        usuarios = UsuarioControl.getInstance().listarUsuario();
        
        assertEquals(tamanho-1, usuarios.size());
    }
    
    @Test
    public void testeDeEditarUsuario(){
        Usuario user = new Usuario();
        
        user.setId(40);
        user.setNomeCompleto("abcd");
        assertTrue(UsuarioControl.getInstance().editarUsuario(user));        
    }
    
    @Test
    public void testeDeListarUsuario(){

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        usuarios = UsuarioControl.getInstance().listarUsuario();
        assertNotNull(usuarios);
        
        boolean contem = false;
        if(usuarios.size() > 0){
            contem = true;
        }
        assertTrue(contem);
    }
}
