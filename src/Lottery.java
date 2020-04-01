import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery{

    public void ImLucky (){
        List<Integer> list=new ArrayList<> ();
        for (int i=0; i<49; i++){
            list.add (i+1);
        }
        int[] array=new int[6];
        Random random=new Random ();
        int j=0;
        for (int i=0; i<6; i++){
            int index=random.nextInt (49);
            array[i]=list.get (index);
            list.remove (index);
            System.out.print (array[i]+" ");
        }
        System.out.println ("Truncated List: ");
        for (int i=0; i<list.size (); i++){
            System.out.print (list.get (i)+", ");
        }
    }
}
