public class Print1to100withoutLoops {

    private static void printNumber(int number, int max) {
        System.out.println(number);
        number = number + 1;
        if(number <= max) {
            printNumber(number, max);
        }

    }

    public static void main(String[] args) {
        int max=10;
        printNumber(1, max);
    }
}
