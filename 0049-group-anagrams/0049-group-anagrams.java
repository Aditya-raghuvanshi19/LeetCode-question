class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        for(String s:strs){
            int [] frq=new int[26];
            for (char c: s.toCharArray()){
                frq[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i:frq){
                sb.append("#");
                sb.append(i);
            } 
            String key=sb.toString();
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<String>());
            }
            mp.get(key).add(s);

        }
        return new ArrayList(mp.values());
    }
}