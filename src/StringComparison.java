public class StringComparison{

    public boolean MakeAComparison(String s1, String s2){
        return s1 == s2.intern();
    }
}
