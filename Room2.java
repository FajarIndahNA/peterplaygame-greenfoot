import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room2 extends World
{

    /**
     * Constructor for objects of class Room2.
     * 
     */
    public Room2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1);
        prepare();
    }
    private void prepare()
    {
        Landc landc1 = new Landc();
        addObject (landc1, 189, 496);
        Landc landc2 = new Landc();
        addObject (landc2, 748, 498);
        Landa landa = new Landa();
        addObject (landa, 820, 168);
        Landa landa1 = new Landa();
        addObject (landa1, 576, 184);
        Landa landa3 = new Landa();
        addObject (landa3, 231, 240);
        Landb landb = new Landb();
        addObject (landb, 84, 168);
        Landa landa2 = new Landa();
        addObject (landa2, 428, 309);
        Landb landb2 = new Landb();
        addObject (landb2, 503, 306);
        Koin koin = new Koin();
        addObject (koin, 85, 112);
        Koin koin2 = new Koin();
        addObject (koin2, 158, 96);
        Koin koin3 = new Koin();
        addObject (koin3, 210, 95);
        Koin koin4 = new Koin();
        addObject (koin4, 473, 246);
        Koin koin5 = new Koin();
        addObject (koin5, 602, 235);
        Koin koin6 = new Koin();
        addObject (koin6, 822, 114);
        Koin koin7 = new Koin();
        addObject (koin7 , 291, 196);
        Kyung soo = new Kyung();
        addObject (soo, 67, 408);
        Berlian berlian = new Berlian();
        addObject (berlian, 825, 421);
        Alien alien = new Alien();
        addObject (alien, 387, 44);
        Alien alien2 = new Alien();
        addObject (alien2, 753, 259);
        Alien alien3 = new Alien();
        addObject (alien3, 475, 375);
    }
}
