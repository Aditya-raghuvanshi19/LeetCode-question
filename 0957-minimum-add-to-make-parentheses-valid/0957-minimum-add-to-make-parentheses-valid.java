class Solution {
    public int minAddToMakeValid(String s) {
        int countop=0;
		int countcl=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='(')
			countop++;
			else{
				if(countop==0)
				countcl++;
				else
				countop--;

			}

		}
		return countop+countcl;
    }
}