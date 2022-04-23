package lp;
// Três valores inteiros e imprimir a soma.
import java.util.Scanner;
public class TresValInt {
    private static Scanner in;

    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    int n1 = in.nextInt();
    System.out.println("Digite o segundo número: ");
    int n2 = in.nextInt();
    System.out.println("Digite o terceiro número: ");
    int n3 = in.nextInt();
// s = soma entre n1, n2, n3.
    int s = n1+n2+n3;
    System.out.printf("A soma entre os três números informados é igual a: %d.", s);
    }
}
