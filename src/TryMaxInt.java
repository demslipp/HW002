public class TryMaxInt{
    private int maxInt;

    public TryMaxInt(int maxInt){
        this.maxInt=maxInt;
    }

    public int WhatsHapened(){
        this.maxInt=this.maxInt * 2;
        System.out.println(maxInt);
        return this.maxInt;
    }
}
