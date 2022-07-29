class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int n = pattern.length();
        List<String> list = new ArrayList<>();
        for(String i : words){
            HashMap<Character,Character> map = new HashMap<>();
            boolean flag = true;
            for(int j=0;j<n;j++){
                if(!map.containsKey(pattern.charAt(j))){
                    if(map.containsValue(i.charAt(j)))
                        flag=false;
                    else
                        map.put(pattern.charAt(j),i.charAt(j));
                }
                else {
                    if(map.get(pattern.charAt(j))!=i.charAt(j))
                        flag=false;
                    }
                }
            if(flag) list.add(i);
        }
        return list;
    }
}