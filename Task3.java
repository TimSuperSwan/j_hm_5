/*
 * Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[] numbers = { 6, 2, 1, 8, 5, 3, 11, 3 };

        heapsort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static int leftChild(int i) {
        return (2 * i + 1);
    }

    private static int rightChild(int i) {
        return (2 * i + 2);
    }

    private static void Replace(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void Heapify(int[] arr, int i, int size) {

        int left = leftChild(i);
        int right = rightChild(i);

        int largest = i;

        if (left < size && arr[left] > arr[i]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            Replace(arr, i, largest);
            Heapify(arr, largest, size);
        }
    }

    public static int pop(int[] arr, int size) {

        if (size <= 0) {
            return -1;
        }

        int top = arr[0];

        arr[0] = arr[size - 1];

        Heapify(arr, 0, size - 1);

        return top;
    }

    public static void heapsort(int[] A) {

        int n = A.length;

        int i = (n - 2) / 2;
        while (i >= 0) {
            Heapify(A, i--, n);
        }

        while (n > 0) {
            A[n - 1] = pop(A, n);
            n--;
        }
    }

}