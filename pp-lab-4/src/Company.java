import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
        for (int i = 0; i < employees.length; i++) {
            if (i == 0 || i == 5) {
                employees[i] = new Manager("Manager" + i,(3000),0);
            }
            else if (i == 1 || i == 4 || i == 6) {
                employees[i] = new Worker("Worker" + i,3000 + i * 500,"Developer");
            }
            else{
                employees[i] = new Employee("Employee" + i,3000 + i * 500);
            }

        }
        System.out.println("Dane dla pracownika o indeksierównym 3: "+ employees[3].toString());
        employees[3].setSalary(2000);
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
        for (Employee emp : employees) {
            emp.setSalary(emp.getSalary() + 500);
        }

        int nonManagersCount = 0;
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                nonManagersCount++;
            }
        }

        for (Employee emp : employees) {
            if ((emp instanceof Manager)) {
                ((Manager) emp).setNumberOfSubordinates(nonManagersCount);
                ((Manager) emp).setSalary(7500);
            }
        }
        System.out.println("Zaktualizowane informacje o pracownikach");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
}
