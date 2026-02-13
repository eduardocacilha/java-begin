public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean maiorDeIdade() {
        if (idade >= 18) {
            System.out.println("Maior de idade");
            return true;
        }
        else {
            System.out.println("Menor de idade");
            return false;
        }
    }

    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setIdade(17);
        pessoa1.setNome("Eduardo");

        pessoa1.getIdade();
        pessoa1.getNome();
        System.out.println(pessoa1.maiorDeIdade());

    }
}


//Crie uma classe IdadePessoa com os atributos privados nome e idade.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.