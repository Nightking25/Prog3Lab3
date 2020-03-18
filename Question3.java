import java.util.Scanner;

public class Question3 {

      public static void main(String[] args) {
            int temp, cond;
            Scanner scanner = new Scanner(System.in);

            System.out.println("          ***************");
            System.out.println("          * Temperature *");
            System.out.println("          ***************");

            System.out.println("Enter the current temperature in Celsius");
            temp = scanner.nextInt();

            System.out.println(temp >=0 ? "The temperature is above zero degree" : "The temperature is below zero degree");
      }
}
