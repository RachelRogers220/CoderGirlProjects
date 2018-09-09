public class Temperatures
{
    public static void main(String[] args)
    {
        int temp[][] = new int[7][4];
        temp[0][0] = 68;
        temp[0][1] = 76;
        temp[0][2] = 73;
        temp[0][3] = 64;
        temp[1][0] = 70;
        temp[1][1] = 76;
        temp[1][2] = 72;
        temp[1][3] = 65;
        temp[2][0] = 76;
        temp[2][1] = 87;
        temp[2][2] = 81;
        temp[2][3] = 69;
        temp[3][0] = 70;
        temp[3][1] = 84;
        temp[3][2] = 78;
        temp[3][3] = 68;
        temp[4][0] = 68;
        temp[4][1] = 82;
        temp[4][2] = 76;
        temp[4][3] = 70;
        temp[5][0] = 71;
        temp[5][1] = 75;
        temp[5][2] = 73;
        temp[5][3] = 74;
        temp[6][0] = 75;
        temp[6][1] = 83;
        temp[6][2] = 77;
        temp[6][3] = 72;
        String days[] = {"Sun: ", "Mon: ", "Tue: ", "Wed: ", "Thu: ", "Fri: ", "Sat: "};
        String times[] ={"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};

        System.out.println("Temperature Calculator\n");
        System.out.println("The data provided are:");
        for (int j = 0; j<4; j++)
        {
            System.out.print(times[j]);
            for (int i = 0; i < 7; i++)
            {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\n\nBased on that data, the following are the average temperatures for the week. \n");
        int average = 0;
        for (int j = 0; j < 7; j++)
        {
            System.out.print(days[j]);
            for (int i = 0; i < 4; i++)
            {
              average += temp[j][i];
            }
            average /= 4;
            System.out.println(average);
            average = 0;
        }
        System.out.println();
        for (int j = 0; j < 4; j++)
        {
            System.out.print(times[j]);
            for (int i = 0; i < 7; i++)
            {
                average += temp[i][j];
            }
            average /= 7;
            System.out.println(average);
            average = 0;
        }
        System.out.print("\nThe final average temperature for the week was: ");

        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                average += temp[i][j];
            }
        }
        average /= 28;
        System.out.println(average);




    }
}
