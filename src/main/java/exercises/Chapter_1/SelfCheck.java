package exercises.Chapter_1;

public class SelfCheck {
    public static void main(String[] args) {
        System.out.println("Your weight on the Moon is " + moonWeight(96.7));
        inchesToMeters();
    }
    public static double moonWeight(double earthWeight) {
        return earthWeight*0.17;
    }
    public static void inchesToMeters() {
        double inches, meters;
        int counter;

        counter = 0;

        for (inches = 1; inches <=144; inches++) {
            meters = inches / 39.37;
            System.out.println(inches + " inches corresponds to " + meters + " meters;");
            counter++;

            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
