class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        HashMap<String,HashMap<Character,Integer>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(String str : strs){
            map.put(str, CharacterCounter(str));    
        }

        for(int i = 0 ; i<strs.length;i++ ){
            if(visited[i]) continue;
            ArrayList<String> tmp = new ArrayList<>();
            tmp.add(strs[i]);
            visited[i] = true;
            for(int k = i + 1 ; k<strs.length ; k++ ){

                if(AreSameFrequence(map.get(strs[i]), map.get(strs[k]))){
                   tmp.add(strs[k]);
                   visited[k] = true;
                }
            }

            result.add(tmp);
        }

        return result ;

    }

    public HashMap<Character,Integer> CharacterCounter(String tmp){

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i<tmp.length() ; i++){

            map.put(tmp.charAt(i),map.getOrDefault(tmp.charAt(i), 0)+1);

        }
        return map;
    }

    public Boolean AreSameFrequence(HashMap<Character,Integer> map1,HashMap<Character,Integer> map2 ){
        if (map1.size() != map2.size()) return false;
        for(Character car : map1.keySet()){
            if(!map1.get(car).equals(map2.get(car))){
                return false;
            }
        }


        return true;
    }

}