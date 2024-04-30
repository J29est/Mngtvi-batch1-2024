import java.util.*;

class tasksheet9{

    public static int add(int a, int b) {
        return Math.addExact(a,b);
    }
    public static int subtract(int a, int b) {
        return Math.subtractExact(a,b);
    }
    public static int multiply(int a, int b) {
        return Math.multiplyExact(a,b);
    }
    public static float divide(int a, int b) {
        return Math.floorDiv(a,b);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 2 Numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("sum of "+a+ "+"+b+ "="+add(a, b));
        System.out.println("difference of "+a+ "-"+b+ "="+subtract(a, b));
        System.out.println("product of "+a+ "*"+b+ "="+multiply(a, b));
        System.out.println("qoutient of "+a+ "/"+b+ "="+divide(a, b));
        input.close();
        System.exit(0);
    }
    }



