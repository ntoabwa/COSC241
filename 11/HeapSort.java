package week11;

/**
 * Heap sort.
 * @author Ngaaia.Toabwa.
 */

public class HeapSort extends Sorter {

    /**
     * Create a new HeapSort sorter with the given integers to sort.
     *
     * @param nums the integers to sort.
     */
    public HeapSort(Integer[] nums) {
        super(nums);
    }

    
    /**
     * Sort the integers by heapifying the array and then 
     * repeatedly calling swap and siftDown on the array.
     *
     */
    public void sortNums() {
        
        heapify();
        
        for (int i = nums.length - 1; i>0; i--) {
            swap(0, i);
            siftDown(0, i);
        }
        
    }

    /**
     * Method that organises items of an array into a heap structure.
     */
    private void heapify() {
        for (int i = nums.length/2; i >= 0; i--) {  
            
            siftDown(i, nums.length);
        }
        

    }

    /**
     * Method that swaps the largest item with the last item
     * in the array.
     * @param s is index of item to be swapped.
     * @param high is index of end of heap.
     */
    private void swap(int s, int high) {   
        i = s;
        j = high;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        update();
    }

        
    /**
     * Method that swaps the parent node with its largest child.
     * @param j is index of parent node to sift down.
     * @param length is end of the heap.
     */
    // private void siftDown(int j, int length) {
        
    //     while (true) {
    //         int largeChild = getLargerChildIndex(j, length); 

    //         if (largeChild == -1) {
    //             break;
    //         }

    //         swap(j, largeChild);
    //         j = largeChild;
     
    //     }
    // }

    private void siftDown(int j, int length) {
        int largeChild = getLargerChildIndex(j, length);
        if (largeChild == -1) {
            return;
        }
        swap(j, largeChild);
        siftDown(largeChild, length);
    }


    /**
     * Method that finds the index of a larger child
     * than its parent.
     * @param s index of parent node.
     * @param length is index of the end of heap.
     * @return index of large child or -1 if there is none.
     */
    /*
    private int getLargerChildIndex(int s, int length) {

        int l = 2 * s + 1;  //left child index

        if (l >= length) {
            return -1;
        }

        int r = 2 * s + 2; //right child index

        if (r >= length || ++comparisons>0 && nums[r].compareTo(nums[l]) < 0) {
            if (++comparisons>0 && nums[l].compareTo(nums[s]) > 0) {
                return l;
            }
            return -1;
        } else {
            if (++comparisons>0 && nums[r].compareTo(nums[s]) > 0) {
                return r;
            }
            return -1;
        }
        }*/

    private int getLargerChildIndex(int s, int length) {
        int largest = s;
        
        int l = 2 * s + 1;  //left child index

        int r = 2 * s + 2; //right child index

        if (l < length && ++comparisons > 0 && nums[l].compareTo(nums[largest]) > 0) {
            largest = l;
        }

        if (r < length && ++comparisons > 0 && nums[r].compareTo(nums[largest]) > 0) {
            largest = r;
        }

        if (largest == s) {
            return -1;
        }

        return largest;
    }
}

    
            
                    
        

      

    


    

    
        
