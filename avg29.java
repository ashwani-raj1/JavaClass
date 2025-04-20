class avg29 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
   	 for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / (double) array.length;
        System.out.println(average);
    }
}
