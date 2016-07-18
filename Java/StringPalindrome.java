class StringPalindrome
{

    public static void main(String[] args) {

        StringPalindrome stringPalindrome = new StringPalindrome();
        String str1="YooY";
        String str2="YosdoY";
        String str3="YoioY";

        System.out.println(stringPalindrome.checkPalindrome(str1));
        System.out.println(stringPalindrome.checkPalindrome(str2));
        System.out.println(stringPalindrome.checkPalindrome(str3));

    }
 //Efficiency O(n/2) - where n is length of a String

     public boolean checkPalindrome(String string)
    {
        int i=0;
        int j=string.length() -1;

        while (i<j)
        {

            if(string.charAt(i) != string.charAt(j))
            {
                return false;

            }

            i++;
            j--;

        }

        return true;

    }

}