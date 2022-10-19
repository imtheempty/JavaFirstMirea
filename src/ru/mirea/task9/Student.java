package ru.mirea.task9;

import java.util.Arrays;

public class Student {
    public static void main (String[] args) {
        int[] IdNumber = {10, 4, 14, 3, 1, 2, 5};
        System.out.println(Arrays.toString(IdNumber));
        for (int left = 0; left < IdNumber.length; left++) {
            int value = IdNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < IdNumber[i])
                {
                    IdNumber[i + 1] = IdNumber[i];
                }
                else {
                    break;
                }
            }
            IdNumber[i + 1] = value;
        }
        System.out.println(Arrays.toString(IdNumber));
    }
}