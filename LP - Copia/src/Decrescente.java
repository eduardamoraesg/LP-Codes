// Três valores inteiros diferentes, imprimir em ordem decrescente.
import java.util.Scanner;
public class Decrescente {
    private static Scanner in;

    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int n1 = in.nextInt();
    System.out.println("Digite um número diferente: ");
    int n2 = in.nextInt();
    System.out.println("Digite um número diferente dos outros dois: ");
    int n3 = in.nextInt();
        if((n3>n2) && (n3>n1) && (n2>n1)){
    System.out.printf("A sequência em ordem decrescente é igual a: %d, %d, %d.", n3, n2, n1);
        }
    }
}