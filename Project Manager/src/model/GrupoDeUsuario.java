package model;

/**
 *
 * @author Dieg0 MigueL
 */
public class GrupoDeUsuario {
    private int id;
    private String nomeDoGrupo;

    public GrupoDeUsuario(int id, String nomeDoGrupo) {
        this.id = id;
        this.nomeDoGrupo = nomeDoGrupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoGrupo() {
        return nomeDoGrupo;
    }

    public void setNomeDoGrupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
    }
}
