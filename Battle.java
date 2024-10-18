package pGaOleGaOle;

public class Battle {
	Player mainPlayer;
	Pokemon mpPokemon;
	Pokemon opPokemon;
	int mpHealth;
	int opHealth;
	
	
	public Battle(Player mPlayer, Opponent randomDude) {
		this.mainPlayer = mPlayer;
		this.mpPokemon = mainPlayer.GetMainPokemon();
		this.opPokemon = randomDude.GetMainPokemon();
	}
	
	public Battle(Player mPlayer, Pokemon opPokemon) {
		this.mainPlayer = mPlayer;
		this.mpPokemon = mPlayer.getMainPokemon();
		
	}
	public int BattleOpponent() {
		//standard battle mode
		return 3; // returns score
	}
	
	public void rounds() {
		//stimulate rounds
	}
	
	
}
