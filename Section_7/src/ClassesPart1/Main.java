package ClassesPart1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("tesla");
        car.setModel("X-model");
        car.setColor("Blue");
        car.setDoors(2);
        car.setConvertible(true);
        System.out.println("Make =" + car.getMake());
        System.out.println("Model =" + car.getModel());
        car.describeCar();


        System.out.println("========================================");


        Car c = new Car();
        c.setMake("porsche");
        c.setModel("m90");
        c.setColor("Red");
        c.setDoors(4);
        c.setConvertible(false);
        c.describeCar();
    }
}
