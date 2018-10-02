public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public static double divideNumbers(double dividend, double divisor) {
        /* Do some casual division ... Super easy ... Shouldn't be any problems here */
        double res = dividend / divisor;
        /* Return the DEFINITELY CORRECT result */
        return res;
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    public static double raiseToPower(int base, int exp) {
        /* Set initial result to be just the number */
        int res = base;

        /* Determine if the exponent is negative */
        boolean isNegative = false;
        if (exp < 0) {
            exp = -exp;
            isNegative = true;
        }

        /* Multiply the result by the base exp times
            Ex: base = 2, exp = 2
               --> res = 2, then res = 4 */
        for (int i = 1; i < exp; i++) {
           res *= base; 
        }

        /* If it's a negative exponent, we should invert it! */
        if (isNegative) {
            double dividedRes = divideNumbers(1, res);
            return dividedRes;
        }
        /* Otherwise, we are safe to just return the result */
        else {
            return res;
        }
    }    
}