class alterStr82 {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= N; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= N; j++) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
