import java.util.*;
/*
  Program that reads a probable season base on the imputed tempreture.
  Question 50 from the textbook.
*/
public class Season {

    public static void main(String[] args) {
        int temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the tempreture in Fahrenheit");
        temp = scanner.nextInt();

        if (temp >= 90) {
            System.out.println("It is probably summer.");
        } else if (temp >= 70 && temp < 90) {
            System.out.println("It is probably spring.");
        } else if (temp >= 50 && temp < 70) {
            System.out.println("It is probably fall.");
        } else if (temp < 50) {
            System.out.println("It is probably winter.");
        } else {
            System.out.println("The tempreture entered is outside the valid range.");
        }
    }
}
