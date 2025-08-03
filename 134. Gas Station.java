class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int gas1=0; 
    int cost1=0;
    int gasleft=0;
    int count=0;
    for(int i=0;i<gas.length;i++){
        gas1+=gas[i];
        cost1+=cost[i];
    }
    if(gas1<cost1){
            return -1;
        }


    for(int i=0;i<gas.length;i++){
        gasleft+=gas[i]-cost[i];
        if(gasleft<=0){
            if(i+1!=gas.length){
                count=i+1;
            }else{
                count=0;
            }
            gasleft=0;
        }
    }    
    return count;    
    }
    }   
    
