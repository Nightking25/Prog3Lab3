import java.util.*;
// This program converts a given currency to USD
public class Question4{
      public static void main(String[] args){

            double currency, usd;
            double usdFactor;
            int option;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Select the currency you want to convert from:");
            System.out.println("\t(1) CAD to USD\n\t(2) EUR to USD\n\t(3) JYP to USD\n\t(4) INR to USD\n\t(5) AUD to USD");
            option = scanner.nextInt();

            switch(option){
                  case 1: // CAD to USD
                      usdFactor = 0.75;
                      System.out.println("Enter the amount of Canadian Dollars you want to convert.");
                      currency = scanner.nextDouble();

                      usd = usdFactor * currency;
                      System.out.printf("You have: %.2f$", usd);

                      break;

                  case 2: //EUR to USD
                      usdFactor = 1.11;
                      System.out.println("Enter the amount of Euros you want to convert.");
                      currency = scanner.nextDouble();

                      usd = usdFactor * currency;
                      System.out.printf("You have: %.2f$", usd);

                      break;

                  case 3: //JYP to USD
                      usdFactor = 0.0093;
                      System.out.println("Enter the amount of Japanese Yen you want to convert.");
                      currency = scanner.nextDouble();

                      usd = usdFactor * currency;
                      System.out.printf("You have: %.2f$", usd);

                      break;

                  case 4: // INR to USD
                      usdFactor = 0.014;
                      System.out.println("Enter the amount of Indian Rupee you want to convert.");
                      currency = scanner.nextDouble();

                      usd = usdFactor * currency;
                      System.out.printf("You have: %.2f$", usd);

                      break;

                  case 5: //AUD to USD
                      usdFactor = 0.62;
                      System.out.println("Enter the amount of Australian Dollars you want to convert.");
                      currency = scanner.nextDouble();

                      usd = usdFactor * currency;
                      System.out.printf("You have: %.2f$", usd);

                      break;

                  default: // executes if the user inputs value of option greater than 5
                      System.out.println("The option you selected doesn't exist!");
            }
      }
}
