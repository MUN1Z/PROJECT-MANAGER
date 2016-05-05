
package control;

/**
 *
 * @author Raiff
 */
public class BacklogControl {
    
    private static BacklogControl controladorBacklog;
    
    //singleton
    public static BacklogControl getInstance(){
        if(controladorBacklog == null){
            controladorBacklog = new BacklogControl();
            return controladorBacklog;
        }
        return controladorBacklog;
    }
    
    public void cadastrarBacklog(){
    
    }
    
    public void deletarBacklog(){
    
    }
    
    public void editarBacklog(){
    
    }
    
    public void listarBacklog(){
    
    }
}
