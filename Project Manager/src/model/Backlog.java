package model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Dieg0 MigueL
 */
public class Backlog {
    private long id;
    private Calendar dataDeCriacao;
    private Calendar dataUltimaModificacao;
    private ArrayList<UserStory> userStories;
    
    public Backlog(long id) {
        this.id = id;
        dataDeCriacao = Calendar.getInstance();
        userStories = new ArrayList<UserStory>();
    }

    public void salvarModificacoes(){
        dataUltimaModificacao = Calendar.getInstance();
    }
    
    public void adicionarUS(UserStory us){
        userStories.add(us);
    }
    
    public void removerUS(UserStory us){
        userStories.remove(us);
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Calendar getDataDeCriacao() {
        return dataDeCriacao;
    }

    public Calendar getDataUltimaModificacao() {
        return dataUltimaModificacao;
    }
}
