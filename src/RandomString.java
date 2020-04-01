import java.util.Random;

public class RandomString{


    public String CreateNewString (){
        String result="";

        Random random=new Random ();
        long numeric=random.nextLong ();
        String str=Long.toString (numeric, 36);
        result=result+str;
        return result;
    }
}
