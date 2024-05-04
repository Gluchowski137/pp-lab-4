package employees;

public class Employee {

    private String fullName;
    private double salary;

    public String getName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public String toString() {
        return "Employee: " + fullName + ", Salary: " + salary;
    }
}
