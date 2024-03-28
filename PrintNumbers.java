/**
 * PrintNumbers
 */
public class PrintNumbers {

    public static void printNumbers(int n, String[] array) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        n = n / 10;
        printNumbers(n, array);
        System.out.print(array[digit] + " ");
    }

    public static void main(String[] args) {
        int num = 695421875;
        String array[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        printNumbers(num, array);
    }
}