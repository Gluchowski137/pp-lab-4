package employees;

public class Worker extends Employee {
    private String position;

    public Worker(String name, double salary, String position) {
        super(name, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return "Worker: " + getName() + ", Salary: " + getSalary() + ", Position: " + position;
    }
}
