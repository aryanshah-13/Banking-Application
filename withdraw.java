/**
 * This is the withdraw class which has the method to withdraw money from any account that the user wishes to withdraw from
 * @author Aryan shah
 * @
 */

import java.util.Scanner;

public class withdraw {

    // Creating instances for chequing and savings accounts 
    chequing chequingAcccount = new chequing();
    savings savingAccount = new savings();

    Scanner scan = new Scanner(System.in);

    // Creating a method to withdraw money from the account
    
    public void withdrawMoney() {
        
        scan.nextLine(); // Empty string to consume empty string

        // Getting the account from which the user wants to withdraw the money
        System.out.print("Enter the account you want to withdraw money from: ");
        String accountName = scan.nextLine();

        // Getting the amount of money that the user wants to withdraw
        System.out.print("Enter the amount: ");
        double amountWithdraw = scan.nextInt(); 

        // If entered account is chequing then withdraw money from chequing account
        if (accountName.equalsIgnoreCase("chequing")) {

            // Checking of the amount to be withdraw is less than the total available balance in the chequing account    
            if (amountWithdraw < chequing.totalBalanceChequing) {
                double newBalance = chequing.totalBalanceChequing - amountWithdraw;
                chequingAcccount.setTotalBalanceChequing(newBalance);
                System.out.println("The money has been withdraw");
                System.out.println("Your new balance for your chequing account is: " + chequing.totalBalanceChequing);
            }

            else {
                System.out.println("Not enough balance !");
            }
            
        }

        // If entered account is savings then withdraw money from savings account
        else if (accountName.equalsIgnoreCase("savings")) {

            // Checking of the amount to be withdraw is less than the total available balance in the savings account
            if (amountWithdraw < savings.totalBalanceSavings) {
                double newBalance = savings.totalBalanceSavings - amountWithdraw;
                savingAccount.setTotalBalanceSavings(newBalance);
                System.out.println("The money has been withdraw");
                System.out.println("Your new balance for you savings account is: " + savings.totalBalanceSavings);
            }

            else {
                System.out.println("Not enough balance !");
            }
            
        }

        else {
            System.out.println("Please enter a valid account !");
        }
       
    }

}
