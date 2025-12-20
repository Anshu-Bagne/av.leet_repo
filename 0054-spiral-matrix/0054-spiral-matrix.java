class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> res= new ArrayList<Integer>();
        int col_b=0,row_b=0;
        int col_e=matrix[0].length-1, row_e=matrix.length-1;

        while(row_b<=row_e && col_b<=col_e){

            for(int i=col_b;i<=col_e;i++){
                res.add(matrix[row_b][i]);
            }
            row_b++;

            for(int i=row_b;i<=row_e;i++){
                res.add(matrix[i][col_e]);
            }
            col_e--;

            if(row_b<=row_e){
                for(int i=col_e;i>=col_b;i--){
                res.add(matrix[row_e][i]);
            }
            row_e--;
            }
            if(col_b<=col_e){
            
                for(int i=row_e;i>=row_b;i--){
                res.add(matrix[i][col_b]);
            }
            col_b++;
            }
         //   res.remove();
        }

        return res;
        
    }}