package PatternMaker;

public class ZigZagLinesPattern extends Pattern
{
    public ZigZagLinesPattern()
    {
        this.jamRate = 0;
        ZigZagStitch a = new ZigZagStitch();
        FillStitch b = new FillStitch();
        for (int i = 0; i < 2; i++)
        {
            stitches.add(a);
            stitches.add(a);
            stitches.add(a);
            stitches.add(b);
            stitches.add(b);
            stitches.add(b);
        }

    }
}
