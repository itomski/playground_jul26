package de.lubowiecki.patterns.decorator;

public class KraftDecorator extends HeroDecorator {

    public KraftDecorator(Hero hero) {
        super(hero);
    }

    @Override
    public void userSpecialForce() {
        super.userSpecialForce();
        System.out.println("KraftDecorator: ist jetzt besonders Stark");
    }
}
