public class testeConversao {
	public static void main(String[] args) {
		double salario = 6164.90;
		int valor = (int) salario;	//casting converte um tipo da variavel para outro
		
		System.out.println("Convers�o de variavel " + valor);
		
		long variavelLong = 654651657651621l; //colocar l no final para indicar que � realmente um long e n�o int
		
		System.out.println("Impress�o de long " + variavelLong);
		
		float variavelFloat = 6546.66f; // coloca o f no final para indicar que � realmente um float e n�o double 
		
		System.out.println("Impress�o float: " + variavelFloat);
		double valor1 = 0.2;
		double valor2 = 0.1;
		double somaDoubleProblema = valor1+valor2;
		
		System.out.println("Impress�o de soma do double: " + somaDoubleProblema);
	}
}
