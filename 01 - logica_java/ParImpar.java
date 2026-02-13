import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolha um número inteiro para verificar se é par ou impar");
        int numeroEscolhido = leitura.nextInt();

        if (numeroEscolhido % 2 == 0) {
            System.out.printf("O número escolhido %d é par", numeroEscolhido);
        } else {
            System.out.printf("O número escolhido %d é ímpar", numeroEscolhido);

        }


    }
}
