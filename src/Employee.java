import java.util.Objects;

public class Employee {

    private static int counterId = 1;

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String department;
    private int salary;

    public static int getCounterId() {
        return counterId;
    }

    public static void setCounterId(int counterId) {
        Employee.counterId = counterId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, department, salary);
    }

    public Employee(String surname, String name, String patronymic, String department, int salary) {
        this.id = counterId++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
//////////////