package lordOfTheRing.enemy;

import lordOfTheRing.Hero.Mortal;

public class Enemy implements Mortal {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public void takeDamage(int damage){
        this.health -= Math.min(health, damage);
        System.out.println(name + " get damage " + damage + ", remaining " + health);
    }
    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
