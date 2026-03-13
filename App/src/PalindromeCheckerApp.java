     /**
     * @author Prantika Gharui
     * @regno  RA2411056010199
     * @version 1.0
     /***/
    import java.util.Scanner;
    import java.util.LinkedList;
     public class PalindromeCheckerApp {
         public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);
             System.out.print("Enter string:");
             String input = sc.nextLine();
             LinkedList<Character> list = new LinkedList<>();
             for(char c :  input.toCharArray())
             {
                 list.add(c);
             }
             boolean isPalindrome = true;
             while(list.size() > 1) {
                 if(list.removeFirst() != list.removeLast())
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

