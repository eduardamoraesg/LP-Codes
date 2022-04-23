// Ler número real e imprimir a quinta parte.
package lp;
import java.util.Scanner;
public class QuintaParte {
    private static Scanner in;
    public static void main(String [] args){
    in = new Scanner(System.in);
    System.out.println("Digite um número: ");
    double n = in.nextDouble();
    // qp = quinta parte.
    double qp = n/5;
    System.out.printf("A quinta parte do número digitado é igual a: %.2f", qp);
    }
    
}
