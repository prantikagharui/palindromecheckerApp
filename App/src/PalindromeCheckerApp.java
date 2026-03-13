     /**
     * @author Prantika Gharui
     * @regno  RA2411056010199
     * @version 1.0
     /***/
    import java.util.Scanner;
    import java.util.Stack;
     public class PalindromeCheckerApp {
         public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);
             System.out.print("Enter string:");
             String input = sc.nextLine();
             Stack<Character> stack = new Stack<>();
             for(char c :  input.toCharArray())
             {
                 stack.push(c);
             }
             boolean isPalindrome = true;
             for(char c :  input.toCharArray())
             {
                 if (c!= stack.pop()) {
                     isPalindrome = false;
                     break;
                 }
             }
             if (isPalindrome){
             System.out.println("The string is a Palindrome");
         } else {
             System.out.println("The string is NOT a Palindrome");
         }
            sc.close();
         }
     }

