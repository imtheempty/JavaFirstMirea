package ru.mirea.task6;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShop {
    private ArrayList<Computer> computers = new ArrayList<Computer>();
    public void addComputer(Computer computer) {
        computers.add(computer);
    }
    public void deleteComputer(int n) {
        for (int i = 0; i < computers.size(); i++) {
            if (n == computers.get(i).getNumber()) {
                computers.remove(i);
                System.out.println("Computer deleted.");
                return;
            }
        }
        System.out.println("Computer with this number not found.");
    }
    public Computer findComputer(int n) {
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getNumber()==n) {
                return computers.get(i);
            }
        }
        System.out.println("Computer with this number not found.");
        return null;
    }

    @Override
    public String toString() {
        return "Shop. Computers: " + computers;
    }

    static public Computer enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Monitor. Diagonal and frequency: ");
        Monitor monitor = new Monitor(sc.nextInt(), sc.nextInt());
        System.out.println("Memory: ");
        Memory memory = new Memory(sc.nextInt());
        System.out.println("Processor clock speed: ");
        Processor processor = new Processor(sc.nextInt());
        int num;
        Brand brand;
        System.out.println("Number of computer: ");
        num = sc.nextInt();
        System.out.println("Enter brand: Samsung, Apple, LG, MSI, Asus. ");
        String brandName = sc.next();
        switch (brandName) {
            case "Samsung":
                brand = Brand.SAMSUNG;
                break;
            case "Apple":
                brand = Brand.APPLE;
                break;
            case "LG":
                brand = Brand.LG;
                break;
            case "MSI":
                brand = Brand.MSI;
                break;
            case "Asus":
                brand = Brand.ASUS;
                break;
            default:
                brand = Brand.ASUS;
        }
        Computer computer = new Computer(brand, num, monitor, memory, processor);
        return computer;
    }

    public static void main(String[] args) {
        String command;
        OnlineShop s = new OnlineShop();
        Computer c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter command:");
        command = sc.next();
        while (true) {
            switch (command) {
                case "Add":
                    s.addComputer(enter());
                    break;
                case "Delete":
                    System.out.print("Enter number: ");
                    s.deleteComputer(sc.nextInt());
                    break;
                case "Find":
                    System.out.print("Enter number: ");
                    System.out.println(s.findComputer(sc.nextInt()));
                    break;
                case "Show":
                    System.out.println(s);
                    break;
                case "Exit":
                    return;
                default:
                    System.out.println("Unknown command.");
            }
            command = sc.next();
        }
    }
}