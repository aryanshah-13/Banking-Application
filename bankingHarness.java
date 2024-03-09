/**
 * This is the main class of the application that has the main method and uses the other classes and their methods to run the application
 */
import java.util.Scanner;

public class bankingHarness {

   public static Scanner scan = new Scanner(System.in);

   // Creating required instances from different classes 
   chequing chequingAccount = new chequing(700);
   savings savingAccount = new savings(550);
   withdraw withdraw = new withdraw();
   transfer newTransfer = new transfer();

   // creating a method to get the total amount of balance in the account 
   public double getTotalBalance(chequing chequingAccount, savings savingAccount) {
      double totalMoney = chequingAccount.getTotalBalanceChequing() + savingAccount.getTotalBalanceSavings();
      return totalMoney;
   }

   // Creating a method to give the user options on what they want to choose
   public void options(chequing chequingAccount, savings savingAccount) {

      System.out.println("Choose from the following options: ");
      System.out.println(
         "1. View Account balance" + "\n" + 
         "2. View Chequing Account balance" + "\n" +
         "3. View Savings Account balance" + "\n" +
         "4. Withdraw money from your account" + "\n" +
         "5. Transfer between accounts"
      );

      int choice = scan.nextInt();

      if (choice == 1) {
         System.out.println("Your total balance in your account is: " + getTotalBalance(chequingAccount, savingAccount));
      }

      else if (choice == 2) {
         System.out.println("The current balance for your chequing account is: " + chequingAccount.getTotalBalanceChequing());
      }

      else if (choice == 3) {
         System.out.println("The current balance for your savings account is: " + savingAccount.getTotalBalanceSavings());
      }

      else if (choice == 4) {
         withdraw.withdrawMoney();
      }

      else if (choice == 5) {
         newTransfer.transferMoney();
      }

      else {
         System.out.println("Please enter a valid option");
      }
   } 

   public static void main(String args[]) {
      bankingHarness banking = new bankingHarness();
      String exit;
      
      do {
         banking.options(banking.chequingAccount, banking.savingAccount);
         System.out.println("Press Y to continue" + "\n" + "Press X to exit");

         // Entering empty scan element to consume the newline character
         banking.scan.nextLine();
         
         exit = banking.scan.nextLine();
      } while(!exit.equalsIgnoreCase("X"));

      System.out.println("Thank you for choosing us");

   }

}


