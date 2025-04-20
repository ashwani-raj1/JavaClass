class Gmult97 {
    public static void main(String[] args) {
        int N = 3;
        int[][] matrix = new int[N][N];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                matrix[i - 1][j - 1] = i * j;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
