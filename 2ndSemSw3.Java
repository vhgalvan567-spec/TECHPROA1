class Animal {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void sound() {
        System.out.println("Some generic animal sound");
    }

    void sound(int times) {
        for (int i = 0; i < times; i++) {
            sound();
        }
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark Bark!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow Meow!");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Moo Moo!");
    }
}

public class Seatwork3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Buddy");
        dog.setAge(3);

        Cat cat = new Cat();
        cat.setName("Kitty");
        cat.setAge(2);

        Cow cow = new Cow();
        cow.setName("Bessie");
        cow.setAge(5);

        // Display info and sounds
        System.out.println(dog.getName() + " (" + dog.getAge() + " years old) makes sound:");
        dog.sound(2);

        System.out.println(cat.getName() + " (" + cat.getAge() + " years old) makes sound:");
        cat.sound(2);

        System.out.println(cow.getName() + " (" + cow.getAge() + " years old) makes sound:");
        cow.sound(2);
    }
}