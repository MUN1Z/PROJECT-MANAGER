package model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Dieg0 MigueL
 */
public class Backlog {
    private long id;
    private String dataDeCriacao;
    private String dataUltimaModificacao;
    private int id_projeto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getDataUltimaModificacao() {
        return dataUltimaModificacao;
    }

    public void setDataUltimaModificacao(String dataUltimaModificacao) {
        this.dataUltimaModificacao = dataUltimaModificacao;
    }

    public int getId_projeto() {
        return id_projeto;
    }

    public void setId_projeto(int id_projeto) {
        this.id_projeto = id_projeto;
    }
    
    
}
