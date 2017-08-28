
/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

package datastructure;

import java.util.*;

public class UseQueue
{

	public static void main(String[] args) {

		Queue queue = new LinkedList();

		//you add elements to queue using add method
		queue.add("Java");
		queue.add(".NET Programming");
		queue.add("Javascript");
		queue.add("HTML5");
		queue.add("Hadoop");

		System.out.println("Peek    element: " + queue.peek());
		System.out.println("Items in the queue..." + queue);
		System.out.println("remove element : " + queue.remove());
		System.out.println("Que Element    : " + queue.element());


		Iterator itr = queue.iterator();

		while (itr.hasNext())
		{
			System.out.println("Queue Value: "+itr.next());
		}
	}



}
