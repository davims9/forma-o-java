public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Teste de condições com booleano");
		int idade = 18;
		int acompanhantes = 2;
		boolean quantidadeAcompanhantes = acompanhantes > 0;
		
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
