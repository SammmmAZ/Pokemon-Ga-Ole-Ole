package pGaOleGaOle;

public class Type {
	// 3 attribute
	String Typing;
	String _weak; // a typing where pokemon's type is weak against
	String _strong; // a typing where pokemon's type has advantage
	
	// constructor - creates all typings at the start of the program
	public Type(String Type, String Weak, String Strong) {
		this.Typing = Type;
		this._weak = Weak;
		this._strong = Strong;
	}
	
	public String toString() {
		return this.Typing +" is strong against" + this._strong + " and is weak against " + this._weak;
	}
	
	public Type(String Type) {
		this.Typing = Type;
		if (this.Typing == "Fire") {
			this._weak = "Water";
			this._strong = "Grass";
		} else if ( this.Typing == "Water") {
			this._strong ="Fire";
			this._weak = "Grass";
		} else if (this.Typing == "Grass") {
			this._strong = "Water";
			this._weak = "Fire";
		}
	}
	
	// methods - check if pokemon's typing favor weakness or strong against
	// all which are boolean methods
	// If a _WeakAgainst - returns true, pokemon will always attack with base attack
	//                   - And have lowest defence against enemy attack
	//                   - Enemy attack will be higher
	//                   - returns False? - critical chances remain normal, defence remain at Base Level
	
	//If a _StrongAgainst - return true, pokemon will always attack with sp_attack
    //                    - Have Strong Defence/ resistance towards enemy attack
	//                    - returns false - critical chances remain normal for attacks, defence remain at Base level
	
	private String _getTyping() {
		return this.Typing;
	}
	
	// check for weakness
	public Boolean _isWeak(Pokemon EPokemon) {
		// checks for if the pokemon's type is weak against the typing of the enemy
		Type Enemy = EPokemon._getType();
		String EnemyType = Enemy._getTyping();
		
		if (this._weak == EnemyType) {
			return true; // tells the pokemon that his attack - 10 , defense - 10
		} else {
			return false; // tells the pokemon that attack will be used, and defense is normal
		}
	}
	// check for strength
	public Boolean _isStrong(Pokemon EPokemon) {
		// checks for pokemon's type is strong against the typing of the enemy
		Type Enemy = EPokemon._getType();
		String EnemyType = Enemy._getTyping();
		
		if (this._strong == EnemyType) {
			return true; // tells pokemon that his _SpAttack will be used, _SpDefense will be used
		} else {
			return false; // tells pokemon that his attack & defense will be used
		}
	}
	
}
