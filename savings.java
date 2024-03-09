public class savings {
    
    // Instance variables 
    public static double totalBalanceSavings;

    // Creating constructor
    public savings(double totalBalance) {
        totalBalanceSavings = totalBalance;
    }

    public savings() {}


    // getters 
    public double getTotalBalanceSavings() {
        return totalBalanceSavings;
    }

    // setters
    public void setTotalBalanceSavings(double totalBalance) {
        totalBalanceSavings = totalBalance;
    }

}
