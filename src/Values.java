import java.util.Scanner;

public class Values{

    double[] array=new double[2];
    public double maximum;
    public double minimum;
    boolean flag=false;
    Scanner scanner=new Scanner (System.in);
    int j=0;

    public String DoubleValues (){

        for (int i=0; i<array.length; i++){
            if (scanner.nextDouble ()>0){

                if (! flag){
                    minimum=array[i];
                    maximum=array[i];
                    flag=true;
                }
                array[j]=scanner.nextDouble ();
                j++;
            }
            if (array[i]>maximum){
                maximum=array[i];
            }
            if (array[i]<minimum){
                minimum=array[i];
            }

            System.out.println (array[i]);
        }

        return "Min: "+minimum+" Max: "+maximum;

    }
}


