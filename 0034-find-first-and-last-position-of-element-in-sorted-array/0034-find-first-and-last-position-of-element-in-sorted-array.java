class Solution {
    public static int firstocc(int[] arr,int key){
      int size=arr.length;
        int s=0;
        int e=size-1;
        int ans=-1;
        while(s<=e){
         int mid=(s+e)/2;
         if (key==arr[mid]){
                 ans=mid;
                 e=mid-1;
          }
          else if(key<arr[mid])
          e=mid-1;
          else 
          s=mid+1;

        }
        return ans;
    }
    public static  int lastocc(int[] arr,int key){
      int size=arr.length;
        int s=0;
        int e=size-1;
      
        int ans=-1;
        while(s<=e){
             int mid=(s+e)/2;
         if (key==arr[mid]){
                 ans=mid;
                 s=mid+1;
          }
          else if(key<arr[mid])
          e=mid-1;
          else 
          s=mid+1;

         
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
       if(nums.length==0)return new int[]{-1,-1};
       int arr[]=new int[2];
       arr[0]=firstocc(nums, target);
       arr[1]=lastocc(nums,target);
       return arr;
    }
}