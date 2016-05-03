/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.ConectaDB;

/**
 *
 * @author cabra
 */
public class Main {

    public static void main(String[] args) {
        
        //testando a conexao
        ConectaDB conn = new ConectaDB();
        conn.conexao();
    }
    
    
    
}
