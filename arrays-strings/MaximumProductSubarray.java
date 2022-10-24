public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int product = nums[0];
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < len; i++) {
            int temp_max = Math.max(nums[i] * max, Math.max(nums[i] * min, nums[i]));
            min = Math.min(nums[i] * max, Math.min(nums[i] * min, nums[i]));

            max = temp_max;
            product = Math.max(product, max); 
        }
        return product;
    }
}