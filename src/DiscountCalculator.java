public class DiscountCalculator {
    public static void main(String[] args) {
        int numBags = 10;
        double pricePerBag = 500.0;
        double discountRate = 0.05;

        // Calculate the total cost without discount
        double totalCost = numBags * pricePerBag;

        // Calculate the discount amount
        double discountAmount = totalCost * discountRate;

        // Calculate the final price after discount
        double finalPrice = totalCost - discountAmount;

        System.out.printf("The buyer paid %.2f naira.\n", finalPrice);
    }
}