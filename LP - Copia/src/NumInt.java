package lp;
// Ler e imprimir um número inteiro.
import java.util.Scanner;
public class NumInt {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite um número inteiro:");
    int n1 = in.nextInt();
    System.out.printf("O número digitado foi: %d.", n1);
    }
}
