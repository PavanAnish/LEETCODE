class Solution {
    public int majorityElement(int[] nums) {
        int count=0;int majority=nums[0];int temp=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==majority){
                    break;
                }
                if(nums[i]==nums[j]){
                    count++;
                }     
            }
            if(count>(nums.length/2) && count>temp){
                    temp=count;
                    majority=nums[i];
                }               
        }return majority;
    }
}