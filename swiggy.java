import java.util.Scanner;
import java.util.Random;

public class swiggy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Display hotel choices
        System.out.println("Select a Hotel:");
        System.out.println("1. Bilal");
        System.out.println("2. A2B");
        System.out.println("3. Amma Canteen");
        System.out.println("4. SS Hyderabad");

        int hotelChoice = scanner.nextInt();
        String hotelName = "";

        // Using switch-case to handle hotel selection
        switch (hotelChoice) {
            case 1:
                hotelName = "Bilal";
                break;
            case 2:
                hotelName = "A2B";
                break;
            case 3:
                hotelName = "Amma Canteen";
                break;
            case 4:
                hotelName = "SS Hyderabad";
                break;
            default:
                System.out.println("Invalid hotel selection.");
                return;  // End the program if an invalid hotel is selected
        }

        System.out.println("You selected " + hotelName + ".");
        System.out.println("Menu:");
        System.out.println("1. Mutton Biryani - 250rs");
        System.out.println("2. Chicken Biryani - 160rs");
        System.out.println("3. Veg Biryani - 100rs");

        System.out.println("Select an item:");
        int itemChoice = scanner.nextInt();
        String itemName = "";
        int itemPrice = 0;

        // Using switch-case to handle menu item selection
        switch (itemChoice) {
            case 1:
                itemName = "Mutton Biryani";
                itemPrice = 250;
                break;
            case 2:
                itemName = "Chicken Biryani";
                itemPrice = 160;
                break;
            case 3:
                itemName = "Veg Biryani";
                itemPrice = 100;
                break;
            default:
                System.out.println("Invalid menu item selection.");
                return;  // End the program if an invalid item is selected
        }

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();
        int totalBill = itemPrice * quantity;

        System.out.println("Your total bill is: " + totalBill + "rs");

        System.out.println("Choose payment method: 1. PhonePe 2. GPay");
        int paymentMethod = scanner.nextInt();

        // You can use another switch-case for payment methods if there are multiple actions to be handled.
        switch (paymentMethod) {
            case 1:
            case 2:
                System.out.println("Enter the amount to pay:");
                int enteredAmount = scanner.nextInt();

                if (enteredAmount == totalBill) {
                    // OTP generation
                    int otp = random.nextInt(9000) + 1000; // Generate a 4-digit OTP
                    System.out.println("Generated OTP: " + otp);

                    System.out.println("Enter the OTP:");
                    int enteredOtp = scanner.nextInt();

                    if (enteredOtp == otp) {
                        System.out.println("Order success! Your " + itemName + " will be delivered soon.");
                    } else {
                        System.out.println("Wrong OTP. Order cancelled.");
                    }
                } else {
                    System.out.println("Incorrect bill amount entered. Order cancelled.");
                }
                break;

            default:
                System.out.println("Invalid payment method.");
                break;
        }

        scanner.close();  // Close the scanner to avoid resource leak
    }
}
