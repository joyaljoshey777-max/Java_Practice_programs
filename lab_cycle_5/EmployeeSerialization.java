import java.io.*;

class Employ implements Serializable {

    int id;
    String name;
    double salary;

    Employ(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Salary: " + salary;
    }
}

public class EmployeeSerialization {

    public static void main(String[] args) {

        Employ emp =
                new Employ(101, "Asni", 50000);

        try {

            // Serialization
            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("employee.ser")
                    );

            out.writeObject(emp);
            out.close();

            System.out.println("Employee serialized.");

            // Deserialization
            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream("employee.ser")
                    );

            Employee restored =
                    (Employee) in.readObject();

            in.close();

            System.out.println("Restored Employee:");
            System.out.println(restored);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}