package lab_3;

public class BankAccount {

    public double bankBalance;
    public double interestRate;
    public String accountHolder;

    // Constructor
    public BankAccount ( double bankBalance, double interestRate, String accountHolder) {
        this.bankBalance = bankBalance;
        this.interestRate = interestRate;
        this.accountHolder = accountHolder;
    }

    public void deposit ( double change ) {
        this.bankBalance += change;
        System.out.println(String.format("Deposited %f into %s.", change, this.accountHolder));
    }

    public void displayAccountInfo () {
        System.out.println("-------------------------");
        System.out.println(String.format("Account Holder: %s", this.accountHolder));
        System.out.println(String.format("Account Value: %f", this.bankBalance));
        System.out.println(String.format("Interest Rate: %f", this.interestRate));
        System.out.println("------------------------- \n");
    }

    public void changeName ( String newName ) {
        this.accountHolder = newName;
    }

    public void withdraw ( double change ) {
        if(change > this.bankBalance) {
            System.out.println("****Insufficient Funds****");
            System.out.println(String.format("Withdraw Amount: %f, Available Balance %d.", change, this.bankBalance));
        } else {
            this.bankBalance -= change;
            System.out.println(String.format("Successfully withdrew %f from %s.", change, this.accountHolder));
        }
    }

    public void accountTransfer (BankAccount transferAccount, double transferAmount) {
        if(transferAmount > this.bankBalance) { 
            System.out.println("****Insufficient Funds****");
            System.out.println("Unable to transfer Funds.");
            System.out.println(String.format("Transfer Amount: %f, Available Balance %d. \n", transferAmount, this.bankBalance));
        } else {
            this.bankBalance -= transferAmount;
            transferAccount.bankBalance += transferAmount;
            System.out.println(String.format("Successfully Transfered %f from %s to %s. \n", transferAmount, this.accountHolder, transferAccount.accountHolder));
        }
    }

    public void calculateInterestYeild ( int years ) { // Simple Interest Calculation
        double interestYeild = this.bankBalance * (Math.pow(1 + this.interestRate, years) - 1);
        System.out.println(String.format("Interest Income Over the next three years: %f (non compounding). ", interestYeild));
    }

    public static void main(String[] args) {

        BankAccount johnDoe_account = new BankAccount(1000, 0.05, "John Doe");
        BankAccount willSmith_account = new BankAccount(2000, 0.03, "Will Smith");

        johnDoe_account.displayAccountInfo();
        willSmith_account.displayAccountInfo();

        willSmith_account.accountTransfer(johnDoe_account, 500);

        johnDoe_account.displayAccountInfo();
        willSmith_account.displayAccountInfo();

        willSmith_account.calculateInterestYeild(5);


    }
}




