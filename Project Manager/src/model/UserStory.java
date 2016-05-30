package model;

/**
 *
 * @author Dieg0 MigueL
 */
class UserStory {
    private long id;
    private String descricao;
    private int peso;
    private String prioridade; 
    private Usuario dono;

    public UserStory(long id, String descricao, int peso, String prioridade, Usuario dono) {
        this.id = id;
        this.descricao = descricao;
        this.peso = peso;
        this.prioridade = prioridade;
        this.dono = dono;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }
    
    
}
