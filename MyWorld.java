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
        super(900, 500, 1); 
        prepare();
    }
    private void prepare()
    {
        //Menambahkan objek pada game
        Landc landc = new Landc();
        addObject (landc, 167, 478);
        Landc landc1 = new Landc();
        addObject (landc1, 723, 478);
        One one = new One();
        addObject (one, 441, 331);
        Name name = new Name();
        addObject (name, 461, 118);
        Play play = new Play();
        addObject (play, 438, 278);
        Infoicon infoicon = new Infoicon();
        addObject (infoicon, 750, 41);
        Game game = new Game();
        addObject (game, 827, 42);
    }
}
