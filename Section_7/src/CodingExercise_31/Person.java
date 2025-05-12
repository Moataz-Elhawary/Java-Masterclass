package CodingExercise_31;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public boolean isTeen() {

        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if (getFirstName().isEmpty() && getLastName().isEmpty()) return "";
        else if (getFirstName().isEmpty()) return getLastName();
        else if (getLastName().isEmpty()) return getFirstName();
        else return firstName + " " + lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }
}
