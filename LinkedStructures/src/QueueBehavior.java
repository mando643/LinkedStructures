
public interface QueueBehavior<E> 
{
	void add(E element);
	E remove();
	E element();
	boolean isEmpty();
}
