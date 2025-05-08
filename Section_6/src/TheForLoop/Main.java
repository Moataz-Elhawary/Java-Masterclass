package TheForLoop;

public class Main {
    public static void main(String[] args) {
        for (int count = 0; count <= 5; count++) {
            System.out.println(count);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% Interest = " + interestAmount);
        }
        System.out.println("=========================================================");
        for (double interest = 7.5; interest <= 10.0; interest += 0.25) {
            double interestAmount = calculateInterest(100.0, interest);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$ 100 at " + interest + "% interest = $ " + interestAmount);

        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100.00);
    }
}

