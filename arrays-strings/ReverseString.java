class ReverseString {
    public void reverseString(char[] s) {
        int n = s.length;
        
        for (int i = 0, j = n - 1; i < j; i++, j--)
        {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }
    }
}