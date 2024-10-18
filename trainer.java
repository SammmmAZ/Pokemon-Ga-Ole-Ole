package pGaOleGaOle;

public class trainer {
	//attributes
	String Name;
	Pokemon MainPokemon;
	
	
	// Constructor
	public trainer(String Name, Pokemon MainPokemon) {
		this.Name = Name;
		this.MainPokemon = MainPokemon;
	}
	
	public Pokemon GetMainPokemon() {
		return this.MainPokemon;
	}
}
