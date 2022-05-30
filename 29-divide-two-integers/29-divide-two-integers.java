class Solution {
public int divide(int dividend, int divisor) {
    
    int sign = 1;
    if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
        sign = -1;
    
    long ldvnd = Math.abs((long) dividend);
    long ldvsr = Math.abs((long) divisor);
    
    if ((ldvnd == 0) || (ldvnd < ldvsr))	return 0;

    long lans = ldivide(ldvnd, ldvsr);
    int ans;
    
    if (lans > Integer.MAX_VALUE)
    {
        ans = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
    } else {
        ans = (int) (sign * lans);
    }
    return ans;
}
	private long ldivide(long ldvnd, long ldvsr) {
    if (ldvnd < ldvsr) return 0;

    long sum = ldvsr;
    long mul = 1;
    while ((sum+sum) <= ldvnd) 
    {
        sum += sum;
        mul += mul;
    }

    return mul + ldivide(ldvnd - sum, ldvsr);
}
}