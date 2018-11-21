import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene2Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SceneSelectButton extends Actor
{
    private GreenfootImage buttonImage; // SceneSelectButton "has-a" GreenfootImage
    
    /**
     * Initialize instance variables for a newly-instantiated
     * object of this class
     */
    public SceneSelectButton( String imageFilename )
    {
        buttonImage = new GreenfootImage(imageFilename);
        setImage( buttonImage );
    } // end SceneSelectButton constructor
    
    /**
     * Act - do whatever the Scene2Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } // end method act 
    
} // end class SceneSelectButton
