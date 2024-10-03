import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kyung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kyung extends Actor
{
    private GreenfootImage gameoverimage = new GreenfootImage("gameover.png");
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -17;
    private int lives = 3; //Score number of lives
    private int score; //store the current score
    private int coinTaken; //store the number of coin taken
    /**
     * Act - do whatever the Kyung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Kyung()
    {
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/13, image.getHeight()/13);
        setImage(image);
    }
    public void act() 
    {
        moveAround();
        checkFalling();
        detectAlienCollision();
        detectShip();
        detectBerlian();
        takeCoin();
        showStatus();
    }
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-4);
        }
        if(Greenfoot.isKeyDown("up")&&(onGround() == true))
        {
            vSpeed = jumpHeight;
            fall();
        }
    }
    boolean onGround()
    {
        Actor under= getOneObjectAtOffset( 0,getImage().getHeight()/2, Land.class);
        return under != null;
    }
    public void checkFalling()
    {
        if(onGround() == false)
        {
            fall();
        }
        if(onGround() == true)
        {
            vSpeed = 0;
        }
    }
    public void detectAlienCollision()
    {
        if(isTouching(Alien.class)){
            Greenfoot.playSound("alien.wav");
            setLocation(67,408);//Kyung kembali ke titik awal dia karena kyung mengenai alien
            removeLife();
        }
    }
    public void detectShip()
    {
        if(coinTaken ==  7 && isTouching(Ship.class)){
            setLocation(67,408);
            increaseScore();
            coinTaken = 0;
            Greenfoot.delay(2);
            Greenfoot.setWorld(new Room2());//menuju ke room 2 atau level selanjutnya
        }
    }
    public void detectBerlian()
    {
        if(coinTaken == 7 && isTouching(Berlian.class)){
            Greenfoot.delay(3);
            Greenfoot.setWorld(new End());// menuju halaman akhir bahwa game selesai dan dapat kembali ke halaman awal
        }
    }
    public void takeCoin()
    {
        if(isTouching(Koin.class)){
            removeTouching(Koin.class);
            Greenfoot.playSound("coin.wav");
            score+=10;
            coinTaken++;
        }
    }
    public void removeLife()
    {
        lives--;
        testEndGame();
        showStatus();
    }
    public void testEndGame()
    {
        if(lives <= 0){
            setImage(gameoverimage);
            Greenfoot.playSound("gameover.wav");
            setLocation(461,245);
            Greenfoot.stop();
        }
    }
    public void increaseScore()
    {
        score++;
    }
    public void showStatus()
    {
        getWorld().showText("Lives : "+lives, 744,27);
        getWorld().showText("Score : "+score, 744,50);
    }
}
