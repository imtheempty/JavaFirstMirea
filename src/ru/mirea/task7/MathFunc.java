package ru.mirea.task7;

import java.util.Scanner;

class MathFunc implements MathCalculable{
    static public void circle(double radius) {
        double C;
        C=2*Pi*radius;
        System.out.println("Circumference: "+C);
    }
    @Override
    public void degree(int a,int i) {
        System.out.println(Math.pow(i, a));
    }
    @Override
    public void module(int a) {
        if(a<0)a=a*-1;
        System.out.println(a);
    }
    public static void main(String[] args) {
        double radius;
        int a, b;
        Scanner in = new Scanner(System.in);
        MathCalculable mc1 = new MathFunc();
        System.out.print("Enter radius: ");
        radius = in.nextDouble();
        circle(radius);
        System.out.print("Enter number for module and degree: ");
        a = in.nextInt();
        mc1.module(a);
        System.out.print("Enter number: ");
        b = in.nextInt();
        mc1.degree(a,b);
    }
}