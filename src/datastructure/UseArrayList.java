
/*
 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
 * Use For Each loop and while loop with Iterator to retrieve data.
 * Store all the sorted data into one of the databases.
 *
 */

package datastructure;

import java.util.*;


public class UseArrayList
{

	public static void main(String args[])
	{

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		Iterator itr = al.iterator();

        //Iterator to retrieve data
		while (itr.hasNext())
		{
			System.out.println("ArrayList : "+itr.next());
		}

		al.remove(3);




	}
}
