class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            int len = numberLength(num);
            count += len%2 == 0 ? 1:0;
        }
        return count;
    }
    public int numberLength(int num) {
        int len = 0;
        while(num > 0) {
            len++;
            num = num/10;
        }
        return len;
    }
}