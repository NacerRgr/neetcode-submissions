class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        
        HashMap<Character,Integer> hashMap = new HashMap();
        HashMap<Character,Integer> hashMa2 = new HashMap();


        
        for(char letter : s.toCharArray()){
            
            if(!hashMap.containsKey(letter)){
                hashMap.put(letter, 1);
            }else{
                 hashMap.replace(letter,hashMap.get(letter)+1);
            } 

        }

  
        for(char letter : t.toCharArray()){
            
            if(!hashMa2.containsKey(letter)){
                hashMa2.put(letter, 1);
            }else{
                hashMa2.replace(letter,hashMa2.get(letter)+1);
            } 
        
        }
        
        return hashMa2.equals(hashMap);


    }
}
