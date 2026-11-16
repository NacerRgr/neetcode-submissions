class Solution {
    public boolean isAnagram(String s, String t) {
 HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
    
        if(s.length() != t.length()){
            return  false;
        }
    
        int i = 0 ;
        for(i=0 ; i < s.length() ; i++ ){


            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        for(char caracter : map1.keySet()){
            if(!Objects.equals(map1.get(caracter), map2.get(caracter))){
                return false;
            }
        }
        

     return true;
    }
}