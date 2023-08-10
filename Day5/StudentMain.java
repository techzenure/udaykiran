package Day5;
import java.util.Scanner;

class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    public Student(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student's Id: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // consume the newline after the int input

        System.out.print("Enter Student's Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student's Address: ");
        String studentAddress = scanner.nextLine();

        String choice;
        String collegeName = "";
        do {
            System.out.print("Whether the student is from NIT(Yes/No): ");
            choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("yes") || choice.equals("y")) {
                Student student = new Student(studentId, studentName, studentAddress);
                System.out.println("Student id: " + student.getStudentId());
                System.out.println("Student name: " + student.getStudentName());
                System.out.println("Address: " + student.getStudentAddress());
                System.out.println("College Name: " + student.getCollegeName());
            } else if (choice.equals("no") || choice.equals("n")) {
                System.out.print("Enter the college name: ");
                collegeName = scanner.nextLine();
                Student student = new Student(studentId, studentName, studentAddress, collegeName);
                System.out.println("Student id: " + student.getStudentId());
                System.out.println("Student name: " + student.getStudentName());
                System.out.println("Address: " + student.getStudentAddress());
                System.out.println("College Name: " + student.getCollegeName());
            } else {
                System.out.println("Wrong Input");
            }
        } while (!(choice.equals("yes") || choice.equals("y") || choice.equals("no") || choice.equals("n")));

        scanner.close();
    }
}
