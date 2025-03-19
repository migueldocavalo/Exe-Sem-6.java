import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        int cont = 1;

        while (cont <= 10) {
            System.out.println(num + " x " + cont + " = " + (num * cont));
            cont++;
        }
    }
}
