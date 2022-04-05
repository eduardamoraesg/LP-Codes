// Ler A, B, C e imprimir se A+B é menor que C.
import java.util.Scanner;
public class SomaMenor {
    private static Scanner in;

    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    int a = in.nextInt();
    System.out.println("Digite o segundo número: ");
    int b = in.nextInt();
    System.out.println("Digite o terceiro número: ");
    int c = in.nextInt();
    int soma = a+b;
        if (soma<c){
// if = se, logo, irá imprimir *se* o valor da soma entre A e B for menor que o valor de C.
            System.out.printf("A soma entre %d e %d é menor que %d.", a, b, c);
        } 
//Caso a soma entre A e B for maior que C.
        else if (soma>c) {
            System.out.printf("A soma entre %d e %d é maior que %d", a, b, c);
        }
    }
}