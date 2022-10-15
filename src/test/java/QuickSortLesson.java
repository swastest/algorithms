import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSortLesson {
    public static void main(String[] args) {
        int[] array = new int[]{64, 28, -5, 17, 20, 34, 15, 16, 55, 33, 50};
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(int[] arr, int from, int to){
        if(from < to){
            int divideIndex = partition(arr, from, to);
            System.out.println("Array: "+ Arrays.toString(arr) + "  FROM " + from + "   TO "+ to + " divideIndex " + divideIndex);
      quickSort(arr, from, divideIndex - 1);
      quickSort( arr, divideIndex, to);
        }

    }

    private static int partition(int[] arr, int from, int to){
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from];
        while (leftIndex <= rightIndex){
            while (arr[leftIndex] < pivot){
                leftIndex++;
            }
            while (arr[rightIndex] > pivot){
                rightIndex--;
            }
            if(leftIndex <= rightIndex){
                swap(arr,rightIndex,leftIndex);
                leftIndex++;
                rightIndex--;

            }
        }
        return leftIndex;
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
