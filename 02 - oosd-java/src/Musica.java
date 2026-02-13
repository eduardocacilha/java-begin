public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double somaAvaliacoes;
    int totalAvaliacoes;


    void Avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes ++;
    }
    double mediaAvaliacoes() {
        return somaAvaliacoes/totalAvaliacoes;
    }
    void exibirFichaTenica() {
        System.out.println("O titulo da musica é:" + titulo);
        System.out.println("O Artista da musica é:" + artista);
        System.out.println("O ano de lancamento da musica é:" + anoDeLancamento);
    }

    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "777x666";
        musica1.artista = "Eduardo Cacilha";
        musica1.anoDeLancamento = 2005;
        musica1.Avalia(10);
        musica1.exibirFichaTenica();
        System.out.println(musica1.mediaAvaliacoes());
    }
}



//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e
// métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.