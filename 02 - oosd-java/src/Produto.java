public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


    public void aplicarDesconto(double valorPercentual) {
        preco -= (valorPercentual/100*preco);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setPreco(100);
        produto1.setNome("Mouse");

        System.out.println(produto1.getPreco());

        produto1.aplicarDesconto(10);
        produto1.getPreco();
        System.out.println(produto1.getPreco());
    }
}


//Desenvolva uma classe Produto com os atributos privados nome e preco.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.