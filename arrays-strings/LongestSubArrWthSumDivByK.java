class LongestSubArrWthSumDivByK{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int res = 0;
        int sum = 0;
        int rem = 0;
        
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            rem = sum % k;
            
            if (rem < 0) {
                rem += k;
            }
            
            if(map.containsKey(rem)) {
                int idx = map.get(rem);
                int len = i - idx;
                if (len > res) {
                    res = len;
                }
            }
            else {
                map.put(rem, i); 
            }
        }
        return res;
    }
}