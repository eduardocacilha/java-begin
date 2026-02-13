public class Carro {
    private String nomeModelo;
    private double preco1;
    private double preco2;
    private double preco3;
    private int precoMedio;

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getPreco1() {
        return preco1;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }

    public double getPreco2() {
        return preco2;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public double getPreco3() {
        return preco3;
    }

    public void setPreco3(double preco3) {
        this.preco3 = preco3;
    }

    public int getPrecoMedio() {
        return precoMedio;
    }
    public double retornaMediaPrecos() {
        return (this.preco1 + this.preco2 + this.preco3) / 3;
    }

    public double maiorValor() {
        return Math.max(this.preco1, Math.max(this.preco2, this.preco3));
    }

    public double menorValor() {
        return Math.min(this.preco1, Math.min(this.preco2, this.preco3));

    }


}

