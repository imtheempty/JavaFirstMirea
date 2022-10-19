package ru.mirea.task8;

public class SortAB {
    public static String recursion(int n, int m){
        if (m > n){
            System.out.print(n + " ");
            return recursion(n+1, m);
        }
        if (n > m){
            System.out.print(n + " ");
            return recursion(n-1, m);
        }
        if (n == m){
            System.out.print(n + " ");
        }
        return " ";
    }

    public static void main(String[] argv){
        System.out.println(recursion(5, 1));
    }
}