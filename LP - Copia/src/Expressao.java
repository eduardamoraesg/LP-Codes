package lp;
import java.util.Scanner;
public class Expressao {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int a = in.nextInt();
        
        System.out.println("Digite um símbolo para operação aritmética (-, +, * ou /):");
        char op;
        op = in.next().charAt(0);

        System.out.println("Digite outro número inteiro: ");
        int b = in.nextInt();

        /* sub = subtração; som = soma; mul = multiplicação; div = divisão; 
        a = primeiro número; b = segundo número.*/
        int sub = a-b;
        int som = a+b;
        int mul = a*b;
        int div = a/b;
        
        switch(op){
        case '-': System.out.printf("A subtração é igual a %d.", sub); break;
        case '+': System.out.printf("A soma é igual a %d.", som); break;
        case '*': System.out.printf("A multiplicação é igual a %d.", mul); break;
        case '/': System.out.printf("A divisão é igual a %d.", div); break;
        default: System.out.println("Este não é um operador aritmético.");
        }
    }
}
