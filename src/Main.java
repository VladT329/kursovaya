public class Main {
    private static Employee[] employees = new Employee[5];

    public static void main(String[] args) {
        employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich", "1", 20000);
        employees[1] = new Employee("Petrov", "Vladimir", "Maksimovich", "2", 30000);
        employees[2] = new Employee("Domozhirov", "Genadiy", "Petrovich", "3", 40000);
        employees[3] = new Employee("Baranov", "Timur", "Ruslanovich", "4", 50000);
        employees[4] = new Employee("Korolev", "Ruslan", "Tigranovich", "5", 100000);

        printEmployees();
        System.out.println("=============");
        System.out.println(sumUpSalary());
        System.out.println("=============");
        System.out.println(findMinSalary());
        System.out.println("=============");
        System.out.println(findMaxSalary());
        System.out.println("=============");
        System.out.println(averageSalary());
        System.out.println("=============");
        printFullName();
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int sumUpSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findMinSalary(){
        int min = employees[0].getSalary();
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min){
                min = employees[i].getSalary();
                index = i;
            }
        }
        return employees[index];
    }

    public static Employee findMaxSalary(){
        int max = employees[0].getSalary();
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max){
                max = employees[i].getSalary();
                index = i;
            }
        }
        return employees[index];
    }

    public static double averageSalary(){
        return sumUpSalary() / employees.length;
    }

    public static void printFullName(){
        for (Employee employee : employees) {
            System.out.println(employee.getSurname() + " " +employee.getName() + " " + employee.getPatronymic());
        }
    }
}