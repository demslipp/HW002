import java.util.Scanner;

public class Values{

    double[] array=new double[2];
    public double maximum;
    public double minimum;
    boolean flag=false;
    Scanner scanner=new Scanner (System.in);
    int j=0;

    public String DoubleValues (){
        double max = Math.nextDown(Double.MAX_VALUE);
        double min = Math.nextUp(0.0);

        return "Min: "+min+" Max: "+max;

    }
}


