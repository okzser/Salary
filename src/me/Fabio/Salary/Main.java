package me.Fabio.Salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Employee e1 = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        e1.setName(sc.next());

        System.out.print("Gross Salary: ");
        e1.setgSalary(sc.nextDouble());

        System.out.print("Tax: ");
        e1.setTax(sc.nextDouble());

        Thread.sleep(785);

        System.out.println("Employee: " + e1);

        Thread.sleep(785);

        System.out.print("Which percentage to increase salary?  ");
        e1.increaseSalary(sc.nextDouble());

        System.out.println("Updated data: " + e1);

    }
}
