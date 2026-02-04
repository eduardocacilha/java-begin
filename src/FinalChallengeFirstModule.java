import java.util.Scanner;

public class FinalChallengeFirstModule {
    public static void main(String[] args) {
        String nome = "Eduardo Cacilha Steinbach";
        String tipoConta = "Corrente";
        double saldoInicial = 2.500;
        Scanner leitura = new Scanner(System.in);
        while (true) {

        System.out.println("*******************************");
        System.out.println("DADOS INICIAIS DO CLIENTE:");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Tipo da Conta: %s%n",tipoConta );
        System.out.printf("Saldo inicial: %f%n", saldoInicial);
        System.out.println("*******************************");

        System.out.println("Operações");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Receber Valor");
        System.out.println("3 - Transferir Valor");
        System.out.println("4 - Sair");

        int opcao = leitura.nextInt();

        if (opcao == 1) {
            System.out.printf("Saldo disponivel de: %f", saldoInicial);
            System.out.println("");
            try {
                System.out.println("Aguardando 2 segundos...");
                Thread.sleep(2000); // O delay acontece aqui
                System.out.println("Continuando!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
        else if (opcao == 2) {
            System.out.println("Digite o valor a receber abaixo");
            double valorReceber = leitura.nextDouble();
            saldoInicial += valorReceber;
            System.out.printf("Seu novo saldo é de: %f", saldoInicial);
            System.out.println("");

            try {
                System.out.println("Aguardando 2 segundos...");
                Thread.sleep(2000); // O delay acontece aqui
                System.out.println("Continuando!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");

        } else if (opcao == 3) {
            System.out.println("Digite o valor a ser transferido abaixo");
            double valorTransferir = leitura.nextDouble();
            saldoInicial -= valorTransferir;
            System.out.printf("Seu novo saldo é de: %f", saldoInicial);
            System.out.println("");

            try {
                System.out.println("Aguardando 2 segundos...");
                Thread.sleep(2000); // O delay acontece aqui
                System.out.println("Continuando!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");

        } else {
            System.out.println("Saindo, obrigado!");
            System.out.println("");

            try {
                System.out.println("Aguardando 2 segundos...");
                Thread.sleep(2000); // O delay acontece aqui
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
            break;
        }


    }}
}
