public class ThreeInt{

    public ThreeInt(){
    }


    public int FoundMaxUsingTernary(int first, int second, int third){
        return (first>second && first>third) ? first : (first<second && second>third) ? second : third;
    }

    public void FoundMax(int first, int second, int third){
        int result;
        if(first>second && first>third){
            result=first;
        } else if(first<second && second>third){
            result=second;
        } else result=third;
        System.out.println(result);
    }

    public void FoundMaxMath(int first, int second, int third){
        int ifFirst=Math.max(first, second);
        int ifSecond=Math.max(second, third);
        System.out.println(Math.max(ifFirst, ifSecond));
    }

}
