import java.util.*;
public class Power{
    public static void main(String[] args) {
        Solution sol = new Solution();
        double output = sol.myPow(2.0, -3);
        System.out.println("Result: " + output);  
    }
}
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (x == 1.0) return 1;

        int sign = n < 0 ? -1 : 1;
        long N = (long) n;

        if (N < 0) {
            N = -1 * N;
        }

        double result = 1;

        while (N > 0) {
            if (N % 2 == 1) {
                result = result * x;
                N--;
            } else {
                x = x * x;
                N = N / 2;
            }
        }

        if (sign < 0) {
            return 1 / result;
        }

        return result;
    }
}
//or otherwise use Math.pow