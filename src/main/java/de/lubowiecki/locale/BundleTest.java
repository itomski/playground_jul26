package de.lubowiecki.locale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class BundleTest {

    public static void main(String[] args) {

        //Locale.setDefault(Locale.JAPAN);

        Scanner scanner = new Scanner(System.in);

        ResourceBundle bundle = ResourceBundle.getBundle("lang.ui");

        System.out.println(bundle.getString("welcome"));
        System.out.print(bundle.getString("question.name") + " ");
        String name = scanner.nextLine();
        System.out.println(bundle.getString("answer.name") + " " + name);

    }
}
