
public class Index {

    public static void addData(EmployeeManager manager) {
        //employee 1
        manager.add("A05", "Tran Quang", 7);
        //employee 2
        manager.add("A03", "Nguyen An", 7);
        //employee 3
        manager.add("A01", "Truong Phung", 5);
        //employee 4
        manager.add("A04", "Pham Thi Lam", 2);
        //employee 5
        manager.add("A02", "Do Trung Ton", 5);
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // heap sort
        addData(manager);
        System.out.println("The employee list before sorting:");
        manager.printAll();
        System.out.println("Starting heapsort by ascending ID:");
        HeapSort.sortAsc(manager.employeeList);
        manager.printAll();
        System.out.println("Starting heapsort by descending ID:");
        HeapSort.sortDesc(manager.employeeList);
        manager.printAll();
        manager.clear();

        // quick sort
        System.out.println("\n\n");
        addData(manager);
        System.out.println("The employee list before sorting:");
        manager.printAll();
        System.out.println("Starting quicksort by ascending ID:");
        QuickSort.quickSortAsc(manager.employeeList, 0, manager.employeeList.size() - 1);
        manager.printAll();
        System.out.println("Starting quicksort by descending ID:");
        QuickSort.quickSortDesc(manager.employeeList, 0, manager.employeeList.size() - 1);
        manager.printAll();
        manager.clear();

        // mergeAsc sort
        System.out.println("\n\n");
        addData(manager);
        System.out.println("The employee list before sorting:");
        manager.printAll();
        System.out.println("Starting mergesort by ascending ID:");
        MergeSort.mergeSortAsc(manager.employeeList, 0, manager.employeeList.size() - 1);
        manager.printAll();
        System.out.println("Starting mergesort by descending ID:");
        MergeSort.mergeSortDesc(manager.employeeList, 0, manager.employeeList.size() - 1);
        manager.printAll();
        manager.clear();
    }

}
