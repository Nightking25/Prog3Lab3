import java.util.*;

public class Password {

    public static void main(String[] args) {
          String entry1, entry2;
          boolean verification;
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter your password: ");
          entry1 = scanner.nextLine();

          System.out.println("Re-enter your password: ");
          entry2 = scanner.nextLine();

          verification = (entry1.regionMatches(0, entry2, 0 , entry2.length()));

          if (verification) {
            System.out.println("You are now registered as a new user!");
          } else {
            System.out.println("Sorry, there is a typo in your password!");
          }

    }
}
