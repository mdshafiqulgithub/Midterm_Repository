package datastructure;
import java.util.*;

/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
*/


public class UseMap {

	public static void main(String[] args)
	{

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101,"Let us C");
		map.put(102, "Operating System");
		map.put(103, "Data Communication and Networking");
		System.out.println("Values before remove: "+ map);

		// Remove value for key 102
		map.remove(102);
		System.out.println("Values after remove: "+ map);




	}




}
