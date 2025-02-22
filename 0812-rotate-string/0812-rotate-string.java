class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal);
    }//in the double length of string s ,it is defently that the correct rotation will come under s+s ,try dry run
}