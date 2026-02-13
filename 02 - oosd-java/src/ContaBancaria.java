public class ContaBancaria {
    private int numeroConta;
    private double saldoInicial;
    public String titular;

    public ContaBancaria(int numeroConta, double saldoInicial, String titular) {
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial; // Aqui você define o saldo inicial com segurança
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void transferir(double valor) {
        if (saldoInicial >= valor) {
            saldoInicial -= valor;
        }
        else {
            System.out.println("Saldo Insuficiente:" + saldoInicial);
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldoInicial += valor;
        }
        else {
            System.out.println("Por favor insira um valor maior do que zero");
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123, 2000, "Eduardo");
        System.out.println(conta1.numeroConta);
        System.out.println(conta1.saldoInicial);
        System.out.println(conta1.titular);
        conta1.transferir(1000);
        System.out.println(conta1.saldoInicial);
        conta1.transferir(1000);
        System.out.println(conta1.saldoInicial);
        conta1.transferir(10);


    }
}
