package AllAboutString;

public class StringMethods {
    public static void main(String[] args) {

        /*Sub String Method */
        String birthDate = "03/11/1997";
        int startingIndex = birthDate.indexOf("1997");
        System.out.println("Starting index = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3,5));
        System.out.println("=".repeat(50));

        String newDate = String.join("/","03","11","1997");
        System.out.println("New date = " + newDate);
        System.out.println("=".repeat(50));

        newDate = "03";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1997");
        System.out.println("New date = " + newDate);

        newDate = "03" + "/" + "11" + "/" + "1997";
        System.out.println("New date = " + newDate);

        newDate = "03".concat("/").concat("11").concat("/").concat("1997");
        System.out.println("New date = " + newDate);
        System.out.println("=".repeat(50));

        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("1","00"));

        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","---"));
        System.out.println("=".repeat(50));

        System.out.println("ABC\n".repeat(4));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(4).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(4).indent(-2));
        System.out.println("-".repeat(20));
    }
}
