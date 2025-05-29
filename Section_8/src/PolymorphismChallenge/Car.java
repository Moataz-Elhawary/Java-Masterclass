package PolymorphismChallenge;

public class Car {
    private String discription;

    public Car(String discription) {
        this.discription = discription;
    }

    public void startEngine() {
        System.out.println("Car -> Start Engine");
    }

    protected void runEngine() {
        System.out.println("Car -> Run Engine");
    }

    public void drive() {
        System.out.println("Car -> Driving , type is " + getClass().getSimpleName());
        runEngine();
    }
}


class GasPowerdCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPowerdCar(String discription) {
        super(discription);
    }

    public GasPowerdCar(String discription, double avgKmPerLiter, int cylinders) {
        super(discription);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Car -> All %d cylinders are fired up , Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String discription) {
        super(discription);
    }

    public ElectricCar(String discription, double avgKmPerCharge, int batterySize) {
        super(discription);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> Switch %d KWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;
    private int batterySize;

    public HybridCar(String discription) {
        super(discription);
    }

    public HybridCar(String discription, double avgKmPerLiter, int cylinders,
                     int batterySize) {
        super(discription);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid -> switch %d KWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
    }
}
