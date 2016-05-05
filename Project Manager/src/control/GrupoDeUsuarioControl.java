
package control;

/**
 *
 * @author Raiff
 */
public class GrupoDeUsuarioControl {
    
    private static GrupoDeUsuarioControl controladorGrupoDeUsuario;
    
    //singlegon
    public static GrupoDeUsuarioControl getInstance(){
        if(controladorGrupoDeUsuario == null){
            controladorGrupoDeUsuario = new GrupoDeUsuarioControl();
            return controladorGrupoDeUsuario;
        }
        return controladorGrupoDeUsuario;
    }
    
    public void cadastrarGrupoDeUsuario(){
    
    }
    
    public void deletarGrupoDeUsuario(){
    
    }
    
    public void editarGrupoDeUsuario(){
    
    }
    
    public void listarGrupoDeUsuario(){
    
    }
}
