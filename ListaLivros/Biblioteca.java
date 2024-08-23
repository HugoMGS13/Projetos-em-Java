import java.util.ArrayList;

public class Biblioteca {
    // Atributo de classe para armazenar múltiplos objetos usando ArrayList
    private ArrayList<Livro> Livros;

    // Construtor para inicializar a lista
    public Biblioteca() {
        Livros = new ArrayList<>();  // Inicializa a lista
    }

    // Método para adicionar um objeto
    public void adicionarObjeto(Livro livro) {
        Livros.add(livro);
    }

    public void Buscar(String titulo){
        for (Livro livro : Livros) {
            if (livro.gettitulo() == titulo){
                livro.exibirInformacoes();
                break;
            } else {
                continue;
            }

        }
    }

    public void Imprimir(){
        for (Livro livro : Livros) {
            System.out.println(livro.gettitulo());
        }
    }
}
