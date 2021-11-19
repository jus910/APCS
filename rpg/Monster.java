/** 	- Monster constructor has no parameters
 * 	- Monster class methods
 * 		- isAlive() returns a boolean
 * 		- attack() returns an int
 **/
public class Monster{
	int HP=10;
	public boolean isAlive() {
		return HP > 0;
	}
	public int attack(Protagonist pro){
		pro.HP-=1;
		return 1;
	}
}
