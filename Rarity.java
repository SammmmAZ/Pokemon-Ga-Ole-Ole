package pGaOleGaOle;

public class Rarity {
	// define attributes
	String _Stars;
	
	public Rarity(String Stars) {
		this._Stars= Stars;
	}
	
	public String toString() {
		return this._Stars + "is on a ranking of" + this._Stars.length() + "out of 5";
	}
	
	//methods RNG
//	public void _rngSetters(Pokemon OPokemon) {
//		Rarity Star = OPokemon._getRarity();
//		String n = Star._getStars();
//		
//		if (n == "**") {
//			OPokemon.setAttack(23);
//			OPokemon.setSPAttack(33);
//			OPokemon.setDefence(10);
//			OPokemon.setHP(44);
//		} else if (n == "***"){
//			OPokemon.setAttack(88);
//			OPokemon.setSPAttack(98);
//			OPokemon.setDefence(30);
//			OPokemon.setHP(122);
//		} else if (n == "****") {
//			OPokemon.setAttack(154);
//			OPokemon.setSPAttack(164);
//			OPokemon.setDefence(50);
//			OPokemon.setHP(210);
//		} else if (n == "*****") {
//			OPokemon._attack = 232;
//			OPokemon._HP =420;
//			OPokemon._Defence = 80;
//			OPokemon._spAttack = 242;
//		}
//		
//	}
}
