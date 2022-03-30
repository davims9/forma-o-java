public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.deposita(300);
		
		System.out.println("Saldo da primeiraConta: " + primeiraConta.saldo);
		
		primeiraConta.deposita(200);
		
		System.out.println("Saldo da primeiraConta " + primeiraConta.saldo);
		System.out.println("Saldo da segundaConta " + segundaConta.saldo);
		
		segundaConta.deposita(1200);
		
		System.out.println("Saldo da primeiraConta " + primeiraConta.saldo);
		System.out.println("Saldo da segundaConta " + segundaConta.saldo);
		
		segundaConta.transfere(200, primeiraConta);
		
		if (segundaConta.transfere(200, primeiraConta)) {
			System.out.println("tranferencia efetua");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println("Saldo da primeiraConta " + primeiraConta.saldo);
		System.out.println("Saldo da segundaConta " + segundaConta.saldo);
		
		segundaConta.saca(2000);
				
		if (segundaConta.transfere(2000, primeiraConta)) {
			System.out.println("saque efetuado");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println("Saldo da primeiraConta" + primeiraConta.saldo);
		System.out.println("Saldo da segundaConta" + segundaConta.saldo);
		
	}
}
