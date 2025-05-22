class Solution {
    public int trap(int[] height) {
        int total=0;
        int n=height.length;
        int l=0;
        int r=n-1;
       int  lmax=0;//this is boundry set on left side
        int rmax=0;//this is boundry set on rihgt side
        while(l<r){
            if(height[l]<=height[r]){//this means on right side some boundary exist
                if(lmax>height[l])//for current height and is thier any left boundy is exist check here, so that water get store
                 total+=lmax-height[l];
                 else
                 lmax=height[l];

                 l+=1;
            }
            else{//it means left side boundry exist
            if(rmax>height[r])
            total+=rmax-height[r];
            else
            rmax=height[r];

            r-=1;
            }
           
        }
        return total;
    }
}