package pGaOleGaOle;
import java.util.*;
public class Battlefield {
	static String BG01= "_PokemonGaOleeGaOlee_";
	static String BG02= "_|%s|_"; // format trainer name & pokemon name into a 21 string 
	static String BG03= "_|_______________%s|_"; // format pokemon's health - opponent
	static String BG04= "_|_________________|_";
	static String BG05= "_|_______________%s|_"; // format pokemon's health - player
	static String BG06= "_|%s|_";// format main players name & pokemon name into a 21 string
	
	
	//Display for pokemon selection
	String DisplayCase1 = "Pokemon 1:%s \n"
			            + "TYPE: %s\n"
			            + "Rarity: %s\n";

	// display everytime before player is prompted a response
	public static void BG_Display(String name, String pokeName, String WildName, int Hp1, int Hp2) {
		System.out.println(BG01);
		System.out.println(BG02.formatted(WildName));// formats trainer name & pokemon's name
		System.out.println(BG03.formatted(Hp2));// formats pokemons' health
		System.out.println(BG04);
		System.out.println(BG05.formatted(Hp1));
		System.out.println(BG06.formatted(name+ "|" +pokeName)); // formats trainer's name & pokemon's name
	}
	
	public String DisplayName(Player mainplayer) {
		// main function of method is to return a 21 string format 
		// like "pokemonname|Playername"
		Pokemon pplayer = mainplayer.getMainPokemon();
		String pokemonName = pplayer._name;
		String PlayerName = mainplayer.getName();
		return pokemonName+"|" + PlayerName;
	}
	
	
	
	public static String Welcome(Scanner user) {
		// gets the trainers name
		System.out.println("Hello Trainer, welcome to the world of pokemon");
		System.out.println("A different kind of pokemon");
		System.out.println("A Ga Oleeee Ga Oleeee kind of Pokemon");
		
		System.out.println("Can I ask your name?");
		String name = user.next();
		return name;
	}

}
