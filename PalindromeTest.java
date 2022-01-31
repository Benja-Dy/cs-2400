import java.util.Scanner;
public class PalindromeTest 
{
   public static void main(String[] args) 
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter a string");
      String word = kb.nextLine();
      if (palindrome(word, -1, -1))
      {
         System.out.println(word + " is a palindrome.");
      }
      else
      {
         System.out.println(word + " is not a palindrome.");
      }
      
   }
   public static boolean palindrome(String s, int i, int j) 
   {
      if (i == -1 && j == -1)
      {
         j = 0;
         i = s.length() -1;
      }
      if (i <= 0 || j >= s.length()-1)
      {
         return true;
      }
      if(s.charAt(i) != s.charAt(j))
      {
         return false;
      }
      else
         palindrome(s, i - 1, j + 1);
         return true;
   }
}
