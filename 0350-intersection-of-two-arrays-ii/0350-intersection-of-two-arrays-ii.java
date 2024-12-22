class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
    

        int[] temp=new int[nums2.length];
       ArrayList<Integer> ans=new ArrayList<>();


        Arrays.fill(temp,0);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && temp[j] !=1){
                    ans.add(nums1[i]);
                    temp[j]=1;
                    break;
                }
            }
        }
        int sizee=ans.size();
        int [] sol=new int[sizee];
        int index=0;
        for(int n:ans ){
            sol[index]=n;
            index++;
        }
        return sol;
        
    }}  