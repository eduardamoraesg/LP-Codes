//Três números, retornar o maior.
import java.util.Scanner;
public class Quest01ie {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    int n1 = in.nextInt();
    System.out.println("Digite o segundo número: ");
    int n2 = in.nextInt();
    System.out.println("Digite o terceiro número: ");
    int n3 = in.nextInt();
        if((n1>n2) && (n1>n3)){
            System.out.printf("O maior número inteiro é %d", n1);
        } else if((n2>n1) && (n2>n3)){
            System.out.printf("O maior número inteiro é %d", n2);
        } else if((n3>n1) && (n3>n2)){
            System.out.printf("O maior número inteiro é %d", n3);
        }
        }
}