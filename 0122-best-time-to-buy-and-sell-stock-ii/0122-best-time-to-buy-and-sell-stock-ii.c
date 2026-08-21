int maxProfit(int* prices, int pricesSize) {
    int lar=0;
    for(int i=0;i<pricesSize-1;i++){
        if(prices[i+1]-prices[i]>0){
            lar+=(prices[i+1]-prices[i]);
        }
    }
    return lar;
}