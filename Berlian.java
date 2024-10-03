import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Berlian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Berlian extends Actor
{
    /**
     * Act - do whatever the Berlian wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Berlian()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/4, image.getHeight()/4);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
