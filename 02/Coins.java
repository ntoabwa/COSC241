package week02;

/**
 *Lab2..cosc241
 *2019
 *Class Coins that have several methods and constructors for an array
 *of boolean coins.
 */

import java.util.Random;
/**Class coins which contains methods and constructors.
 * @author Ngaaia Toabwa.
 */
public class Coins{
    /**boolean data field.*/
    public static final boolean HEADS = true;
    /**another boolean data field.*/
    public static final boolean TAILS = false;

    /**array of boolean coins.*/
    private boolean[] coins;


    /**
     *Constructor initialising the boolean array called coins.
     *@param coins array initiated.
     */
    public Coins(boolean[] coins) {
        this.coins = coins;
    }

    /**
     * check every element in the array of coins and incrementing numHeads
     * everytime a HEADS occured  
     * and then returns the total number of HEADS in the array.
     * @return the number of HEADS.
     */
    public int countHeads() {
        int numHeads = 0;
        for (int index=0; index<coins.length; index++){
            if(coins[index]==HEADS){
                numHeads++;
            }
        }
        return numHeads;
    }

    
    /**
     * creates an empty string and then return this String after.
     * adding a H or T to it from the coins array
     * HEADS in the array add a H to the string.
     * TAILS in the array add a T to the string.
     * @return a new string constructed from the coins array.
     */
    public String toString(){
        String newString="";

        for(int index=0; index<coins.length; index++){
            if(coins[index]==HEADS){
                newString=newString+'H';
            }else{
                newString=newString+'T';
            }
        }
        return newString;
           
    }

    /**
     *Constructor that creates a Coins object from a String c
     *consisting of the characters H and t.
     *a character H adds a HEADS to the coins array.
     *a character T adds a TAILS to the coins array.
     *@param c as the input string.
     */

    public Coins(String c){
        this.coins = new boolean[c.length()];
       
        for(int index=0; index<c.length(); index++){
            if(c.charAt(index)=='H'){
                coins[index]=HEADS;
            }else{
                coins[index]=TAILS;
            } 
        }
    }

    /**
     *Contructor creating a coins object with size length with values
     *generated from a random coin toss.
     *Random generator used only generates two values, 0 and 1.
     *HEADS  is added if 1 is generated.
     *TAILS is added if 0 is generated.
     *@param length used for array size.
     */
    public Coins(int length){

        Random generator = new Random();
        
            
        this.coins = new boolean[length];
        for(int index=0; index<length; index++){
            if(generator.nextInt(2)==1){
                coins[index]=HEADS;
            }else{
                coins[index]=TAILS;
            }
        }
    }
    
    /**
     *Count and return number of runs in a sequence of coins.
     *Works by comparing one element with the next one in the array
     *and incrementing count if they are different.
     *@return the number of runs in an array of coins.
     */
    public int countRuns(){
        //represent the first run in the coins array
        int count=1;

        for(int index=0; index<coins.length-1; index++){
            if(coins[index]!=coins[index+1]){
                count++;
            }
        }

        return count;
    }

    /**main method used to test if the methods are working correctly.
     * @param args in main method.
     */
    public static void main (String[] args){
        boolean[] b={HEADS,TAILS,HEADS,HEADS,TAILS};
        boolean[] b2= new boolean[10];
        Coins c= new Coins(b);
        System.out.println (c.countHeads() );
        System.out.println (c.toString() );
        System.out.println (c.countRuns() );
    }
}
    

   
   
                
            


   

        
  





