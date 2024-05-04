public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            employees[i].setSalary(3000 + i * 500);
        }
        System.out.println("Dane dla pracownika o indeksierównym 3: "+ employees[3].toString());
        employees[3].setSalary(2000);
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
}
