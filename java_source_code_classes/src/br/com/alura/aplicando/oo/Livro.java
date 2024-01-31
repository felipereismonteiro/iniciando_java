package java_source_code_classes.src.br.com.alura.aplicando.oo;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("autor: " + autor);
        System.out.println("titulo: " + titulo);
    }
}
