package TaskWork.BasicForAll3;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter number of employee");
        GenerationEmployee.setNumberOfEmployee(scanner.nextInt());

        GenerationEmployee.print();

    }
}
