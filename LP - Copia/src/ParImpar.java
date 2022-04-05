// Receber um número qualquer e informar se é par ou ímpar.
import java.util.Scanner;
public class ParImpar {
    private static Scanner in;

    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int n = in.nextInt();
        if(n % 2 == 0){
            System.out.println("O número " +n+ " é par.");
// Se o resto da divisão entre o número escolhido e 2 for igual a 0, o número é par.
        } else {
            System.out.println("O número " +n+ " é ímpar.");
// Caso contrário, o número é ímpar.
        }
    }
}
