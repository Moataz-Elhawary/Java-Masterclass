package EncapsulationChallenge;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagePrinted = printer.printPages(5);
        System.out.printf("Current Job Pages : %d, Printer total : %d %n",
                pagePrinted, printer.getPagesPrinted());

        pagePrinted = printer.printPages(10);
        System.out.printf("Current Job Pages : %d, Printer total : %d %n",
                pagePrinted, printer.getPagesPrinted());

    }
}
