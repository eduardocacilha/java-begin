import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolha um número para exibirmos sua tabuada");
        int numeroTabuada = leitura.nextInt();

        for (int i = 1; i < 11; i++) {
            int resultado = 0;
            resultado = numeroTabuada*i;
            System.out.printf("%d x %d = %d%n", numeroTabuada, i, resultado);
        }
    }
}
