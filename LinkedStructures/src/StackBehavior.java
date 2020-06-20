//Armando Jimenez


public interface StackBehavior<E>
{
	E pop();
	E peek();
	void push(E data);
	boolean isEmpty();
}
