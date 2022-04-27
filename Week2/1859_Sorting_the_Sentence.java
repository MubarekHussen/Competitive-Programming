class Solution {
    public String sortSentence(String s) {
        
        String[] words = new String[s.length()];
        String str = "";
        char cmp1, cmp2;
        int i = 0, j = 0;
        
        words  = s.split(" ");
        
        for (i =0; i < words.length; i++)
        {
            for (j = 0; j < words.length - 1; j++)
            {
                cmp1 = words[j].charAt(words[j].length()-1);
                cmp2 = words[j + 1].charAt(words[j + 1].length() - 1);
                if (cmp1 > cmp2)
                {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        
        for (String x : words)
        {
            str += x.substring(0, x.length() - 1) + " ";
        }
        
        String result = str.substring(0, str.length()-1);
        return (result);
    }
    
}
