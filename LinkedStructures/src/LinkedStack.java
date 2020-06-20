
public class LinkedStack<E> implements StackBehavior<E> 
{
	private class Node<E>
	{
		private E element;
		private Node<E> next;
		
		private Node(E element)
		{
			this.element = element;
			this.next = null;
		}
	}
	
	private Node<E> top;
	
	public LinkedStack()
	{
		top = null;
	}
	
	public void push(E data)
	{
		Node newNode = new Node<E>(data);
		top = newNode;
		top.element = data;
		top.next = newNode;
		
	}
	
	public E pop() throws EmptyStackException
	{
		if (isEmpty())
		{
			throw new EmptyStackException("The array stack is empty. There is nothing to pop");
		}
		
		E Element = top.element;
		top = top.next;
		return Element;
	}

	public boolean isEmpty() 
	{
		return top == null;
	}
	
	public E peek() throws EmptyStackException
	{
		if (isEmpty())
		{
			throw  new EmptyStackException("The array stack is empty. There is nothing to peek");
		}
		return top.element;
	}
	}
	



