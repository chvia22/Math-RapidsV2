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
public class Easy extends World
{
    KayakEasy kayakeasy = new KayakEasy();
    private String fileName = "easy-equations-answer.txt";
    public ArrayList<String> lines;
    public int maxLines;
    public int lineno=0;
    
    /**
     * Constructor for objects of class Easy.
     * 
     */
    
    public Easy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        try 
        {
            lines = loadFile(fileName);
            maxLines=lines.size();
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
        //KayakEasy kayakeasy = new KayakEasy();
        addObject(kayakeasy, 300, 215);
        
        Question question = new Question("10+6=", "a) 12", "b) 13", "c) 16", "d) 15",2);
        addObject (question, 580, 105);

        
    }
    
    private ArrayList<String> loadFile(String filename) throws IOException
    {
        ArrayList<String> lines = new ArrayList<String>();
        
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
                lines.add(line);
            }
            line = reader.readLine();
        }
        reader.close();
        return lines;
    }
    
    public void loadQ()
    {
        String l=lines.get(lineno);
        String[] qAndA = l.split(",");
        
        removeObjects(getObjects(Question.class));
        removeObjects(getObjects(Answer.class));
        
        Question q = new Question(qAndA[0],
                                  qAndA[1],qAndA[2],qAndA[3],qAndA[4],
                                  Integer.parseInt(qAndA[5]));
        addObject(q, 580, 105);
        lineno++;
        if (lineno> lines.size()-1)
        {
            lineno=0;
        }
    }
    
    public int getMaxLines()
    {
        return maxLines;
    }
    
    public void moveKayakEasy()
    {
        kayakeasy.rowBoat();
    }
}