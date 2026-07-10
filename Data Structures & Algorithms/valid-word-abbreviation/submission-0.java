class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        
        //apple
        //i
        //a3e
        //j

        int i=0; //1
        int j=0;  //1

        while (i<word.length() && j<abbr.length())
        {
            char w = word.charAt(i); //a //p
            char a = abbr.charAt(j); //a //3

            if (Character.isDigit(a))
            {
                if (a=='0')
                {
                    return false;
                }
                int temp = 0;
                while (j<abbr.length() && Character.isDigit(abbr.charAt(j)))
                {
                    temp = temp *10 + (abbr.charAt(j)-'0');
                    j= j+1;
                }
                i = i + temp;

            }
            else
            {
                if (w!=a)
                {
                    return false;
                }
                i = i+1;
                j = j+1;
            }
        }


    return i==word.length() && j == abbr.length();
    }

}