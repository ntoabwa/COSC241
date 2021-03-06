package week09;

/**
 * Insertion sort.
 * @author Ngaaia.Toabwa.
 */

public class InsertionSort extends Sorter {

    /**
     * Create a new InsertionSort sorter with the given integers to sort.
     *
     * @param nums the integers to sort.
     */
     
    public InsertionSort(Integer[] nums) {
        super(nums);
    }


    /**
     * Sort the integers (which are stored in the parent Sorter class).
     *
     */
    public void sortNums() {

        int key;

        for (i = 1; i<nums.length; i++) {
            key = nums[i];
            j = i-1;
          
            
            while (++comparisons > 0 && j>-1 && nums[j] > key)  {
                nums[j+1] = nums[j];
                j--;
                update();
            }
          
    
            nums[j+1] = key;
        }
       
   
    }
}

