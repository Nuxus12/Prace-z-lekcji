import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kangur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kangur extends Actor
{
   public void Zjadanie()
    {
        if (isTouching (Zaba.class)) ;
        {
            removeTouching (Zaba.class); 
           
        }
    }
    public void act ()
    
   {
       Zjadanie();
    }    
}

