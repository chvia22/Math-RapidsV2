import greenfoot.*;

/**
 * Write a description of class Settings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlaySetUpMenu extends World
{

    /**
     * Constructor for objects of class Settings.
     * 
     */
    public PlaySetUpMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        BackButton backbutton = new BackButton();
        addObject(backbutton, 72, 364);
        EasyButton easybutton = new EasyButton();
        addObject(easybutton, 300, 135);
        MediumButton mediumbutton = new MediumButton();
        addObject(mediumbutton, 300, 200);
        HardButton hardbutton = new HardButton();
        addObject(hardbutton, 300, 265);
    }
}
