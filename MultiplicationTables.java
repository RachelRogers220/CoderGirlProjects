import java.util.Scanner;
public class MultiplicationTables
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Multiplication Tables\n\nHow large would you like to see them?");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();

        while ((size < 0) || (size > 20))
        {
            System.out.println("Please enter a number between 0 and 20.");
            size = keyboard.nextInt();
        }
        for (int counter = 0; counter <= size; counter++)
        {
            for (int counter2 = 0; counter2 <= size; counter2++)
            {
                System.out.println(counter + " * " + counter2 + " = " + (counter * counter2));
            }
        }

    }
}
