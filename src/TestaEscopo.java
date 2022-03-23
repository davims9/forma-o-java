public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Teste de condi��es com booleano");
		int idade = 18;
		int acompanhantes = 2;
		boolean quantidadeAcompanhantes = acompanhantes > 0;
		
		/* isso n�o compila pois a variavel fica criada somente dentro do escopo do if
		 * deixando de existir quando sai
		 if (acompanhantes >= 2){
		 	boolean quantidadeAcompanhantes = true;
		 }else{
		 	boolean quantidadeAcompanhantes = false;
		 }
		 */
		
		/* isso n�o compila pois a variavel corre o risco de n�o ser inicializada.
		 * 
		 * boolean quantidadeAcompanhantes;
		 if (acompanhantes >= 2){
		 	quantidadeAcompanhantes = true;
		 }
		 */
		
		if (idade > 18) {
			System.out.println("Sua idade � maior que 18");
			System.out.println("Pode entrar");
		} else if (idade == 18) {
			System.out.println("Sua idade � 18");
			System.out.println("Pode entrar");
		} else if (idade < 18 && quantidadeAcompanhantes) {
			System.out.println("Voc� tem menos de 18 anos");
			System.out.println("Mas est� companhado. Pode entrar!");
		}else {
			System.out.println("Voc� n�o pode entrar");
		}
	}
}
