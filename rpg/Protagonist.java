/**
 Protagonist class methods
 * 		- isAlive() returns a boolean
 * 		- specialize() returns void
 * 		- normalize() returns void
 * 		- attack() returns an int (is this a getter method?, monster input)
 * 		- getName() returns a String
**/
public class Protagonist{
	private String name;
	int HP=100;
	int attack=100;
	public Protagonist(String inputName){
		name = inputName;
	}
	public boolean isAlive() {
		return HP > 0;
	}
	public void specialize(){
	}
	public void normalize(){
	}
	public int attack(Monster mon){
		if (Math.random()>0.5){
			mon.HP -=attack;
			return attack;
		} else{
			return 0;
		}		
	}
	public String getName(){
		return name;
	}
}
