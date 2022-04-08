
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		
		g.setSenha(222);
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(g);
		
		Cliente c = new Cliente();
		
		c.setSenha(2222);
		
		si.autentica(c);
		
		Autenticavel adm = new Administrador();
		
		adm.setSenha(2222);
		
		si.autentica(adm);

	}

}
