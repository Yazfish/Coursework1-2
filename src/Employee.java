import java.util.Objects;

public class Employee {
    private int id;
    private String employeeName;
    private String department;
    private double salary;

    private static int idGen = 1;

    public Employee(String employeeName, String department, double salary) {
        id = idGen++;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {

        return id;
    }

    public String getEmployeeName() {

        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public void setDepartment(String department) {

        this.department = department;
    }
    public void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && Double.compare(salary, employee.salary) == 0 && Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeName, department, salary);
    }

    @Override
    public String toString() {
        return "Табельный номер - " + id +
                ", Сотрудник - " + employeeName +
                ", Отдел - " + department +
                ", Зарплата - " + salary +
                " руб.";
    }
}