
import java.util.ArrayList;

public class SelectionSort {

    static void sortAsc(ArrayList<Employee> arr) {
        int n = arr.size();

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j).getID().compareTo(arr.get(min_idx).getID()) <= 0) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first
            // element
            Employee temp = arr.get(min_idx);
            arr.set(min_idx, arr.get(i));
            arr.set(i, temp);
        }
    }

    static void sortDesc(ArrayList<Employee> arr) {
        int n = arr.size();

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the maximum element in unsorted array
            int max_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j).getID().compareTo(arr.get(max_idx).getID()) >= 0) {
                    max_idx = j;
                }
            }

            // Swap the found maximum element with the first
            // element
            Employee temp = arr.get(max_idx);
            arr.set(max_idx, arr.get(i));
            arr.set(i, temp);
        }
    }
}
