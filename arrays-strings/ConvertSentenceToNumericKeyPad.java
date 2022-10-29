public class ConvertSentenceToNumericKeyPad 
{
	public static String convertSentence(String str) 
	{
		String[] keyPad = {"2", "22", "222", "3", "33", "333",
                            "4", "44", "444", "5", "55", "555",
                            "6", "66", "666", "7", "77", "777",
                            "7777", "8", "88", "888", "9", "99",
                            "999", "9999"
                           };
        
        StringBuilder numericSequence = new StringBuilder(); 
        
        for (int i = 0; i < str.length(); i++) {
            int j = str.charAt(i) - 'a';
            numericSequence.append(keyPad[j]);
        }
        return numericSequence.toString();
	}

    public static void main(String[] args)
    {
        System.out.println(convertSentence("codingninjas"));
    }
}