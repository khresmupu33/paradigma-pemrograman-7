/**
 * Nama: Khresna Mulia Putra
 * NRP: 2572032
 */
public enum Radix {
    Binary(2),Octal(8),HexaDecimal(16),Decimal(10);
    private final int value;
    Radix(int value){
        this.value=value;
    }
    public int getValue() {
        return value;
    }
}
