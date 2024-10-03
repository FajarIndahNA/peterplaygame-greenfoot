import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.io.*;
//import javax.swing.*;
/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{

    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        prepare();
        //showPoint();
    }
    private void prepare()
    {
        Landc landc = new Landc();
        addObject (landc, 220, 469);
        Landc landc1 = new Landc();
        addObject (landc1, 300, 474);
        Ship1 ship = new Ship1();
        addObject (ship, 421,78);
        Win youwin = new Win();
        addObject (youwin, 158,109);
        Allmember allmember = new Allmember();
        addObject (allmember, 317, 332);
        BackHome backhome = new BackHome();
        addObject (backhome, 821, 423);
    }
}
