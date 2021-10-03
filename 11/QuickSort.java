package week11;

/**
 * Quick sort.
 * @author Ngaaia.Toabwa.
 */

public class QuickSort extends Sorter {


    /**
     * Create a new QuickSort sorter with the given integers to sort.
     *
     * @param nums the integers to sort.
     */
    
    public QuickSort(Integer[] nums) {
        super(nums);
    }

    /**
     * Method that recursively sort both parts of the array.
     * @param left subarray input.
     * @param right subarray input.
     */
    private void quickSort(int left, int right){

        if (left < right) {
            int p = partition(left, right);
            quickSort(left, p);
            quickSort(p+1, right);
        }

    }

    /**
     * Rearranges the array such that all items to the left
     * of pivot are values smaller.
     * Items to the right have greater values.
     * @param left subarray input.
     * @param right subarray input.
     * @return int that partions the array.
     */
    private int partition(int left, int right) {

        int pivot = nums[left];
        int hole = left;
        i = left + 1;
        j = right;

        while (true) {
            
            while (++comparisons > 0 && j > hole && nums[j] >= pivot) {
                j--;
            }
            update();
            
            if (j == hole) {
                break;
            }
            update();
            
            nums[hole] = nums[j];
            hole = j;
        

            while (++comparisons > 0 && i < hole && nums[i] < pivot) {
                i++;
            } update();
        
            if (i == hole) {
                break;
            }

            nums[hole] = nums[i];
            hole = i;
        }
        
        nums[hole] = pivot;
        return hole;
        
    
    }

    /**
     * Sort the integers by first calling quickSort.
     */
    public void sortNums() {
        quickSort(0, nums.length - 1);
    }
    
}

    
               





        
            
        
