package model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Dieg0 MigueL
 */
public class Projeto {
    private long id;
    private String descricaoGeral;
    private String dataDeCriacao;
    private String dataDeFinalizacao;
    
    /*
    public Projeto(long id, String descricaoGeral) {
        this.id = id;
        this.descricaoGeral = descricaoGeral;
        dataDeCriacao = Calendar.getInstance();
    }
    
    public boolean finalizar(){
        dataDeFinalizacao = Calendar.getInstance();
        return true;
    }*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricaoGeral() {
        return descricaoGeral;
    }

    public void setDescricaoGeral(String descricaoGeral) {
        this.descricaoGeral = descricaoGeral;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getDataDeFinalizacao() {
        return dataDeFinalizacao;
    }

    public void setDataDeFinalizacao(String dataDeFinalizacao) {
        this.dataDeFinalizacao = dataDeFinalizacao;
    }
    
  
    
    

}
