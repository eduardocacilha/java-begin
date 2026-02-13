import java.util.Scanner;

public class SinalNumero {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);
        System.out.println("Digite um número inteiro abaixo");

        int numeroUsuario = Leitura.nextInt();

        if (numeroUsuario < 0) {
            System.out.printf("O número: %d é negativo", numeroUsuario);
        }
        else if (numeroUsuario > 0) {
            System.out.printf("O número: %d é positivo", numeroUsuario);
        }
    }
}
