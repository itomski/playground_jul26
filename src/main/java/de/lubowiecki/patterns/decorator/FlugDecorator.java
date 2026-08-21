package de.lubowiecki.patterns.decorator;

public class FlugDecorator extends HeroDecorator {

    public FlugDecorator(Hero hero) {
        super(hero);
    }

    @Override
    public void userSpecialForce() {
        super.userSpecialForce();
        System.out.println("FlugDecorator: kann jetzt fielgen");
    }
}
