import greenfoot.*;

/**
 * Write a description of class Answer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnswerHard extends Actor
{
    String anshd;
    boolean isCorrect=false;
    int ansNum;
    Message m = new Message();
    CorrectMessage cm = new CorrectMessage();
    

     public AnswerHard(String txt){
        
      anshd=txt;
      
      // First we create an image that will hold our largest answer, so that we can 
      // align all the text to the left.  
      GreenfootImage imgTxt= new GreenfootImage(300,30);
      // if we include "java.awt." in the next line, we don't have to import the class
      //See http://www.greenfoot.org/topics/187
      imgTxt.setColor(java.awt.Color.black);
      
      imgTxt.setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 14));
      imgTxt.drawString(anshd,1,15);
     
      //TextImage t=new TextImage(ans);
      setImage(imgTxt);   
        
    }  
    public AnswerHard(String txt, int num, boolean correct){
          
        
    }
    /**
     * Act - do whatever the Answer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        if (Greenfoot.mouseClicked(this)){
           if (isCorrect) {
               getWorld().addObject(cm, 325,100);
               //Easy.moveKayakEasy();
               //getWorld().moveKayakEasy();
               //getWorld(Easy).moveKayakEasy();
               Hard hd = (Hard) getWorld();
               hd.moveKayakHard();
               //Each of these three give a different error message and I have no
               //idea how to fix it.
            }
            else {
               getWorld().addObject(m, 325,100);
            }
            // This could also be put in the message method, after the message is displayed
            // and disappears. Which makes more sense?
            ((Hard) getWorld()).loadQHard();// curLine maintained in Blackboard
         } 
    }
    
    public void setCorrect(){
     isCorrect=true;
    }
    
    public int slen(){
        return anshd.length();
    }
    
}
