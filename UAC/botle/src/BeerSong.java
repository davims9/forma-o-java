public class BeerSong {
	public static void main (String[] args) {
		int beerNum = 99;
		String name = "garrafas";
		
		while (beerNum > 0) {
			if (beerNum == 1){
				name = "garrafa";
			}
			System.out.println(beerNum+ " " +name+ " de cerveja no murro");
			System.out.println(beerNum+ " " +name+ " de cerveja");
			System.out.println("Tire uma fora");
			System.out.println("Passe ao redor");
			beerNum = beerNum-1;
			
			if (beerNum > 0) {
			System.out.println(beerNum+ " " +name+ " de cerveja no murro");
			}
		}
		System.out.println("Sem mais garrafas de cerveja no murro");
	}
}