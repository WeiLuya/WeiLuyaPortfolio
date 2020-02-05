package model_linkedlists;

public class Player {

	String position;
	int number;
	
	public Player(String position,int number)
	{
		this.position = position;
		this.number = number;
	}
	
	public String toString() 
	{
		return position + " #"+ Integer.toString(number);
	}
	
}
