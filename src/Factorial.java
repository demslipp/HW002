import java.math.BigInteger;

public class Factorial{

    BigInteger bigValue=BigInteger.valueOf(1);

    public BigInteger CalculateFactorial(int value){
        for (int i=2; i<=value; i++){
            bigValue=bigValue.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bigValue);
        return bigValue;
    }

}
