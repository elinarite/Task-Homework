package TaskWork.BasicForAll3;

public class Employee implements Comparable<Employee> {
    private String employeeName;
    private int employeeAge;
    private double salary;

    private Department department;
    private Rating rating;


    public Employee() {
    }

    public Employee(String employeeName, int employeeAge, double salary, Department department, Rating rating) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.salary = salary;
        this.department = department;
        this.rating = rating;
    }

    /**
     * comparator, which sorts by name, age and salary
     *
     * @param employee the object to be compared.
     */
    @Override
    public int compareTo(Employee employee) {
        if (this.employeeName.compareTo(employee.getEmployeeName()) != 0) {
            return this.employeeName.compareTo(employee.getEmployeeName());
        }
        if (this.employeeAge - employee.getEmployeeAge() != 0) {
            return this.employeeAge - employee.getEmployeeAge();
        }
        return (int) (this.salary - employee.getSalary());
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Name: " + employeeName + ", Age: " + employeeAge +
                ", salary " + salary +
                ", department " + department +
                ", rating " + rating + "\n";
    }
}