import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 900, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kocik kocik = new Kocik();
        addObject(kocik,492,836);
        Kocik kocik2 = new Kocik();
        addObject(kocik2,436,523);
    }

    
    public void dodajPizze ()
    {int szerokosc =this.getWidth();
        int x = Greenfoot.getRandomNumber (szerokosc) ;

        Pizza pizza = new Pizza ();
        addObject ( pizza, x , 0) ;
    }


    public void act ()
    {
        int szansa=Greenfoot.getRandomNumber(100);

        if (szansa < 3 )
        {
            dodajPizze () ;
        }

    }
}
