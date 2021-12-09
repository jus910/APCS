// Team we forgot: Justin Mohabir, Jonathan Song, Kevin Li
// APCS pd8
// HW45 -- Array of Titanium
// 2021-12-08
// Time spent: 0.8 hours

/*
QCC:
  - When the assignment says to test ListInt’s methods, does that mean to test SuperArray's methods of the same name?
DISCO:
	- If you set a method in ListInt to public, SuperArray cannot have a method of the same name that is private
  - SuperArray implements ListInt, so it must have methods with the same name and parameter as those in ListInt
  	If one of those methods is missing, you get the error: SuperArray is not abstract and does not override abstract method add(int,int) in ListInt
  - ListInt cannot be instantiated because it is abstract
  - You can create and use a main method in an interface
  - A single class can implement multiple interfaces
*/

public interface ListInt{
  public void add(int input);

  public void add(int index, int input);

  public void remove(int index);

  public int size();
  /*
  public void expand();

  public void toString();

  public int get(int index);

  public int set(int index, int input);
  */
}
