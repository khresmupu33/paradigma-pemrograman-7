/**
 * Nama: Khresna Mulia Putra
 * NRP: 2572032
 */
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        ConverterCalculator converterCalculator = new ConverterCalculator();
        while (loop) {
            System.out.println("=====================");
            System.out.println("[1] Convert to Binary");
            System.out.println("[2] Convert to Octal");
            System.out.println("[3] Convert to Hexadecimal");
            System.out.println("[4] Convert to Decimal");
            System.out.println("[5] Exit");
            System.out.println("=====================");
            System.out.print("Choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Input number: ");
                int number = input.nextInt();
                System.out.println("Number " + number + " in binary is " + converterCalculator.toBinary(number));
            }
            else if (choice == 2) {
                System.out.print("Input number: ");
                int number = input.nextInt();
                System.out.println("Number " + number + " in octal is " + converterCalculator.toOctal(number));
            }
            else if (choice == 3) {
                System.out.print("Input number: ");
                int number = input.nextInt();
                System.out.println("Number " + number + " in hexadecimal is " + converterCalculator.toHexaDecimal(number));
            }
            else if (choice == 4) {
                System.out.print("Input radix: ");
                int radixInput = input.nextInt();

                Radix from = Radix.Decimal;
                if (radixInput == 2) from = Radix.Binary;
                else if (radixInput == 8) from = Radix.Octal;
                else if (radixInput == 16) from = Radix.HexaDecimal;

                System.out.print("Input number: ");
                String numStr = input.next();

                System.out.println(numStr + " in decimal is " + converterCalculator.toDecimal(numStr, from));
            }
            else if (choice == 5) {
                loop = false;
            }
        }
        input.close();
    }
}