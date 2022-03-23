public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Teste de condições com booleano");
		int idade = 18;
		int acompanhantes = 2;
		boolean quantidadeAcompanhantes = acompanhantes > 0;
		
		/* isso não compila pois a variavel fica criada somente dentro do escopo do if
		 * deixando de existir quando sai
		 if (acompanhantes >= 2){
		 	boolean quantidadeAcompanhantes = true;
		 }else{
		 	boolean quantidadeAcompanhantes = false;
		 }
		 */
		
		/* isso não compila pois a variavel corre o risco de não ser inicializada.
		 * 
		 * boolean quantidadeAcompanhantes;
		 if (acompanhantes >= 2){
		 	quantidadeAcompanhantes = true;
		 }
		 */
		
		if (idade > 18) {
			System.out.println("Sua idade é maior que 18");
			System.out.println("Pode entrar");
		} else if (idade == 18) {
			System.out.println("Sua idade é 18");
			System.out.println("Pode entrar");
		} else if (idade < 18 && quantidadeAcompanhantes) {
			System.out.println("Você tem menos de 18 anos");
			System.out.println("Mas está companhado. Pode entrar!");
		}else {
			System.out.println("Você não pode entrar");
		}
	}
}
