class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
        while(j>=0){ //this is becuase nums2 always have element but 1st may or may not so only run loop till we cover all ement of 2nd
            if(i>=0 && nums1[i]>nums2[j]){//here i check because if 1st not have element than i become -1 and give error so better to check that i>=0 it means 1st have elemnt.
                nums1[k]=nums1[i];
                i--;
            }else
            {
                nums1[k]=nums2[j];
                j--;
            }
            k--;
            
        }

    }
}