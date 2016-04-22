import greenfoot.*;

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuestionMedium extends Actor
{
    // instance variables 
    // See https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html
    // for a discussion of instance variables and class variables
    
    String questionmed;
    AnswerMedium[] ansmed = new AnswerMedium[4];
    int correctAnswer;
    private boolean addAns=true;
    
    
     public QuestionMedium(String qmed){
       questionmed=qmed;
       stringToImage(qmed);
    }
    
    public QuestionMedium(String qmed, 
                    String a0,String a1,String a2,String a3, 
                    int correctA){
      questionmed=qmed;
      stringToImage(qmed);
      
      ansmed[0]=new AnswerMedium(a0);
      ansmed[1]=new AnswerMedium(a1);
      ansmed[2]=new AnswerMedium(a2);
      ansmed[3]=new AnswerMedium(a3);
      
      ansmed[correctA].setCorrect();
       
      
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
       getWorld().addObject(ansmed[0],xStart,yStart);
       getWorld().addObject(ansmed[1],xStart+60,yStart);
       getWorld().addObject(ansmed[2],xStart+120,yStart);
       getWorld().addObject(ansmed[3],xStart+180,yStart);
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
