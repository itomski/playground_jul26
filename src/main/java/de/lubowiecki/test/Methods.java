package de.lubowiecki.test;

public class Methods {

    public static void main(String[] args) {

        // byte < short < int < long < float < double
        //         char <


        int i = 'c';
        System.out.println(i++);
        System.out.println((char)i);

    }

}

class A {

    public A(int i) {
    }
}

class B extends A {

    public B() {
        super(0);
    }
}