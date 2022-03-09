package stack;

public class Stack {
	
	private int cap;
	private int[] stack;
	private int numberOfNumbers;
	
	public Stack(int c) {
		if (c > 0) {
			cap = c;
			stack = new int[cap];
		}
	}
	
	public void addNumber(int num) {
		if (numberOfNumbers < cap) {
			stack[numberOfNumbers++] = num;
		}
	}
	
	public int getNumber() {
		if (numberOfNumbers > 0) {
			return stack[--numberOfNumbers];
		}
		else {
			return -147;
		}
	}
	
	public boolean isFull() {
		return (numberOfNumbers == cap);
	}
	
	public boolean isEmpty() {
		return numberOfNumbers == 0;
	}
	
	public void emptyStack() {
		for (int i = 0; i < stack.length; i++) {
			stack[i] = 0;
		}
		numberOfNumbers = 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Stack: ");
		for (int i = 0; i < numberOfNumbers; i++) {
			sb.append(stack[i]).append(" ");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Stack s1 = new Stack(3);
		System.out.println(s1.isEmpty());
		s1.addNumber(1);
		s1.addNumber(2);
		s1.addNumber(3);
		s1.addNumber(4);
		System.out.println(s1);
		System.out.println(s1.isFull());
		s1.getNumber();
		System.out.println(s1);
		System.out.println(s1.isFull());
		s1.emptyStack();
		System.out.println(s1.isEmpty());
		System.out.println(s1);
	}
	
}
