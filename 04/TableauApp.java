package week04;

import java.util.*;

/**
 * Skeleton code for an array based implementation of Young's tableau.
 *
 * @author Iain Hewson
 */
public class TableauApp {
    
    /**true if a tableau given is truelly a tableau.
     * false if it is not a tableau.
     * used in methods which tests a tableau.
     *
     */
    public static boolean isTableau;

    /**
     * The main method is just used for testing.
     *
     * @param args command line arguments are not used.
     */
    public static void main(String[] args) {
        final int[][] valid = {{1, 4, 5, 10, 11}, {2, 6, 8}, {3, 9, 12}, {7}};
        System.out.println(TableauApp.toString(valid));
    }

    /**
     * Determines whether the array passed to it is a valid tableau or not.
     *
     * @param t a two-dimensional array to test for tableau-ness.
     *
     * @return true if the parameter is a valid tableau, otherwise false
     */
    public static boolean isTableau(int[][] t){
        return rowLengthsDecrease(t) && rowValuesIncrease(t)
            && columnValuesIncrease(t) && isSetOf1toN(t);
    }

    /**
     *  Returns a string representation of an array based tableau.
     *
     * @param t a two-dimensional array which represents a tableau.
     *
     * @return a string representation of an array based tableau.
     */
    public static String toString(int[][] t) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                result.append(String.format("%-4s", t[i][j]));
            }
            if (i < t.length-1) {
                result.append("\n");
            }
        }
        return result.toString();
    }


    /**
     * Return true if no row is longer than a preceding row
     * otherwise false.
     *
     * @param t a two-dimensional array which represents a tableau.
     *
     * @return true if no row is longer than the one above it, otherwise false.
     */
    public static boolean rowLengthsDecrease(int[][] t){
        for(int i=0; i<t.length-1; i++){
            if(t[i].length<t[i+1].length){
                return false;
            }
        }
        return true;
    }

    /**
     * Return true if the integers are increasing from left to right
     * otherwise false.
     *
     * @param t a two-dimensional array which represents a tableau.
     *
     * @return true if integers are increasing from left to right.
     */

    public static boolean rowValuesIncrease(int[][] t){
        for(int i=0; i<t.length; i++){
            for(int j=0; j<t[i].length-1; j++){
                if(t[i][j]>t[i][j+1]){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Return true if row values are increasing from left to right.
     *
     * @param t a two dimensional array which represents a tableau.
     *
     * @return false if row values are not increasing from left to right.
     */
    public static String columnValuesTesting(int[][] t){
        String newString="";
        for(int i=t.length-1; i>0; i--){
            for(int j=0; j<t[i].length; j++){
                newString=newString + t[i][j] + " ";
            }
        } return newString;
    }

    /**
     * Return true if column values decreases down the table.
     *
     * @param t a two-dimensional array which represents a tableau.
     *
     * @return true if column values are decreasing downward.
     */

    public static boolean columnValuesIncrease(int[][] t){
        for(int i=t.length-1; i>0; i--){
            for(int j=0; j<t[i].length; j++){
                if(t[i][j]<t[i-1][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private static int size (int[][] t) {
        int s = 0;
        for (int i=0; i<t.length; i++) {
            s+=t[i].length;
        }

        return s;
    }
    

    public static boolean isSetOf1toN(int[] [] t) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i=0; i<t.length; i++) {
            for (int j=0; j<t[i].length; j++) {
                numbers.add(t[i][j]);
            }
        }

        for (int i=1; i<size(t)+1; i++) {
            if (!numbers.contains(i)) {
                return false;
            }
        }
        return true;
        
        

    }


 



    
}
