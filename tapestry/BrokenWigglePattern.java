package PatternMaker;

public class BrokenWigglePattern extends Pattern
{
    public BrokenWigglePattern()
    {
        this.jamRate = .4;
        SmallCrossStitch a = new SmallCrossStitch();
        LargeCrossStitch b = new LargeCrossStitch();
        for (int i = 0; i < 5; i++) {
            stitches.add(a);
            stitches.add(b);
        }
    }
}
