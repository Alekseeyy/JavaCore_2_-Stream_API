package Stream_API_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();

        for (int value : list) {
            if (value > 0) {
                if (value % 2 == 0) {
                    newList.add(value);
                }
            }
        }
        Collections.sort(newList);

        for (int x : newList) {
            System.out.println(x);
        }
    }
}
