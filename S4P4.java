import java.util.Arrays;
import java.util.List;

public class S4P4 {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4};

        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);

        Integer[] newArr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(newArr));
    }
}