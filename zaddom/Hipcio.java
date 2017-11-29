import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hipcio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hipcio extends Actor

{
    int krok=(3) ;
    int losuj = Greenfoot.getRandomNumber(160);
    int szybkosc=Greenfoot.getRandomNumber(3);
    
    
    public void Odbijanie ()
    {
        int losuj = Greenfoot.getRandomNumber(100);
        
        if (isAtEdge())krok=krok * (szybkosc);
        if (isAtEdge() )turn(losuj);
   
    }
     public void Ruch ()
  {
      move(krok);
    }
    public void act() 
    {
        Ruch ();
        Odbijanie();
    }    
}
