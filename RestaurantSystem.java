import java.util.Scanner;

public class RestaurantSystem {

   static void displayMenu(String[] food, int[] price) {

        System.out.println("===== RESTAURANT MENU =====");

        for (int i = 0; i < food.length; i++) {
            System.out.println((i + 1) + ". " + food[i] + " - Rs." + price[i]);
        }

        System.out.println("5. Exit");
    }

    static double calculateBill(int price, int quantity) {

        return price * quantity;
    }

    static void showKitchen() {

        System.out.println("\n===== KITCHEN =====");
        System.out.println("Order received");
        System.out.println("Food is being prepared");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        String[] food = {"Pizza", "Burger", "Biryani", "Fried Rice"};
        int[] price = {200, 100, 180, 150};

        displayMenu(food, price);

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

       
        if (choice == 5) {

            System.out.println("Thank you! Visit again.");

        }

        else if (choice >= 1 && choice <= 4) {

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double total = 0;

      
            switch (choice) {

                case 1:
                    total = calculateBill(price[0], quantity);
                    break;

                case 2:
                    total = calculateBill(price[1], quantity);
                    break;

                case 3:
                    total = calculateBill(price[2], quantity);
                    break;

                case 4:
                    total = calculateBill(price[3], quantity);
                    break;
            }

         
            showKitchen();

        
            System.out.println("\n===== BILL =====");
            System.out.println("Food: " + food[choice - 1]);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Bill: Rs." + total);

          
            if (total >= 500) {

                total = total - 50;

                System.out.println("Discount: Rs.50");
                System.out.println("Final Bill: Rs." + total);
            }

            else {

                System.out.println("No discount");
                System.out.println("Final Bill: Rs." + total);
            }
        }

        else {

            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
