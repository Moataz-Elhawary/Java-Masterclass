package CodingExercise_5;

public class LeapYear {
    public static void main(String[] args) {

        // Test
        boolean isLeapYear;
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }


/*
    public static boolean isLeapYear(int year){

       if (year < 1 || year > 9999){
           return false;
       }

           if (year % 4 == 0)
           {
               if(year % 100 == 0)
               {
                   if(year % 400 == 0)
                   {
                       return true;
                   }
                     else {
                         return false ;
                          }
               }
               else {
                   return true;
                     }
           }
           else {
               return false;
                 }
       }
*/


    // Another Solution
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }


}

