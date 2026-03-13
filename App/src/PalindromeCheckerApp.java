     /**
     * @author Prantika Gharui
     * @regno  RA2411056010199
     * @version 1.0
     /***/
    import java.util.Scanner;
     public class PalindromeCheckerApp {
         public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);
             System.out.print("Enter string:");
             String input = sc.nextLine();
             char[] chars = input.toCharArray();
             int start=0;
             int end = chars.length - 1;
             boolean isPalindrome = true;
             while (start < end) {
                 if (chars[start]!= chars[end]) {
                     isPalindrome = false;
                     break;
                 }
                 start++;
                 end--;
             }
             if (isPalindrome){
             System.out.println("The string is a Palindrome");
         } else {
             System.out.println("The string is NOT a Palindrome");
         }
            sc.close();
         }
     }

