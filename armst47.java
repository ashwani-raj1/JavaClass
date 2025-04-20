class armst47 {
    public static void main(String[] args) {
        int number = 153, originalNumber = number, result = 0;
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        System.out.println(result == number);
    }
}
