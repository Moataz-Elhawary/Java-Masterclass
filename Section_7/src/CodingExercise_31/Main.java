package CodingExercise_31;

public class Main {
    public static void main(String[] args) {

        // Test Code
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("Moataz");    // firstName is set to Moataz
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Hawary");    // lastName is set to Hawary
        System.out.println("fullName= " + person.getFullName());

    }
}
