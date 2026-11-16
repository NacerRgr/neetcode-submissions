class Solution {
    public boolean hasDuplicate(int[] nums) {

   HashSet<Integer> set = new HashSet<Integer>();

        for(int num : nums){
            if(!set.contains(Integer.valueOf(num))){
               set.add(Integer.valueOf(num));
            }else{
                return true;
            }
        }




    
        return false;

    
    }
}