package week03;
/**
 * Class with recursive methods which repeats themselves until they reach
 * a base value where they stop.
 * @author Ngaaia Toabwa
 */

public class RecursiveApp{

    /**
     * Count and return the number of digits it contains.
     * method is repeated with a new long value everytime by dividing
     * the current value with 10.
     *@return the number of digits in a long.
     *@param n as input.
     */
    public static long digits(long n){
        
        if(n<10){
            return 1;
        }
        return 1+digits(n/10); 
    }

    /**
     *Calculate and return the sum of digits a long contains.
     *Remainder of the long after division by 10 is summed up.
     *Then method is repeated with dividing the current value with 10
     *@return the sum of digits in the long input.
     *@param n as long input.
     */
    public static long sumOfDigits(long n){
        if(Math.abs(n)<10){
            return n;
        }
        
        return (n%10) + sumOfDigits(n/10);
 
    }

    
    

    
}
