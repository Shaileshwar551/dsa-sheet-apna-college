class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[]  array_s = s.toCharArray();
        char[]  array_t = t.toCharArray();

        Arrays.sort(array_s);
        Arrays.sort(array_t);

        return Arrays.equals(array_s, array_t);
    }
}