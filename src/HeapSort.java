
import java.util.ArrayList;

public class HeapSort {

    public static void sortAsc(ArrayList<Employee> arr) {
        int n = arr.size();

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyAsc(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            Employee temp = arr.get(0);
            arr.set(0, arr.get(i));
            arr.set(i, temp);

            // call max heapifyAsc on the reduced heap
            heapifyAsc(arr, i, 0);
        }
    }

    // To heapifyAsc a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    static void heapifyAsc(ArrayList<Employee> arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr.get(l).getID().compareTo(arr.get(largest).getID()) > 0) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && arr.get(r).getID().compareTo(arr.get(largest).getID()) > 0) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            Employee swap = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, swap);

            // Recursively heapifyAsc the affected sub-tree
            heapifyAsc(arr, n, largest);
        }
    }

    public static void sortDesc(ArrayList<Employee> arr) {
        int n = arr.size();

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyDesc(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            Employee temp = arr.get(0);
            arr.set(0, arr.get(i));
            arr.set(i, temp);

            // call max heapifyAsc on the reduced heap
            heapifyDesc(arr, i, 0);
        }
    }

    // To heapifyAsc a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    static void heapifyDesc(ArrayList<Employee> arr, int n, int i) {
        int smallest = i; // Initialize smallest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr.get(l).getID().compareTo(arr.get(smallest).getID()) < 0) {
            smallest = l;
        }

        // If right child is larger than largest so far
        if (r < n && arr.get(r).getID().compareTo(arr.get(smallest).getID()) < 0) {
            smallest = r;
        }

        // If largest is not root
        if (smallest != i) {
            Employee swap = arr.get(i);
            arr.set(i, arr.get(smallest));
            arr.set(smallest, swap);

            // Recursively heapifyAsc the affected sub-tree
            heapifyDesc(arr, n, smallest);
        }
    }
}
