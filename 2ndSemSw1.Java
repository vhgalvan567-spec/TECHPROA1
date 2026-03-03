import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public boolean setName(String name) {
        name = name.toLowerCase();

        if (name.equals("gaming mouse")) {
            this.name = "Gaming Mouse";
            this.price = 1500.5;
            return true;
        } else {
            System.out.println("Invalid product. Only Gaming Mouse available.");
            return false;
        }
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return price * quantity;
    }

    public void showDetails() {
        System.out.println("\nProduct: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + getTotalAmount());
    }
}

public class SecondSemSw1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product item = new Product();

        boolean valid = false;
        while (!valid) {
            System.out.print("Enter product name: ");
            String name = input.nextLine();
            valid = item.setName(name);
        }

        System.out.print("Enter quantity: ");
        int qty = input.nextInt();
        item.setQuantity(qty);

        item.showDetails();

        input.close();
    }
}