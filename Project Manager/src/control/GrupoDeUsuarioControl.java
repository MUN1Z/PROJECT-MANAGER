
package control;

/**
 *
 * @author Raiff
 */
public class GrupoDeUsuarioControl {
    
    private static GrupoDeUsuarioControl controladorGrupoDeUsuario;
    
    //singleton
    public static GrupoDeUsuarioControl  getInstance(){
        if(controladorGrupoDeUsuario==null){
            controladorGrupoDeUsuario = new GrupoDeUsuarioControl();
            return controladorGrupoDeUsuario;
        }
        return controladorGrupoDeUsuario;
    }
    
    public void cadastrarGrupoUsuario(){
        
    }
    
    public void deletarGrupoUsuario(){
    
    }
    
    public void editarGrupoUsuario(){
    
    }
    
    public void listarGrupoUsuario(){
    
    }
}
