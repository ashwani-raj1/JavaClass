class fibseq74 {
    public static void main(String[] args) {
        int N = 10;
        int a = 0, b = 1;
        int i = 0;
        while (i < N) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
        }
    }
}
