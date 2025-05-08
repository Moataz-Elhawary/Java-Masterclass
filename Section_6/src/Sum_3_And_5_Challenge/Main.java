package Sum_3_And_5_Challenge;

public class Main {
    public static void main(String[] args) {
        int count = 0, sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Can be divided by 3 & 5 ");
                count++;
                sum += i;
                if (count == 5) {
                    System.out.println("Sum of numbers That meet a condition = " + sum);
                    break;
                }
            }
        }
    }
}
