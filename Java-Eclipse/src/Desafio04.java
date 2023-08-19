import java.util.Locale;
import java.util.Scanner;

public class Desafio04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numeroFuncionario, horasTrabalhadas, valorHora, salarioFuncionario;
		
		numeroFuncionario = sc.nextDouble();
		horasTrabalhadas = sc.nextDouble();
		valorHora = sc.nextDouble();
		
		salarioFuncionario = horasTrabalhadas * valorHora;
		
		System.out.printf("Numero = %.2f%n", numeroFuncionario);
		System.out.printf("Salario = R$%.2f%n", salarioFuncionario);
		
		sc.close();
	}
}