import java.util.*;
public class BankingApp{
Scanner scanner = new Scanner (System.in);
Bank bank = new bank();


System.out.println("Welcome to the Banking App!");

boolean loggedIn = false;
User loggedInUser = null;
 
while (!loggedIn) {
    System.out.println("Enter user ID: ");
    int userId = scanner. nextInt();
    System.out.println("Enter PIN: ");
    int pin = scanner.nextInt();

    loggedInUser = bank.logIn(userId, pin);
    if (loggedInUser != null) {
        System.out.println("Invalid user ID or PIN. Please try again");
    }
}

}
class User {
    private int id;
    private int pin;
    private String name;
    private double balance;
     

    public User (int id, int pin, String name, duoble balance){
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }
public int getPin(){
    return pin;
    }
    public double getBalance(){
   return balance;
   }
   public void cashIn(doudle amount)
   if (amount > 0){
    balance +=amount;

   }
   else {
    System.out.println(" Invalid amount.");
   }
    }


}

}