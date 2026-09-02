// Parent class
class Student {

    // Protected members can be accessed by subclasses
    protected int rollNo;
    protected String name;
    protected double marks;

    // Student constructor
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    void displayStudent() {
        System.out.println("Student Details");
        System.out.println("----------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
    }
}

// PGStudent inherits Student
class PGStudent extends Student {

    String specialization;
    int semester;

    // PGStudent constructor
    PGStudent(int rollNo, String name, double marks,
              String specialization, int semester) {

        // Calling parent constructor
        super(rollNo, name, marks);

        this.specialization = specialization;
        this.semester = semester;
    }

    // Display PG student details
    void displayPGStudent() {

        // Calling inherited method
        displayStudent();

        System.out.println("\nPG Student Details");
        System.out.println("-------------------");
        System.out.println("Specialization : " + specialization);
        System.out.println("Semester       : " + semester);
    }
}

// Main class
public class Task2_Student_PGStudent {

    public static void main(String[] args) {

        // Creating PGStudent object
        PGStudent p = new PGStudent(
            21,
            "Neha",
            89,
            "AI & ML",
            2
        );

        // Display details
        p.displayPGStudent();
    }
}