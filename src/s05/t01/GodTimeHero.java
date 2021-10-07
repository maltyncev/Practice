package s05.t01;

import s04.Hero;

public class GodTimeHero extends Hero {
    private final int godMinutes;
    private final long creationTime;

    public GodTimeHero(int power, int godMinutes) {
        super(power);
        this.godMinutes = godMinutes;
        this.creationTime = System.currentTimeMillis();
    }

    @Override
    public void handleDamage(int damage) {
        long time = System.currentTimeMillis();
        if ((time - creationTime) > godMinutes) {
            super.handleDamage(damage);
        }
    }
}
