public class Conta {
	private int numero; // atributos
	private int agencia;
	private Cliente titular;
	private double saldo;
	
	private static int total = 0; //static torna o atributo pertencenta classe 
	
	public Conta(int agencia, int numero){ //Isso é um construtor, que é diferente de um metodo
	    this.agencia = agencia;
	    this.numero = numero;
	    this.saldo = 0;
	    System.out.println("Estou criando uma conta");
	    
	    Conta.total++; //poderia ficar com o Conta. e mesmo assim compila 
	}
	
	public void deposita(double valor){ // metodo
		this.saldo += valor;
	}
	
	public boolean saca(double valor) { // metodo
		if(this.saldo>=valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}		
	}
	
	public boolean transfere(double valor, Conta destino) { // metodo
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo(){ // metodo
		return this.saldo;
	}
	
	/* retirado pois o numero já é setada no construtor
	public void setNumero(int numero) {
		this.numero = numero;
	}
	*/
	public int getNumeto() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	/* retirado pois a agencia já é setada no construtor
	public void setAgencia (int agencia) {
		this.agencia = agencia;
	}
	*/
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal(){
		return Conta.total;
	}
}
