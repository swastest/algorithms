import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubblesSearch {
    public static void main(String[] args) {
        int[] array = new int[]{64, 28, -5, 17, 20, 34};
        System.out.println(Arrays.toString(array));
        boolean isSorted = false;
        while (!isSorted){
            isSorted =true;
            for(int i = 1; i<array.length; i++){
                if(array[i]<array[i-1]){
                    int temp = array[i];
                    array[i] = array[i -1];
                    array[i-1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }




    }

    private static void sortList(List<Integer> arr) {

    }
}
