import java.util.ArrayList;

class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Student Created: " + name);
    }

    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // Called by Garbage Collector before object destruction (for demo only)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector destroying Student object: " + name);
        super.finalize();
    }
}

// Temporary class to create memory pressure
class TempStudent {
    int x = 10;
}

public class GarbageCollectorDemo {
    public static void main(String[] args) {

        System.out.println("Student Records System Started");

        // List to store student objects
        ArrayList<Student> students = new ArrayList<>();

        // Creating student objects
        students.add(new Student(1, "Balmond"));
        students.add(new Student(2, "Layla"));
        students.add(new Student(3, "Nana"));

        System.out.println("\n--- Displaying Student Records ---");
        for (Student s : students) {
            s.displayInfo();
        }

        // Removing references
        System.out.println("\n--- Removing Student Records ---");
        students.remove(0); // Balmond removed
        students.remove(0); // Layla removed

        // Suggesting Garbage Collection
        System.out.println("\n--- Suggesting Garbage Collection ---");
        System.gc();

        // Pause to allow garbage collector to run (for demo only)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nRemaining Student Records:");
        for (Student s : students) {
            s.displayInfo();
        }

        System.out.println("\nStudent Records System Ended");
    }
}