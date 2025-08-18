import java.util.Scanner;

public class Desconto {

    public static void main(String[] args) {
        System.out.println("Digite o valor da compra");
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextInt();

        if(valor >= 100){

         double desconto = 0.1;
         double numero = valor * desconto;
         double total = valor - numero;

            System.out.println("Com Desconto fica:"+ total);
        }else if( valor < 100){

            System.out.println("Sem Desconto  = R$ "+ valor);
        }
    }

}
