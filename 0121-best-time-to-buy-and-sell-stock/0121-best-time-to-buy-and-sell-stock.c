int maxProfit(int* nums, int pricesSize) {
   int i,lar=0;
   if(pricesSize==1)
        return 0;
   int buy=nums[0];
   int sell;
   for(i=1;i<pricesSize;i++){
    sell=nums[i];
        if(buy>sell){
            buy=nums[i];
            // sell=nums[i+1];
        }
        if(lar<sell-buy){
            lar=sell-buy;
        }
        // sell=nums[i];
   }
   return lar;
}