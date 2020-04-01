public class Main{

    public static void main(String[] args){

        Notation notation=new Notation();
        notation.ChangeNumberSystem(18);

        Angle angle=new Angle();
        angle.NormalizeUsingPercent(-10);
        angle.NormalizeUsingMath(-10);

        ThreeInt threeInt=new ThreeInt();
        threeInt.FoundMax(14, 12, 18);
        System.out.println(threeInt.FoundMaxUsingTernary(14, 12, 18));
        threeInt.FoundMaxMath(14, 12, 18);

        Values values=new Values();
        values.DoubleValues();

        TryMaxInt tryMaxInt=new TryMaxInt(Integer.MAX_VALUE);
        tryMaxInt.WhatsHapened();
        System.out.println("Since adding anything to Integer.MAX_VALUE will result in overflow, we end up with a negative number, because the sign bit gets flipped as part of the overflow.\n");

        Factorial factorial=new Factorial();
        System.out.println(factorial.CalculateFactorial(1000)+"\n");

        SubStrings subStrings=new SubStrings();
        subStrings.PrintAllSubStrings("Hello Java!            Z\n");

        StringComparison stringComparison=new StringComparison();
        String first="This is the line for test";
        String second=new String("This is the line for test");
        System.out.println(stringComparison.MakeAComparison(first, second));

        RandomString randomString=new RandomString();
        randomString.CreateNewString();

        Lottery lottery=new Lottery();
        lottery.ImLucky();

        MagicSquare magicSquare=new MagicSquare();
        magicSquare.Detect();

    }
}
