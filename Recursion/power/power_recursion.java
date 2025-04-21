//The time complexity is O(log N)
//The space complexity is O(log n) because of the recursive call stack depth.


package Recursion.power;

class Solution {
    private double power(double x, long n) {
        if (n == 0) return 1.0; // when power is 0
        if (n == 1) return x;   // when power is 1

        if (n % 2 == 0) {   //power is even
            return power(x * x, n / 2);
        }
        return x * power(x, n - 1); // when power is odd
    }
    
    public double myPow(double x, int n) {

        if (n < 0) {
            return 1.0 / power(x, -n);
        }
        return power(x, n);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        double x = 2.0;
        int n = 10;

        // Calculate x raised to n
        double result = sol.myPow(x, n);

        // Print the result
        System.out.println(x + "^" + n + " = " + result);
    }
}