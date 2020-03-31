public class ThreeInt{

    public ThreeInt (){
    }


    public int FoundMaxUsingTernary (int first, int second, int third){
        return (first>second && first>third) ? first : (first<second && second>third) ? second : third;
    }

    public int FoundMax (int first, int second, int third){
        int result=first;
        if (first>second && first>third){
            result=first;
        } else if (first<second && second>third){
            result=second;
        } else result=third;
        return result;
    }

    public int FoundMaxMath (int first, int second, int third){
        int ifFirst=Math.max (first, second);
        int ifSecond=Math.max (second, third);
        return Math.max (ifFirst, ifSecond);
    }

}
