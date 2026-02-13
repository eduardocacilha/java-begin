import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        int numeroEscolhido = new Random().nextInt(100);

        Scanner leitura = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("digite um numero de 0 a 99 e tente a sorte");
            int numeroChute = leitura.nextInt();
            if (numeroChute == numeroEscolhido) {
                System.out.printf("Parabéns você acertou");
                break;
            }
            else if (i == 4){
                    System.out.println("Nao existem mais tentativas. Você perdeu!");
                    System.out.printf("o numero escolhido era: %d", numeroEscolhido);
                    break;
            } else if (numeroChute > numeroEscolhido) {
                    System.out.printf("Você errou! Restam %d tentativas.%n", 5 - (i + 1));
                    System.out.println("");
                    System.out.println("O número palpite é maior tente um número menor");
            } else {
                    System.out.printf("Você errou! Restam %d tentativas.%n", 5 - (i + 1));
                    System.out.println("");
                    System.out.println("o seu palpite é menor tente um numero maior");




            }

        }
    }
}

