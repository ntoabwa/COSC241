package week11;

/**
 * Merge sort.
 * @author Ngaaia.Toabwa.
 */


public class MergeSort extends Sorter {

    
    /**
     * Create a new MergeSort sorter with the given integers to sort.
     *
     * @param nums the integers to sort.
     */
    public MergeSort(Integer[] nums) {
        super(nums);
       
    }

    /**
     * Method that recursively call itself on the left and
     * right subarray.
     * @param left subarray input.
     * @param right subarray input.
     */
    private void mergeSort(int left, int right){
    
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);          
            mergeSort(mid + 1, right);   
            merge(left, mid + 1, right);  
        }
    }


    /**
     * Method that is called to merge all the subarrays
     * from left to right.
     * Form a sorted array.
     * @param left subarray.
     * @param mid of array.
     * @param right input subarray.
     */
    private void merge(int left, int mid, int right) {
        
        //System.err.println(left + " " + mid + " " + right);
        int[] temp = new int[nums.length];
        for (int i=0; i<temp.length; i++) {
            temp[i] = nums[i];
  
        }

        i = left;
        j = left;
        int k = mid;

        while (++comparisons>0 &&(i < mid) && (k <= right)) {
            if (temp[i] < temp[k]) {
                nums[j++] = temp[i++];
            } else {
                nums[j++] = temp[k++];
            }
            update();
        }

        while (++comparisons>0 && i < mid) {
            nums[j++] = temp[i++];
            update();
        }

        while (++comparisons>0 && j <= right) {
            nums[j++] = temp[k++];
            update();
        }
    }
        

    /**
     * Sort the array by calling mergeSort
     * to sort them out first.
     */
    public void sortNums() {
        mergeSort(0, nums.length - 1);
    }


}


        



        
        
        
