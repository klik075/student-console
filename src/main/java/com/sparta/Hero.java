package com.sparta;

public class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp)
    {
        this.name = name;
        this.hp = hp;
    }
    public int getHp()
    {
        return hp;
    }
    public void takeDamage(int damage)
    {
        if(damage < 0)
            return;

        hp = Math.max(hp - damage, 0);
    }
    public void describe()
    {
        System.out.println(name + "| HP " + hp);
    }
}
