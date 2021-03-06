
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        if(high < low) return ans;
        for(int i = 1; i < 10; i++)
        {
            int num=i;
            for(int j = i+1; j<10; j++)
            {
                num= num*10 + j;
                if(num <= high && num >= low)
                    ans.add(num);
                if(num > high)
                    break;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}