public class testeConversao {
	public static void main(String[] args) {
		double salario = 6164.90;
		int valor = (int) salario;	//casting converte um tipo da variavel para outro
		
		System.out.println("Conversão de variavel " + valor);
		
		long variavelLong = 654651657651621l; //colocar l no final para indicar que é realmente um long e não int
		
		System.out.println("Impressão de long " + variavelLong);
		
		float variavelFloat = 6546.66f; // coloca o f no final para indicar que é realmente um float e não double 
		
		System.out.println("Impressão float: " + variavelFloat);
		double valor1 = 0.2;
		double valor2 = 0.1;
		double somaDoubleProblema = valor1+valor2;
		
		System.out.println("Impressão de soma do double: " + somaDoubleProblema);
	}
}
