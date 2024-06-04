package exercises.Chapter_2;

public class SelfCheck {
    public static void main(String[] args) {
        primeNumbers();
    }

    public static void primeNumbers() {
        int i, j;
        boolean isPrime;

        for (i = 2; i <= 100; i++) {
            isPrime = true;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " is primitive.");
            }
        }
    }
}
