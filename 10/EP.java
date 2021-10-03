package week10;

/**
 *241 Assignment.
 *Class EP that implements interface ExamPile.
 */

import java.util.*;

/**
 * Class that contains methods that work on the exam pile
 * and/or return different results.
 * @author Ngaaia.Toabwa.
 */

public class EP implements ExamPile {
    
    /**
     *arraylist that stores pile of exams.
     */
    ArrayList<Integer> exams = new ArrayList<>();
   
      
    /**
     * method that receives pile of exams and store
     * them in an arraylist.
     *@param items input array.
     */
    public void load(int[] items) {
        for (int i: items) {
            exams.add(i);
        } 
    }
  
    /**
     * method that returns size of exam pile.
     * @return the length of the arraylist exams.
     */
    public int size() {
        return exams.size();
    }

    /**
     * method that looks for the first item and returns it.
     * @return first int in the arraylist.
     */
    public int peek() {

        int offset = 0;
        try {
            
            if (exams.isEmpty()){
                throw new EmptyPileException("ArrayList is empty");
            }

           
        } catch (EmptyPileException ex) {
            System.out.println(ex);
        }
        
        return exams.get(offset);
    }

    /**
     * method that finds that first item, returns it
     * then removes it from exam pile.
     * @return top int of arraylist.
     */
    public int mark() {
        int offset =0;
        
        try {
            
            if (exams.isEmpty()){ 
                throw new EmptyPileException("ArrayList is empty");
            }
        }  catch (EmptyPileException ex) {
            System.out.println(ex);
        }
        
        int top = exams.get(offset);
        exams.remove(offset);
        return top;
      
    }
  
    /**
     * method that takes the first item and add it
     * to the end of the pile and then
     * deleting it from the front.
     */
    public void delay() {
  
        try {
            
            if (exams.isEmpty()) {
                throw new EmptyPileException("ArrayList is empty");
            }
               
      
        } catch (EmptyPileException ex) {
            System.out.println(ex);
        }
        
        int item = exams.get(0);
        exams.add(item);
        exams.remove(0);

        
    }
    
    /**
     * add each item to the string created and then return
     * the newstring that is created.
     * @return a string of exam items.
     *
     */
    public String toString() {
        String newString ="";
        for (Integer item: exams) {
            newString = newString + Integer.toString(item) + " ";
        }
        return newString.trim();
    }

    /**
     * method that compares two exam piles.
     * @return true if the two piles have same content.
     * @param newPile as the new input EP.
     */
    public boolean equals(EP newPile) {
        return this.exams.equals(newPile.exams);
    }


    /**
     * creates a string of mark and delay steps
     * works by delaying until 0 is the top and then
     * marking it until they all finish.
     * @return string of M and D.
     */
    public String sortingSteps() {
        
        String newString = "";
        int j = 0;
        int size = exams.size();

        while (j < size) {
            if (j == exams.get(0)) {
                newString = newString + 'M';
                exams.remove(0);
            } else {
                newString = newString + 'D';
                int item = exams.get(0);
                exams.add(item);
                exams.remove(0);
                j--;
            }

            j++;
              
        } 

        return newString;
        
    }


    /**
     * method that recreates a pile of exam with integers
     * and returns it by 
     * using string of M and D steps.
     *@return instance of EP with integers.
     *@param steps input.
     */
    public static EP reconstruct(String steps) {
        EP pile = new EP();
        int count = 0;

       
        for (int i=0; i<steps.length(); i++) {
            if (steps.charAt(i) == 'M') {
                count++;
            }
        }

        for (int i=steps.length()-1; i>=0; i--) {
            if (steps.charAt(i) == 'M') {
                pile.exams.add(0, count-1);
                count--;
              
            } else {
                pile.exams.add(0, pile.exams.remove(pile.exams.size()-1));
            }
            
        }
            
        return pile;
    }


}
