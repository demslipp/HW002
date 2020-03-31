import java.util.Scanner;

public class Values{
    public Values (){
    }

    double array[]=new double[2];
    public double maximum;
    public double minimum;
    boolean flag=false;
    Scanner scanner=new Scanner (System.in);

    public String DoubleValues (){

         for (int i=0; i<array.length; i++){
              if (scanner.nextDouble ()>0){

                   if (! flag){
                        minimum=array[i];
                        maximum=array[i];
                        flag=true;
                   }
                   array[i]=scanner.nextDouble();
              }
         }
         for (int i=0; i<array.length; i++){
              if (array[i]>maximum){
                   maximum=array[i];
              }
              if (array[i]<minimum){
                   minimum=array[i];
              }
         }
         for (int i=0; i<array.length; i++){
              System.out.println (array[i]);
         }

         String result="Min: "+minimum+" Max: "+maximum;
         return result;

    }
}


