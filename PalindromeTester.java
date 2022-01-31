import java.util.Scanner;
public class PalindromeTester
{
   public static void main(String args[])
 {
   String reverse = "";
   String word = " ";
   int total = -1;
   boolean done = false;
   Scanner kb = new Scanner(System.in);
   do{
      System.out.println("Please enter a palindrome: ");
      String userInput = kb.nextLine();
      word = "";
      for (int i =  0; i <= userInput.length() - 1; ++i)
      {
         if (Character.isLetter(userInput.charAt(i)) == true)
         {
            word += (userInput.charAt(i));
         }
         System.out.println(Character.isLetter(userInput.charAt(i)));
      }
      word = word.toLowerCase();
      System.out.println(word);
      for (int i = word.length() - 1; i >= 0; --i)
      {
         reverse += (word.charAt(i));
      }
      reverse = reverse.toLowerCase();

      if (word.equals(reverse))
      {
         System.out.println("This is a palindrome");
         total += 1;
      }
      else
      {
         System.out.println("This is not a palindrome");
      }
      reverse = "";
   }while(word.length() != 0);
   System.out.println("Testing Completed");
   System.out.println("You have found " + total + " palindromes");
 }
}