import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends Actor
{
    /**
     * Act - do whatever the Game wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Game()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/23, image.getHeight()/23);
        setImage(image);
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
           getImage().scale((int)Math.round(getImage().getWidth()*0.9), (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.delay(2);
            Greenfoot.setWorld(new Credit());//akan berpindah ke halaman credit
        }
    }    
}
