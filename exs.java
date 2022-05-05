package aulaexs;
import java.util.Scanner;
public class exs {
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	
	boolean saida = true;
	
	while(saida) {
		System.out.println("Digite 1 para sair: "); 
		int entrada = in.nextInt();
		if (entrada==1) {
			saida = false;
		}
	}
	}
}
