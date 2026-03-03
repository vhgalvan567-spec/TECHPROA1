class Person {
    String name;

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = null;

        // Set name for p1 and display
        p1.name = "Vince Harold Galvan";
        p1.displayName();

        // Attempt to display p2's name and handle NullPointerException
        try {
            p2.displayName();
        } catch (NullPointerException e) {
            System.out.println("Error: Student Object is not created");
        }
    }
}