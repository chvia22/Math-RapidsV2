import greenfoot.*;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
import java.io.*;
/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends World
{
    KayakHard kayakhard = new KayakHard();
    private String fileName = "hard-equations-answer.txt";
    public ArrayList<String> lineshd;
    public int maxLinesHd;
    public int linenoph=0;
    
    /**
     * Constructor for objects of class Easy.
     * 
     */
    
    public Hard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        try 
        {
            lineshd = loadFile(fileName);
            maxLinesHd=lineshd.size();
        }
        catch (IOException ieo)
        {
            System.out.println("error");
        }

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        //KayakHard kayakhard = new KayakHard();
        addObject(kayakhard, 300, 215);
        
        QuestionHard questionhd = new QuestionHard("1) 10+6=", "a) 12", "b) 13", "c) 16", "d) 15",2);
        addObject (questionhd, 382, 146);

        
    }
    
    private ArrayList<String> loadFile(String filename) throws IOException
    {
        ArrayList<String> lineshd = new ArrayList<String>();
        
        ClassLoader classloader = getClass().getClassLoader();
        InputStream is = classloader.getResourceAsStream(filename);
        if (is == null)
        {
            throw new IOException("no such file: " + filename);
        }
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(is));
        String line = reader.readLine();
        while (line != null)
        {
            if (!line.equals("") && !line.startsWith("#"))
            {
                lineshd.add(line);
            }
            line = reader.readLine();
        }
        reader.close();
        return lineshd;
    }
    
    public void loadQHard()
    {
        String lh=lineshd.get(linenoph);
        String[] qhdAndA = lh.split(",");
        
        removeObjects(getObjects(QuestionHard.class));
        removeObjects(getObjects(AnswerHard.class));
        
        QuestionHard qh = new QuestionHard(qhdAndA[0],
                                  qhdAndA[1],qhdAndA[2],qhdAndA[3],qhdAndA[4],
                                  Integer.parseInt(qhdAndA[5]));
        addObject(qh, 382, 146);
        linenoph++;
        if (linenoph> lineshd.size()-1)
        {
            linenoph=0;
        }
    }
    
    public int getMaxLines()
    {
        return maxLinesHd;
    }
    
    public void moveKayakHard()
    {
        kayakhard.rowBoat();
    }
}