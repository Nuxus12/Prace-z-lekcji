import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kocik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kocik extends Actor
{
    int punkty = 0;
    boolean tanczylem = true ;
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
        if( isTouching (Pizza.class))
        {
            removeTouching(Pizza.class);
            punkty ++ ;
            tanczylem = false;
        }
    }

    public void wyswietlPunkty ()
    {
        World swiat=this.getWorld () ;
        swiat.showText ("Pizze: " + punkty , 70,40 ) ;
        

    }

    public void tanczenie()
    {
        if ( punkty % 5 == 0 && !tanczylem )
        {
            for (int i = 0; i < 4; i++)
            {
                this.setImage("cat-dance.png");
                Greenfoot.delay (20);
                this.setImage("cat-dance-2.png");
                Greenfoot.delay (20);
            }
            this.setImage("cat-sit.png");
            tanczylem =true ;
        }
    }

    public void act () 
    {
        ruch ();
        zjadaniepizzy();
        wyswietlPunkty ();
        tanczenie () ;
    }    
}

