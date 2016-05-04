/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.ConectaDB;
import control.UsuarioControl;
import modelo.Usuario;

/**
 *
 * @author cabra
 */
public class Main {

    public static void main(String[] args) {
        
        //testando a conexao
        ConectaDB conn = new ConectaDB();
        conn.conexao();
        
        Usuario user = new Usuario();
        Usuario user2 = new Usuario();
        
        user.setNomeCompleto("teste 1");
        user.setEmail("raiff_santos@hotmail.com");
        user.setLogin("raiff");
        user.setSenha("1234");
        
        user2.setNomeCompleto("teste 2");
        user2.setEmail("exemplo@hotmail.com");
        user2.setLogin("exemplo");
        user2.setSenha("1234");
        
        
        UsuarioControl controller = new UsuarioControl();
        
        controller.cadastrarUsuario(user);
        controller.cadastrarUsuario(user2);
        
        user.setId(7);//somente para teste, o id do usuario a ser deletado precisa vir do banco de dados.
        
        controller.deletarUsuario(user);
    }
}
