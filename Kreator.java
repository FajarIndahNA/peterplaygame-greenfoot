import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kreator extends Actor
{
    /**
     * Act - do whatever the Kreator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Kreator()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/5, image.getHeight()/5);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
