public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor+0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor; //super indica que o atributo vem da classe mãe
	}
	
	
	@Override
	public double getValorImposto() {
		return saldo*0.01;
	}
	
}
