package ru.mirea.task6;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Printable> list= new ArrayList<>();
        list.add(new Book("Shack", "Paul Yang"));
        list.add(new Book("FNAF: Silver eyes", "Scott Cawthon"));
        list.add(new Shop("Book", 650));
        list.add(new Shop("Headphones", 13500));

        for (var p : list) {
            p.print();
        }
    }
}