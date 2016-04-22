import greenfoot.*;

/**
 * Write a description of class MediumButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediumButton extends Actor
{
    /**
     * Act - do whatever the MediumButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.mouseClicked(this))
       {
           Greenfoot.setWorld(new Medium());
       }
    }    
}
