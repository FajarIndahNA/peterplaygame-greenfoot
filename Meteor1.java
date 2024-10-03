import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteor1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteor1 extends Enemy
{
    /**
     * Act - do whatever the Meteor1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Meteor1()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/30, image.getHeight()/30);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
