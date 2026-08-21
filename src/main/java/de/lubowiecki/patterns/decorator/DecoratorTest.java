package de.lubowiecki.patterns.decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class DecoratorTest {

    public static void main(String[] args) {

//        try(BufferedWriter out = new BufferedWriter(new FileWriter("data.txt"))) {
//
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }

        //Hero hero = new KraftDecorator(new FlugDecorator(new BasicHero()));
        Hero hero = new KraftDecorator(new BasicHero());
        hero.userSpecialForce();
    }
}
