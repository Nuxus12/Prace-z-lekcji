import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ewa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ewa extends Actor
{
    public void klawisze ()

    {
        // Add your action code here.

        if (Greenfoot.isKeyDown("right"))move(1) ;
        if (Greenfoot.isKeyDown("left"))move(-1) ;
        if (Greenfoot.isKeyDown("down"))
        {
            turn(-90);
            move(-1); 
            turn(90);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            turn(-90);
            move(1); 
            turn(90);
        }
    }    

    public void stawianieJablek ()
    {
        if (Greenfoot.isKeyDown("space") )
        {
            if( !isTouching (Apple.class))
            {
                int x =getX() ;
                int y =getY();
                Apple apple = new Apple();
                getWorld() .addObject(apple,x,y);
            }
        }
    }

    public void act() 
    {
        klawisze ();
        stawianieJablek();

    }
}
