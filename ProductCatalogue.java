import java.io.*;

class Product implements Serializable {

    int id;
    String name;
    double price;

    transient String discountCode;

    Product(int id, String name, double price,
            String discountCode) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.discountCode = discountCode;
    }

    public String toString() {

        return "ID: " + id +
                ", Name: " + name +
                ", Price: " + price +
                ", Discount Code: " + discountCode;
    }
}

public class ProductCatalogue {

    public static void main(String[] args) {

        Product[] products = {

                new Product(
                        101,
                        "Laptop",
                        50000,
                        "LAP10"
                ),

                new Product(
                        102,
                        "Phone",
                        25000,
                        "PHONE20"
                ),

                new Product(
                        103,
                        "Headphones",
                        2000,
                        "HEAD5"
                )
        };

        try {

            // Serialization
            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("products.ser")
                    );

            out.writeObject(products);
            out.close();

            System.out.println("Products serialized.");

            // Deserialization
            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream("products.ser")
                    );

            Product[] restored =
                    (Product[]) in.readObject();

            in.close();

            System.out.println("\nDeserialized Products:");

            for (Product p : restored) {
                System.out.println(p);
            }

            System.out.println(
                    "\nDiscount code is null because it is transient."
            );

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}