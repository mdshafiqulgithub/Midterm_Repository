package algorithm;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import databases.ConnectDB;

/*
 *Created by PIIT_NYA on 04/22/2017.
 */
public class Numbers
{

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) throws Exception {

		int[] num = new int[100];
		Random rand = new Random();

		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(1000);
		}


		//ConnectDB connectDB = new ConnectDB();

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);

		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");

		//Quick Sort
		int n = num.length;
		randomize(num, n);
		Sort quick = new Sort();
		quick.quickSort(num, 2, 40);
		long QuickSortExecutionTime = quick.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take:" + QuickSortExecutionTime + " milli sec");

		//Shell Sort
		n = num.length;
		randomize(num, n);
		Sort shellSort = new Sort();
		shellSort.shellSort(num);
		long shellSortExecutionTime = quick.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take:" + shellSortExecutionTime + " milli sec");

		//Merge Sort
		randomize(num, n);
		Sort merge = new Sort();
		quick.quickSort(num, 2, 40);
		merge.mergeSort(num, 30, 50);
		long MergeSortExecutionTime = quick.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take:" + MergeSortExecutionTime + " milli sec");

	}


		/*


		algo.quickSort(num,2,10);




        //connectDB.InsertDataFromArryToMySql(num, "selection_sort", "SortingNumbers");

       // List<String> numbers = connectDB.readDataBase("selection_sort", "SortingNumbers");

        /*for(String st:numbers){
        	System.out.println(st);
        }
        /*
		int n = num.length;
		randomize (num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//Continue for rest of the Sorting Algorithm....

		*/


	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}


}
