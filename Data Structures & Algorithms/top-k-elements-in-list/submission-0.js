class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        let arr = new Map();

        for (let num of nums) {
            if (!arr.has(num)) {
                arr.set(num, 1);
            } else {
                arr.set(num, arr.get(num) + 1);
            }
        }

        // Convert map to array of [num, freq] pairs
        const arr1 = Array.from(arr.entries());

        // Sort the array by frequency in descending order
        arr1.sort((a, b) => b[1] - a[1]);

        // Extract the top k elements
        return arr1.slice(0, k).map(pair => pair[0]);
    }
}