
import java.util.ArrayList;

public class InsertionSort {

    /*Function to sort array using insertion sort*/
    static void sortAsc(ArrayList<Employee> arr) {
        int n = arr.size();
        for (int i = 1; i < n; ++i) {
            Employee key = arr.get(i);
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr.get(j).getID().compareTo(key.getID()) >= 0) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }
    }

    static void sortDesc(ArrayList<Employee> arr) {
        int n = arr.size();
        for (int i = 1; i < n; ++i) {
            Employee key = arr.get(i);
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr.get(j).getID().compareTo(key.getID()) <= 0) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }
    }

}
