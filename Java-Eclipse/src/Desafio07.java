import java.util.Locale;
import java.util.Scanner;

public class Desafio07 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, area, metroQuadrado, preco;
		
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		metroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		preco = metroQuadrado * area;
		System.out.println("Largura: " + largura);
		System.out.println("Comprimento: " + comprimento);
		System.out.println("Preco em metros quadrados: " + metroQuadrado);
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);
		
		sc.close();
	}
}