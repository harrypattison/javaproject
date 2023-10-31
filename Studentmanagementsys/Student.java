import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private String rollNumber;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String rollNumber) {
        students.removeIf(student -> student.getRollNumber().equals(rollNumber));
    }

    public Student findStudent(String rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber().equals(rollNumber)) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search for Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");

            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Roll Number: ");
                    String rollNumber = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = scanner.nextLine();

                    // Input validation can be added here

                    Student student = new Student(name, rollNumber, grade);
                    system.addStudent(student);
                    break;

                case 2:
                    System.out.print("Enter Roll Number to Remove: ");
                    rollNumber = scanner.nextLine();
                    system.removeStudent(rollNumber);
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    rollNumber = scanner.nextLine();
                    Student foundStudent = system.findStudent(rollNumber);
                    if (foundStudent != null) {
                        System.out.println("Student Found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    List<Student> allStudents = system.getAllStudents();
                    for (Student s : allStudents) {
                        System.out.println(s);
                    }
                    break;

                case 5:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
