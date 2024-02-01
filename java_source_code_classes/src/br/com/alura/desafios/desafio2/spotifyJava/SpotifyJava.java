package java_source_code_classes.src.br.com.alura.desafios.desafio2.spotifyJava;

public class SpotifyJava {
    public static void main(String[] args) {
        Podcast podcast = new Podcast();
        Musica musica = new Musica();

        for (int i = 0; i < 10; i++) {
            podcast.tocar();
        }

        for (int i = 0; i < 50; i++) {
            musica.tocar();
        }

        long reproducoes = podcast.getTotalReproducoes();
        System.out.println(reproducoes);
    }
}
