class Solution {
    public int candy(int[] ratings) {
        // int sum=1;
        // int curr=1;
        // int dcurr=1;
        // int peek=0;
        // int last=0;
        // for(int i=1;i<ratings.length;i++){
        //     if(ratings[i]>ratings[i-1]){
        //           curr+=1;
        //           sum+=curr;
        //     }else if(ratings[i]<ratings[i-1]){
        //           peek=curr;
        //           dcurr+=1;
        //           sum+=dcurr;
                  
        //     }else
        //     {
        //         sum+=1;
        //         last=dcurr+1;
        //         if(last>peek && i!=ratings.length-1){
        //             sum += last-peek;
        //             last=1;
        //             peek=1;
        //             curr=1;
        //             dcurr=1;
        //         }
               
        //     }
        // }
        // return sum;
        int sum=1;
        int n=ratings.length;
        int i=1;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                sum+=1;
                i++;
            }
            int peek=1;
            while(i<n && ratings[i]>ratings[i-1]){//for increasing mountain
                peek+=1;
                sum+=peek;
                i++;
            }
            int down=1;
            while(i<n && ratings[i]<ratings[i-1]){//for descresing mountain
                sum+=down;
                down+=1;
                i++;
            }
            if(down>peek)//for solvinig the peek of increasing mountian
            sum+=down-peek;

        }
        return sum;
    }
}