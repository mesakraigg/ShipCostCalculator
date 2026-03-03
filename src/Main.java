import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the item price: $");
        double itemPrice;
        double shippingCost;

        itemPrice = input.nextDouble();

        if (itemPrice >= 100) {
            shippingCost = 0.0;
        }else {
            shippingCost = itemPrice * 0.02;
        }
        double totalPrice = itemPrice + shippingCost;

        System.out.println("the shipping cost is: $" + shippingCost);
        System.out.printf("The total price is: $%.2f%n", totalPrice);
    }
}