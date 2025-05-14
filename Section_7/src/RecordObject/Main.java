package RecordObject;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Moataz";
                        case 2 -> "Moamen";
                        case 3 -> "Mohab";
                        case 4 -> "Mohamed";
                        case 5 -> "Mahmoud";
                        default -> "Anonymous";
                    },
                    "5/11/1995",
                    "Java MasterClass");
            System.out.println(s);
        }
        System.out.println("=====================================================================");
        Student pojoStudent = new Student("S923006", "Hawary", "6/11/1997", "Java MasterClass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Ali", "4/5/1990", "Java MasterClass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println("=====================================================================");

        pojoStudent.setClassList(pojoStudent.getClassList() + " , Java OCP Exam 829 ");
//        recordStudent.setClassList(recordStudent.classList() + " Java OCP Exam 829 ");

        System.out.println("=====================================================================");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

        System.out.println("=====================================================================");


    }
}
