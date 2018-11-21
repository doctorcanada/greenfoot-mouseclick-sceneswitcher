import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene3 extends World
{
    private int scoreForThisScene; // Scene3 "has-a" current score
    
    /**
     * Constructor for objects of class Scene3.
     * 
     */
    public Scene3( int scoreFromPreviousScene )
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // initialize instance variables
        this.scoreForThisScene = scoreFromPreviousScene;
    } // end Scene3 constructor
    
    public void act()
    {
        // Just for the purpose of this "toy example," let's 
        // just end the scenario here, display the score, and update userInfo
        Greenfoot.stop();
        
        showText( "Final score: " + scoreForThisScene, 300, 250 );
        
        if (UserInfo.isStorageAvailable()) {
            UserInfo myInfo = UserInfo.getMyInfo();
            if (scoreForThisScene > myInfo.getScore()) {
                myInfo.setScore(scoreForThisScene);
                myInfo.store();  // write back to server            
            } // end inner if
            showText( "High score: " + myInfo.getScore(), 300, 275 );
        } // end outer if
        
    } // end method act
} // end class Scene3
