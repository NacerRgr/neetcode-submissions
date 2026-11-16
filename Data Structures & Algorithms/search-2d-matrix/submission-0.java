class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            for(int i = 0 ; i<matrix.length ; i++){
            int l = 0;
            int r = matrix[i].length-1;
            
            for(int k = 0 ; k<matrix[i].length ; k++){
            
            while (l <= r) {
            int mid = l + (r - l) / 2;

            if (matrix[i][mid] > target) {
                r = mid - 1;

            } else if (matrix[i][mid] < target) {
                l = mid + 1;
            } else {
                return true;
            }

            }

            }
        }

        return false;
    }
}
