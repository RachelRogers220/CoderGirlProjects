package PatternMaker;

public class TapestryController
{
    public static void PrintPattern(Pattern a, boolean wider)
    {
        if (wider)
        {
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 8; j++)
                {
                    a.SewPattern();
                }
                System.out.print("\n");
            }
            System.out.print("\n\n\n");
        } else {
            for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 6; j++)
                {
                    a.SewPattern();
                }
                System.out.print("\n");
            }
            System.out.print("\n\n\n");
        }

    }
    public static void main(String[] args)
    {
        CrossStitchWigglePattern a = new CrossStitchWigglePattern();
        PrintPattern(a, true);
        ZigZagLinesPattern b = new ZigZagLinesPattern();
        PrintPattern(b,true);
        BaublePattern c = new BaublePattern();
        PrintPattern(c,true);
        BlockyBaublePattern d = new BlockyBaublePattern();
        PrintPattern(d,true);
        BrokenWigglePattern e = new BrokenWigglePattern();
        PrintPattern(e,true);

        PrintPattern(a,false);
        PrintPattern(b,false);
        PrintPattern(c,false);
        PrintPattern(d,false);
        PrintPattern(e,false);



    }

}
