class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        char arrayp[] = p.toCharArray();
        Arrays.sort(arrayp);
        for(int i = 0;i<=s.length()-p.length();i++){
            char array[] = (s.substring(i,i+p.length())).toCharArray();
            Arrays.sort(array);
            if(Arrays.equals(array,arrayp)){
                list.add(i);
            }
        }
        return list;
        
    }
}