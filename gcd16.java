class gcd16 {
    public static void main(String[] args) {
        int a = 56, b = 98;
        while (a != b) {
            if (a > b) {
			a = a - b;
			}
            else {
		b = b - a;
		}
        }
        System.out.println(a);
    }
}
