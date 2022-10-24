class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length == 1)
            return;
        
        int len = nums.length - 2;
        int pivot = -1;
        
        for (int i = len; i >= 0; i --) {
            if (nums[i] < nums[i + 1])
            {
                pivot = i;
                break;
            }
        }
        
        if (pivot < 0)
            reverseArray(nums, 0, nums.length - 1);
        
        else
        {
            int pivotSuccessor = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[pivot])
                {
                    pivotSuccessor = i;
                    break;
                }
            }
            swap(nums, pivot, pivotSuccessor);
            reverseArray(nums, pivot + 1, nums.length - 1);
        }
    }
    
    
    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
 
    
    public void reverseArray(int[] arr, int i, int j) {
        while (i < j) 
            swap(arr, i++, j--);
    }
}