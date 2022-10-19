package ru.mirea.task10;

public class Student {
    public String Name;
    public String Surname;
    public String Speciality;
    public int Course;
    public int Score;
    public String Group;

    public int getCourse() {
        return Course;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        this.Score = score;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public String getGroup() {
        return Group;
    }

    public void setCourse(int course) {
        this.Course = course;
    }

    public void setName(String name) {
        this. Name = name;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public void setSpeciality(String speciality) {
        this.Speciality = speciality;
    }

    public void setGroup(String group) {
        this.Group = group;
    }

    public Student(int course,int score, String name, String surname, String speciality, String group) {
        Course = course;
        Name = name;
        Surname = surname;
        Speciality = speciality;
        Group = group;
        Score = score;
    }

    public Student (){
    }

    public static void main(String[] args)
    {

    }
}