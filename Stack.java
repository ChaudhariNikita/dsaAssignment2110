package assignment2110;

public class Stack {
	private char[] stack;
	private int top;
	private int maxSize;

	public Stack(int size) {
		maxSize = size;
		stack = new char[maxSize];
		top = -1;
	}

	public void push(char c) {
		if (top < maxSize - 1) {
			stack[++top] = c;
		}
	}

	public char pop() {
		if (top >= 0) {
			return stack[top--];
		}
		return '\0';
	}

	public boolean isEmpty() {
		return top == -1;
	}

}
