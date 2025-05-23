class Solution {
    public String intToRoman(int num) {

        String ans="";
        ArrayList<Integer> l=new ArrayList<>();
        HashMap<Integer,String> mp=new HashMap<>();
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(9);
        l.add(10);
        l.add(40);
        l.add(50);
        l.add(90);
        l.add(100);
        l.add(400);
        l.add(500);
        l.add(900);
        l.add(1000);

        // Map index → Roman numeral
        mp.put(0, "I");
        mp.put(1, "IV");
        mp.put(2, "V");
        mp.put(3, "IX");
        mp.put(4, "X");
        mp.put(5, "XL");
        mp.put(6, "L");
        mp.put(7, "XC");
        mp.put(8, "C");
        mp.put(9, "CD");
        mp.put(10, "D");
        mp.put(11, "CM");
        mp.put(12, "M");

        for(int i=l.size()-1;i>=0;i--){
           int q = num/l.get(i);
           while(q>0){
            ans+=mp.get(i);
            q--;
           }
           num=num%l.get(i);
        }
        return ans;
    }
}