

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String st = new String(ch); // Correct way to create string from char array

            if (!map.containsKey(st)) {
                map.put(st, new ArrayList<>());
            }
            map.get(st).add(str); // Always add the original string
        }

        return new ArrayList<>(map.values());
    }
}
