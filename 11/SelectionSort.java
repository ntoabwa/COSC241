package week11;

/**
 * Selection sort.
 * @author Ngaaia.Toabwa.
 */

public class SelectionSort extends Sorter {


    /**
     * Create a new SelectionSort sorter with the given integers to sort.
     *
     * @param nums the integers to sort.
     */
    public SelectionSort(Integer[] nums) {
        super(nums);
    }

    /**
     * Sort the integers (which are stored in the parent Sorter class).
     */
    public void sortNums() {

        int index = 0;
        comparisons = 0;
        int temp;
        for (i = 0; i < nums.length; i++) {
            index = i;
            for (j = i+1; j < nums.length; j++) {
                if (++comparisons > 0 && nums[j] < nums[index]) {
                    index = j;                   
                }
                update();
            }

            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
            update();
        }
        
        update();
    }
        

}
