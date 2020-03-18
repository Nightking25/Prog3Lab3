import java.util.*;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
//This program calcuates the user's age and the amount of days between the birthday
public class Question5 {
      public static void main(String[] args){
            //Variables
            String input;
            int yearNow, yearDob, daysDiff, monthDiff, yearDiff, monthNumberNow, monthNumberDob;
            Period diff;
            Scanner scanner = new Scanner(System.in);

            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            // Get the current Date
            LocalDate now = LocalDate.now();
            yearNow = now.getYear();
            Month monthNow = now.getMonth();
            monthNumberNow = monthNow.getValue();
            //Askes the input from the user
            System.out.println("Enter your Date of Birth in the format YYYY-MM-DD");
            input = scanner.nextLine();
            LocalDate dob = LocalDate.parse(input);
            yearDob = dob.getYear();
            Month monthDob = dob.getMonth();
            monthNumberDob = monthDob.getValue();
            // To calculate the age
            yearDiff = yearNow - yearDob;// difference in years
            diff = Period.between(dob, now);
            System.out.printf("You are %d years old.\n", diff.getYears());
            // For the difference in days
            dob = dob.plusYears(yearDiff);
            diff = Period.between(dob, now);
            monthDiff = diff.getMonths();
            daysDiff = diff.getDays();
            // conveting Months to Days
            int i, days , rem, total;
            days = 0;
            if (dob.compareTo(now) > 0)  {
              //calculates days if the month has 31 days
              for(i = monthNumberNow ; i < monthNumberDob ; i++){
                rem = i % 2;
                if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                  days = days + (1 * 31);
                }else if(i == 4 || i == 6 || i == 9 ||  i == 11 ){
                  days = days + (1 * 30);
                } else {
                  days = days + (1 * 29);
                }
              }
            total = days + Math.abs(daysDiff);
            System.out.printf("Your birthday is in %d days", total );
            } else if (dob.compareTo(now) < 0){
                //calculates days if the month has 30 days
                for(i = monthNumberDob; i < monthNumberNow; i++){
                    rem = i % 2;
                    if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                      days = days + (1 * 31);
                    } else if(i == 4 || i == 6 || i == 9 ||  i == 11 ){
                      days = days + (1 * 30);
                    } else {
                      days = days + (1 * 29);
                    }
                    total = days + Math.abs(daysDiff);
                    System.out.printf("Your birthday was %d days ago", total);
                  }
            } else {
                //if the users birthday is today
                System.out.println("Your Birthday is Today! Happy Birthday!!!");
            }
      }
}
