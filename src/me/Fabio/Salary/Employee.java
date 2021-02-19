package me.Fabio.Salary;

public class Employee {
    
    private String name;
    private double gSalary;
    private double tax;

    public double nSalary() {
        return gSalary - tax;
    }

    public void increaseSalary(double percentage) {
        this.gSalary = this.gSalary / 100 * percentage;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String a) {
        this.name += a;
    }

    public double getgSalary() {
        return gSalary;
    }

    public void setgSalary(double a) {
        this.gSalary += a;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double a) {
        this.tax += a;
    }

    public String toString() {
        return this.getName() + ", $" + this.nSalary();
    }

 




}


