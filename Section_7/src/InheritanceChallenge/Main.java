package InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        // Test create Employee
        Employee Moataz = new Employee("Moataz", "03/11/1997", "01/01/2020");
        System.out.println(Moataz);
        System.out.println("Age: " + Moataz.getAge());
        System.out.println("Pay: " + Moataz.collectPay());
        System.out.println("=====================================");

        Employee Tim = new Employee("Tim", "11/11/1985", "01/01/2022");
        System.out.println(Tim);
        System.out.println("=====================================");

        // Test create Salaried Employee
        SalariedEmployee Joe = new SalariedEmployee("Joe", "01/01/1991",
                "25/01/2021", 35000);
        System.out.println(Joe);
        System.out.println("Joe's Paycheck = $" + Joe.collectPay());
        Joe.retire();
        System.out.println("Joe's Pension Paycheck = $" + Joe.collectPay());
        System.out.println("=====================================");

        // Test create Hourly Employee
        HourlyEmployee Mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(Mary);
        System.out.println("Mary's Paycheck = $" + Mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + Mary.getDoublePay());


    }
}
