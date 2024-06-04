package exercises.Chapter_3;

import java.io.IOException;

public class SelfCheck {
    public static void main(String[] args) throws IOException {
        spaceCount();
        cycle_1000();
        geometricProgression();
        registerChange();
    }

    public static void spaceCount() throws IOException {
        int spaceCount = 0;
        char ch;
        for (; ; ) {
            ch = (char) System.in.read();
            if (ch == ' ') spaceCount++;
            if (ch == '.') break;
        }
        System.out.println("There are " + spaceCount + " spaces");
    }

    public static void cycle_1000() {
        for (int i = 1000; i >= 0; i -= 2) {
            System.out.println("i equals to: " + i);
        }
    }

    public static void geometricProgression() {
        int i = 1;
        for (; i < 5000; i *= 2) {
            System.out.println("i equals to " + i);
        }
    }

    public static void registerChange() throws IOException {
        char ch;
        int changes = 0;
        System.out.println("To stop execution enter dot symbol");
        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.println(ch);
            }
        } while (ch != '.');
        System.out.println("Register changed " + changes + " times");
    }
}
