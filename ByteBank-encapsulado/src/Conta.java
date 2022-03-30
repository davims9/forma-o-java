public class Conta {
	private int numero;
	private int agencia;
	private Cliente titular;
	private double saldo;
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo>=valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
