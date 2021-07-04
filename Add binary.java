// Given two binary strings a and b, return their sum as a binary string.
class Solution {
    public String addBinary(String a, String b) {
        String result = "";

        int s = 0;

        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1) {

            s += ((i >= 0) ? a.charAt(i) - '0' : 0);
            s += ((j >= 0) ? b.charAt(j) - '0' : 0);

            result = (char) (s % 2 + '0') + result;

            s /= 2;

            i--;
            j--;
        }

        return result;

    }
}