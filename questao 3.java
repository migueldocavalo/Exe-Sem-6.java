import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();

        do {
            System.out.println(n);
            n--;
        } while (n >= 0);
    }
}
