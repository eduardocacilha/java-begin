public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 10.0;
        double percentualDesconto = 10.0;
        double valorComDesconto = precoOriginal*(percentualDesconto/100);

        System.out.printf("O valor original: %.2f foi para %.2f com %.2f por cento desconto", precoOriginal, valorComDesconto, percentualDesconto);
    }
}
