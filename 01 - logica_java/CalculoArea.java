import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite 1 para calcular a área do quadrado");
        System.out.println("Digite 2 para calcular a área do circulo");

        int opcao = leitura.nextInt();
        double area = 0;

        if (opcao == 1) {
            System.out.println("Vamos calcular a área do quadrado digite a medida do lado L abaixo");
            double ladoL = leitura.nextDouble();
            area += Math.pow(ladoL, 2);
            System.out.printf("A área do quadrado é %.2f", area);
        }
        else if (opcao == 2) {
            System.out.println("Vamos calcular a área do circulo digite a medida do raio r abaixo");
            double raioR = leitura.nextDouble();
            area += Math.PI * Math.pow(raioR, 2);
            System.out.printf("A área do circulo é %.2f", area);

        }
        else {
            System.out.println("Por favor digite 1 ou 2");
        }

    }
}
