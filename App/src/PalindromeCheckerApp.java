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
             String reversed = "";
             for (int i = input.length() - 1; i >= 0; i--) {
                 reversed = reversed + input.charAt(i);
             }
            if(input.equals(reversed)) {
             System.out.println("The string is a Palindrome");
         } else {
             System.out.println("The string is NOT a Palindrome");
         }
            sc.close();
         }
     }

