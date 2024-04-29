import java.util.*;
class tasksheet8 {
    static int cumulativeSumI(int a, int b, int c){
        return sumOfNumber(a)+sumOfNumber(b)+sumOfNumber(c);
    }
    static int sumOfNumber(int x){
        int sum = 0;
        for (int z=1;z<=x;z++)
        sum+=z;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers:"); 
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
System.out.println("The cumulative sum of "+a+ "+"+b+"+"+c+"="+cumulativeSumI(a, b, c));
System.exit(0);
     }
}


