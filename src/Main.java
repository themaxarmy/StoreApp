import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Scanner keyboardString = new Scanner(System.in);
        String tempNumber;
        String tempName;
        double tempPrice;


        System.out.println("Enter the stock number: ");
        tempNumber = keyboardString.nextLine();
        System.out.println("Enter the stock name: ");
        tempName = keyboardString.nextLine();
        System.out.println("Enter the stock price: ");
        tempPrice = keyboardString.nextDouble();

        StockItem item1 = new StockItem(tempNumber, tempName, tempPrice);

        item1.increaseTotalStock(5);

        System.out.println(item1.getTotalStock());

        System.out.println(item1.calculateTotalPrice());
    }
}