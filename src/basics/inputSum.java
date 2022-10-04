package basics;

import java.util.Scanner;

/**
 * To read numbers from user,add and print result
 *
 * @author Karl Sirkas
 */

public class inputSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to Sum");

        System.out.println("Number 1");
        int num1 = scanner.nextInt();

        System.out.println("Number 2");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is " + sum);








    }
}
