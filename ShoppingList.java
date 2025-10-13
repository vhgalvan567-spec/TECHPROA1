import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
                    ArrayList<String> shoppingList = new ArrayList<>();

                            System.out.println("Enter up to 5 items to buy:");

                                    // Step 1: Ask user to enter up to 5 items
                                            for (int i = 0; i < 5; i++) {
                                                        System.out.print("> ");
                                                                    String item = input.nextLine().trim();
                                                                                
                                                                                            if (item.isEmpty()) {
                                                                                                            break; // Stop if user presses Enter without typing
                                                                                                                        }
                                                                                                                                    shoppingList.add(item);
                                                                                                                                            }

                                                                                                                                                    // Step 2: Print the complete shopping list
                                                                                                                                                            System.out.println("\nYour shopping list:");
                                                                                                                                                                    for (int i = 0; i < shoppingList.size(); i++) {
                                                                                                                                                                                System.out.print(shoppingList.get(i));
                                                                                                                                                                                            if (i < shoppingList.size() - 1) {
                                                                                                                                                                                                            System.out.print(", ");
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                        // Step 3: Display how many items were entered
                                                                                                                                                                                                                                                System.out.println("\n\nYou entered " + shoppingList.size() + " item(s).");

                                                                                                                                                                                                                                                        // Step 4: Search feature (Extra Challenge)
                                                                                                                                                                                                                                                                System.out.print("\nSearch for an item: ");
                                                                                                                                                                                                                                                                        String searchItem = input.nextLine().trim();

                                                                                                                                                                                                                                                                                if (shoppingList.contains(searchItem)) {
                                                                                                                                                                                                                                                                                            System.out.println(searchItem + " is in your shopping list!");
                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                System.out.println(searchItem + " is NOT in your shopping list.");
                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                input.close();
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    }
