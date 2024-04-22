import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Orange extends Actor
{
    public void act()
    {
        move(-2);//
        if(getX()<=0)
        {
            resetOrange();
        }
        
        if(isTouching(Hero.class))
        {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetOrange()
    {
        int x = Greenfoot.getRandomNumber(2);
        if(x==0)
        {
            setLocation(600, 300);
        }
        else
        {
            setLocation(600, 100);
        }
    }
}
