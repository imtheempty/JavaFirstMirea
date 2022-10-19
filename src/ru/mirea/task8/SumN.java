package ru.mirea.task8;

public class SumN {
    public static int recursion(int n){
        if (n/10 != 0)
            return n%10+recursion(n/10);
        else
            return n%10;
    }

    public static void main(String[] argv){
        System.out.println(recursion(12345));
    }
}