import greenfoot.*;

/**
 * Write a description of class KayakHard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KayakHard extends Actor
{
    public int speedhd;
    
    /**
     * 
     */
    public KayakHard()
    {
        speedhd = 3;
    }
    
    /**
     * Act - do whatever the KayakHard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-speedhd, getY());
        
        if (getX() == 0)
        {
            Hard hard = (Hard)getWorld();
            hard.removeObject(this);
            Greenfoot.setWorld(new GameoverMenu());
        }
        

    }  
    
    public void rowBoat()
    {
        setLocation(getX()+55, getY());
    }
}
