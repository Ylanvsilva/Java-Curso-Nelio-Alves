import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma entre " + a + " + " + b + " e igual a " + soma);
		
		sc.close();
	}
}