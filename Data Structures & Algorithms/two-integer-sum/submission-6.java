class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i = 0 ; i< nums.length ; i++ ){
            map.put( nums[i], i);
      
        }


        for(int num = 0  ; num < nums.length ; num++ ){
            if(map.containsKey(target-nums[num]) && map.get(target-nums[num])!=num){
                res[0] = map.get(target - nums[num]);
                res[1] = num;
                Arrays.sort(res);

                return res;
             }
        }


        return new int[0];


    }
}
