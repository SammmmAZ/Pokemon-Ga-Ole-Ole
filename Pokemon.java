package pGaOleGaOle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pokemon {
	// Pokemon attributes
	String _name;
	int _HP; // represents Pokemons healthPoints in interger
	int _attack; // represents Pokemon's attack power
	int _spAttack; // represents Pokemon's critical attack when type advantage is present
	Rarity _stars; // can be either of * / **/ ***/ ****/ or *****
	int _Defence; // represents endurance/ resisting enemy pokemon's attack
	Type _type; // represents pokemon's type
	
	// getter
	public Type _getType() {
		return _type; // returns pokemon's type
	}
	
	public Rarity _getRarity() {
		return _stars;
	}
	
	public void setHP(int HP) {
		this._HP = HP;
	}
	
	public void setAttack(int attack) {
		this._attack = attack;
	}
	public void setSPAttack(int spAttack) {
		this._spAttack = spAttack;
	}
	public void setDefence( int defense) {
		this._Defence = defense;
	}
	
	// standard for player chose at start
	public Pokemon(String Name, int HP, int attack,Rarity Stars, int spAttack, int defense) {
		this._name = Name;
		this._HP = HP;
		this._attack = attack;
		this._spAttack = spAttack;
		this._stars = Stars; // 
		this._Defence = defense;
	}
	
	// RNG pokemon, generated based on the Stars
	public Pokemon(String Name, Rarity Stars, Type type) {
		this._name = Name;
		this._stars = Stars;
		this._type = type;
		
		if (this._stars._Stars == "*****") {
			this._attack = 1200;
			this._spAttack= 1300;
			this._HP = 1400;
			this._Defence= 400;
		}else if (this._stars._Stars == "****") {
			this._attack = 800;
			this._spAttack = 850;
			this._Defence = 300;
			this._HP = 900;
		}else if (this._stars._Stars == "***") {
			this._attack=400;
			this._spAttack=420;
			this._Defence=200;
			this._HP=500;
		}else if (this._stars._Stars == "**") {
			this._attack = 260;
			this._spAttack = 280;
			this._Defence = 150;
			this._HP = 250;
		}else {
			this._attack= 150;
			this._spAttack= 165;
			this._Defence=100;
			this._HP=180;
		}
	}	
	
	public String toString() {
		return this._name + " is " + this._getRarity() + "has typing" + this._type;    
	}
}
