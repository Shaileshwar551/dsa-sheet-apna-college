class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String alphanumericStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(alphanumericStr).reverse();
        
        return alphanumericStr.equals(sb.toString());
    }
}