/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import control.UsuarioControl;
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
        UsuarioControl useControl = new UsuarioControl();
        
        user.setNomeCompleto("teste nome");
        user.setEmail("teste@email.com");
        user.setLogin("teste login");
        user.setSenha("teste senha");
        
        useControl.cadastrarUsuario(user);
    }
    
    @Test
    public void testeDeDetetarUsuario(){
        Usuario user = new Usuario();
        UsuarioControl useControl = new UsuarioControl();
        
        user.setNomeCompleto("teste nome");
        user.setEmail("teste@email.com");
        user.setLogin("teste login");
        user.setSenha("teste senha");
        user.setId(2);
        
        useControl.cadastrarUsuario(user);
        useControl.deletarUsuario(user);
    }
    
    @Test
    public void testeDeEditarUsuario(){
        Usuario user = new Usuario();
        UsuarioControl useControl = new UsuarioControl();
        
        user.setNomeCompleto("teste nome");
        user.setEmail("teste@email.com");
        user.setLogin("teste login");
        user.setSenha("teste senha");
        
        useControl.cadastrarUsuario(user);
        
        user.setNomeCompleto("editado nome");
        user.setEmail("editado@email.com");
        user.setLogin("editado login");
        user.setSenha("editado senha");
        user.setId(3);
        
        useControl.editarUsuario(user);
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
