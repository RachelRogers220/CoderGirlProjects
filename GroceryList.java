import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String item1;
        String item2;
        String item3;

        int quantity1;
        int quantity2;
        int quantity3;

        float price1;
        float price2;
        float price3;

        float cost1;
        float cost2;
        float cost3;

        float totalCost;

        out.println("Please list three items on your grocery shopping list.");

        out.println("Item 1? ");
        item1 = keyboard.nextLine();
        out.println();

        out.println("Item 2? ");
        item2 = keyboard.nextLine();
        out.println();

        out.println("Item 3? ");
        item3 = keyboard.nextLine();
        out.println();

        out.println("Now, please enter the quantity of each item.");

        out.println("How many " + item1 + "?");
        quantity1 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println();

        out.println("How many " + item2 + "?");
        quantity2 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println();

        out.println("How many " + item3 + "?");
        quantity3 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println();

        out.println("Now, please enter the price of each item.");

        out.println("How much does one " + item1 + " cost?");
        price1 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println();

        out.println("How much does one " + item2 + " cost?");
        price2 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println();

        out.println("How much does one " + item3 + " cost?");
        price3 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println();

        out.println("Calculating your grocery bill.");

        cost1 = quantity1 * price1;
        cost2 = quantity2 * price2;
        cost3 = quantity3 * price3;

        totalCost = cost1 + cost2 + cost3;

        out.println("Your total cost is " + totalCost);


    }
}
