import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Alunos: ");
        int q = sc.nextInt();
        double soma = 0;

        for (int i = 1; i <= q; i++) {
            System.out.print("Nota " + i + ": ");
            soma += sc.nextDouble();
        }

        System.out.println("Média: " + (soma / q));
    }
}
