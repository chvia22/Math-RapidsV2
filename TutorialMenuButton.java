import greenfoot.*;

/**
 * Write a description of class TutorialMenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialMenuButton extends Actor
{
    /**
     * Act - do whatever the TutorialMenuButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new TutorialMenu());
        }
    }    
}
