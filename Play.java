import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Actor
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Play()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/10, image.getHeight()/10);
        setImage(image);
    }
    public void act() 
    {
        // agar bisa berpindah halaman
        if(Greenfoot.mousePressed(this))
        {
           getImage().scale((int)Math.round(getImage().getWidth()*0.9), (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.delay(2);
            Greenfoot.setWorld(new Room1());//akan berpindah pada room1
        }
    }    
}
