public class Validpalindrom{
    static boolean sentencePalindrome(String str)
    {   
        int l = 0;
        int h = str.length()-1;
         
        // Lowercase string
        str = str.toLowerCase();
         
        // Compares character until they are equal
        while(l <= h)
        {
             
            char getAtl = str.charAt(l);
            char getAth = str.charAt(h);
             
            // If there is another symbol in left
            // of sentence
            if (!(getAtl >= 'a' && getAtl <= 'z'))
                l++;
             
            // If there is another symbol in right
            // of sentence
            else if(!(getAth >= 'a' && getAth <= 'z'))
                h--;
             
            // If characters are equal
            else if( getAtl == getAth)
            {
                l++;
                h--;
            }
             
            // If characters are not equal then
            // sentence is not palindrome
            else
                return false;
        }
         
        // Returns true if sentence is palindrome
        return true;   
    }
    public static void main(String[] args) {
        String s = "i am a good boy yob doog a ma i";
           if(sentencePalindrome(s)){
              System.out.println("It's palindrom");
           }    
            else
            System.out.println("It's not palindom");
    }
}