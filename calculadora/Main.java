import java.util.Scanner; // Importando o pacote Java.util para usar o método Scanner e receber dados

class Main {
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in); /* Criando um objeto scan que faz referência ao método Scanner(System.in)
        para receber os dados no programa*/

        leituraeretorno read = new leituraeretorno(); /* Criando um objeto read que faz referência à classe leituraeretorno que
        cuidará de ler os números e retornar o 
        resultado */ 

        int num; // Criando a variável local do tipo inteiro "num"

        System.out.println("Escolha uma ação:\n1 - Adição\n2 - Subtracao\n3 - Multiplicação\n4 - Divisão");

        num = scan.nextInt(); /* Num receberá o valor do tipo inteiro que o scan irá receber */
        
        read.ler(num); /* Uso o objeto read para invocar o mérodo ler com o parâmetro sendo a 
        variável "num" */


    }
}