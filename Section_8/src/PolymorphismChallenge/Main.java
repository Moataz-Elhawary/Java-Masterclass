package PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS ");
        runRace(car);

        System.out.println("=".repeat(20));

        Car ferrari = new GasPowerdCar("2022 Blue Ferrari 296 GTS ",
                15.4, 6);
        runRace(ferrari);

        System.out.println("=".repeat(20));

        Car tesla = new ElectricCar("2022 red Tesla Model 3",
                568,75);
        runRace(tesla);

        System.out.println("=".repeat(20));

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari FS90 Stradale",
                16,8,8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
