class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    int n1=nums1.length;
    int n2=nums2.length;
    int i=0;
    int j=0;

    Arrays.sort(nums1);
    Arrays.sort(nums2);
    ArrayList<Integer> list=new ArrayList<>();
    while(i<n1 && j<n2){
        if(nums1[i] < nums2[j])
        i++;
        else if(nums1[i] > nums2[j])
        j++;
        else
        {
            if(list.size()==0 || list.get(list.size()-1)!=nums1[i])
            list.add(nums1[i]);
            i++;
            j++;
        }
    }
    int snew=list.size();
    int [] arr=new int[snew];
    int index=0;
    for(int n: list){
        arr[index]=n;
        index++;
    }
    return  arr;
    
    }
}