import java.util.*;
/*
  This program identifies the type of sentence the user inputed
  no
*/
public class SentenceIdentifier{
      public static void main(String[] args) {
            String sentence;
            String last;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a sentence.");
            sentence = scanner.nextLine();

            last = sentence.substring(sentence.length() - 1);
            System.out.println(last);
            //Testing for type of the sentence
            if (last.equals(".")) {
                System.out.println("This sentence is declarative.");
            } else if (last.equals("?")) {
                System.out.println("This sentence is interrogative.");
            } else if (last.equals("!")) {
                System.out.println("This sentence is exclamatory.");
            } else {
                System.out.println("Your sentence is not complete.");
            }
      }
}
