import screenmatch.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import screenmatch.com.alura.screenmatch.modelos.Filme;
import screenmatch.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Eduardo");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(180);



        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.8);
        System.out.println(meuFilme.getTotalAvaliacoes());
        meuFilme.avalia(7.5);
        System.out.println(meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.retornaMedia());
        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("---------------");
        System.out.println(lost.getDuracaoEmMinutos());
        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

    }
}
