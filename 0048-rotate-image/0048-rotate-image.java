class Solution {
    public void rotate(int[][] matrix) {
        transposeMatrix(matrix);
        reverseRows(matrix);
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                   System.out.println(matrix[i][j]+" ");

            }
            System.out.println(" ");
        }
    }
        public void transposeMatrix(int [][] matrix){
             for (int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
             }
        }

        public void reverseRows(int [][] matrix){
             for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length/2;j++){
                   int temp= matrix[i][j];
                   matrix[i][j]=matrix[i][(matrix.length-j-1)];
                   matrix[i][(matrix.length-j-1)]=temp;

        }
    }
    }
}