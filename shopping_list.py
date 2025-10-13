# Shopping List Program
# Created by: [Your Name]
# Date: [Date]
# Description: A simple shopping list program using lists, user input, and conditionals.

# Step 1: Ask the user to enter up to 5 items
print("Enter up to 5 items to buy:")

shopping_list = []  # Empty list to store items

for i in range(5):
    item = input(f"> ").strip()
        if item:  # Only add if user enters something
                shopping_list.append(item)
                    else:
                            break  # Stop if user presses Enter without typing anything

                            # Step 2: Print the complete shopping list
                            print("\nYour shopping list:")
                            print(", ".join(shopping_list))

                            # Step 3: Count and display how many items were entered
                            print(f"\nYou entered {len(shopping_list)} item(s).")

                            # Step 4 (Extra Challenge): Search feature
                            search = input("\nSearch for an item: ").strip()

                            if search in shopping_list:
                                print(f"{search} is in your shopping list!")
                                else:
                                    print(f"{search} is NOT in your shopping list.")
