import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kocik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kocik extends Actor
{
    public void ruch ()
    {
        if (Greenfoot.isKeyDown ("right"))
        {
            move(6);
        }
        if (Greenfoot.isKeyDown ("left"))
        {
            move(-6);
        }
    }

    public void zjadaniepizzy ()
    {
        if( isTouching (Pizza.class))removeTouching(Pizza.class);
        
    }

    public void act () 
    {
        ruch ();
        zjadaniepizzy();
    }    
}

