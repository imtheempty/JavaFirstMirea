package ru.mirea.task10;

import java.util.Scanner;

class Tester implements Comparator<Student>{
    Scanner in = new Scanner(System.in);
    public  Student[] idNumber = new Student[20];
    public void setArray()
    {
        int i,f;
        String A;
        for(i=0;i<3;i++)
        {
            idNumber[i] = new Student();
            System.out.print("Enter name:");
            A=in.nextLine();
            idNumber[i].setName(A);
            System.out.println("Enter surname:");
            A=in.nextLine();
            idNumber[i].setSurname(A);
            System.out.println("Enter speciality:");
            A=in.nextLine();
            idNumber[i].setSpeciality(A);
            System.out.println("Enter course:");
            f=in.nextInt();
            idNumber[i].setCourse(f);
            System.out.println("Enter group:");
            A=in.nextLine();
            A=in.nextLine();
            idNumber[i].setGroup(A);
            System.out.println("Enter score:");
            f=in.nextInt();
            idNumber[i].setScore(f);
            A=in.nextLine();
        }
    }
    public void outArray() {
        int i;
        for(i=0;i<3;i++)
            System.out.println(idNumber[i].getName() + " " + idNumber[i].getSurname() + " " +
                    idNumber[i].getSpeciality() + " " + idNumber[i].getCourse() + " " + idNumber[i].getGroup() + " "
                    + idNumber[i].getScore());
    }
    @Override
    public void sortCourse()
    {
        int i;
        int p1,p2;
        String p3,p4,p5,p6;
        for(i=1;i<3;i++)
        {
            if(idNumber[i].getCourse()>idNumber[i-1].getCourse())
            {
                p1=idNumber[i].getCourse();
                p2=idNumber[i].getScore();
                p3=idNumber[i].getName();
                p4=idNumber[i].getSurname();
                p5=idNumber[i].getSpeciality();
                p6=idNumber[i].getGroup();

                idNumber[i].setCourse(idNumber[i-1].getCourse());
                idNumber[i].setScore(idNumber[i-1].getScore());
                idNumber[i].setName(idNumber[i-1].getName());
                idNumber[i].setSurname(idNumber[i-1].getSurname());
                idNumber[i].setSpeciality(idNumber[i-1].getSpeciality());
                idNumber[i].setGroup(idNumber[i-1].getGroup());

                idNumber[i-1].setCourse(p1);
                idNumber[i-1].setScore(p2);
                idNumber[i-1].setName(p3);
                idNumber[i-1].setSurname(p4);
                idNumber[i-1].setSpeciality(p5);
                idNumber[i-1].setGroup(p6);
                sortScore();
            }
        }
    }
    @Override
    public void sortScore()
    {
        int i;
        int p1,p2;
        String p3,p4,p5,p6;
        for(i=1;i<3;i++)
        {
            if(idNumber[i].getScore()>idNumber[i-1].getScore())
            {
                p1=idNumber[i].getCourse();
                p2=idNumber[i].getScore();
                p3=idNumber[i].getName();
                p4=idNumber[i].getSurname();
                p5=idNumber[i].getSpeciality();
                p6=idNumber[i].getGroup();

                idNumber[i].setCourse(idNumber[i-1].getCourse());
                idNumber[i].setScore(idNumber[i-1].getScore());
                idNumber[i].setName(idNumber[i-1].getName());
                idNumber[i].setSurname(idNumber[i-1].getSurname());
                idNumber[i].setSpeciality(idNumber[i-1].getSpeciality());
                idNumber[i].setGroup(idNumber[i-1].getGroup());

                idNumber[i-1].setCourse(p1);
                idNumber[i-1].setScore(p2);
                idNumber[i-1].setName(p3);
                idNumber[i-1].setSurname(p4);
                idNumber[i-1].setSpeciality(p5);
                idNumber[i-1].setGroup(p6);
                sortCourse();
            }
        }
    }

    public static void main(String[] args)
    {
        int i;
        Tester m1 = new Tester();
        m1.setArray();
        m1.sortScore();
        m1.sortCourse();
        m1.outArray();
    }
}