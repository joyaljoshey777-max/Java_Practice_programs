class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public String toString() {
        return super.toString() + " (Dog)";
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy");

        d.makeSound();
        System.out.println(d);
    }
}