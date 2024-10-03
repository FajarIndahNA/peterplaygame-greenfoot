import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info extends World
{

    /**
     * Constructor for objects of class Info.
     * 
     */
    public Info()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1);
        prepare();
    }
    private void prepare()
    {
        Informasi informasi = new Informasi();
        addObject (informasi, 462, 222);
        Astronot astronot = new Astronot();
        addObject (astronot, 234, 376);
        BackHome backhome = new BackHome();
        addObject (backhome, 805, 374);
    }
}

