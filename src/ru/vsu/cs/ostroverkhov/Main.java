package ru.vsu.cs.ostroverkhov;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.ROOT);

        double a = inputSide('a');

        double b = inputSide('b');

        double c = inputSide('c');

        double p = (calcSemiPerimeter(a, b, c));
        System.out.println("The semi-perimeter for these sides will be = " + p );


        double heightA = calcHeight(a, b, c, p);
        System.out.println("The height of side a is " + heightA);

        double heightB = calcHeight(b, a, c, p);
        System.out.println("The height of side b is " + heightB);

        double heightC = calcHeight(c, a, b, p);
        System.out.println("The height of side с is " + heightC);
    }

    static double calcHeight(double a, double b, double c, double p)
    {
        return (2/a) * Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    static double calcSemiPerimeter(double a, double b, double c)
    {
        double p = (a + b + c) / 2;
        return p;
    }

    public static double inputSide(char name)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the side %s: ", name);
        return scanner.nextDouble();
    }
}