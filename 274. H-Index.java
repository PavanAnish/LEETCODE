class Solution {
    public int hIndex(int[] citations) {
    int pos=0;
    if(citations.length>1){  
    for(int i=0;i<citations.length;i++){
        for(int j=0;j<(citations.length-i-1);j++){
            if(citations[j]<citations[j+1]){
                int temp=citations[j];
                citations[j]=citations[j+1];
                citations[j+1]=temp;
                }    
            }    
        }
    }
    if(citations[0]==0){
            return 0;}
    for(int i=0;i<citations.length;i++){
        if(citations[i]>=i+1){
            pos=i+1;
            
        }
        else{
            break;
        }            
    }
    return pos ;}   
    }
