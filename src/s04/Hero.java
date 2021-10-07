package s04;

import java.util.Collections;

public class Hero {
    static int INITIAL_HEALTH = 100;
    protected final int power;
    private final int speed;
    protected int health;

    public Hero() {
        health = INITIAL_HEALTH;
        power = 50;
        speed = 50;
    }

    public Hero(int power) {
        this.health = INITIAL_HEALTH;
        this.power = power % 100;
        this.speed = 100 - this.power;
    }

    private static String repeatAsterisk(int times) {
        return String.join("", Collections.nCopies(times, "*"));
    }

    public void handleDamage(int damage) {
        health = health - damage;
    }

    public void hit(Hero hero) {
        hero.handleDamage(this.power);
    }

    @Override
    public String toString() {
        return "health \t" + repeatAsterisk(health / 10) + "\n" +
                "power \t" + repeatAsterisk(power / 10) + "\n" +
                "speed \t" + repeatAsterisk(speed / 10) + "\n";
    }
}
