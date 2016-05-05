
package control;

/**
 *
 * @author Raiff
 */
public class UserStoryControl {
    
    private static UserStoryControl controladorUserStory;
    
    public static UserStoryControl getInstance(){
        if(controladorUserStory == null){
            controladorUserStory = new UserStoryControl();
            return controladorUserStory;
        }
        return controladorUserStory;
    }
    
    public void cadastrarUserStory(){
    
    }
    
    public void deletarUserStory(){
    
    }
    
    public void editarUserStory(){
    
    }
    
    public void listaruserStory(){
    
    }
}
