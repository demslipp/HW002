import java.math.BigInteger;

public class Notation{

    public Notation(){
    }

    public String ChangeNumberSystem(int number){
        String numStr=""+number;
        BigInteger a=new BigInteger(numStr);
        String binary=a.toString(2);
        String octal=a.toString(8);
        String hexadecimal=a.toString(16);
        String result="\nDecimal: "+numStr+"\nBinary: "+binary+"\nOctal: "+octal+"\nHexadecimal: "+hexadecimal;
        System.out.println(result+"\n");
        return result;
    }


}
