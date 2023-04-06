package TaskWork.BasicForAll3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerationEmployee extends Employee {
    static Random random = new Random();

    /**
     * numberOfEmployer - entered by user via scanner
     */
    private static int numberOfEmployee;

    public static int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public static void setNumberOfEmployee(int numberOfEmployee) {
        GenerationEmployee.numberOfEmployee = numberOfEmployee;
    }

    /**
     * method, which generates name of employee
     */
    public static StringBuilder nameGeneration() {
        String abc = "abcdefghijklmnoprstuvz";
        int generationEmployeeNameLength = (random.nextInt(10) + 3);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < generationEmployeeNameLength; i++) {
            stringBuilder.append(abc.charAt(random.nextInt(abc.length())));
        }
        return stringBuilder;
    }

    /**
     * constructor, which generates employees
     */
    public GenerationEmployee() {
        super();
        setEmployeeName(String.valueOf(nameGeneration()));
        setEmployeeAge(random.nextInt(60) + 18);
        setSalary(random.nextDouble(10000) + 2000);
        setDepartment(Department.values()[random.nextInt(Department.values().length)]);
        setRating(Rating.values()[random.nextInt(Department.values().length)]);
    }

    /**
     * method, which adds employees to the list
     */
    public static List<Employee> employeeList(int numberOfEmployee) {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < numberOfEmployee; i++) {
            employeeList.add(new GenerationEmployee());
        }
        System.out.println(employeeList);
        return employeeList;
    }

    /**
     * method, which changes employee's wages based on rating
     */
    public static void employeeSalaryChangeAfterRatingComparison(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            if (employee.getRating().getRatingScore() == 0) {
            } else {
                employee.setSalary(employee.getSalary() * employee.getRating().getRatingScore());
            }
        }
        System.out.println(employeeList);
    }

    /**
     * method, which sorts list of employees by rating
     */
    public static List<Employee> collectionSort(List<Employee> employeeList) {
        employeeList.sort(new ComparatorRating());
        return employeeList;
    }

    /**
     * method for print
     */
    public static void print() {
        employeeSalaryChangeAfterRatingComparison(collectionSort(employeeList(getNumberOfEmployee())));
    }
}