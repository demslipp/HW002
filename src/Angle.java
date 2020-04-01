public class Angle{

    public int NormalizeUsingPercent (int angle){
        return angle % 360; // I'm not sure if this is right but i did it as I understood
    }

    public int NormalizeUsingMath (int angle){
        return Math.floorMod (angle,360);
    }
}
