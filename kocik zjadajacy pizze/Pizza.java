import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
  public void spadanie ()
 { turn (90);
        move(2);
        turn(-90);
    }
    public void znikanie ()
    {
        int Y = getY ();
        World world =this.getWorld();
        int wysokosc =world.getHeight() -1;
        if(Y >=wysokosc) world.removeObject (this) ;
    }
    
    public void act() 
    {
        spadanie ();
        znikanie ();
    }    
}
