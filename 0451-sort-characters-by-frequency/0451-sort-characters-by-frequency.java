class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        StringBuilder ans=new StringBuilder();
        List<Character> list=new ArrayList(mp.keySet());
        list.sort((k1,k2)->mp.get(k2)-mp.get(k1));
        for(char ch:list){
            for(int i=0;i<mp.get(ch);i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}