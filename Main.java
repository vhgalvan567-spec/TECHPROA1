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

                                                    p1.name = "Vince Harold Galvan";
                                                            p1.displayName();

                                                                    try {
                                                                                p2.displayName();
                                                                                        } catch (NullPointerException e) {
                                                                                                    System.out.println("Error: Student Object is not created");
                                                                                                            }
                                                                                                                }
                                                                                                                }
}
