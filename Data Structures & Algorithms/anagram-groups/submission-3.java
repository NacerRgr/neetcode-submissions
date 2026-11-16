class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
  
            HashMap<String,HashMap<Character,Integer>> countFrequency = new HashMap<>();
            List<List<String>> result = new ArrayList<>(); 
            boolean[] visited = new boolean[strs.length];

            for(String str: strs){
                countFrequency.put(str, new HashMap<>());
                HashMap<Character,Integer> tmpMap = countFrequency.get(str);

                for(char c : str.toCharArray()){
                    tmpMap.put(c, tmpMap.getOrDefault(c, 0)+1);
                }

                countFrequency.put(str,tmpMap);
            }

           

            for(int i = 0 ; i< strs.length ; i++){
                
                ArrayList<String> list = new ArrayList<>();
                if(visited[i]){
                    continue;
                }

                for(int j = i ; j<strs.length ; j++){
                    if(countFrequency.get(strs[i]).equals(countFrequency.get(strs[j]))){
                        
                        list.add(strs[j]);
                        visited[j] = true;
                    }
                }

                result.add(list);

            }



            
            



            return result;

}

}