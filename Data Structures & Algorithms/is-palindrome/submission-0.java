public class Solution {
 public boolean isPalindrome(String s) {
        
        char [] ch = s.toCharArray();
        for(int i = 0 , j=s.length()-1 ; i<ch.length && i<j  ; i++,j--){
            
            while(!Character.isLetterOrDigit(ch[i]) && i<j){
                i++;
            }
            while(!Character.isLetterOrDigit(ch[j]) && i<j){
                j--;
            }

            if(Character.toLowerCase( ch[i])  !=Character.toLowerCase( ch[j])  ){
                return false;
            }


        }
        return true;

    }
}