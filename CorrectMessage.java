import greenfoot.*;

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CorrectMessage extends Actor
{
     GreenfootImage imgCorrectMessage= new GreenfootImage(400,40);

    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CorrectMessage() {
        
    
      // if we include "java.awt." in the next line, we don't have to import the class
      //See http://www.greenfoot.org/topics/187
      imgCorrectMessage.setColor(java.awt.Color.green);
      imgCorrectMessage.fill();
      imgCorrectMessage.setColor(java.awt.Color.black);
      imgCorrectMessage.setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 14));
      imgCorrectMessage.drawString("CORRECT!",20,20);
      imgCorrectMessage.setTransparency(200);
      
     // imgTxt.setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 14));
      // Draw the text into the image that we are creating for the question object
     // imgTxt.drawString(s,1,15);
     
      //TextImage t=new TextImage(ans);
     setImage(imgCorrectMessage);      
        
    }
    public void act() 
    {
        // Add your action code here.
        imgCorrectMessage.setTransparency(imgCorrectMessage.getTransparency()-20);
        if (imgCorrectMessage.getTransparency()<40){
            getWorld().removeObject(this);
        }
    }    
}