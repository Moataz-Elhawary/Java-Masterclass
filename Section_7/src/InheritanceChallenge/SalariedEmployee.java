package InheritanceChallenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate,
                            String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        // Salaried Employee get paid every other week
        double payCheck = annualSalary / 26;
        // Let's say the maximum pension can only ever be ninety percent of their final salary :
        double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;
        return (int) adjustedPay;
    }

    public void retire() {
        isRetired = true;
        terminate("12/12/2025");
    }
}
