class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int subStringLength = 0;

        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0, j = 0; i < s.length(); i++) {
            char currentCh = s.charAt(i);
            if (charMap.containsKey(currentCh) && charMap.get(currentCh) >= j) {
                j = charMap.get(currentCh) + 1;
            }

            subStringLength = Math.max(subStringLength, i - j + 1);
            charMap.put(currentCh, i);
        }
        return subStringLength;
    }
}