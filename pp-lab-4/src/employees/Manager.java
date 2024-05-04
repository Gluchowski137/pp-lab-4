package employees;

public class Manager extends Employee {
    public int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int subordinates) {
        this.numberOfSubordinates = subordinates;
    }

    public String toString() {
        return "Manager: " + getName() + ", Salary: " + getSalary() + ", Subordinates: " + numberOfSubordinates;
    }
}
