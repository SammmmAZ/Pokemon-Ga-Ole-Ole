package pGaOleGaOle;
import java.util.*;
public class PlayGame {
	public static void main(String[] args) {
		// the actual start of the code
		// pre create the rarity's
		Rarity OneStar = new Rarity("*");
		Rarity TwoStar = new Rarity("**");
		Rarity ThrStar = new Rarity("***");
		Rarity ForStar = new Rarity("****");
		Rarity FivStar = new Rarity("*****");
		//-----------------------------------
		//-----------------------------------
		//pre create the typings
		Type Fire = new Type("Fire");
		Type Grass = new Type("Grass");
		Type Water = new Type("Water");
		// ----------------------------
		// ----------------------------
		
		
		// predefined lists of pokemon as decided by group 
		ArrayList<String> Pokemons = new ArrayList<>(Arrays.asList("Swablu", "Axew", "IvySaur", "Torkoal", "Poliwhirl", "Inteleon", "Dewott", "Wartortle", "Charizard", "Latios"));
        ArrayList<Rarity> PRarity = new ArrayList<>(Arrays.asList(OneStar,ThrStar,TwoStar,OneStar,TwoStar,ThrStar, ThrStar, ForStar, ThrStar, FivStar));
        ArrayList<Type> PType = new ArrayList<>(Arrays.asList(Water,Fire,Grass,Fire,Water,Fire,Grass,Grass,Water,Fire,Fire));
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        
        // prior to interact with player
        // place welcoming titles
        Scanner userInput = new Scanner(System.in);
        String username = Battlefield.Welcome(userInput);
        
        // pre-create a scanner
        // to choose a pokemon, from an array of 10 pokemon along with their rarity
        Pokemon MyPokemon = GeneratePokemon();
        // use the player constructor to create the player instance
        Player Main = new Player(username, MyPokemon, 0);
        System.out.print(Main);
        System.out.print(MyPokemon);
        Pokemon WildPokemon = GeneratePokemon();
        System.out.print(WildPokemon);
        
        
        //clears screen
        System.out.print("Enter battle");
        Battle(Main,WildPokemon);
        
        System.out.println("Thank You for playing");
        
        
        
	}
	/// methods of playGame
	public static Pokemon GeneratePokemon() {
		// pre create the rarity's
		Rarity OneStar = new Rarity("*");
		Rarity TwoStar = new Rarity("**");
		Rarity ThrStar = new Rarity("***");
		Rarity ForStar = new Rarity("****");
		Rarity FivStar = new Rarity("*****");
		//-----------------------------------
		//-----------------------------------
		//pre create the typings
		Type Fire = new Type("Fire");
		Type Grass = new Type("Grass");
		Type Water = new Type("Water");
		// ----------------------------
		// ----------------------------
		
		
		// predefined lists of pokemon as decided by group 
		ArrayList<String> Pokemon = new ArrayList<>(Arrays.asList("Swablu", "Axew", "IvySaur", "Torkoal", "Poliwhirl", "Inteleon", "Dewott", "Wartortle", "Charizard", "Latios"));
        ArrayList<Rarity> PRarity = new ArrayList<>(Arrays.asList(OneStar,ThrStar,TwoStar,OneStar,TwoStar,ThrStar, ThrStar, ForStar, ThrStar, FivStar));
        ArrayList<Type> PType = new ArrayList<>(Arrays.asList(Water,Fire,Grass,Fire,Water,Fire,Grass,Grass,Water,Fire,Fire));
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        // prior to interact with player
        // place welcoming titles
        // to choose a pokemon, from an array of 10 pokemon along with their rarity
        // loops until player gets pokemon of choice
        while(true) {
        	// generate random number representing the columns in the array
            Random rand = new Random();
            int randomNumber = rand.nextInt(10);	
            // fetches pokemon data at each specific column based on the number
            String PG = Pokemon.get(randomNumber);
            Rarity PR = PRarity.get(randomNumber); 
            Type PT = PType.get(randomNumber);
            Pokemon Samples = new Pokemon(PG,PR,PT);
            System.out.println(Samples);
            System.out.println("Do you want this pokemon? [Yes or No]");
            Scanner scanner = new Scanner(System.in);
			try {
				String confirm = scanner.nextLine();
				if(confirm.toUpperCase().equals("YES")) {
	            	Pokemon MainPokemon = new Pokemon(PG,PR, PT); // generates main pokemon for player
	            	scanner.close();
	            	return MainPokemon;
	            }
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
            }finally {
            	scanner.close();
            	continue;
            }
	    }
	
	}
	
	public static int Battle(Player player, Pokemon Wild) {
		// get the health points of both pokemon
		int score = 0;
		int _HP_OP = Wild._HP;
		int _HP_MP = player.getMainPokemon()._HP;
		
		// undefined attack power
		int player_attack;
		int enemy_attack;
		
		// undefined defense
		
		// run the is weak methods
		Type players = player.MainPokemon._type;
		Type wilddd = Wild._type;
		Scanner UserCommand = new Scanner(System.in);
		
		if (players._isWeak(player.MainPokemon) && wilddd._isStrong(player.MainPokemon)) {
			player_attack = player.MainPokemon._attack; // pokemon uses normal attack
			enemy_attack = Wild._spAttack; // enemy gets boost
		} else if (players._isStrong(Wild) && wilddd._isWeak(player.MainPokemon)) {
			player_attack = player.MainPokemon._spAttack; // uses boosted attack
			enemy_attack = Wild._attack; // uses normal attack
		}else {
			player_attack = player.MainPokemon._attack;
			enemy_attack = Wild._attack;
		}
		
		while ( true) {
	        System.out.print("\033H\033[2J");
	        System.out.flush();
			Battlefield.BG_Display(player.getName(), player.MainPokemon._name, Wild._name, _HP_OP, _HP_MP);
			System.out.println("Press enter to attack");// prompts to attack
			UserCommand.nextLine(); 
			// reassign the values
			_HP_OP -= player_attack;
			_HP_MP -= enemy_attack;
			
			if (_HP_OP == 0) {
				System.out.print("Game Overr");
				System.out.print("You gained "+ 0);
				score = 0;
				UserCommand.close();
				return score;
			} else if (_HP_MP ==0) {
				System.out.print("You won");
				System.out.print("You gained" + 3000);
				UserCommand.close();
				return score + 3000;
			}else {
				score += 500; //adds 500 points each round
				continue;
			}
		}
	}

}