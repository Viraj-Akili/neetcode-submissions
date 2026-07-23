class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] matrix2=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix2[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    int n=i;
                    int m=j;
                    for(int k=0;k<row;k++){
                        matrix2[k][m]=0;
                    }
                    for(int p=0;p<col;p++){
                            matrix2[n][p]=0;
                    }
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=matrix2[i][j];
            }
        }
        return;
    }
}
