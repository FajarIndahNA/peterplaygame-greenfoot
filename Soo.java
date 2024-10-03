import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soo extends Actor
{
    private int speed = 7;
    private int vSpeed = 0;
    private int acceleration = 2;
    private int jumpStrength = 12;
    /**
     * Act - do whatever the Soo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Soo()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/13, image.getHeight()/13);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
        checkKeys();
        checkFall();
        detectEnemyCollision();
    }
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("Left"))
        {
            setImage("soo-left.png");
            moveLeft();
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setImage("soo-right.png");
            moveRight();
        }
        if (Greenfoot.isKeyDown("up"))
        {
            jump();
        }
    }
    public void jump()
    {
        vSpeed = -jumpStrength;
        fall();
    }
    public boolean onLand()
    {
        Actor under = getOneObjectAtOffset( 0,getImage().getHeight(), Land.class);
        return under != null;
    }
    public void checkFall()
    {
        if(onLand()){
            vSpeed = 0;
        }
        else{
            fall();
        }
    }
    public void fall()
    {
        setLocation (getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    public void moveRight()
    {
        setLocation ( getX() + speed, getY() );
    }
    public void moveLeft()
    {
        setLocation ( getX() - speed, getY() );
    }
    public void detectEnemyCollision()
    {
        if(isTouching(Enemy.class)){
            setLocation(67,408);
        }
    }
}
