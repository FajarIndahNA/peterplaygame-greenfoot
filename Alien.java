import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Enemy
{
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = -2;
    int count = 0;
    public Alien()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/25, image.getHeight()/25);
        setImage(image);
    }
    public void act() 
    {
        //setLocation(getX() + 2, getY());
        //setRotation(getRotation()+5);
        moveAround();
        count++;
    }
    public void moveAround()
    {
        if(count < 120)
        setLocation(getX() + speed, getY());
        else{
            speed = -speed;
            getImage().mirrorHorizontally();
            count = 0;
        }
    }
    
}
