public class Angle{

    public void NormalizeUsingPercent(int angle){
        System.out.println(angle % 360); // I'm not sure if this is right but i did it as I understood
    }

    public void NormalizeUsingMath(int angle){
        System.out.println(Math.floorMod(angle, 360));
    }
}
