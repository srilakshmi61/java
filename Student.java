public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Override toString() to print student details
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}
