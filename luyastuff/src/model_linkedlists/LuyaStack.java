package model_linkedlists;

public class LuyaStack {
	private Stack mystack;
	private int size = 25; 

	public LuyaStack() {
		mystack = new Stack();
	}

	public void createStack() {
		for (int i = 0; i <= size; i++) {
			mystack.push(new String(Character.toString('a' + i)));
			
			for (int j = 0; j < i; j++) {
				System.out.print("=");
			}
			
			System.out.print(mystack.getObject());
		
			for (int j = 0; j < (25 - i); j++) {
				System.out.print("~");
			}
			
			System.out.println("");//print newline
		}
	}

	public void emptyStack() {
		for (int i = 0; i <= size; i++) {
			for (int j = 0; j < (25 - i); j++) {
				System.out.print("=");
			}
			
			System.out.print(mystack.pop());
			
			for (int j = 0; j < i; j++) {
				System.out.print("~");
			}
			
			System.out.println("");//print newline
		}
	}

	public void displayStack() {
		System.out.println("Top Element: " + mystack.getObject());
		System.out.println(mystack);
	}

	public static void main(String[] args) {
		LuyaStack stack = new LuyaStack();

		stack.createStack();
		stack.displayStack();
		stack.emptyStack();
	}

}
