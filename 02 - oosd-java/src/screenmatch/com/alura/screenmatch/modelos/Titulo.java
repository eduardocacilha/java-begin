package screenmatch.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;
    private double mediaAvaliacoes;

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;

    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do screenmatch.com.alura.screenmatch.modelos.Filme:" + nome);
        System.out.println("Ano de Lancamento do screenmatch.com.alura.screenmatch.modelos.Filme:" + anoDeLancamento);
    }
    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes ++;
    }
    public double retornaMedia() {
        if (totalAvaliacoes == 0) {
            return 0;
        }
        return somaAvaliacoes/totalAvaliacoes;
    }

}

