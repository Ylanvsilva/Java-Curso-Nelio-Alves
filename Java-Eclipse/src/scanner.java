import java.util.Locale;
import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);
		
		Locale.setDefault(Locale.US);
		double z;
		z = sc.nextDouble();
		System.out.println("Voce digitou: " + z);
		System.out.printf("Voce digitou: %.2f%n", z);
		
		char w;
		w = sc.next().charAt(0);
		System.out.println("Voce digitou: " + w);
		
		String a;
		int b;
		double c;
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		System.out.printf("Voce digitou: " + a + " -> " + b + " -> " + c);
		
		sc.close();
	 }
}