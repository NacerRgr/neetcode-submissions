class Solution {
    public int[] twoSum(int[] numbers, int target) {
             int i = 0 ;
        int k = numbers.length - 1;

        while(i<k){

            if(numbers[i]+numbers[k] == target){
                return new int[] {i+1,k+1};
            }
            if(numbers[i]+numbers[k] > target){
                k--;
            }else if(numbers[i]+numbers[k] < target){
                i++;
            }
        }



        return null;
    }
}
