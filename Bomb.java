import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bomb extends Actor
{
    int bombSpeed = -1;
    public void act()
    {
        move(bombSpeed);
        if(getX() <= 0)
        {
            resetBomb();
        }
    }
    
    public void resetBomb(){
        int x = Greenfoot.getRandomNumber(2);
        if(x == 0)
        {
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
    }
}
