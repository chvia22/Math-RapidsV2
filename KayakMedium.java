import greenfoot.*;

/**
 * Write a description of class KayakMedium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KayakMedium extends Actor
{
    public int speedmed;
    
    /**
     * 
     */
    public KayakMedium()
    {
        speedmed = 2;
    }
    
    /**
     * Act - do whatever the KayakMedium wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-speedmed, getY());
        
        if (getX() == 0)
        {
            Medium medium = (Medium)getWorld();
            medium.removeObject(this);
            Greenfoot.setWorld(new GameoverMenu());
        }
        
    } 
    
    public void rowBoat()
    {
        setLocation(getX()+55, getY());
    }
}
