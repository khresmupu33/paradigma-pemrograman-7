/**
 * Nama: Khresna Mulia Putra
 * NRP: 2572032
 */
public class ConverterCalculator {
    private String coreConverterFromDecimal(int number, Radix radix) {
        if (number == 0) return "0";
        String result = "";
        int count = 0;
        int groupSize = 0;
        int base = radix.getValue();
        if (radix == Radix.Binary) groupSize = 4;
        else if (radix == Radix.Octal) groupSize = 3;
        else if (radix == Radix.HexaDecimal) groupSize = 4;

        char[] chars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (number > 0) {
            if (count == groupSize && groupSize > 0) {
                result = " " + result;
                count = 0;
            }
            result = chars[number % base] + result;
            number = number / base;
            count++;
        }

        return result;
    }

    private int coreConverterToDecimal(String numberInString, Radix radix) {
        int result = 0;
        int base = radix.getValue();
        int power = 1;
        numberInString = numberInString.toUpperCase();
        for (int i = numberInString.length() - 1; i >= 0; i--) {
            char c = numberInString.charAt(i);
            int val = 0;

            if (c >= '0' && c <= '9') {
                val = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                val = c - 'A' + 10;
            }

            result += val * power;
            power *= base;
        }
        return result;
    }
    public String toBinary(int number) {return coreConverterFromDecimal(number, Radix.Binary);}
    public String toOctal(int number) {return coreConverterFromDecimal(number, Radix.Octal);}
    public String toHexaDecimal(int number) {return coreConverterFromDecimal(number, Radix.HexaDecimal);}
    public int toDecimal(String number, Radix from) {return coreConverterToDecimal(number, from);}
}