package s05.t01;

import s04.Hero;

public class GodTimeHero extends Hero {
    private int godMinutes;

    public GodTimeHero(int godMinutes) {
        this.godMinutes = godMinutes;
    }

    public GodTimeHero(int power, int godMinutes) {
        super(power);
        this.godMinutes = godMinutes;
    }

    public void pause() {
        try {
            Thread.sleep(godMinutes);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void hit(Hero hero) {
        pause();
        hero.health = hero.health - this.power;
    }
}
