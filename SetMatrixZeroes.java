public class SetMatrixZeroes{
    public static void main (String[] args){
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        String rows = " ";
        String cols = " ";
        for(int i = 0; i<matrix.length ; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    rows = rows + Integer.toString(i) + " ";
                    cols = cols + Integer.toString(j) + " ";
                }
            }
        }
        for(int i = 0; i<matrix.length ; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(rows.contains(" "+ Integer.toString(i) + " ") == true || cols.contains(" " + Integer.toString(j) + " ") == true){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 0; i<matrix.length ; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}