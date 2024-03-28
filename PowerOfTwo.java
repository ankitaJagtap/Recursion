/**
 * PowerOfTwo
 */
public class PowerOfTwo {

    public static int powerOf(int n) {
        if (n == 0) {
            return 1;
        }
        return (2 * powerOf(n - 1));

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(powerOf(n));
    }
}