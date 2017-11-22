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
        super(800, 500, 1); 
        prepare();
    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Zaba zaba = new Zaba();
        addObject(zaba,300,288);
        zaba.setLocation(393,230);
        zaba.setLocation(423,252);
        Hipcio hipcio = new Hipcio();
        addObject(hipcio,440,192);
        Hipcio hipcio2 = new Hipcio();
        addObject(hipcio2,521,256);
        Hipcio hipcio3 = new Hipcio();
        addObject(hipcio3,441,324);
        Hipcio hipcio4 = new Hipcio();
        addObject(hipcio4,357,255);
        Kangur kangur = new Kangur();
        addObject(kangur,666,119);
        Kangur kangur2 = new Kangur();
        addObject(kangur2,629,392);
        Kangur kangur3 = new Kangur();
        addObject(kangur3,191,170);
        Kangur kangur4 = new Kangur();
        addObject(kangur4,328,378);
    }
}
