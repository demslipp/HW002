import java.math.BigInteger;

public class Main{

    public static void main (String[] args){

        ThreeInt threeInt=new ThreeInt ();
        System.out.println (threeInt.FoundMax (14,12,18));
        System.out.println (threeInt.FoundMaxUsingTernary (14, 12, 18));
        System.out.println (threeInt.FoundMaxMath (14, 12, 18));

        Notation notation = new Notation ();
        System.out.println (notation.ChangeNumberSystem (18));

        Values values=new Values ();
        System.out.println ("\nType values here:");
        System.out.println (values.DoubleValues ());


    }
}
