package ClassesChallenge;

public class Main {
    public static void main(String[] args) {

        Account myAccount = new Account();
//        Account myAccount = new Account("12345", 250, "Moataz Elhawary",
//                "moataz@account.com", "+201111111");

        System.out.println("==============================================================");

        System.out.println(myAccount.getAccountBalance());
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getCustomerEmail());
        System.out.println(myAccount.getCustomerPhone());

        System.out.println("==============================================================");
/*
        myAccount.setAccountBalance(1000);
        myAccount.setAccountNumber("12345");
        myAccount.setCustomerName("Moataz Elhawary");
        myAccount.setCustomerEmail("moataz@account.com");
        myAccount.setCustomerPhone("123456789");
*/

        System.out.println("================================================================");

        myAccount.withdrawFunds(100.0);
        myAccount.depositFunds(500);
        myAccount.withdrawFunds(100.0);
        myAccount.withdrawFunds(400.0);

        System.out.println("================================================================");

        myAccount.depositFunds(100);
        myAccount.withdrawFunds(45.5);
        myAccount.withdrawFunds(35.60);
        myAccount.withdrawFunds(50.5);
        myAccount.withdrawFunds(18.90);

        System.out.println("================================================================");

        Account hawaryAccount = new Account("Hawary", "hawary@account.com", "12345");
        System.out.println("Account No: " + hawaryAccount.getAccountNumber() +
                " ; Name: " + hawaryAccount.getCustomerName());
    }
}
