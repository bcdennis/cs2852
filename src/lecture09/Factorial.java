/**
 * CS2852
 * Spring 2016
 * Week 5
 */
package lecture09;


/**
 * Factorial Demo Code
 *
 * Solving the problem of factorial for n is simply solving for n-1 and then multiplying by n.
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(loop(5));
        System.out.println(recursive(5));
    }

    /**
     * A looped implementation of factorial.
     * @param n the value to calculate factorial for.
     * @return the factorial of n.
     */
    public static int loop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result*i;
        }

        return result;
    }


    /**
     * A recursive implementation of factorial.
     * @param n the value to calculate factorial for.
     * @return the factorial of n.
     */
    public static int recursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n* recursive(n-1);
        }
    }
}
