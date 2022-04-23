package lp;
// Ler um número real e imprimir o quadrado desse número.
import java.util.Scanner;
public class NumQuadrado {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
        System.out.println("Digite um número:");
        double n = in.nextDouble();
        double quad = n*n;
        System.out.printf("O quadrado do número informado é igual a: %.2f.", quad);
    }
}
