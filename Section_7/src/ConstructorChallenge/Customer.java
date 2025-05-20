package ConstructorChallenge;

public class Customer {
    private String name;
    private String emailAddress;
    private double creditLimit;

    public Customer(String name, String emailAddress, double limit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = limit;
    }

    public Customer(String name, String emailAddress) {
        this(name, emailAddress, 500);
    }

    public Customer() {
        this("Nobody", "Nobody@email.com");
    }


    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }


}
