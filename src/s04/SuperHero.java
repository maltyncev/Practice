package s04;

public class SuperHero extends Hero {
    private final int coef;

    public SuperHero(int coef) {
        this.coef = coef;
    }

    public SuperHero(int power, int coef) {
        super(power);
        this.coef = coef;
    }

    @Override
    public void hit(Hero hero) {
        hero.health = hero.health - this.power * coef;
    }
}
