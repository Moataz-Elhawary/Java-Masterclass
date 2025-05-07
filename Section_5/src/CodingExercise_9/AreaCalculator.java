package CodingExercise_9;

public class AreaCalculator {
    public static void main(String[] args) {

        // Test Code
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));
    }

    // Requirement Solution

    public static double area(double radius){
        if (radius < 0) return -1;
        return (3.14159265 * (radius*radius));
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0) return -1;
        return (x*y);
    }

}
