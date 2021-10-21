package exercise2;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int n1 = number % 10;
        int n2 = (number / 10 ) % 10;
        int n3 = ((number / 10) / 10);

        int summe = n1 + n2 + n3;
        System.out.println("Sum of digits: " + summe);
    }
}