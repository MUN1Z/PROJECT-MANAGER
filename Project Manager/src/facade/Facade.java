/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import control.BacklogControl;
import control.ProjetoControl;
import control.UsuarioControl;
import java.util.ArrayList;
import model.Backlog;
import model.Projeto;
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
    
    /**
     * Método responsável por cadastrar um projeto no banco de dados, recebe
     * como parametro um objeto do tipo Projeto
     * @author Raiff
     */
    public static boolean cadastrarProjeto(Projeto projeto){
        return ProjetoControl.cadastrarProjeto(projeto);
    }
    
    /**
     * Método resposável por deletar um projeto no banco de dados, recebe
     * como parametro um objeto do tipo Projeto
     * @author Raiff
     */
    public static boolean deletarProjeto(Projeto projeto){
        return ProjetoControl.deletarProjeto(projeto);
    }
    
    public static ArrayList<Projeto> listarProjeto(){
       return ProjetoControl.listarProjeto();
    }
    
    /**
     * Método responsável por cadastrar um Backlog no banco de dados, recebe
     * como parametro um objeto do tipo Backlog
     * @author Felipe Muniz
     */
    public static boolean cadastrarBacklog(Backlog backlog){
        return BacklogControl.cadastrarBacklog(backlog);
    }
    
    /**
     * Método responsável por deletar um Backlog no banco de dados, recebe
     * como parametro um objeto do tipo Backlog
     * @author Felipe Muniz
     */
    public static boolean DeletarBacklog(Backlog backlog){
        return BacklogControl.deletarBacklog(backlog);
    }
    
    /**
     * Método responsável por editar um Backlog no banco de dados, recebe
     * como parametro um objeto do tipo Backlog
     * @author Felipe Muniz
     */
    public static boolean EditarBacklog(Backlog backlog){
        return BacklogControl.editarBacklog(backlog);
    }
    
    /**
     * Método responsável por Listar todos os Backlogs do banco de dados, recebe
     * Retorna um ArrayList
     * @author Felipe Muniz
     */
    public static ArrayList<Backlog> ListarBacklog(){
        return BacklogControl.listarBacklog();
    }
    
}
