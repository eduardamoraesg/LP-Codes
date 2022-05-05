package lp;
import java.util.Scanner;
public class LoopWhile {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Contando até 10");
        int i  = 1;
        int max = 10;

        while(i<max){
            System.out.println("Valor de i= " + i); 
            i++; // i = i + 1 ou i += 1

        }
    }
}
