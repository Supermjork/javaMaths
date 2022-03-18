public class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public static boolean isEven(int value) {
        return (value % 2 == 0);
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public static boolean isPrime(int value) {
        for(int i = 2; i < value; i++) {
            if(value % i == 0) {
                return false;
            }
            break;
        }
        return true;
    }

    public boolean isEven() {
        return (value % 2 == 0);
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        for(int i = 2; i < value; i++) {
            if(value % i == 0) {
                return false;
            }
            break;
        }
        return true;
    }

    public boolean equals(int value) {
        return (this.value == value);
    }

    public boolean equals(MyInteger value) {
        return (this.value == value.value);
    }

    public static void main(String[] args) {
        MyInteger int0 = new MyInteger(6);
        MyInteger int1 = new MyInteger(4);

        System.out.printf("The number %d, Prime: %b, Odd: %b, Even: %b", int0.getValue(), int0.isPrime(), int0.isOdd(), int0.isEven());
    }
}