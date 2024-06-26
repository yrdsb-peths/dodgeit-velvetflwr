import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        banana banana = new banana();
        addObject(banana, 600, 100);
        
        Orange orange = new Orange();
        addObject(orange, 600, 300);
    }
}
