package model_linkedlists;


public class LuyaCircleQueue 
{
	private CircleQueue myqueue;
	private int size;
	
	
	public LuyaCircleQueue()
	  {
		  myqueue = new CircleQueue();
	  }
	
	public void createQueue()
	{
		LinkedList node;
		node = (LinkedList)myqueue.getObject();
	  		for (int i = 0; i <= 100; i++)
			{
		  		if(isPrime(2 + i)) {
					myqueue.add(new String(Integer.toString(2 + i)));
					System.out.println(myqueue.getObject());
					size++;
		  		}
			}
	}
	
	  public void displayQueue()
	  {
	    System.out.println("First Element: " + myqueue.getFirstObject() );
	    System.out.println("Last Element: " + myqueue.getLastObject() );
	    System.out.println("Full Queue: " + myqueue);
	  }

	
	public void emptyQueue()
	{
		for(int i = 0; i < size; i++) {
			
				System.out.println(myqueue.delete());
		}
	}
	


	public boolean isPrime(int a)
	{
		for(int i = 2; i < a; i++) {
			if((a % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		
	    LuyaCircleQueue queue = new LuyaCircleQueue();
		queue.createQueue();
		queue.displayQueue();
		queue.emptyQueue();

	}

}
