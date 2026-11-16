class Solution {
    public boolean hasDuplicate(int[] nums) {
        
    

    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num,map.getOrDefault(num, 1)+1);
            }
        }

        for(int num : map.values()){
            System.out.println(num);
            if(num > 1){
                return true;
            }
        }


   




    
        return false;

    
    }
}