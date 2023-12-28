package Day49;

public class HeapSort {

    // Function to build a Heap from the given array.
    void buildHeap(int arr[], int n)
    {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }
 
    // Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
 
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
 
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
 
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }
    
    // Function to perform Heap Sort on the given array.
    public void heapSort(int arr[], int n)
    {
        buildHeap(arr, n);
 
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }
    
    // Utility function to swap elements at indices i and j in the array.
    private void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
