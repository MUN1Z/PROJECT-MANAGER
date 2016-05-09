/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import control.UsuarioControl;
import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author MUNIZ
 */
public class Facade {
    
    /** 
     *  Método responsável por cadastrar um novo usuário no banco de dados
     *  <br> Recebe como parâmetro um objeto do tipo Usuario
     *  @author Felipe Muniz
     *  @version 1.0
     */
    public static boolean cadastrarUsuario(Usuario usuario){
        return UsuarioControl.cadastrarUsuario(usuario);
    }
    
    /** 
     *  Método responsável por deletar usuário do banco de dados
     *  <br> Recebe como parâmetro um objeto do tipo Usuario
     *  @author Felipe Muniz
     *  @version 1.0
     */
    public static boolean deletarUsuario(Usuario usuario){
        return UsuarioControl.deletarUsuario(usuario);
    }
    
    /** 
     *  Método responsável por editar um usuário do banco de dados
     *  <br> Recebe como parâmetro um objeto do tipo Usuario
     *  @author Felipe Muniz
     *  @version 1.0
     */
    public static boolean editarUsuario(Usuario usuario){
        return UsuarioControl.editarUsuario(usuario);
    }
    
    /** 
     *  Método responsável por listar todos usuarios do banco de dados
     *  <br> Retorna um Arraylist de Usuario
     *  @author Felipe Muniz
     *  @version 1.0
     */
    public static ArrayList<Usuario> listarUsuarios(){
        return UsuarioControl.listarUsuario();
    }
    
}
