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
        super(1000, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Adam adam = new Adam();
        addObject(adam,945,47);
        Ewa ewa = new Ewa();
        addObject(ewa,47,453);
        ewa.setLocation(216,348);
        adam.setLocation(822,113);
        Drzewo drzewo = new Drzewo();
        addObject(drzewo,825,371);
        Wychodek wychodek = new Wychodek();
        addObject(wychodek,209,98);
    }

    public void act ()
    {
        if(Greenfoot.isKeyDown("b"))
        {   int szerokosc =getWidth();
            int wysokosc =getHeight();
            

            String odp=Greenfoot.ask ("ile węży ustawić: ");
            int ile = Integer.parseInt(odp);

            for (int i=0; i<ile ; i++)
            {
                int x =Greenfoot.getRandomNumber(szerokosc);
                int y =Greenfoot.getRandomNumber(wysokosc);
                Snake2 snake=new Snake2();
                addObject(snake,x,y);
                
                while (snake.dotykaAdama()|| snake.dotykaEwy() )
                {
                x =Greenfoot.getRandomNumber(szerokosc);
                y =Greenfoot.getRandomNumber(wysokosc);
                snake.setLocation(x,y);
                
            }
             
        }
    }
}
}

