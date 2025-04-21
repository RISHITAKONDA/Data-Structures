//Brute Force:
//tc: Time Complexity: O(n)
//sc: Space Complexity: O(1)

package Recursion.power;

public class power_brute {

        public double myPow(double x, int n) {

            if (n == 0 || x == 1.0) return 1;

            long temp = n; // to avoid integer overflow

            // Handle negative exponents
            if (n < 0) {
                x = 1 / x;
                temp = -1L * n;
            }

            double ans = 1;

            for (long i = 0; i < temp; i++) {
                // Multiply ans by x for n times
                ans *= x;
            }
            return ans;
        }
    }

    class Main {
        public static void main(String[] args) {
            Solution sol = new Solution();
            // Output: 1024.0000
            System.out.printf("%.4f\n", sol.myPow(2.0000, 10));
            // Output: 0.2500
            System.out.printf("%.4f\n", sol.myPow(2.0000, -2));
        }
    }



