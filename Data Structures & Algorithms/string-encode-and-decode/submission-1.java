class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for (String s : strs) {
            res += s.length() + "#" + s; 
        }
        return res;
    }

    public List<String> decode(String str) {
        int i = 0, j = 0;
        int length = 0;
        List<String> arr = new ArrayList<>();

        while (i < str.length()) {
            while (str.charAt(j) != '#') {
                j++;
            }
            length = Integer.parseInt(str.substring(i, j));
            i = j+1; // fix: move i after '#'
            String s = str.substring(i, i + length);
            arr.add(s);
            i = i + length;
            j = i;
        }

        return arr;
    }
}
