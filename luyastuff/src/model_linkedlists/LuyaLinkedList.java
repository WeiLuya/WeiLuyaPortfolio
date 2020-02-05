package model_linkedlists;

public class LuyaLinkedList {
	  private Stack luyastack;
	  
	  public Player Zhang;
	  public Player Wei;
	  public Player Espinosa;
	  public Player Kulkarni;
	  public Player Shihora;
	  
	  public LuyaLinkedList()
	  {
		  luyastack = new Stack();
		  
		  Zhang = new Player("forward", 11);
		  Wei = new Player("defense", 19);
		  Espinosa = new Player("defense", 92);
		  Kulkarni = new Player("forward", 11);
		  Shihora = new Player("forward", 55);
	  }
	  
	  public void createStack()
	  {
		  		System.out.println("Team of players");
				luyastack.push(Zhang.toString());  
				System.out.println("player " + luyastack.getObject()+ " has entered the ice.");
				luyastack.push(Wei.toString());
				System.out.println("player " + luyastack.getObject()+ " has entered the ice.");
				luyastack.push(Espinosa.toString());
				System.out.println("player " + luyastack.getObject() + " has entered the ice.");
				luyastack.push(Kulkarni.toString());
				System.out.println("player " + luyastack.getObject() + " has entered the ice.");
				luyastack.push(Shihora.toString());
				System.out.println("player " + luyastack.getObject()+ " has entered the ice.");
				System.out.println("This is your team: " + luyastack);
	  }
	  
	  
	  public void emptyStack()
	  {
		  	for (int i = 0; i < 5; i++)
		  	{
				 System.out.println("the player " + luyastack.pop() + " has been ejected. This is your remaining team: " + luyastack);						
		  	}
	  }
	  
	  public static void main(String args[])
	  {
		  LuyaLinkedList L = new LuyaLinkedList();
		  L.createStack();
		  L.emptyStack();
	  }
}
