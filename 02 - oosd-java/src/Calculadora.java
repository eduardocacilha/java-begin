public class Calculadora {
    void dobraNumero(double numero) {
        numero *= numero;
        System.out.println(numero);
    }

    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();
        calculadora1.dobraNumero(16);
    }
}
