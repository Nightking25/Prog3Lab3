import java.util.*;
//Calculates the area of a circle based on a radius given by the user
public class Question1 {

  public static void main(String[] args) {
    double radius, area;
    Scanner scanner = new Scanner(System.in);

    System.out.println("           ********************");
    System.out.println("           * Area of a Circle *");
    System.out.println("           ********************");

    System.out.println("Enter the radius of the circle");
    radius = scanner.nextDouble();

    if(radius>0){
      area = Math.PI * Math.pow(radius, 2);
      System.out.printf("The area of your circle is: %.2f", area);
    } else {
      System.out.println("You have to input a positive radius!, Your radius is either negative or zero");
    }
  }
}
