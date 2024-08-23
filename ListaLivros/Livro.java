public class Livro {
    private String titulo;
    private String Autor;
    private int numeroPaginas;

    public Livro(String titulo, String Autor, int numeroPaginas){
        this.titulo = titulo;
        this.Autor = Autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirInformacoes(){
        System.out.println("O livro " + this.titulo + " de " + this.Autor + " possui " + this.numeroPaginas + " paginas.");
    }

    public String gettitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.Autor;
    }

    public int numeroPaginas(){
        return this.numeroPaginas;
    }

    public void setTitulo(String newTitulo){
        this.titulo = newTitulo;
    }

    public void setAutor(String newAutor){
        this.Autor = newAutor;
    }

    public void setNumeroPaginas(int newNumPag){
        this.numeroPaginas = newNumPag;
    }
}
