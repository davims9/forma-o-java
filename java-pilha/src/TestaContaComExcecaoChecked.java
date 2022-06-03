public class TestaContaComExcecaoChecked {
	
	public static void main(String[] args) {

        Conta c = new Conta(111, 333);
        try {
            c.deposita(200,00);
        } catch(MinhaExcecao ex) {
            System.out.println("tratamento ....");
        }

    }
}
