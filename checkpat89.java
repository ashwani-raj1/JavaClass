class checkpat89 {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
