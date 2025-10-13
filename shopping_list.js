// Shopping List Program in JavaScript
// Created by: [Your Name]
// Description: A simple program using arrays, user input, and conditionals.

const prompt = require("prompt-sync")(); // For Node.js user input
let shoppingList = [];

console.log("Enter up to 5 items to buy:");

// Step 1: Ask the user to enter up to 5 items
for (let i = 0; i < 5; i++) {
  let item = prompt("> ").trim();
    if (item === "") break; // Stop if user presses Enter without typing
      shoppingList.push(item);
      }

      // Step 2: Print the complete shopping list
      console.log("\nYour shopping list:");
      console.log(shoppingList.join(", "));

      // Step 3: Count how many items were entered
      console.log(`\nYou entered ${shoppingList.length} item(s).`);

      // Step 4 (Extra Challenge): Search feature
      let searchItem = prompt("\nSearch for an item: ").trim();

      if (shoppingList.includes(searchItem)) {
        console.log(`${searchItem} is in your shopping list!`);
        } else {
          console.log(`${searchItem} is NOT in your shopping list.`);
          }
