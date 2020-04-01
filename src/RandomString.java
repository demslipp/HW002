import java.util.Random;

public class RandomString{


    public String CreateNewString (){//int count){
        String result="";

        //for (int i=0; i<count; i++){
            Random random=new Random ();
            long numeric =random.nextLong ();
            String str = Long.toString(numeric, 36);
            result=result+str;
        //}
        return result;
    }
}
