public class App {
    public static void main(String[] args) {

        Livro Ocapital = new Livro("O capital", "Karl Marx", 900);
        Livro Biblia = new Livro("Biblia", "Desconhecido", 1000);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarObjeto(Biblia);
        biblioteca.adicionarObjeto(Ocapital);
        biblioteca.Buscar("Biblia");
        biblioteca.Imprimir();

    }
}
