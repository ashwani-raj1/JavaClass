class sumallp87 {
    public static void main(String[] args) {
        int[][] matrix = {{1, -2, 3}, {4, -5, 6}, {-7, 8, 9}};
        int sum = 0;
      for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    sum += matrix[i][j];
                }
            }
	}
        System.out.println("Sum of positive elements: " + sum);
    }
}
