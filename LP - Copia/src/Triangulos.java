// Ler o valor dos três lados de um triângulo e dizer se ele é Equilátero, Isósceles ou Escaleno.
import java.util.Scanner;
public class Triangulos {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Declare o valor de a: ");
    int a = in.nextInt();
    System.out.println("Declare o valor de b: ");
    int b = in.nextInt();
    System.out.println("Declare o valor de c: ");
    int c = in.nextInt();
     // && = e || = ou
    if(a == b && a == c && b == c){
    System.out.println("Triângulo Equilátero");
    //Equilátero quando possui todos os lados iguais.
    }
    else if((a == b) || (a == c) || (b == c)){
    System.out.println("Triângulo Isósceles");
    // Isósceles quando possui dois lados iguais e um diferente.
    }
    else{
    System.out.println("Triângulo Escaleno");
    //Escaleno quando os três lados são diferentes.
    }
    }
}
