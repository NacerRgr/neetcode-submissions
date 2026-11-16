public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.putIfAbsent(num, 1);

            if(map.containsKey(num)){
                map.replace(num, map.get(num)+1);
            }
        }

        List<int[]> arr = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()   )
        {
            arr.add(new int[]{entry.getKey(),entry.getValue()});
        }

        arr.sort((a,b) -> b[1]-a[1]);

        int[] arrr = new int[k];


        for(int i = 0 ; i<arrr.length ; i++  ){
            arrr[i] = arr.get(i)[0];
        }

        return arrr;
    }
}