package schultz.university.matchingdelimiters;

public class ArrayStackChar {
	
	private char[] data;
	private int top;
	
	public ArrayStackChar() {
		data = new char[100];
		top = -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return (top + 1) == 0;
	}
	
	public void push(char element) {
		if(top + 1 <= data.length-1) {
			top++;
			data[top] = element;
		}
		
		else
			System.out.println("Cannot push, stack is full!");
	}
	
	public char pop() {
		if(isEmpty())
			return ' ';
		
		char result = data[top];
		
		data[top] = 0;
		top--;
		
		return result;
	}
	
	public String toString() {
		if(isEmpty())
			return "Stack is empty!";
		
		String result = "";
		
		for(int i = top; i >= 0; i--)
			result += data[i] + "\n";
		
		return result;
	}
}
