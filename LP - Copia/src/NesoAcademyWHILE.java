package lp;
import java.util.Scanner;
public class NesoAcademyWHILE {
    private static Scanner s;
    public static void main(String args[]){
        s = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 10");
        int contador = 100;
        int n = s.nextInt();
        while(n < 1 || n > 10){
            System.out.print( n+" não está entre 1 e 10. Por favor, informe um número válido: ");
            n = s.nextInt();
            System.out.println(contador + ",");
        }
        System.out.println("K");
    }
}



        //     System.out.println("Digite um número entre 1 e 10");
        
    //     int n = s.nextInt();
    //     while(n < 1 || n > 10){
    //         System.out.print( n+" não está entre 1 e 10. Por favor, informe um número válido: ");
    //         n = s.nextInt();
    //     }
    //     System.out.println("K");
    // }
