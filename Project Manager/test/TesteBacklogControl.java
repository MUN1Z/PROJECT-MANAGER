/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import control.BacklogControl;
import control.ProjetoControl;
import database.ConectaDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Backlog;
import model.Projeto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import facade.Facade;

/**
 *
 * @author Raiff
 */
public class TesteBacklogControl {

    private static Projeto projeto;
    private static Backlog backlog;
    private static int id_projeto;

    @BeforeClass
    public static void setUpClass() {
        projeto = new Projeto();
        projeto.setDataDeCriacao("23/05/2016");
        projeto.setDataDeFinalizacao("02/06/2016");
        projeto.setDescricaoGeral("Projeto de Teste JUnit");

        Facade.cadastrarProjeto(projeto);
        projeto.setId(getIdProjeto());
        
        backlog = new Backlog();
        backlog.setDataDeCriacao("23/05/2016");
        backlog.setDataUltimaModificacao("23/05/2016");
        backlog.setId_projeto((int) projeto.getId());
    }

    private static int getIdProjeto() {
        ConectaDB conecta = new ConectaDB();
        conecta.conexao();

        int id_projeto;

        try {
            String sql = "SELECT * FROM projeto where descricao='Projeto de Teste JUnit'";

            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            id_projeto = rs.getInt("id");
            conecta.desconecta();
            return id_projeto;

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Before
    public void setUp() {
       
    }

    @Test
    public void cadastrarBacklog() {
        Assert.assertTrue("Erro ao cadastrar", BacklogControl.cadastrarBacklog(backlog));
    }

    @Test
    public void deletarBacklog() {
        Assert.assertTrue("Erro ao deletar", BacklogControl.deletarBacklog(backlog));
    }

    @After
    public void tearDown() {

    }

    @AfterClass
    public static void tearDownClass() {
        projeto = null;
        backlog = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
