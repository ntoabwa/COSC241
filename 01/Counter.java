package week01;
/**
 *Lab1, COSC241 2019.
 *Counter class which counts the number of lines and words from the user.
 */

import java.util.Scanner;  //import the scanner class

/**Counter class that counts the number of words and lines from a scanner.
 *@author Ngaaia 
 */
public class Counter{

    /**main method which counts the number of lines and words from the user.
     *@param args Commandline arugment.
     */ 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);  
        String s;
        int numLines=1;
        int count =0;
        
        /**checks if there is a next line, stores it in the string
         *s and counts the number of words it contains*/
        while(scan.hasNextLine()){       
            numLines++;                             
            s = scan.nextLine();

            if(s.length()==0){
               
            }else{
                /**counts words only when there's a space after the last letter
                 *in a word.
                 */
                for(int index=0; index<s.length()-1; index++){
                    if(s.charAt(index)!=' '&& s.charAt(index+1)==' '){ 
                        count++;
                    }
                }
                /** so if there is no space after the last word then count
                 *also increments.
                 */
                if(s.charAt(s.length()-1)!=' '){
                    count++;
                }
            }
        }
        numLines = numLines-1;
        System.out.println("lines: "+ numLines);
        System.out.println("words: "+ count);
    }
}

        
     

        
