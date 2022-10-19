package ru.mirea.task6;

public class Book implements Printable{
    private String name;
    private String author;

    public  Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public void print() {
        System.out.println("Book. Name: " + name + "; author: " + author);
    }
}