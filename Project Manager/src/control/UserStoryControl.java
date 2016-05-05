
package control;

/**
 *
 * @author Raiff
 */
public class UserStoryControl {
    
    public static UserStoryControl controladorUserStory;
    
    //singleton
    public static UserStoryControl getInstance(){
        if(controladorUserStory==null){
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
    
    public void listarUserStory(){
    
    }
}
