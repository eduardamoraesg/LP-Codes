import java.util.Scanner;
public class Notas {
    private static Scanner in;

    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite uma nota: ");
    double nota = in.nextDouble();
    if((8.0<=nota) & (nota<=10)){
    System.out.println("Nota A");
    } 
    if((7.0<=nota) & (nota<8.5)){
    System.out.println("Nota B");
    }
    if((5.0<=nota) & (nota<7.0)){
    System.out.println("Nota C");
    }
    if((3.0<=nota) & (nota<5.0)){
    System.out.println("Nota D");
    }
    if(nota<3.0){
    System.out.println("Nota E");
    }
    }
}
