package java_source_code_classes.src.br.com.alura.desafios.desafio2.spotifyJava;

public class Audio implements AudioDefault {
    private static long totalDeReproducoes;

    public long getTotalReproducoes() {
        return totalDeReproducoes;
    }

    @Override
    public void tocar() {
        totalDeReproducoes++;
    }
}
