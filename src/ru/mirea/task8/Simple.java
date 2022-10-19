package ru.mirea.task8;

public class Simple {
    public static boolean isPrime(int n){
        if (n == 0 || n == 1)
            return true;

        return recursion(n, 2);
    }
    public static boolean recursion(int a, int b){
        if (a == b)
            return true;
        if (a % b == 0)
            return false;
        else
            return recursion(a, b+1);
    }

    public static void main(String[] argv){
        if (isPrime(19) == true)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}