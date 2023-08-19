import java.util.Locale;
import java.util.Scanner;

public class Desafio16 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor >= 0.0 && valor <= 25.00) {
			System.out.printf("Intervalo (0, 25)");
		}
		if (valor > 25.00 && valor <= 50.00) {
			System.out.printf("Intervalo (25, 50)");
		}
		if (valor >= 50.00 && valor <= 75.00) {
			System.out.printf("Intervalo (50, 75)");
		}
		if (valor >= 75.00 && valor <= 100.00) {
			System.out.printf("Intervalo (75, 100)");
		} 
		if(valor < 0 || valor > 100) {
			System.out.println("Fora de Intervalo");
		}
		
		
		sc.close();
	}
}