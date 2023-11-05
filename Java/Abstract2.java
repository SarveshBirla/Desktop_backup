import java.util.ArrayList;
import java.util.Scanner;

abstract class Course {
    abstract void studentDetails();
}

class Student {
    String name;
    String uid;
    String year;
    double[] marks = new double[5];

    Student(String name, String uid, String year) {
        this.name = name;
        this.uid = uid;
        this.year = year;
    }

    void setMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
    }

    double calculateAverageMarks() {
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        return totalMarks / 5.0;
    }

   // @Override
    public String toString() {
        return "Name: " + name + "\nUID: " + uid + "\nYear: " + year +
               "\nMarks: " + marks[0] + ", " + marks[1] + ", " + marks[2] + ", " + marks[3] + ", " + marks[4];
    }
}

class EXTCA extends Course {
    ArrayList<Student> students = new ArrayList<>();

  //  @Override
    void studentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students in EXTCA: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            System.out.print("Enter student UID: ");
            String uid = scanner.next();
            System.out.print("Enter student year (FE, SE, TE): ");
            String year = scanner.next();

            Student student = new Student(name, uid, year);
            student.setMarks();

            students.add(student);
        }
    }
}

class EXTCB extends Course {
    ArrayList<Student> students = new ArrayList<>();

   // @Override
    void studentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students in EXTCB: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            System.out.print("Enter student UID: ");
            String uid = scanner.next();
            System.out.print("Enter student year (FE, SE, TE): ");
            String year = scanner.next();

            Student student = new Student(name, uid, year);
            student.setMarks();

            students.add(student);
        }
    }
}

public class Abstract2{
    public static void main(String[] args) {
        EXTCA extca = new EXTCA();
        EXTCB extcb = new EXTCB();

        extca.studentDetails();
        extcb.studentDetails();

        System.out.println("\nEXTCA Students:");
        for (Student student : extca.students) {
            System.out.println(student);
        }

        System.out.println("\nEXTCB Students:");
        for (Student student : extcb.students) {
            System.out.println(student);
        }

        double extcaAverageMarks = calculateAverageMarks(extca.students);
        double extcbAverageMarks = calculateAverageMarks(extcb.students);

        System.out.println("\nAverage Marks for EXTCA Students: " + extcaAverageMarks);
        System.out.println("Average Marks for EXTCB Students: " + extcbAverageMarks);
    }

    public static double calculateAverageMarks(ArrayList<Student> students) {
        double totalMarks = 0;
        int numStudents = students.size();

        for (Student student : students) {
            totalMarks += student.calculateAverageMarks();
        }

        return totalMarks / numStudents;
    }
}
