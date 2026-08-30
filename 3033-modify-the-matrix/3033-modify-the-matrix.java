class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int i,j,r=matrix.length,c=matrix[0].length,a=0;
        int maxarr[]=new int[c],max;
        for(i=0;i<c;i++){
            max=0;
            for(j=0;j<r;j++)
            {
                if(matrix[j][i]>max)
                    max=matrix[j][i];
            }
            maxarr[a++]=max;
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(matrix[i][j]==-1)
                    matrix[i][j]=maxarr[j];
            }
        }
        return matrix;
    }
}