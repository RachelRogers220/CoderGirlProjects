import java.util.Scanner;
import static java.lang.System.out;


public class SandwichShop {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int veggiesGoal = 50;
        int burgersGoal = 250;
        int subsGoal = 180;
        int soupGoal = 70;

        int veggies;
        int burgers;
        int subs;
        int soup;

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is " + veggiesGoal + "\nHow"
                + " many veggie sandwiches were sold today?");
        veggies = keyboard.nextInt();
        if (veggies >= veggiesGoal)
        {
            out.println("\nMade goal for veggies!");
        }
        else
        {
            out.println("Fell short.");
        }

        out.println("The sales goal for burgers is " + burgersGoal +"\nHow" +
                " many burgers were sold today?");
        burgers = keyboard.nextInt();
        if (burgers >= burgersGoal)
        {
            out.println("\nMade goal for burgers!");
        }
        else
        {
            out.println("Fell short.");
        }

        out.println("The sales goal for subs is " + subsGoal + "\nHow" +
                " many subs were sold today?");
        subs = keyboard.nextInt();
        if (subs >= subsGoal)
        {
            out.println("Made goal for subs!");
        }
        else
        {
            out.println("Fell short.");
        }

        out.println("The sales goal for soups is " + soupGoal + "\nHow" +
                " many soups were sold today?");
        soup = keyboard.nextInt();
        if (soup >= soupGoal)
        {
            out.println("Made goal for soup!\n");
        }
        else
        {
            out.println("Fell short.");
        }

        if ((veggies>=veggiesGoal) && (burgers>=burgersGoal) &&
                (subs>=subsGoal) && (soup>= soupGoal))
        {
            out.println("Made goal for everything!");
        }
    }

}
