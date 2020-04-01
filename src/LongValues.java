/*import java.util.Scanner;

public class LongValues{
    public LongValues (){
    }

    Scanner scanner=new Scanner (System.in);

    public String Calculator (String first, String second){
        int sum;
        int difference;
        int product;
        int quotient;
        int remainder;
        sum=Math.abs (Integer.parseInt (first))+Math.abs (Integer.parseInt (second));
        difference=Math.abs (Integer.parseInt (first)-Integer.parseInt (second));
        product=Integer.parseInt (first) * Integer.parseInt (second);
        quotient=Integer.parseInt (first) / Integer.parseInt (second);
        remainder=Integer.parseInt (first) % Integer.parseInt (second);
        return "Sum: "+sum+"\nDif: "+difference+"\nProd: "+product+"\nQuot: "+quotient+"\nRem: "+remainder;
    }

    public void Result (String first, String second){
        boolean tested=true;
        for (int i=0; i<=1; i++){
            if (i == 0){
                first=scanner.toString ();
            } else {
                second=scanner.toString ();
            }
        }

        Integer preTest=Integer.MAX_VALUE;
        String test=preTest.toString ();

        if ((first.length ()<test.length ()) && second.length ()<test.length ()){
            Result (first, second);
        } else if ((first.length () == test.length ()) && second.length () == test.length ()){
            for (int i=0; i<=first.length (); i++){
                if ((first.charAt (i)>=test.charAt (i)) || (second.charAt (i)>=second.charAt (i))){
                    tested=false;
                    break;
                }
            }
                if (tested){
                    Result (first, second);
                } else {}
            }
        } //else{}


    }

    public String Sum (){

    }

    public String Difference (){
    }

    public String Product (){
    }

    public String Quotient (){
    }

    public String Remainder (){
    }
}*/