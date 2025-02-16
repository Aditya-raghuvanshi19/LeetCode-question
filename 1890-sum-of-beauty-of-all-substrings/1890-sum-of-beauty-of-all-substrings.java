class Solution {
    public static int findb(String s){
        int []arr=new int[26];
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
            }
            
        }
        int diff=max-min;
        return diff;

    }
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                sum=sum+findb(s.substring(i,j+1));
            }
        }
        return sum;
    }
}