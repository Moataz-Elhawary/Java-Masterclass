package ConstructorChallenge;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Moataz", "moataz@email.com", 1000);
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        System.out.println("==================================================");

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());

        System.out.println("==================================================");

        Customer thirdCustomer = new Customer("Tim", "tim@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());
    }
}
