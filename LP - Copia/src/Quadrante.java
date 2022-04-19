import java.util.Scanner;
public class Quadrante {
    private static Scanner in;

    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Informe x: ");
    double x = in.nextDouble();
    System.out.println("Informe y: ");
    double y = in.nextDouble();
    if(x>=0 && y>=0){
    System.out.println("Primeiro Quadrante");
    }
    if(x<=0 && y<=0){
    System.out.println("Segundo Quadrante");
    }
    if(x<=0 && y<=0){
    System.out.println("Terceiro Quadrante");
    }
    if(x>=0 && y<=0){
    System.out.println("Quarto quadrante");
    }
}
}
