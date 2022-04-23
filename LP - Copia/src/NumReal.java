// Ler e imprimir um número real.
package lp;
import java.util.Scanner;
public class NumReal {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite um número: ");
    double n = in.nextDouble();
    System.out.printf("O número digitado foi: %.2f", n);
    }
}
