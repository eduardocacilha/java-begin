public class ModeloCarro extends Carro{
    public static void main(String[] args) {
        ModeloCarro carro1 = new ModeloCarro();
        carro1.setNomeModelo("Fusca");
        carro1.setPreco1(1000);
        carro1.setPreco2(2000);
        carro1.setPreco3(3000);
        System.out.println(carro1.retornaMediaPrecos());
        System.out.println(carro1.maiorValor());
        System.out.println(carro1.menorValor());

    }

}


