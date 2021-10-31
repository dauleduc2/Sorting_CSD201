
import java.util.ArrayList;

public class BubbleSort {

    static void sortAsc(ArrayList<Employee> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j).getID().compareTo(arr.get(j + 1).getID()) >= 0) {
                    // swap arr[j+1] and arr[j]
                    Employee temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    static void sortDesc(ArrayList<Employee> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j).getID().compareTo(arr.get(j + 1).getID()) <= 0) {
                    // swap arr[j+1] and arr[j]
                    Employee temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

}
