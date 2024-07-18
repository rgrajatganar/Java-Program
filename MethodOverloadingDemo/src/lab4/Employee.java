package lab4;

class Employee1 {
    private String name;
    private double baseSalary;

    public Employee1(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }
}

class Manager extends Employee1 {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

class Programmer extends Employee1 {
    private int numberOfProjects;

    public Programmer(String name, double baseSalary, int numberOfProjects) {
        super(name, baseSalary);
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (numberOfProjects * 100); // Assuming $100 bonus per project
    }
}

public class Employee {
    public static void main(String[] args) {
        // Creating Manager object
        Manager manager = new Manager("Pranit", 50000, 10000);
        // Creating Programmer object
        Programmer programmer = new Programmer("Prajwal", 40000, 5);

        // Printing salaries
        System.out.println("Manager Salary: $"+manager.calculateSalary());
        System.out.println("Programmer Salary: $" + programmer.calculateSalary());
    }
}


