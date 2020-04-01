import java.util.Random;

public class RandomString{


    public String CreateNewString(){
        Random random=new Random();
        long numeric=random.nextLong();
        String str=Long.toString(numeric, 36);
        System.out.println(str);
        return str;
    }
}
