import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class banana extends Actor
{
    public void act()
    {
        move(-3);
        
        if(getX()<=0)
        {
            resetBanana();
        }
    }
    
    public void resetBanana()
    {
        int x = Greenfoot.getRandomNumber(2);
        if(x==0)
        {
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
    }
}
