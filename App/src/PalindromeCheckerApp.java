     /**
     * @author Prantika Gharui
     * @regno  RA2411056010199
     * @version 1.0
     */
    import java.util.Scanner;
     public class PalindromeCheckerApp {
        public static void main(String[] args) {

            System.out.println("Welcome to the Palindrome Checker System");
            System.out.println("Version : 1.0");
            System.out.println("System initialized successfully.");

            //UC2
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter Name:");
            String input=sc.nextLine();
            boolean isPalindrome = true;
            for(int i=0; i< input.length()/2; i++) {
                if(input.charAt(i) != input.charAt(input.length()-1 -i)){
                    isPalindrome = false;
                    break;
                }
            }
        System.out.println("Is It a Palindrome? :" + isPalindrome);
            sc.close();
        }
    }
