import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Astronot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Astronot extends Actor
{
    /**
     * Act - do whatever the Astronot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Astronot()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/13, image.getHeight()/13);
        setImage(image);
    }
}
