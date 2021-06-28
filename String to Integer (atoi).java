// Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

// The algorithm for myAtoi(string s) is as follows:

// Read in and ignore any leading whitespace.
// Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
// Read in next the characters until the next non-digit charcter or the end of the input is reached. The rest of the string is ignored.
// Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
// If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
// Return the integer as the final result.
// Note:

// Only the space character ' ' is considered a whitespace character.
// Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.

class Solution {
    public int myAtoi(String s) {
        int digit = -1;
        s = s.trim();
        long num = 0;
        int len = s.length();
        boolean negative = false;
        if (len == 0) {
            return 0; // Edge case pretty obvious
        }
        char startChar = s.charAt(0);
        if (startChar == '-') {
            negative = true;
        }
        if (len == 1) {
            digit = Character.getNumericValue(startChar);
            if (digit >= 0 && digit <= 9) {
                return digit; // Edge case (input="9")
            } else {
                return 0; // Edge case (input="e")
            }
        }

        if (s.charAt(1) == '+' || s.charAt(1) == '-') {
            return 0; // Edge case (input="+-123")
        }
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (i == 0 && (c == '-' || c == '+')) {
                continue; // skip any leading signs, we'll deal with it later
            }
            if (c == '0' && num == 0) {
                continue; // Edge case (input="-000000000000000000000000000000000001")
            }
            digit = Character.getNumericValue(c);
            if (digit >= 0 && digit <= 9) {
                num = num * 10 + digit;
            } else {
                break;
            }
            if (num > Integer.MAX_VALUE) {
                if (negative) {
                    return Integer.MIN_VALUE; // Edge case (input="-6786876876123")
                }
                return Integer.MAX_VALUE; // Edge case (input="6786876876123")
            }
        }

        if (negative) {
            num = num - (2 * num); // convert positive to negative
        }
        return (int) num;

    }
}