import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Infoicon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Infoicon extends Actor
{
    /**
     * Act - do whatever the Infoicon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Infoicon()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/15, image.getHeight()/15);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this))
        {
           getImage().scale((int)Math.round(getImage().getWidth()*0.9), (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.delay(2);
            Greenfoot.setWorld(new Info());//akan berpindah pada info
        }
    }    
}
