/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import control.ProjetoControl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
        
        Projeto projeto = new Projeto();
        Calendar c = Calendar.getInstance();                
        projeto.setDescricaoGeral("my first projet");
        projeto.dataIniDataFim(c, c);
        System.out.println("data ini " + projeto.getDataDeCriacao());
        ProjetoControl.cadastrarProjeto(projeto);
        
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
