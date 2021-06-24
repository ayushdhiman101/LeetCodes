
// Given an integer x, return true if x is palindrome integer.

// An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else {
            if (x == 0)
                return true;
            int n = x;
            int sum = 0;
            while (x != 0) {
                int z;
                z = x % 10;
                sum = sum * 10 + z;
                x = x / 10;
            }

            if (sum == n)
                return true;
        }
        return false;
    }
}