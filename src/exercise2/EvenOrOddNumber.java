package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.print("Number is even");
        } else{
            System.out.print("Number is odd");
        }
    }
}
