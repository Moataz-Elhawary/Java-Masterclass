package Inheritance;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {

        super(type, weight < 15 ? "small" : (weight < 35 ? "midium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.print("Ow Woooooo! ");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    public void bark() {
        System.out.print("Woof! ");
    }

    public void run() {
        System.out.print("Dog Running ");
    }

    public void walk() {
        System.out.print("Dog Walking ");
    }

    public void wagTail() {
        System.out.print("Tail Wagging ");
    }


}
