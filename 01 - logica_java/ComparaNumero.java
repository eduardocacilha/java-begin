import java.util.Scanner;

public class ComparaNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira dois números inteiros abaixo");
        int primeiroValor = leitura.nextInt();
        int segundoValor = leitura.nextInt();

        if (primeiroValor > segundoValor) {
            System.out.printf("O primeiro valor: %d é maior que o segundo valor: %d", primeiroValor, segundoValor);
        } else if (primeiroValor < segundoValor) {
            System.out.printf("O primeiro valor: %d é menor que o segundo valor: %d", primeiroValor, segundoValor);
        } else {
            System.out.printf("Os valores: %d e %d são iguais", primeiroValor, segundoValor);
        }

    }
}




