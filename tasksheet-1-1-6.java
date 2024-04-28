import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class tasksheet6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        ArrayList <Integer> c = new ArrayList<>();
        c.add(input.nextInt());
        c.add(input.nextInt());
        c.add(input.nextInt());
        if(c.get(0)==c.get(1) && c.get(1)==c.get(2))
        System.out.println("All numbers are equaal");
        else
        System.out.println("The largest number is "+Collections.max(c));
        System.exit(0);

    }
}
