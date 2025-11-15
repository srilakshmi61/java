import java.util.*;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student s) {
        students.add(s);
    }

    // View all students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students added yet!");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Menu
    public void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (ch) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    addStudent(new Student(id, name, age));
                    System.out.println("Student Added!");
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
