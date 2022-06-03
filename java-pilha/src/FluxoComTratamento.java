public class FluxoComTratamento {

    public static void main (String[] args)  {
        System.out.println("Ini do main");
        try {
        	metodo1();
        }catch (ArithmeticException | NullPointerException | MinhaExcecao2 ex) {
        	System.out.println("Deu erro " + ex.getMessage());
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao2{
        System.out.println("Ini do metodo1");
   
       		metodo2();
 
       		System.out.println("Fim do metodo1");
       	
    }   
/*
    private static void metodo2() throws MinhaExcecao2 {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao ("erro excessão MinhaExcecao");
    }
 */   
    private static void metodo2() throws MinhaExcecao2 {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao2 ("erro excessão MinhaExcecao2");
    }
    
    
}