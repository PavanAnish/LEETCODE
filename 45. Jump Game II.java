class Solution {
    public int jump(int[] nums) {
    int maxreach=0;
    int k=0;
    int n=nums.length;
    for(int i=0;i<nums.length;i++){
        if(maxreach>i){
            break;
        }
        if(i==0){
            if(maxreach<n-1){
                k++;
            }
        }if(nums[maxreach]<n-1){
            k++;    
        }
        maxreach+=nums[i];
    }
    return k;   
    }
}