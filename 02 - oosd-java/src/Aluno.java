public class Aluno {
    private String nome;
    private double notas;
    private double somaNotas;
    private int totalNotas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double notas) {
        this.notas = notas;
        somaNotas += notas;
        totalNotas ++;
    }

    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }
    public double calcularMedia() {
        if(totalNotas == 0) {
            return 0;

        }
        else {
            return somaNotas/totalNotas;
        }
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Eduardo");
        aluno1.setNotas(9.80);
        aluno1.setNotas(8.5);
        aluno1.setNotas(9.0);
        aluno1.setNotas(8.7);
        System.out.println(aluno1.calcularMedia());
        System.out.println(aluno1.totalNotas);
        System.out.println(aluno1.somaNotas);

    }

}

//Desenvolva uma classe Aluno com os atributos privados nome e notas.
//Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método calcularMedia que retorna a média das notas do aluno.