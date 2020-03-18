import java.util.Scanner;
/*
  This programs determines if a Baseball player is eligible for the All Stars Game or not
  no 42 from textbook
*/
public class AllStarsGame{
      public static void main(String[] args) {
            double numberOfHits, numberOfAtBats, hittingPercentage;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the player's number of hits.");
            numberOfHits = scanner.nextDouble();

            System.out.println("Enter the number of at-bats for the player.");
            numberOfAtBats = scanner.nextDouble();

            hittingPercentage = numberOfHits / numberOfAtBats;
            System.out.printf("The players hitting percentage is: %f\n", hittingPercentage);
            if(hittingPercentage > .300){
              System.out.println("The player is eligible for the All Stars Game");
            } else {
              System.out.println("The player is not eligible");
            }
      }
}
