import java.util.Scanner;

public class leituraeretorno {

    Scanner scan = new Scanner(System.in);

    adicao adc = new adicao();
    subtracao sub = new subtracao();
    multiplicacao mult = new multiplicacao();
    divisao div = new divisao();

    int n1;
    int n2;

    public void pedir(){
        System.out.println("Escreva os dois números:");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
    }

    public void ler(int num){
        if (num == 1){
            pedir();
            System.out.println("O resultado de " + n1 + " + " + n2 + " é = " + adc.adicionar(n1,n2));
        }
        else if (num == 2){
            pedir();
            System.out.println("O resultado de " + n1 + " - " + n2 + " é = " + sub.subtrair(n1,n2));
        }
        else if (num == 3){
            pedir();
            System.out.println("O resultado de " + n1 + " x " + n2 + " é = " + mult.multiplicar(n1,n2));
        }
        else if (num == 4){
            pedir();
            System.out.println("O resultado de " + n1 + " % " + n2 + " é = " + div.divdir(n1,n2));
        }
    }
}
