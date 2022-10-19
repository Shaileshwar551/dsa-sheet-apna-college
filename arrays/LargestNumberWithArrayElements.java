class LargestNumberWithArrayElements {
    public String largestNumber(int[] nums) {
        String num1 = "";
        String num2 = "";
        String result = "";

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                num1 = nums[i] + "" + nums[j];
                num2 = nums[j] + "" + nums[i];

                if(Long.parseLong(num2) > Long.parseLong(num1)) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
        }

        if (result.charAt(0) == '0') {
             return "0";
         }
        
        return result;
    }
}