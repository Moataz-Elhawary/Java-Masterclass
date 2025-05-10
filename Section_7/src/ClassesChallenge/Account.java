package ClassesChallenge;

public class Account {

    private double accountBalance;
    private String accountNumber;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        /* this is the Constructor chaining to call constructor from another ,
         * you have to be sure that it's the very first line that executed in the constructor
         * */
        this("5678", 2.5, "Hawary",
                "hawary@account.com", "+201234567");

        System.out.println("Empty Constructor Called");
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public Account(String accountNumber, double accountBalance, String customerName,
                   String customerEmail, String customerPhone) {
        System.out.println("Account Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }


    public void depositFunds(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposited of $" + depositAmount + " made New Balance is $" + accountBalance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if (accountBalance - withdrawAmount < 0) {
            System.out.println("Insufficient Funds! you only have $" + accountBalance + " in your account.");
        } else {
            accountBalance -= withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount + " Processed, Remaining balance = $" + accountBalance);
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
