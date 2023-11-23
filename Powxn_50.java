public class Powxn_50 {
    // Time Complexity: O(n)
    public static double myPow(double x, int n) {
        double res = 1;
        if (n < 0) {
            for (int i = 0; i < Math.abs(n); i++) {
                res *= x;
            }
            return 1/res;
        }
        else {
            for (int i = 0; i < n; i++) {
                res *= x;
            }
            return res;
        }
    }

    public static double binaryRecursive(double x, long n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1.0 / binaryRecursive(x, -1 * n);
        }
        if (n % 2 == 1) {
            return x * binaryRecursive(x * x, (n - 1) / 2);
        }
        else {
            return binaryRecursive(x * x, n / 2);
        }
    }
    public static double myPowBinaryRecursive(double x, int n) {
        return binaryRecursive(x, (long) n);
        // Time Complexity: O(log n)
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x, n));
        System.out.println(myPowBinaryRecursive(x, n));
        double x1 = 2.10000;
        int n1 = 3;
        System.out.println(myPow(x1, n1));
        System.out.println(myPowBinaryRecursive(x1, n1));
        double x2 = 2.00000;
        int n2 = -2;
        System.out.println(myPow(x2, n2));
        System.out.println(myPowBinaryRecursive(x2, n2));
        double x3 = 2.00000;
        int n3 = -2147483648;
        System.out.println(myPow(x3, n3));
        System.out.println(myPowBinaryRecursive(x3, n3));
    }
}
