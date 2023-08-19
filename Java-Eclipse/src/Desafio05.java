import java.util.Locale;
import java.util.Scanner;

public class Desafio05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, codigoPeca2, numeroPeca1, numeroPeca2;
		double precoPeca1, precoPeca2, total;
		
		codigoPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		precoPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		precoPeca2 = sc.nextDouble();
		
		total = numeroPeca1 * precoPeca1 + numeroPeca2 * precoPeca2;
		
		System.out.printf("Valor a pagar = R$%.2f%n", total);
		
		sc.close();
	}
}