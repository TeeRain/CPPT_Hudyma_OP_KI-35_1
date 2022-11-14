public class HexNumbers implements Numbers
{
    private String number;
    private int value;
    public String toString(){

        return Integer.toString(value);
    }

    public HexNumbers(String number, int value) {
        this.number = number;
        this.value = value;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getDecValue() {
        return value;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Number in hex: " + number + ",\tvalue in dec: " + value);
    }
}
