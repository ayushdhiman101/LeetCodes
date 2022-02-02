class Solution {
          

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list =new ArrayList<>();
        
        int s_hash[]= new int[26];
        for(char c : p.toCharArray())
            s_hash[c-'a']+=1;
        
       
        for(int i=0;i<=s.length()-p.length();i++){
            int s_hash_copy[] = Arrays.copyOf(s_hash, s_hash.length);

            String sub=s.substring(i,i+p.length());
            boolean flag=true;
            for(int j=0;j<p.length();j++){
                int idx=sub.charAt(j)-'a';
                if( s_hash_copy[idx]==0 ){
                    flag=false;
                    break;
                }
                    
                else
                    s_hash_copy[idx]-=1;
                    
                    
            }
            if(flag==true) list.add(i);
        }
            
    
        return list;   
    }
}