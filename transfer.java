/**
 * This is a class that has methods through which user can transfer money from account to other that is from either debit to credit or from chequing to savings or vice versa 
 * @author Aryan shah
 */
public class transfer {
    
    private String input;
    private String input2;
    private double amount;

    public void transferMoney() {
        bankingHarness.scan.nextLine(); // Consuming empty space character

        // Getting the account from which the user wants to trasnfer his money from
        System.out.print("Enter the account you want to transfer your money from: ");
        input = bankingHarness.scan.nextLine(); // using the scanner object from banking harness class 
        System.out.println(input);

         

        // Getting the account to which the user wants to trasnfer his money
        System.out.print("Enter the account you want to transfer your money to: ");
        input2 = bankingHarness.scan.nextLine();
        System.out.println(input2);

        // Getting the amount of money to be trasnfered
        System.out.print("Enter the amount of money you want to transfer: ");
        amount = bankingHarness.scan.nextDouble();
        System.out.println(amount);

        
        if (input.equalsIgnoreCase("chequing")) {

            // System.out.println("You want to trasnfer you money from chequing");
            System.out.println("Your balance in chequing account: " + chequing.totalBalanceChequing);

            if (amount <= chequing.totalBalanceChequing) {

                if (input2.equalsIgnoreCase("savings")) {
                    chequing.totalBalanceChequing = chequing.totalBalanceChequing - amount;
                    savings.totalBalanceSavings = savings.totalBalanceSavings + amount;
                    System.out.println("Transfer successful");
                }
    
                else if (input2.equalsIgnoreCase("credit")) {
                    System.out.println("You want to transfer money to credit card");
                }
    
                else {
                    System.out.println("Please enter a valid account");
                }

                System.out.println("Chequing balance: " + chequing.totalBalanceChequing);
                System.out.println("Savings balance: " + savings.totalBalanceSavings);

            }

            else {
                System.out.println("Not enough balance !");
            }
            
        }

        else if (input.equalsIgnoreCase("savings")) {

            System.out.println("Your balance in savings account: " + savings.totalBalanceSavings);

            if (amount < savings.totalBalanceSavings) {

                if (input2.equalsIgnoreCase("chequing")) {
                    // Transferring money from savings to chequing
                    savings.totalBalanceSavings = savings.totalBalanceSavings - amount;
                    chequing.totalBalanceChequing = chequing.totalBalanceChequing + amount;
                    System.out.println("Trasnfer successful");
                }

                else if (input2.equalsIgnoreCase("credit")) {
                    System.out.println("You want to transfer money to credit card");
                }

                else {
                    System.out.println("please enter a valid account");
                }

                System.out.println("Chequing account: " + chequing.totalBalanceChequing);
                System.out.println("Savings: " + savings.totalBalanceSavings);

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