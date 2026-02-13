public class CelToFa {
    public static void main(String[] args) {
        int temp_C = 20;
        double temp_F = (temp_C*1.8)+32;

        System.out.println(String.format("A temperatura em celsius: %d equivale a %f em farenhaits",temp_C, temp_F));

    }
}
//Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.
//String nome = "Maria";int idade = 30;double valor = 55.9999;

//System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));