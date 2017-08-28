package algorithm;

public class Sort
{

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */

  //Selection Sort
    public int[] selectionSort(int [] array)
    {
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++)
        {
            for(int j=i+1; j<array.length; j++)
            {
                if(array[j]<array[i])
                {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //InsertionSort
    public int[] insertionSort(int [] array)
    {
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
   //Bubble Sort implementation
    public int[] bubbleSort(int [] array)
    {
        int[] list = array;
        //implement here

        //Bubble Sort implementation
        for (int i = 1; i < list.length; i++)
        {
            int temp = 0;

            if (list[i - 1] > list[i])
            {
                temp = list[i - 1];
                list[i - 1] = list[i];
                list[i] = temp;
            }
        } return list;
    }

    //Merge Sort Implementation
    public int [] mergeSort(int[] a, int low, int high)
    {
        int N = high - low;

        if (N <= 1)

            return a;
        int mid = low + N/2;

        // recursively sort
        mergeSort(a, low, mid);
        mergeSort(a, mid, high);

        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;

        for (int k = 0; k < N; k++)
        {
            if (i == mid)
                temp[k] = a[j++];
            else if (j == high)
                temp[k] = a[i++];
            else if (a[j]<a[i])
                temp[k] = a[j++];
            else
                temp[k] = a[i++];
        }
        for (int k = 0; k < N; k++)
        {
            a[low + k] = temp[k];
        }

        return a;
    }

//Quick Sort Program
    public int [] quickSortprorgam(int [] array)
    {
        int[] list = array;
        //implementation
      //  System.out.println(arr.toString(x));

        int low = 0;
        int high = array.length - 1;
        list = quickSort(list, low, high);
       //System.out.println(list.toString(array));
       return list;
    }

    public int[] quickSort(int[] arr, int low, int high)
    {
        if (arr == null || arr.length == 0)
            return arr;
        if (low >= high)
            return arr;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j)
        {
            while (arr[i] < pivot)
            {
                i++;
            }

            while (arr[j] > pivot)
            {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            // recursively sort two sub parts
            if (low < j)
                quickSort(arr, low, j);

            if (high > i)
                quickSort(arr, i, high);

        }
        return arr;
    }


    public int [] heapSort(int [] arr)
    {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }

        return arr;
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }


  //Bucket Sort implementation
    public int [] bucketSort(int [] a, int maxVal)
    {
        int[] bucket = new int[maxVal + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            bucket[a[i]]++;
        }

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++)
        {
            for (int j = 0; j < bucket[i]; j++)
            {
                a[outPos++] = i;
            }
        }
        return bucket;
    }


    public int [] shellSort(int [] array)
    {
        int inner, outer;
        int temp;

        int h = 1;
        while (h <= array.length / 3)
        {
            h = h * 3 + 1;
        }
        while (h > 0)
        {
            for (outer = h; outer < array.length; outer++)
            {
                temp = array[outer];
                inner = outer;

                while (inner > h - 1 && array[inner - h] >= temp)
                {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
        }
        return array;
    }


    public static void printSortedArray(int [] array)
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
