

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    List<List<String>> sr_list = new ArrayList<>();

      

        HashMap<String,ArrayList<String>> map = new HashMap<>();
        
        char[] ch ;
        
        for(String str : strs){
            
            ch = str.toCharArray();
            Arrays.sort(ch);
            String tmp = Arrays.toString(ch);

            map.putIfAbsent(tmp, new ArrayList<>());
            
            if(map.containsKey(tmp)){
               map.get(tmp).add(str);
            }
           
        }

        

        return new ArrayList<>(map.values());
        
    }
}
