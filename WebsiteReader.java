import java.util.*;
/*
  This program reads a web address and determines whether it is a web address
  for a government, a university, a business, an organization, or another entity
  Question 49 from the textbook
*/
public class WebsiteReader{
      public static void main(String[] args) {
            String website;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a Web Address. eg: 123@example.com");
            website = scanner.nextLine();

            if (website.endsWith(".gov")) {
                System.out.println("It is a government web address.");
            } else if (website.endsWith(".edu")) {
                System.out.println("It is an university web address.");
            } else if (website.endsWith(".com")) {
                System.out.println("It is a business web address.");
            } else if (website.endsWith(".org")) {
                System.out.println("It is an organization web address.");
            } else {
                System.out.println("It is a web address for another entity.");
            }
      }
}
