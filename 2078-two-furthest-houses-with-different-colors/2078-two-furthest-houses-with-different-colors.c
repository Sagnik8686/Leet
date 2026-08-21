int maxDistance(int* colors, int colorsSize) {
    int max=0;
    for(int i=0;i<colorsSize;i++){
        for(int j=i;j<colorsSize;j++){
            if(colors[j]!=colors[i]){
                if(j-i>max)
                    max=j-i;
                // else
                //     max=-1*(j-1);
            }
        }
    }
    return max;
}