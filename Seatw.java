import java.util.Scanner;

public class SeatworkFourteen {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
                    Motorcycle m = new Motorcycle();

                            m.make = "Yamaha Aerox";
                                    m.color = "black & white";
                                            
                                                    m.showAtts();

                                                            System.out.println("-----------");
                                                                    System.out.print("Do you want to start the engine? (on/off): ");
                                                                            String choice = input.nextLine();

                                                                                    if (choice.equalsIgnoreCase("on")) {
                                                                                                m.startEngine();
                                                                                                        } else if (choice.equalsIgnoreCase("off")) {
                                                                                                                    m.stopEngine();
                                                                                                                            } else {
                                                                                                                                        System.out.println("Invalid input. Please type 'on' or 'off'.");
                                                                                                                                                }

                                                                                                                                                        System.out.println("-----------");
                                                                                                                                                                m.showAtts();
                                                                                                                                                                    }
                                                                                                                                                                    }

                                                                                                                                                                    class Motorcycle {
                                                                                                                                                                        String make;
                                                                                                                                                                            String color;
                                                                                                                                                                                boolean engineState = false;

                                                                                                                                                                                    void startEngine() {
                                                                                                                                                                                            if (engineState) {
                                                                                                                                                                                                        System.out.println("The engine is already on.");
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                            System.out.println("The engine is now starting...");
                                                                                                                                                                                                                                        System.out.println("The engine is now on");
                                                                                                                                                                                                                                                    engineState = true;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                    void stopEngine() {
                                                                                                                                                                                                                                                                            if (!engineState) {
                                                                                                                                                                                                                                                                                        System.out.println("The engine is already off.");
                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                            System.out.println("The engine is now off.");
                                                                                                                                                                                                                                                                                                                        engineState = false;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                        void showAtts() {
                                                                                                                                                                                                                                                                                                                                                System.out.println("This motorcycle is a " + color + " " + make);
                                                                                                                                                                                                                                                                                                                                                        System.out.println("Engine state: " + (engineState ? "on" : "off"));
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            }
