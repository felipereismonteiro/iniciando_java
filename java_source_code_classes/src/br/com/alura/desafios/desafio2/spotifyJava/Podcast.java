package java_source_code_classes.src.br.com.alura.desafios.desafio2.spotifyJava;

public class Podcast extends Audio {
    @Override
    public void tocar() {
        super.tocar();
        System.out.println("Tocando podcast");
    }
}
