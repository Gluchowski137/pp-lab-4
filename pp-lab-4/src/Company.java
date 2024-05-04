import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            if (i == 0) {
                employees[i] = new Manager();
                employees[i].setSalary(3000 + i * 500);
                ((Manager) employees[0]).setNumberOfSubordinates(0);
            }
            else if (i == 1 || i == 4) {
                employees[i] = new Worker();
                employees[i].setSalary(3000 + i * 500);
                ((Worker) employees[i]).setPosition("Developer");
            }
            else{
                employees[i] = new Employee();
                employees[i].setSalary(3000 + i * 500);
            }

        }
        System.out.println("Dane dla pracownika o indeksierównym 3: "+ employees[3].toString());
        employees[3].setSalary(2000);
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
}
