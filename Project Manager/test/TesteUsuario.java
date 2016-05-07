
import DAO.ConectaDB;
import com.mysql.jdbc.PreparedStatement;
import control.UsuarioControl;
import java.util.ArrayList;
import modelo.Usuario;
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
        
        user.setId(65);//informar id do usuario a ser deletado
        
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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
