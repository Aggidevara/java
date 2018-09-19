public class Matrix {
    int row,col;
    int[][] first={{}};
    int[][] second={{}};

    Matrix(int row,int col,int[][] first,int[][] second){
       this.row=row;
        this.col=col;
        this.first=first;
        this.second=second;
    }
    public int[][] additionOfMatrix(){
        int[][] sum=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum[i][j]=first[i][j]+second[i][j];
                //System.out.println(sum[i][j]);
            }
        }
        return sum;
    }
}
