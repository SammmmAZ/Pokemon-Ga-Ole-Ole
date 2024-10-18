package pGaOleGaOle;

public class Player extends trainer{
	int Score;
	
	public Player(String name, Pokemon main, int Score) {
		super(name, main);
		this.Score = Score;
	}
	// getters 
	public Pokemon getMainPokemon() {
		return this.MainPokemon;
	}
	public String getName() {
		return this.Name;
	}
	
	public int attack(int mpAttack, int spAttack, int opHP) {
		if (opHP - mpAttack <= 0) {
			opHP = 0;
		} else {
		opHP -= mpAttack; // reduces the attack point of the HP of the enemy
		}
		return opHP;
	}
	
	public String ToString() {
		return this.Name + " now has a pokemon" + this.MainPokemon.toString();
	}
}
