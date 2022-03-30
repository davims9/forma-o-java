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
		
		boolean sucessoTranferencia = segundaConta.transfere(200, primeiraConta);
		
		if (sucessoTranferencia) {
			System.out.println("tranferencia efetua");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println("Saldo da primeiraConta " + primeiraConta.saldo);
		System.out.println("Saldo da segundaConta " + segundaConta.saldo);
		
					
		if (segundaConta.transfere(2000, primeiraConta)) { //novamente efetua a tranferencia junto com a validação 
			System.out.println("saque efetuado");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println("Saldo da primeiraConta" + primeiraConta.saldo);
		System.out.println("Saldo da segundaConta" + segundaConta.saldo);
		
	}
}
