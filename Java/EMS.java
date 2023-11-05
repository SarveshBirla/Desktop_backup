class Employee {
    protected double basicSalary;

    public Employee() {
        this.basicSalary = 10000;
    }

    public double getSalary() {
        return basicSalary;
    }
}

class Programmer extends Employee {
    private double bonus;

    public Programmer() {
        super();
        this.bonus = 5000;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}

class Admin extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public Admin(int hoursWorked) {
        super();
        this.hoursWorked = hoursWorked;
        this.ratePerHour = 500;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + (hoursWorked * ratePerHour);
    }
}

public class EMS {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Admin admin = new Admin(40); // Assuming the Admin worked 40 hours

        System.out.println("Programmer Salary: " + programmer.getSalary());
        System.out.println("Admin Salary: " + admin.getSalary());
    }
}
