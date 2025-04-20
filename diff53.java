class diff53 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sumEven = 0, sumOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
