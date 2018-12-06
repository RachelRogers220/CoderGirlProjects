package PatternMaker;

public class BaublePattern extends Pattern
{
    public BaublePattern()
    {
        jamRate = 0;
        ShortLineStitch a = new ShortLineStitch();
        CircleStitch b = new CircleStitch();
        for (int i = 0; i < 5; i++)
        {
            stitches.add(a);
            stitches.add(a);
            stitches.add(b);
        }
    }
}
