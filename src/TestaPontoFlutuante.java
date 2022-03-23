public class TestaPontoFlutuante {
	public static void main(String[] args) {
		double salario = 6164.90;
		System.out.println("Meu salario é de " + salario);
		
		double naoImprimeDouble = 5 / 2; //não imprime corretamente devido a leitura começar da direita com 2 inteiros
		System.out.println("Isso não imprime corretamento o double: " + naoImprimeDouble);
		
		double imprimeDouble = 5.0 / 2; //imprime double corretamente, pois 1 dos 2 é double 
		System.out.println("Isso imprime DOUBLE corretamente: " + imprimeDouble);
		
		
	}
}
