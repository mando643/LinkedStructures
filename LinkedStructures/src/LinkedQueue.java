public class LinkedQueue<E> implements QueueBehavior<E> 
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
	
	private Node<E> rear;
	private Node<E> front;
	
	public LinkedQueue()
	{
		front = null;
		rear = null;
	}

	
	public E remove() throws EmptyQueueException
	{
		if (isEmpty())
		{
			throw new EmptyQueueException("The array stack is empty. There is nothing to pop");
		}
		
		E element = front.element;
		front = front.next;
		return element;
	}
	
	
	public void add(E element)
	{
		 Node<E> curr = front;
	        if (front == null)
	            front = new Node<E>(element);
	        else
	        {
	            while (curr.next != null)
	                curr = curr.next; 
	            curr.next = new Node<E>(element);
	        }
	}

	public E element() throws EmptyQueueException
	{
		if (isEmpty())
		{
			throw new EmptyQueueException("The array stack is empty. There is nothing to pop");
		}
		
		return front.element;
	}

	public boolean isEmpty()
	{
		return front == null;
	}
	
	

	
}
