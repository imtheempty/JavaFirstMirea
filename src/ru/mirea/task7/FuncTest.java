package ru.mirea.task7;

import java.util.Scanner;

class FuncTest implements FuncString{
    @Override
    public void even(String S) {
        int kol=0;
        kol=S.length();
        System.out.println(kol);
    }
    @Override
    public void odd(String S) {
        StringBuffer str = new StringBuffer("");
        int kol=0;
        for(int i=0;i<S.length();i++)
        {
            str.insert(i*2 , S.charAt(i));
            str.insert(i*2+1 , " ");
        }
        System.out.println(str);
    }
    @Override
    public void invert(String S) {
        StringBuffer str = new StringBuffer("");
        int kol=0;
        for(int i=S.length()-1;i>=0;i--) {
            str.insert(kol, S.charAt(i));
            kol++;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FuncString mc1 = new FuncTest();
        String str="";
        str = in.nextLine();
        mc1.even(str);
        mc1.odd(str);
        mc1.invert(str);
    }
}