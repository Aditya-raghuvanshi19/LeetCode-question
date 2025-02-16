class Solution {
    public static int findb(int arr[]){
        
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
             int []arr=new int[26];
            for(int j=i;j<s.length();j++){
                arr[s.charAt(j)-'a']++;
                sum=sum+findb(arr);
            }
        }
        return sum;
    }
}