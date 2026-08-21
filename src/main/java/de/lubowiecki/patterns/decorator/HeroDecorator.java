package de.lubowiecki.patterns.decorator;

public class HeroDecorator implements Hero {

    protected Hero hero;

    public HeroDecorator(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void userSpecialForce() {
        hero.userSpecialForce();
    }
}
