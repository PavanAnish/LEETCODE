class Solution {
    public int maxProfit(int[] prices) {
    int profit=0;
    int minprice=prices[0];
    for(int i=0;i<prices.length-1;i++){
        if(prices[i+1]<minprice){
            minprice=prices[i+1];
        }
        else if (prices[i+1]>minprice){
            profit+=(prices[i+1]-minprice);
            minprice=prices[i+1];  
        }
    }
        
    return profit;     
    }
       
    }

        
    
