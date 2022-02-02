class Solution {
          

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list =new ArrayList<>();
        
        int shash[]= new int[26];
        for(int i=0;i<p.length();i++){
            char c=p.charAt(i);
            shash[c-'a']+=1;
        }
        
        int plen=p.length();
        int slen=s.length();
        
        for(int i=0;i<=slen-plen;i++){
            int b[] = Arrays.copyOf(shash, shash.length);

            String sub=s.substring(i,i+plen);
            boolean flag=true;
            for(int j=0;j<plen;j++){
                int idx=sub.charAt(j)-'a';
                if( b[idx]==0 ){
                    flag=false;
                    break;
                }
                    
                else
                    b[idx]-=1;
                    
                    
            }
            if(flag==true) list.add(i);
        }
            
    
        return list;   
    }
}