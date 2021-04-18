import java.util.Scanner;

public class CalculadoraReview {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
		double primeiroValor;
		double segundoValor;
		double soma, divisao , subtracao , multiplicacao;
		
		System.out.println("Por favor, digite seu primeiro valor");
		primeiroValor = leitor.nextDouble();
		System.out.println("Por favor, digite o segundo valor");
		segundoValor = leitor.nextDouble();
		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores é " + soma);
		divisao = primeiroValor / segundoValor;
		System.out.println("A soma entre os dois valores é " + divisao);
		subtracao = primeiroValor - segundoValor;
		System.out.println("A soma entre os dois valores é " + subtracao);
		multiplicacao = primeiroValor * segundoValor;
		System.out.println("A soma entre os dois valores é " + multiplicacao);
		
		
	
	
	
		leitor.close();
	
	}

}
