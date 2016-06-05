/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import control.ProjetoControl;
import facade.Facade;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Projeto;
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
public class TesteProjeto {
    
    public TesteProjeto() {
        
    }
    
    @Test
    public void cadastrarProjeto(){
        
        Projeto p = new Projeto();
        
        ArrayList<Projeto> projetos = Facade.listarProjeto();
        
        int tamanho = projetos.size();

        p.setDescricaoGeral("Nome do projeto 2");
        p.setDataDeCriacao("20/05/2016");
        p.setDataDeFinalizacao("20/06/2016");
        assertTrue(Facade.cadastrarProjeto(p));
        
        projetos = Facade.listarProjeto();
        assertEquals(tamanho+1, projetos.size());
    }
    
    @Test
    public void testeDeDeletarProjeto(){
        
        Projeto p = new Projeto();
        
        ArrayList<Projeto> projetos = Facade.listarProjeto();
        int tamanho = projetos.size();
                
        assertTrue(Facade.deletarProjeto(p));
        projetos = Facade.listarProjeto();
        
        assertEquals(tamanho-1, projetos.size());
    }
    
    @Test
    public void testeDeEditarProjeto(){
        Projeto p = new Projeto();
        
        p.setId(40);
        p.setDescricaoGeral("Teste de Descrição");
        assertTrue(Facade.editarProjeto(p));
    }
    
    @Test
    public void testeDeListarProjeto(){
    
        ArrayList<Projeto> projetos = Facade.listarProjeto();
                
        assertNotNull(projetos);
        
        boolean contem = false;
        if(projetos.size() > 0){
            contem = true;
        }
        assertTrue(contem);
        
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
