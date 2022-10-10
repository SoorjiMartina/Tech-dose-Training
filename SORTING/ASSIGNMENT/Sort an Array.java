
class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int len = nums.length;
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        int[] bucket = new int[max - min + 1];
        for (int num : nums) {
            bucket[num - min]++;
        }
        int i;
        int[] result = new int[len];
        int index = 0;
        for (i = 0; i < bucket.length; i++) {
            while (bucket[i] > 0) {
                result[index++] = i + min;
                bucket[i]--;
            }
        }
        return result;
    }
}
