public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int n = matrix.length; //nXn matrix
        for(int i =0;i<n;i++){
            for(int j = i; j<n-1-i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
