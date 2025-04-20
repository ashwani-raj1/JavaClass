
public class Sumprime1 {
    public static void main(String[] args) {
        int count = 0, sum = 0, num = 2;
        while (count < 20) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println(sum);
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
