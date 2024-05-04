import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            if (i == 0) {
                employees[i] = new Manager("Manager",(3000),0);
            }
            else if (i == 1 || i == 4) {
                employees[i] = new Worker("Worker " + i,3000 + i * 500,"Developer");
            }
            else{
                employees[i] = new Employee("Employee " + i,3000 + i * 500);
            }

        }
        System.out.println("Dane dla pracownika o indeksierównym 3: "+ employees[3].toString());
        employees[3].setSalary(2000);

        int nonManagersCount = 0;
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                nonManagersCount++;
            }
        }

        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagersCount);
            ((Manager) employees[0]).setSalary(7500);
        }

        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
}
