package week11;

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

        comparisons = 0;
        int key;

        for (int j = 1; j<nums.length; j++) {
            key = nums[j];
            int i = j-1;
            
            while ((++comparisons>0) && (i>-1) && (nums[i] > key))  {
                nums [i+1] = nums[i];
                i--;
                update();
            }
            update();
    
            nums[i+1] = key;
        }
        update();
   
    }
}
