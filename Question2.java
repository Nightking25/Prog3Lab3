import java.util.Scanner;
// This program calutales the BMI and tells the user their respective classification
public class Question2 {

      public static void main(String[] args) {

            double wtInLbs, wtInKg, htInFt, htInM, BMI;
            final double LBS_TO_KG, FT_TO_M;
            Scanner scanner = new Scanner(System.in);

            LBS_TO_KG = 0.453582;
            FT_TO_M = 0.3048;

            System.out.println("          ******************");
            System.out.println("          * BMI Calculator *");
            System.out.println("          ******************");

            System.out.print("Enter your Weight in Pounds: ");
            wtInLbs = scanner.nextDouble();

            System.out.print("\nEnter your Height in Feet: ");
            htInFt = scanner.nextDouble();

            wtInKg = wtInLbs * LBS_TO_KG;
            htInM = htInFt * FT_TO_M;

            BMI = wtInKg / Math.pow(htInM,2);

            System.out.printf("\nYour weight in kilograms: %f", wtInKg);
            System.out.printf("\nYour height in meters: %f", htInM);
            System.out.printf("\nYour BMI is: %.2f", BMI);
            //for classification
            System.out.printf("\n\nClassification: ");
            if (BMI < 18.5) {
              System.out.println("Underweight");
            } else if (BMI >= 18.5 && BMI < 25.0 ) {
              System.out.println("Normal");
            } else if (BMI >= 25 && BMI < 30 ) {
              System.out.println("Overweight");
            } else {
              System.out.println("Obese");
            }
      }
}
