import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackHome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackHome extends Actor
{
    /**
     * Act - do whatever the BackHome wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BackHome()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/20, image.getHeight()/20);
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
            Greenfoot.setWorld(new MyWorld());// kembali pada halaman awal
        }
    }    
}
