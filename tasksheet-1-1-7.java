import java.util.*;
class task7{
 void addTwoNumbers(int a, int b){
 System.out.println("The sum of "+a+"+"+b+"="+ (a+b));
 }
 void minusTwoNumbers(int a, int b){
System.out.println("The difference of "+a+"-"+b+"="+ (a-b));
}
void multiplyTwoNumbers(int a, int b){
System.out.println("The product of "+a+"*"+b+"="+(a*b));
 }
 void divideTwoNumbers(int a, int b){
    System.out.println("The quotient of "+a+"/"+b+"="+(a/b));  
}
   void arithMethod(int a, int b){
    addTwoNumbers(a, b);
    minusTwoNumbers(a, b);
    multiplyTwoNumbers(a, b);
    divideTwoNumbers(a, b);
   }

   public static void main(String[] args) {
    task7 c7 = new task7();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    int a = input.nextInt();
    int b = input.nextInt();
    c7.arithMethod(a, b);
    input.close();
    System.exit(0);
   }
}
