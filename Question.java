import greenfoot.*;

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question extends Actor
{
    // instance variables 
    // See https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html
    // for a discussion of instance variables and class variables
    
    String question;
    Answer[] ans = new Answer[4];
    int correctAnswer;
    private boolean addAns=true;
    
    
     public Question(String q){
       question=q;
       stringToImage(q);
    }
    
    public Question(String q, 
                    String a0,String a1,String a2,String a3, 
                    int correctA){
      question=q;
      stringToImage(q);
      
      ans[0]=new Answer(a0);
      ans[1]=new Answer(a1);
      ans[2]=new Answer(a2);
      ans[3]=new Answer(a3);
      
      ans[correctA].setCorrect();
       
      
    }  

       /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if (addAns){
         addAnswers();
         addAns=false;
        }
    } 
    
    public void addAnswers(){
       int xStart=340; 
       int yStart=150; 
       getWorld().addObject(ans[0],xStart,yStart);
       getWorld().addObject(ans[1],xStart+60,yStart);
       getWorld().addObject(ans[2],xStart+120,yStart);
       getWorld().addObject(ans[3],xStart+180,yStart);
    }


    // We use this code in each of our constructors, so create a single method
    // to create a background image from the question string
    // Once created, we set the question object's image to this string image
    public void stringToImage(String s){
        
        GreenfootImage imgTxt= new GreenfootImage(600,30);


        imgTxt.setColor(java.awt.Color.black);
      
        imgTxt.setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 14));

        imgTxt.drawString(s,1,15);
     
        setImage(imgTxt);      
        
    }
}
