package exercises;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
        char choice, ignore;
        do {
            System.out.println("Reference:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while");
            System.out.println(" 6. break");
            System.out.println(" 7. continue\n");
            System.out.print("Make your choice: ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '7');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("Operator if:\n");
                System.out.println("if(statement) instruction;");
                System.out.println("else instruction;");
                break;
            case '2':
                System.out.println("Operator switch:\n");
                System.out.println("switch(expression) {");
                System.out.println(" case constant:");
                System.out.println(" sequence of statements");
                System.out.println(" break;");
                System.out.println(" // ... ");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Operator for:\n");
                System.out.print("for(initialization; condition; iteration)");
                System.out.println(" instruction;");
                break;
            case '4':
                System.out.println("Operator while:\n");
                System.out.println("while(condition) instruction;");
                break;
            case '5':
                System.out.println("Operator do-while:\n");
                System.out.println("do {");
                System.out.println(" instruction;");
                System.out.println("} while (condition};");
            case '6':
                System.out.println("Operator break:\n");
                System.out.println("break; or break pointer;");
            case '7':
                System.out.println("Operator continue:\n");
                System.out.println("continue; or continue pointer;");
            default:
                System.out.print("Request not found.");
        }
    }
}
