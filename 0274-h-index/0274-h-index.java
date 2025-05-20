class Solution {
    public int hIndex(int[] citations) {

        int s=citations.length;
        int[] noofpaper=new int[s+1];

        for(int n: citations){
            if(n>s)//5 baar sitation pane vale itne paper h
            noofpaper[s]++;
            else
            noofpaper[n]++;
        }
        int count=0;
        for(int i=s;i>=0;i--){
            count +=noofpaper[i];
            if(count>=i)
            return i;
        }
        return 0;
    }
}