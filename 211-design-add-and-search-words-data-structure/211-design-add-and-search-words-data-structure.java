class WordDictionary {
    static HashMap<Integer, List<String>> map;
    public WordDictionary() {
        map = new HashMap<>();
    }
    
    public void addWord(String word) {
        if(map.containsKey(word.length())){
            List<String> l = map.get(word.length());
            l.add(word);
            map.put(word.length(), l);
        }
        else
        {
            List<String> list = new ArrayList<>();
            list.add(word);
            map.put(word.length(), list);
        }
    }
    
    public boolean search(String word) {
        if(!map.containsKey(word.length()))
            return false;
        if(word.contains(".")){
            return check(word);
        }
        else{
            return map.get(word.length()).contains(word);
        }
    }
    static boolean check(String word){
        int n = word.length();
        List<String> l = map.get(n);
        for(int i=0; i<l.size(); i++){
            String temp = l.get(i);
            int flag = 1;
            for(int j=0; j<n; j++){
                char a = word.charAt(j);
                char b = temp.charAt(j);
                
                if(a=='.' || b=='.')
                    continue;
                else{
                    if(a!=b){
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag == 1)
                return true;
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */