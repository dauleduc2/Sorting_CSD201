
import java.util.ArrayList;

public class QuickSort {

    static void swap(ArrayList<Employee> arr, int i, int j) {
        Employee temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    /* This function takes last element as pivot, places
   the pivot element at its correct position in sorted
   array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot */
    static int partitionAsc(ArrayList<Employee> arr, int low, int high) {

        // pivot
        Employee pivot = arr.get(high);

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr.get(j).getID().compareTo(pivot.getID()) < 0) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
          arr[] --> Array to be sorted,
          low --> Starting index,
          high --> Ending index
     */
    static void quickSortAsc(ArrayList<Employee> arr, int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partitionAsc(arr, low, high);

            // Separately sort elements before
            // partitionAsc and after partitionAsc
            quickSortAsc(arr, low, pi - 1);
            quickSortAsc(arr, pi + 1, high);
        }
    }

    /* This function takes last element as pivot, places
   the pivot element at its correct position in sorted
   array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot */
    static int partitionDesc(ArrayList<Employee> arr, int low, int high) {

        // pivot
        Employee pivot = arr.get(high);

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr.get(j).getID().compareTo(pivot.getID()) > 0) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
          arr[] --> Array to be sorted,
          low --> Starting index,
          high --> Ending index
     */
    static void quickSortDesc(ArrayList<Employee> arr, int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partitionDesc(arr, low, high);

            // Separately sort elements before
            // partitionAsc and after partitionAsc
            quickSortDesc(arr, low, pi - 1);
            quickSortDesc(arr, pi + 1, high);
        }
    }
}
