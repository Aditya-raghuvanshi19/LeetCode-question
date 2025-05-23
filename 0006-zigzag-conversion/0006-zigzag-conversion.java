class Solution {
    public String convert(String s, int numRows) {
        String[] arr=new String[numRows];
        for(int i=0;i<numRows;i++){
            arr[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int index=0;index<numRows && i<s.length();index++){
                arr[index]+=s.charAt(i++);
            }
            for(int index=numRows-2;index>0 && i<s.length() ;index--){
                arr[index]+=s.charAt(i++);
            }
        }
        String ans="";
        for(String st:arr)
        ans+=st;

        return ans;
    }
}