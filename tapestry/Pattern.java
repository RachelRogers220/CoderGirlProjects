package PatternMaker;

import java.util.ArrayList;
import java.util.Iterator;

public class Pattern
{
    //has-a
    //ArrayList<Stitch> stitches
    //double jam rate
    //private boolean needleJam = (Math.random() < this.jamRate);

    protected ArrayList<Stitch> stitches = new ArrayList();
    protected double jamRate;
    protected boolean needleJam = false;
    Iterator iter = stitches.iterator();


    //behaviors
    //pattern()
    public Pattern()
    {

    }

    public void SewPattern()
    {

        if ((Math.random() < this.jamRate))
        {
            for (int i = 0; i < (stitches.size()/2); i++)
            {
                Stitch a = stitches.get(i);
                a.sew();
            }
        }
        else
        {
            for (int i = 0; i < stitches.size(); i++) {
                Stitch a = stitches.get(i);
                a.sew();
            }
        }

    }

}
