public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDavi = new Conta();
		contaDavi.titular = new Cliente();
		
		contaDavi.titular.nome = "Davi Moura Souza";
		contaDavi.titular.CPF = "999.999.999-99";
		contaDavi.titular.profissao = "Dev";
		
		System.out.println(contaDavi);		
		System.out.println("Saldo da conta: " + contaDavi.saldo);
		System.out.println("Numero da conta " + contaDavi.numero);
		System.out.println("Agencia da conta " + contaDavi.agencia);
		
		System.out.println(contaDavi.titular);
		System.out.println("Nome do titular: " + contaDavi.titular.nome);
		System.out.println("CPF do titular: " + contaDavi.titular.CPF);
		System.out.println("profissão do titular: " + contaDavi.titular.profissao);
		
		contaDavi.deposita(9000);
		
		System.out.println("Saldo da conta: " + contaDavi.saldo);
		
		
		if(contaDavi.saca(500)) {
			System.out.println("Saque efetuado com sucesso");
		} else{
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println("Saldo da conta: " + contaDavi.saldo);
		
	}
}
