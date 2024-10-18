package pGaOleGaOle;

public class Opponent extends trainer{
	String name;
	Pokemon OPpokemon;
	
	public Opponent(String name,Pokemon OpPokemon ) {
		super(name, OpPokemon);
	}
	
	public int attack(int _mpHealth) {
		int attackPower = this.OPpokemon._attack;
		return _mpHealth - attackPower;
	}
	
	
	
}
