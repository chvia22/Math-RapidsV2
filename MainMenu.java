import greenfoot.*;

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    

    private void prepare()
    {

        PlaySetUpMenuButton playsetupmenubutton = new PlaySetUpMenuButton();
        addObject(playsetupmenubutton, 442, 289);
        QuitButton quitbutton = new QuitButton();
        addObject(quitbutton, 99, 46);
        playsetupmenubutton.setLocation(279, 209);
        TutorialMenuButton tutorialmenubutton = new TutorialMenuButton();
        addObject(tutorialmenubutton, 286, 279);
        quitbutton.setLocation(283, 341);
        playsetupmenubutton.setLocation(533, 290);
        tutorialmenubutton.setLocation(533, 331);
        quitbutton.setLocation(533, 372);
    
    }
}
