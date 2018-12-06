package PatternMaker;

public class CrossStitchWigglePattern extends Pattern
{
    //has-a
    //ArrayList<Stitch> stitches (inherited from Pattern)
    //double jam rate (inherited from Pattern)

    //behavior
    //pattern() (inherited from Pattern)
    //creates stitches and adds them to the array list
    public CrossStitchWigglePattern()
    {
        jamRate = .05;
        SmallCrossStitch a = new SmallCrossStitch();
        LargeCrossStitch b = new LargeCrossStitch();
        for (int i = 0; i < 5; i++)
        {
            stitches.add(a);
            stitches.add(b);
        }
    }

}



