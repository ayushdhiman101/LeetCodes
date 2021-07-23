// Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

// You may assume the integer does not contain any leading zero, except the number 0 itself.


class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] == 9) {
            int i = digits.length - 1;
            do {
                digits[i] = 0;
                i--;
                if (i < 0) {
                    int[] arr = new int[digits.length + 1];
                    arr[0] = 1;
                    for (int j = 0; j < digits.length; j++) {
                        arr[j + 1] = digits[j];
                    }
                    return arr;
                }
            } while (digits[i] == 9);

            digits[i] += 1;
        } else {
            digits[digits.length - 1] += 1;
        }
        return digits;
    }
}
