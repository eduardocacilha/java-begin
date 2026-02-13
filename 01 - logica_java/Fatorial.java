import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número inteiro para exibirmos seu fatorial");
        int fatorialNumero = leitura.nextInt();
        int resultado = 1;

        for (int i = fatorialNumero; i > 1; i--) {
            resultado *= i;
        }
        System.out.println(resultado);
    }
}
