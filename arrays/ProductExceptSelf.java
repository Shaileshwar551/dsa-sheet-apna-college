import java.util.*;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] arr1 = new int[nums.length];
        Arrays.fill(arr1, 1);

        int[] arr2 = new int[nums.length];
        Arrays.fill(arr2, 1);

        printArray(arr1);
        printArray(arr2);
        
        for (int i = 1; i < arr1.length; i++)
        {
            for (int j = i - 1; j >= 0; j--) {
                arr1[i] *= nums[j];
            }
        }
        
        for (int i = arr2.length - 2; i >= 0; i--) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                arr2[i] *= nums[j];
            }
        }

        printArray(arr1);
        printArray(arr2);
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr1[i] * arr2[i]; 
        }
        return nums;
    }

    public static void printArray(int[] arr) {
        System.out.println();
		for (int i = 0; i < arr.length; i++)
        {
            System.out.printf("%d\t", arr[i]);
        }
    }

    public static void main(String[] args) {
		int[] intArray = new int[]{ -1,1,0,-3,3 }; 
		intArray = productExceptSelf(intArray);
		printArray(intArray);
	}
}