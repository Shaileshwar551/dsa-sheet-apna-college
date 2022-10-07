public class KthLargestInArray {
    public int findKthLargest(int[] nums, int k) {
        TreeMap<Integer, Integer> tmap = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            tmap.put(nums[i], tmap.getOrDefault(nums[i], 0) + 1);
        }

         int freq  = 0;
         for (Map.Entry it : tmap.entrySet()) {
             freq += (int)it.getValue();

              if (freq >= k) {
                return (int)it.getKey();
              }
         }
         return -1;
    }
}