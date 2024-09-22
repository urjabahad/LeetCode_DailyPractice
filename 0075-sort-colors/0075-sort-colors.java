class Solution {
    public void sortColors(int[] nums) {
       /* 
       1->red
       2->white
       3->blue
       order: red, white, blue
       */ 
       int r=0,w=0,b=0;
       for(int num : nums){
        if(num==0){
            r++;
        }
        else if(num==1){
            w++;
        }
        else{
            b++;
        }
       }
       //fill the array with sorted colors
       w+=r;
       b+=w;
       for(int i=0;i<nums.length;i++){
        if(i<r){
            nums[i]=0;
        }
        else if(i<w){
            nums[i]=1;
        }
        else{
            nums[i]=2;
        }
       }
    }
}