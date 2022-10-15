import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SearchMinElement {

    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(14);
        listInt.add(145);
        listInt.add(1);
        listInt.add(-5);
        listInt.add(18);
        listInt.add(15);

        int minValue = listInt.get(0);
        int minIndex = 0;
        for (int i = 1; i < listInt.size(); i++) {
            if (listInt.get(i) < minValue) {
                minValue = listInt.get(i);
                minIndex = i;
            }
        }
        System.out.println(minValue);
        System.out.println(minIndex);
    }

}
