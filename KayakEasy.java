import greenfoot.*;

/**
 * Write a description of class Rowboat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KayakEasy extends Actor
{
    private int speed;
    
    /**
     * 
     */
    public KayakEasy()
    {
        speed = 1;
        
    }
    
    /**
     * Act - do whatever the Rowboat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-speed, getY());
        
        if (getX() == 0)
        {
            Easy easy = (Easy)getWorld();
            easy.removeObject(this);
            Greenfoot.setWorld(new GameoverMenu());
        }
        
        if (getX() >= 550)
        {
            Easy easy = (Easy)getWorld();
            easy.removeObject(this);
            Greenfoot.setWorld(new GameoverMenu());
        }
        
    }    
    
    public void rowBoat()
    {
        setLocation(getX()+55, getY());
    }
}
