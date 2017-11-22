import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake2 extends Actor
{
    public boolean dotykaAdama ()
    {
        return isTouching(Adam.class); 
        
        
        
    }
    public boolean dotykaEwy()
    {
        return isTouching (Ewa.class);
    }
    
    /**
     * Act - do whatever the Snake2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
