package Inheritan_Overriding;

public class Employee_13_5 {
    public static void main(String[] args) {
        Manager1 manager = new Manager1("John Doe", 5000.0);
        Salesperson salesperson = new Salesperson("Jane Smith", 5000.0, 10000.0);

        System.out.println("Manager Salary: $" + manager.calculateSalary());
        System.out.println("Salesperson Salary: $" + salesperson.calculateSalary());

        System.out.println("\nOverridden methods in Manager class:");
        manager.calculateSalary();

        System.out.println("\nOverridden methods in Salesperson class:");
        salesperson.calculateSalary();
    }
}

class Employee1 {
    private String name;
    private double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateSalary() {
        return salary;
    }

    public double calculateSalary(double bonus) {
        return salary + bonus;
    }
}

class Manager1 extends Employee1 {
    public Manager1(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        double b = getSalary() * 0.1;
        return super.calculateSalary(b);
    }
}

class Salesperson extends Employee1 {
    private double salesAmount;

    public Salesperson(String name, double salary, double salesAmount) {
        super(name, salary);
        this.salesAmount = salesAmount;
    }

    @Override
    public double calculateSalary() {
        double commission = getSalary() * 0.05;
        return super.calculateSalary(commission);
    }
}
