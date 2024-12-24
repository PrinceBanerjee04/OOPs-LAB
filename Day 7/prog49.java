java for Stack using generic class.

import java.util.*;
class Stack<T> 
{
	private ArrayList<T> elements;
	public Stack() 
	{
		elements = new ArrayList<>();
    	}

    	public void push(T element) 
	{
        	elements.add(element);
    	}
    	public T pop() 
	{
        	if (isEmpty()) 
		{
            		throw new IllegalStateException("Stack is empty. Cannot pop.");
        	}
        	return elements.remove(elements.size() - 1);
    	}
    	public T peek() 
	{
        	if (isEmpty()) 
		{
            		throw new IllegalStateException("Stack is empty. Cannot peek.");
        	}
        	return elements.get(elements.size() - 1);
    	}

    	public boolean isEmpty()
	{
        	return elements.isEmpty();
    	}

    	public int size() 
	{
        	return elements.size();
    	}
}

class prog49
{
	public static void main(String[] args) 
	{
        	Stack<Integer> intStack = new Stack<>();
        	Stack<String> stringStack = new Stack<>();

        	intStack.push(10);
        	intStack.push(20);
        	intStack.push(30);

        	System.out.println("Integer Stack Size: " + intStack.size());
        	System.out.println("Top Element: " + intStack.peek());
        	System.out.println("Popped Element: " + intStack.pop());
        	System.out.println("Stack After Pop: " + intStack.size());

		stringStack.push("Hello");
        	stringStack.push("World");

        	System.out.println("String Stack Size: " + stringStack.size());
        	System.out.println("Top Element: " + stringStack.peek());
        	System.out.println("Popped Element: " + stringStack.pop());
        	System.out.println("Stack Empty : " + stringStack.isEmpty());
	}
}
