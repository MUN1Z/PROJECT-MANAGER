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
    private Calendar dataDeCriacao;
    private Calendar dataDeFinalizacao;
    
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
    
    public void dataIniDataFim(Calendar dataCriacao, Calendar dataFinalizacao){
        this.dataDeCriacao = dataCriacao;
        this.dataDeFinalizacao = dataFinalizacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricaoGeral() {
        return descricaoGeral;
    }

    public void setDataDeCriacao(Calendar dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }
    

    public void setDescricaoGeral(String descricaoGeral) {
        this.descricaoGeral = descricaoGeral;
    }


    public Calendar getDataDeCriacao() {
        return dataDeCriacao;
    }


    public Calendar getDataDeFinalizacao() {
        return dataDeFinalizacao;
    }

    public void setDataDeFinalizacao(Calendar dataDeFinalizacao) {
        this.dataDeFinalizacao = dataDeFinalizacao;
    }

    
    

}
