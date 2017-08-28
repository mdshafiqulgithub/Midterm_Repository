package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber
{

	public static void main(String[] args)
	{
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

		//assign first element of an array to largest and smallest
		int smallest = array[0];
		int largetst = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > largetst)
				largetst = array[i];
			else if (array[i] < smallest)
			smallest = array[i];

		}

		System.out.println("Lowest Number is : " + smallest);
	}


}
