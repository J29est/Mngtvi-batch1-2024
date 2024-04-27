 import java.util.Scanner;
 class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String  a = "madam";
        StringBuilder b = new StringBuilder(input.nextLine());
        if (b.toString().equals(a)){
            System.out.println("The input string is a palindrome.");
        }else{
            System.out.println("The input string is not palindrome.");
        }
    }
}