public class NumerosPrimosAte100 {
    public static void main(String[] args) {
        int n = 100;

        System.out.println("Números primos entre 1 e " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
