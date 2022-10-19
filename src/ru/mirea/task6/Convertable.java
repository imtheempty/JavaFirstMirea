package ru.mirea.task6;

public interface Convertable {
    double convertK(int n);
    double convertF(int n);

    public static void main(String[] args)
    {
        Convert obj = new Convert();
        System.out.println(obj.convertK(50));
        System.out.println(obj.convertF(50));
    }
}