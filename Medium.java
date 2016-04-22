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
public class Medium extends World
{
    KayakMedium kayakmedium = new KayakMedium();
    private String fileName = "medium-equations-answers.txt";
    public ArrayList<String> linesmed;
    public int maxLinesMed;
    public int linenom=0;
    
    /**
     * Constructor for objects of class Easy.
     * 
     */
    
    public Medium()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        try 
        {
            linesmed = loadFile(fileName);
            maxLinesMed=linesmed.size();
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
        //KayakMedium kayakmedium = new KayakMedium();
        addObject(kayakmedium, 300, 215);
        
        QuestionMedium questionm = new QuestionMedium("1) 10+6=", "a) 12", "b) 13", "c) 16", "d) 15",2);
        addObject (questionm, 580, 105);

        
    }
    
    private ArrayList<String> loadFile(String filename) throws IOException
    {
        ArrayList<String> linesmed = new ArrayList<String>();
        
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
                linesmed.add(line);
            }
            line = reader.readLine();
        }
        reader.close();
        return linesmed;
    }
    
    public void loadQMedium()
    {
        String lm=linesmed.get(linenom);
        String[] qmedAndA = lm.split(",");
        
        removeObjects(getObjects(QuestionMedium.class));
        removeObjects(getObjects(AnswerMedium.class));
        
        QuestionMedium qmed = new QuestionMedium(qmedAndA[0],
                                  qmedAndA[1],qmedAndA[2],qmedAndA[3],qmedAndA[4],
                                  Integer.parseInt(qmedAndA[5]));
        addObject(qmed, 580, 105);
        linenom++;
        if (linenom> linesmed.size()-1)
        {
            linenom=0;
        }
    }
    
    public int getMaxLines()
    {
        return maxLinesMed;
    }
    
    public void moveKayakMedium()
    {
        kayakmedium.rowBoat();
    }
}