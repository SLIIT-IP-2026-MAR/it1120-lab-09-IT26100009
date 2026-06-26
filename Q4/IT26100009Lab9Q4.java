import java.util.Scanner;

public class IT26100009Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static String findGrades(double finalMark) {

        if (finalMark >= 75)
            return "A";
        else if (finalMark >= 65)
            return "B";
        else if (finalMark >= 55)
            return "C";
        else if (finalMark >= 45)
            return "D";
        else
            return "F";
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.println("\nStudent Name : " + name);
        System.out.println("Final Mark   : " + finalMark);
        System.out.println("Grade        : " + grade);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nEnter details for Student " + i);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Assignment Mark: ");
            double assignment = sc.nextDouble();

            System.out.print("Enter Exam Mark: ");
            double exam = sc.nextDouble();
            sc.nextLine();

            double finalMark = calcFinalMark(assignment, exam);
            String grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }
    }
}