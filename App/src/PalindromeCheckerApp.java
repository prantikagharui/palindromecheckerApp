     /**
     * @author Prantika Gharui
     * @regno  RA2411056010199
     * @version 1.0
     /***/
    import java.util.Scanner;
    import java.util.ArrayDeque;
    import java.util.Deque;
     public class PalindromeCheckerApp {
         public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);
             System.out.print("Enter string:");
             String input = sc.nextLine();
             Deque<Character> deque = new ArrayDeque<>();
             for(char c :  input.toCharArray())
             {
                 deque.addLast(c);
             }
             boolean isPalindrome = true;
             while(deque.size() > 1) {
                 if(deque.removeFirst() != deque.removeLast())
                 {
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

