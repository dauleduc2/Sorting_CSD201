
import java.util.ArrayList;

public class MergeSort {

    static void mergeAsc(ArrayList<Employee> Arr, int start, int mid, int end) {

        // create a temp array
        Employee temp[] = new Employee[end - start + 1];

        // crawlers for both intervals and for temp
        int i = start, j = mid + 1, k = 0;

        // traverse both arrays and in each iteration add smaller of both elements in temp
        while (i <= mid && j <= end) {
            if (Arr.get(i).getID().compareTo(Arr.get(j).getID()) <= 0) {
                temp[k] = Arr.get(i);
                k += 1;
                i += 1;
            } else {
                temp[k] = Arr.get(j);
                k += 1;
                j += 1;
            }
        }

        // add elements left in the first interval
        while (i <= mid) {
            temp[k] = Arr.get(i);
            k += 1;
            i += 1;
        }

        // add elements left in the second interval
        while (j <= end) {
            temp[k] = Arr.get(j);
            k += 1;
            j += 1;
        }

        // copy temp to original interval
        for (i = start; i <= end; i += 1) {
            Arr.set(i, temp[i - start]);
        }
    }

// Arr is an array of integer type
// start and end are the starting and ending index of current interval of Arr
    static void mergeSortAsc(ArrayList<Employee> Arr, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSortAsc(Arr, start, mid);
            mergeSortAsc(Arr, mid + 1, end);
            mergeAsc(Arr, start, mid, end);
        }
    }

    static void mergeDesc(ArrayList<Employee> Arr, int start, int mid, int end) {

        // create a temp array
        Employee temp[] = new Employee[end - start + 1];

        // crawlers for both intervals and for temp
        int i = start, j = mid + 1, k = 0;

        // traverse both arrays and in each iteration add smaller of both elements in temp
        while (i <= mid && j <= end) {
            if (Arr.get(i).getID().compareTo(Arr.get(j).getID()) >= 0) {
                temp[k] = Arr.get(i);
                k += 1;
                i += 1;
            } else {
                temp[k] = Arr.get(j);
                k += 1;
                j += 1;
            }
        }

        // add elements left in the first interval
        while (i <= mid) {
            temp[k] = Arr.get(i);
            k += 1;
            i += 1;
        }

        // add elements left in the second interval
        while (j <= end) {
            temp[k] = Arr.get(j);
            k += 1;
            j += 1;
        }

        // copy temp to original interval
        for (i = start; i <= end; i += 1) {
            Arr.set(i, temp[i - start]);
        }
    }

// Arr is an array of integer type
// start and end are the starting and ending index of current interval of Arr
    static void mergeSortDesc(ArrayList<Employee> Arr, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSortDesc(Arr, start, mid);
            mergeSortDesc(Arr, mid + 1, end);
            mergeDesc(Arr, start, mid, end);
        }
    }
}
