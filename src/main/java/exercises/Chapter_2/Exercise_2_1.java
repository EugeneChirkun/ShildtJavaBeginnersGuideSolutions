package exercises.Chapter_2;

public class Exercise_2_1 {
    public static void main(String[] args) {
        System.out.println("Distance to source of lightning is " + soundOfThunder(7.2) + " feet");
        System.out.println("Distance to object returning echo is " + soundOfThunder(12) + " feet");
    }
    public static double soundOfThunder(double time) {
        return time*1100;
    }

    public static double distanceToObjByEcho(double time) {
        return (time*1100)/2;
    }
}
