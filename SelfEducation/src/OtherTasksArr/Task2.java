package OtherTasksArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String[] arr = {"Kasimov", "Roman", "Elmirovich", "Nineteen", "pop"};
        ArrayList<String> list = new ArrayList<String>();
        for (String element : arr) {
            list.add(element);
        }
        System.out.println(list);

        String[] arr1 = new String[list.size()];
        list.toArray(arr1);
        System.out.println(Arrays.toString(arr1));

        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr1));
        System.out.println(list1);

    }
}
