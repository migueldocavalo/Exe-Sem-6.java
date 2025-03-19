import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Início: ");
        int ini = sc.nextInt();
        System.out.print("Fim: ");
        int fim = sc.nextInt();

        System.out.println("Primos:");
        for (int i = ini; i <= fim; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
