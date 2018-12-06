package PatternMaker;

public class BlockyBaublePattern extends Pattern
{
    public BlockyBaublePattern()
    {
        jamRate = .10;
        BlockStitch a = new BlockStitch();
        ShortLineStitch b = new ShortLineStitch();
        CircleStitch c = new CircleStitch();
        for (int i = 0; i < 3; i++)
        {
            stitches.add(a);
            stitches.add(b);
            stitches.add(b);
            stitches.add(c);
            stitches.add(b);
            stitches.add(b);
        }
    }
}
