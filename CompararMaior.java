import java.util.InputMismatchException;
import java.util.Scanner;

public class CompararMaior {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            int primeiro = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int segundo = scanner.nextInt();

            if (primeiro > segundo) {
                System.out.println("O maior número é: " + primeiro);
            } else if (segundo > primeiro) {
                System.out.println("O maior número é: " + segundo);
            } else {
                System.out.println("Os números são iguais: " + primeiro);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
