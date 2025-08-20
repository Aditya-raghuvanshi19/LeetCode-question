class Solution {
    public boolean lemonadeChange(int[] bills) {
        int rup5=0;
        int rup10=0;
        int rup20=0;

        for(int i: bills){
            if(i==5)rup5++;
            else if(i==10){
                if(rup5==0)return false;
                rup5--;
                rup10++;
            }else if(i==20){
                if(rup5 !=0 && rup10 != 0){
                 rup5--;
                rup10--;
                rup20++;
                }
                else if(rup5 >=3){
                    rup5 -= 3;
                    rup20 ++;
                }
                else return false;
                
            }
        }
        return true;
    }
}