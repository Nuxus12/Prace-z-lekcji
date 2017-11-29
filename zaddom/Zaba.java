import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zaba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zaba extends Actor
{
    public void Umieranie()
    {
        if (isTouching (Kangur.class));
        {
            removeTouching (Zaba.class);
        }
    }
    
         public void Zjadanie()
    {
        if (isTouching (Hipcio.class)) ;
        {
            removeTouching (Hipcio.class); 
           
        }
    }
       
    
    public void Ruch ()
    {
        if (Greenfoot.isKeyDown ("left")) move(-2);
        if (Greenfoot.isKeyDown ("right")) move (2);
        if (Greenfoot.isKeyDown("down")) 
{
    turn(-90);
    move(-2);
    turn(90);
}
        if(Greenfoot.isKeyDown("up"))
        {
         turn(-90);
         move(2);
         turn(90);
       
        }
    }
    
    public void act() 
    {
        Ruch ();
        Zjadanie();
        Umieranie();
        
    }
        
}
