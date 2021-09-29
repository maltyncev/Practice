package s04;

import java.util.Collections;

public class Hero {
    static int INITIAL_HEALTH = 100;

    public int health;
    public final int power;
    private final int speed;

    public int getHealth() {
        return health;
    }
    public int getPower() {
        return power;
    }
    public int getSpeed() {
        return speed;
    }

    public void setHealth (int health) {
        this.health = health;
    }

    public Hero () {
        health = INITIAL_HEALTH;
        power = 50;
        speed = 50;
    }

    public Hero (int power) {
        this.health = INITIAL_HEALTH;
        this.power = power % 100;
        this.speed = 100 - this.power;
    }

    public void hit(Hero hero) {
        hero.health = hero.health - this.power;
    }

    @Override
    public String toString() {
        return "helth \t" + repeatAsterisk(health / 10) + "\n" +
                "power \t" + repeatAsterisk(power / 10) + "\n" +
                "speed \t" + repeatAsterisk(speed / 10) + "\n";
    }

    private static String repeatAsterisk(int times) {
        return String.join("", Collections.nCopies(times,"*"));
    }
}
