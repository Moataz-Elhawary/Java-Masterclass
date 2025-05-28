package Polymorphism;

public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = movie.getMovie("C", "AirPlane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        /*var is a special context keyword in java
        that lets our code take advantage of local variable
        type inference (LVTI) it's compile-time type */
        var airPlan = movie.getMovie("C", "AirPlane");
        airPlan.watchMovie();

        var plane = new Comedy("AirPlane");
        plane.watchComedy();

        /*This Code Shows you one way to test for the Run Time Type but this not the best way*/
        Object unKnownObject = movie.getMovie("A", "Jaws");
        if (unKnownObject.getClass().getSimpleName() == "Comedy") {
            Comedy C = (Comedy) unKnownObject;
            C.watchComedy();

            /* The instanceof operator lets you test the type of object or instance
             * The reference variable you are testing iin the left operand
             * The type you are testing for is the right operand
             * */
        } else if (unKnownObject instanceof Adventure) { // this is another way
            ((Adventure) unKnownObject).watchAdventure();

            /*Pattern Matching for the instanceof operator that became part of java in JDK-16
             * - if the jvm can identify that an object matches the type, it can extract data
             * from the object without casting
             * - for this operator, the object can be assigned to variable which I've called syfy
             * in this example (if the instanceof method returns true)
             * the variable syfy is already typed as a ScienceFaction variable */
        } else if (unKnownObject instanceof ScienceFiction syfy) { // one more way
            syfy.watchScienceFiction();

        }
    }
}
