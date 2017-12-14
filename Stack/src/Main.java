//Simple stack implementation

public class Main {

	public static void main(String[] args)  {	
		
		StackLogic stack1 = new StackLogic();
		StackLogic stack2 = new StackLogic();
		
		for (int i = 0; i < 20; i++) {
			stack1.push(i);
			System.out.print("Stack1 Pushing:" +stack1.array[i] + " ,");
		}
	System.out.println();		
		for (int i = 0; i < 10; i++) {
			stack2.push(i);
			System.out.print("Stack2 Pushing:" +stack2.array[i] + " ,");
		}
		
	System.out.println();
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Pop stack1: " +stack1.pop());
		}
	System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println("Pop stack2: " +stack2.pop());
		}	
	}
}

class StackLogic	{
	
	int[] array = new int[20];
	int topOfStack;
	
	public StackLogic() {
		topOfStack = -1;	
	}
	
	void push(int item)	{
		if (topOfStack > array.length)	{
			System.out.println("stack is full");
			}
		else	
			array[++topOfStack] = item;			
	}
	
	int pop()	{
		if (topOfStack < 0)	{
			System.out.println("Buffer UNDER flow");
		}
		return array[topOfStack--];
	}
}



