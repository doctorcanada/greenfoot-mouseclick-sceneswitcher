import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene1 extends World
{
    private MouseInfo mouseInfo;            // Scene1 "has-a" MouseInfo 
    private SceneSelectButton scene2Button; // Scene1 "has-a" SceneSelectButton
    private SceneSelectButton scene3Button; // Scene1 "has-a" SceneSelectButton
    private int scoreForThisScene;          // Scene1 "has-a" current score for this scene
    
    /**
     * Constructor for objects of class Scene1.
     * 
     */
    public Scene1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // Initialize instance variables and place objects in scene
        mouseInfo = Greenfoot.getMouseInfo();
        scene2Button = new SceneSelectButton("scene2button.png");
        addObject(scene2Button,150,270);
        scene3Button = new SceneSelectButton("scene3button.png");
        addObject(scene3Button,450,270);
        scoreForThisScene = 0;
    } // end Scene1 constructor
    
    /**
     * Specifies what the scene does during each cycle through the game loop
     * (in this case, we check to see if the mouse left button has been clicked,
     *  and if so, did we click on a button? If so, then load the next scene based
     *  on what button was clicked, and pass along some data to used in the 
     *  next scene
     */
    public void act()
    {
        /* 
         * just as a "toy" example for the sake of generating
         * some data to pass to the next scene, let's increment
         * the score by 1 for each act cycle
         */
        scoreForThisScene++;
        
        /*
         * Next, let's load the scene corresponding to the button that was
         * clicked; the current score will be passed to the constructor
         * of whatever the next scene is, so that the score PERSISTS
         * from scene to scene! (Important stuff!!!)
         */
        if ( Greenfoot.mouseClicked( scene2Button ) ) 
        {
            Greenfoot.setWorld( new Scene2( scoreForThisScene ) ); 
        } 
        else if ( Greenfoot.mouseClicked( scene3Button ) ) 
        {
            Greenfoot.setWorld( new Scene3( scoreForThisScene ) );
        } // end if/else
    } // end method act
        
} // end class Scene1
