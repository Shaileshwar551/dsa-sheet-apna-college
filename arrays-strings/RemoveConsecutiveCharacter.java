class RemoveConsecutiveCharacter {
    public String removeConsecutiveCharacter(String S) {
        String result = "";
        result += S.charAt(0);
        
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                result += S.charAt(i);
            }
        }
        
        return result;
    }
}